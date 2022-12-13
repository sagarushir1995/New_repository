package com.packagename;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test2 {
	int Student_Id;
	String Student_Name;

	public Test2(int student_Id, String student_Name) {
		super();
		Student_Id = student_Id;
		Student_Name = student_Name;
	}

	@Override
	public String toString() {
		return "Test2 [Student_Id=" + Student_Id + ", Student_Name=" + Student_Name + "]";
	}

	public static void main(String[] args)
	{
		Test1 t1 = new Test1("saga", "Jagdish");
//		Test1 t2 = new Test1(11, "Nitesh");
//		Test1 t3 = new Test1(12, "Sagar");
//		Test1 t4 = new Test1(13, "Mahesh");
		Test2 t5 = new Test2(1, "Mangesh");
		Test2 t6 = new Test2(2, "rahul");
		Test2 t7 = new Test2(3, "Ganesh");
		Test2 t8 = new Test2(4, "Ramesh");
		ArrayList al = new ArrayList();
		al.add(t1);
//		al.add(t2);
//		al.add(t3);
//		al.add(t4);
		al.add(t5);
		al.add(t6);
		al.add(t7);
		al.add(t8);
		
		Iterator itr = al.iterator();
		while (itr.hasNext())
		{
//		Object s = (String)itr.next();
		System.out.println(itr.next());
		}

	}

}
