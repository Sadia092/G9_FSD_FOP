package com.department.admin;

import com.department.head.SuperDepartment;

public class AdminDepartment extends SuperDepartment {
	
	public String departmentName()
	{
		return ("Admin Department");
	}
	public String getTodaysWork()
	{
		return ("\n Complete your documents Submission");
	}
	public String getWorkDeadline()
	{
		return ("\n Complete by EOD");
		}
	
}
