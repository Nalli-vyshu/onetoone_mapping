
package com.stumapping;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;




public class company {



	private static projects p;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		 Configuration con=new Configuration().configure()
				 .addAnnotatedClass(employee.class).addAnnotatedClass(projects.class);
		 
		 
		 SessionFactory sf=con.buildSessionFactory();
		 
		 Session ses=sf.openSession() ;
		Transaction tx=ses.beginTransaction();
		
		    projects p1=new projects();
		p1.setProjectd(1);
//		p1.setProjectName("Java Bnaking project");		
//		
//		projects p2=new projects();
//	    p2.setProjectd(2);
//		p2.setProjectName("Angular payment project");
//		
//		
//		projects p3=new projects();
//		p3.setProjectd(3);
//     	p3.setProjectName("Node js project");
//	
//	   List<projects>projectlist=new ArrayList<projects>();
//		 
//	   projectlist.add(p1);
//		projectlist.add(p2);
//				List<projects>projectlist2=new ArrayList<projects>();		
//		projectlist2.add(p3);
//		
//	
//	    employee e1=new employee();
//	    e1.setEmpId(101);
//	    e1.setEmpName("vyshu");
//	    e1.setEmpLocation("Hyd");
//	    e1.setProject(projectlist);
//	    
//	    
//	    employee e2=new employee();
//	    e2.setEmpId(102);
//	    e2.setEmpName("duggu");
//        e2.setEmpName("vizag");
//	    e2.setProject(projectlist2);
//		
//	    
//	    ses.save(p1);
//        ses.save(p2);
//	    ses.save(p3);
//	    ses.save(e1);
//        ses.save(e2);
//		
		
		
		Query qu=ses.createQuery("from emplyoee");
		
		List<employee> emplist=qu.getResultList();
		
		for(employee emp:emplist)
		{
			
			List<projects> pp=emp.getProject();
			
			for(projects p:pp);
			
			System.out.println(emp.getEmpName()+" is working in "+p.getProjectName());
		}
	    tx.commit();
	    
		
		
		
	}

}
