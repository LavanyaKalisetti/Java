package com.nt.Collections;

import java.util.ArrayList;
import com.nt.Collections.Student;

public class College {
public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<>();
		al.add(new Student(101, "S1", "C1", 1000));
		al.add(new Student(102, "S2", "C1", 1000));
		al.add(new Student(103, "S3", "C1", 1500));
		al.add(new Student(101, "S1", "C2", 2000));
		al.add(new Student(102, "S2", "C2", 2000));
		al.add(new Student(104, "S1", "C1", 1000));
		al.add(new Student(101, "S1", "C3", 3000));
		al.add(new Student(101, "S1", "C3", 3000));
		
		System.out.println(al);
		System.out.println();
		
		Student student = new Student(103, "abc", "C1", 0000);
		int index = al.indexOf(student);
		if(index != -1) {
			Student s1 = al.get(index);
			System.out.println("Fee paid is: "+ s1.getFee());
		}else {
			System.out.println(student.getSno() + " student is not found in " + student.getCourse());
		}
		
	}

}
