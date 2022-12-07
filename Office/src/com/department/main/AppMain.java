package com.department.main;

import com.department.admin.AdminDepartment;
import com.department.hr.HrDepartment;
import com.department.tech.TechDepartment;

public class AppMain {

	public static void main(String[] args) {
		
		AdminDepartment d1 = new AdminDepartment();
		System.out.println("\n\n Welcome to "+ d1.departmentName()+ d1.getTodaysWork() + d1.getWorkDeadline() + d1.isTodayHoliday());
		
		
		HrDepartment d2 = new HrDepartment();
		System.out.println("\n\n Welcome to "+ d2.departmentName() + d2.doActivity() + d2.getTodaysWork() + d2.getWorkDeadline() + d2.isTodayHoliday());
	
		
		TechDepartment d3 = new TechDepartment();
		System.out.println("\n\n Welcome to "+ d3.departmentName() + d3.getTodaysWork() + d3.getWorkDeadline() + d3.getTechStackInformation() + d3.isTodayHoliday());
		

	}

}
