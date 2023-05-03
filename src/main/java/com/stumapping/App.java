package com.stumapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.*;


public class App 
{
    public static void main( String[] args )
    {
       
	 Configuration con=new Configuration().configure()
			 .addAnnotatedClass(student.class).addAnnotatedClass(bike.class);
	 
	 
	 SessionFactory sf=con.buildSessionFactory();
	 
	 Session ses=sf.openSession() ;
	Transaction tx=ses.beginTransaction();
	
//	bike b1=new bike();
//	b1.setBikeId(100);
//	b1.setBikeName("pulsar");
//	
//	
//	bike b2=new bike();
//	b2.setBikeId(101);
//	b2.setBikeName("BMW");
//	
//	
//	student s1=new student();
//	s1.setStId(1);
//	s1.setStName("sonu");
//	s1.setStClass("bsc");
//	s1.setBike(b1);
//	
//	
//	student s2=new student();
//	s2.setStId(2);
//	s2.setStName("chintu");
//	s2.setStClass("bzc");
//	s2.setBike(b2);
//	
//	
//	ses.save(b1);
//	ses.save(b2);
//	ses.save(s1);
//	ses.save(s2);
	
	
	Query qu=ses.createQuery("from student");
	
	
	List<student> ls=qu.getResultList();
	for(student s:ls)
		
		System.out.println(s.getStName()+" has "+s.getBike().getBikeName());
	
		
tx.commit();
    }
}
