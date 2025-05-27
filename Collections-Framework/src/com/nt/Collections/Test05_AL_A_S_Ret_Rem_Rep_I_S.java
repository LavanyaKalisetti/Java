package com.nt.Collections;

import java.util.ArrayList;

public class Test05_AL_A_S_Ret_Rem_Rep_I_S {
	public static void main(String[] args) {
		//Creating new instance of AL
			ArrayList<Object> al = new ArrayList<>();
			
		//Operation #1: Adding objects -> Growable/resizable array algorithm
			al.add("a");
			al.add("b");
			al.add(5);
			al.add(6.7);
			al.add('p');
			al.add(true);
			al.add(null);
			
			al.add("a");
			al.add(null);
			al.add(5);

			al.add(6.7);
			al.add(new Ex(5, 6));
			al.add(new Ex(5, 6));
			al.add(new Sa(5, 6));
			al.add(new Sa(5, 6));

		//Operation #2: Counting objects
			System.out.println(al.size());
			
		//Operation #3: printing objects  
			System.out.println(al);
			
		//Operation #4: Searching an object in collection
			System.out.println(al.contains("a"));
			System.out.println(al.contains(5));
			System.out.println(al.contains(null));
			System.out.println(al.contains(6.7));
			System.out.println(al.contains(true));
			System.out.println(al.contains("A"));
			System.out.println(al.contains(new String("a")));
			System.out.println(al.contains(new Integer(5)));
			System.out.println(al.contains(new Ex(5, 6)));
			System.out.println(al.contains(new Sa(5, 6)));
			
		}

}
