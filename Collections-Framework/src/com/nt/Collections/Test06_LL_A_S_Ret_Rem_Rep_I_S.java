package com.nt.Collections;

import java.util.LinkedList;

public class Test06_LL_A_S_Ret_Rem_Rep_I_S {
	public static void main(String[] args) {
		//Creating new instance of AL
			LinkedList<Object> ll = new LinkedList<>();
			
		//Operation #1: Adding objects -> doubly linked list DS and algorithm 
			ll.add("a");
			ll.add("b");
			ll.add(5);
			ll.add(6.7);
			ll.add('p');
			ll.add(true);
			ll.add(null);
			
			ll.add("a");
			ll.add(null);
			ll.add(5);

			ll.add(6.7);
			ll.add(new Ex(5, 6));
			ll.add(new Ex(5, 6));
			ll.add(new Sa(5, 6));
			ll.add(new Sa(5, 6));

		//Operation #2: Counting objects
			System.out.println(ll.size());
			
		//Operation #3: printing objects  
			System.out.println(ll);
			
		//Operation #4: Searching an object in collection (== operator an equals() method)
			System.out.println(ll.contains("a"));			//linear searching algorithm
			System.out.println(ll.contains(5));
			System.out.println(ll.contains(null));
			System.out.println(ll.contains(6.7));
			System.out.println(ll.contains(true));
			System.out.println(ll.contains("A"));
			System.out.println(ll.contains(new String("a")));
			System.out.println(ll.contains(new Integer(5)));
			System.out.println(ll.contains(new Ex(5, 6)));
			System.out.println(ll.contains(new Sa(5, 6)));
			System.out.println();
			
		//Operation #5: Retrieving index of the given object (searching)[== operator and equals() method]
			System.out.println(ll.indexOf("a"));		//linear searching algorithm
			System.out.println(ll.indexOf("A"));
			System.out.println(ll.indexOf(new String("a")));
			System.out.println(ll.indexOf(new Ex(5 ,6)));
			System.out.println(ll.indexOf(new Sa(5 ,6)));
			System.out.println();
			
			System.out.println(ll.lastIndexOf("a"));
			System.out.println(ll.lastIndexOf("A"));
			System.out.println(ll.lastIndexOf(new String("a")));
			System.out.println(ll.lastIndexOf(new Ex(5 ,6)));
			System.out.println(ll.lastIndexOf(new Sa(5 ,6)));
			System.out.println();
			
		//Operation #6: Retrieving object from LinkedList, it does not have index
			System.out.println(ll.get(0));		//search for given index node in LL 	
			System.out.println(ll.get(4));		//it implicitly generates index
			System.out.println(ll.get(10));		//and search for the given index node
			System.out.println(ll.get(11));		//by following binary search algorithm	
			System.out.println(ll.get(13));		//means it divides LL into 2 halfs  
			//System.out.println(al.get(-1));	//then searches the given index node 
			//System.out.println(al.get(15));	//node either in first half or in second half
												//bit not in the entire LinkedList
			
			//retrieving the particular object from collection where ever it is available
			int index = ll.indexOf('p');
			if(index!=-1) {
				Object obj = ll.get(index);
				System.out.println(obj);
			}else {
				System.out.println("'p' is not available");
			}
			System.out.println();
			
			//Operation #7: removing object [== operator and equals() method]
								
				/*
				 * remove(int)  //binary search algorithm
				 *  
				 * remove(Object),	 
				 * removeAll(col), 	//linear search algorithm
				 * retainAll(col),
				 * 
				 * removeIf(Predicate), clear()
				 */
			System.out.println(ll);
//			 							///LSA
			System.out.println(ll.remove("a"));	//remove(Object) -> "a" is removed
			System.out.println(ll);   
										//BSA
			System.out.println(ll.remove(5));	//remove(index)  -> 5th index object is removed
			System.out.println(ll);
										//LSA
			System.out.println(ll.remove((Integer)5));	//remove(object)  -> 5 is removed
			System.out.println(ll);
			
			//System.out.println(al.remove('p'));	//remove(index)  -> 'p' index object being removed -> not found -> RE: IOOBE
			System.out.println(ll.remove((Character)'p'));	//remove(object)  -> 'p' is removed
			System.out.println(ll);
			
			System.out.println(ll.remove(6.7));	//remove(object)  -> 6.7 is removed
			System.out.println(ll);
			
			System.out.println(ll.remove(true));//remove(object)  -> true is removed
			System.out.println(ll);
			
			System.out.println(ll.remove(new Ex(5, 6)));//remove(object)  -> Ex(5,6) is !removed
			System.out.println(ll);						//because it is not found in collection
														//because equals() method is not overridden
			
			System.out.println(ll.remove(new Sa(5, 6)));//remove(object)  -> Sa(5,6) is removed
			System.out.println(ll);						//because it is found in collection
			System.out.println();						//because equals() method is overridden
			
			//What is the output from below program?
			LinkedList<Integer> al2 = new LinkedList<>();
			for(int i=1; i<=10; i++) {
				al2.add(i*10);
			}
									 // 0   1    2   3   4  5   6    7  8    9	
			System.out.println(al2); //[10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
			al2.remove(1);			 //[10, 30, 40, 50, 60, 70, 80, 90, 100]
			al2.remove(2);			 //[10, 30, 50, 60, 70, 80, 90, 100]
			System.out.println(al2); //[10, 40, 50, 60, 70, 80, 90, 100]
			System.out.println();
			
			LinkedList<Object> al3 = new LinkedList<>();
			al3.add("a");
			al3.add(5);
			al3.add("b");
			al3.add(6);
			al3.add("c");
			al3.add(7);
			
			System.out.println(al3);
			//al3.removeIf(ele -> ele instanceof String);
			//al3.removeIf(ele -> ele instanceof Integer);
			al3.removeIf(ele -> ele instanceof Integer && ((Integer)ele)%2==0);
			System.out.println(al3);
			System.out.println();
			
			LinkedList<Object> al4 = new LinkedList<>();
			al4.add("a");
			al4.add(5);
			
			LinkedList<Object> al5 = new LinkedList<>();
			al5.add("a");
			al5.add(5);
			al5.add("b");
			al5.add("a");
			al5.add(6);
			al5.add(5);
			al5.add("c");
			al5.add(7);
			
			System.out.println(al5);
			//al5.removeAll(al4); 	//no error
			//al5.retainAll(al4);	//no error
			al5.clear();
			System.out.println(al5);
			System.out.println();
			
		//Operation #8:	Inserting object or collection of objects
			LinkedList<Object> al6 = new LinkedList<>();
			al6.add("a");
			al6.add(5);
			al6.add("b");
			al6.add(6);
			al6.add("c");
			al6.add(7);
			System.out.println(al6);
				//BSA
			al6.add(1, "X");				//index based -> binary search algorithm
			System.out.println(al6);
			
			al6.addAll(4, al4);
			System.out.println(al6);
			
		//Operation #9: replacing object
			      //BSA
			al6.set(4, "Y");				//index based -> binary search algorithm
			System.out.println(al6);
			
			//al6.replaceAll(ele -> "Hi");
			//al6.replaceAll(ele -> 10);
			//al6.replaceAll(ele -> (ele instanceof String ? ele.hashCode() : ele));
			al6.replaceAll(ele -> (ele instanceof String ? ((String)ele).toUpperCase() : ele));
			System.out.println(al6);
			System.out.println();
			
		//Operation #10: Sorting objects in collection(rule collection must be homogeneous)
			LinkedList<String> al7 = new LinkedList<String>();
			al7.add("a");
			al7.add("c");
			al7.add("b");
			System.out.println(al7);
			al7.sort(null);
			System.out.println(al7);
			
		}
	}



