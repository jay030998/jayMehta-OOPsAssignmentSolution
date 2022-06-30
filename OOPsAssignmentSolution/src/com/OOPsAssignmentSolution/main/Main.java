package com.OOPsAssignmentSolution.main;

import com.OOPsAssignmentSolution.model.AdminDepartment;
import com.OOPsAssignmentSolution.model.HrDepartment;
import com.OOPsAssignmentSolution.model.TechDepartment;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment obj = new AdminDepartment();
		obj.departmentName();
		obj.getTodaysWork();
		obj.getWorkDeadline();
		obj.isTodayAHoliday();
		
		HrDepartment obj1 = new HrDepartment();
		obj1.departmentName();
		obj1.doActivity();
		obj1.getTodaysWork();
		obj1.getWorkDeadline();
		obj1.isTodayAHoliday();
		
		TechDepartment obj2 = new TechDepartment();
		obj2.departmentName();
		obj2.getTodaysWork();
		obj2.getWorkDeadline();
		obj2.getTechStackInformation();
		obj2.isTodayAHoliday();
	}

}
