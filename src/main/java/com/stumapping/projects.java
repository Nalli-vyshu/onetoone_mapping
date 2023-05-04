package com.stumapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class projects {
	
	
	@Id
	private int projectd;
	private String projectName;
	public int getProjectd() {
		return projectd;
	}
	public void setProjectd(int projectd) {
		this.projectd = projectd;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	@Override
	public String toString() {
		return "projects [projectd=" + projectd + ", projectName=" + projectName + "]";
	}
	
	
	

}
