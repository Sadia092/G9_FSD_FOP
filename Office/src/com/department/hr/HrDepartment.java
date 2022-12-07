package com.department.hr;

import com.department.head.SuperDepartment;

public class HrDepartment extends SuperDepartment {
	

	public String departmentName()
	{
		return ("HR Department");
	}
	public String getTodaysWork()
	{
		return ("\n Fill today's timesheet and mark your attendance");
	}
	public String getWorkDeadline()
	{
		return ("\n Complete by EOD");
		}
	public String doActivity()
	{
		return ("\n Team Lunch");
	}

}
