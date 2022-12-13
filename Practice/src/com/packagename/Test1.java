package com.packagename;

public class Test1 {
	String emp_id;
	String emp_Name;
	
	public Test1(String emp_id, String emp_Name) {
		super();
		this.emp_id = emp_id;
		this.emp_Name = emp_Name;
	}
	@Override
	public String toString() {
		return "Test1 [emp_id=" + emp_id + ", emp_Name=" + emp_Name + "]";
	}
	


}
