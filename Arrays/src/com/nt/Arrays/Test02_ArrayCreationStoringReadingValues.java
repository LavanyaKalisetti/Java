package com.nt.Arrays;

import java.util.Arrays;

public class Test02_ArrayCreationStoringReadingValues {
	public static void main(String[] args) {
		
		//Syntax #1: 
			//1. Creating array with new kw and dimension
			int[] ia1 = new int[5];
			
			//2. print array default values
			System.out.println(ia1[0]);
			System.out.println(ia1[1]);
			System.out.println(ia1[2]);
			System.out.println(ia1[3]);
			System.out.println(ia1[4]);
			System.out.println();
			
			//3. Initializing array object
			ia1[0] = 3;
			ia1[1] = 4;
			ia1[2] = 5;
			ia1[3] = 6;
			ia1[4] = 7;
			
			//4. printing array values after initialization
			System.out.println(ia1[0]);
			System.out.println(ia1[1]);
			System.out.println(ia1[2]);
			System.out.println(ia1[3]);
			System.out.println(ia1[4]);
			System.out.println();
			
		//Syntax #2: 
			//1. Declaring array variable, creating array object and  initializing array object in a single line 0  1  2  3  4	
			int[] ia2 = {3, 4, 5, 6, 7};

			//2. printing array values after initialization
			System.out.println(ia2[0]);
			System.out.println(ia2[1]);
			System.out.println(ia2[2]);
			System.out.println(ia2[3]);
			System.out.println(ia2[4]);
			System.out.println();
			
		//Rule: index [>=0 && <length]	
		   //System.out.println(ia1[-1]); //RE: j.l.AIOOBE 
		  //System.out.println(ia1[5]); //RE: j.l.AIOOBE
			
			
		//5 ways of printing array values 	
		//=================================	
	//Approach #1: Reading and printing directly	//Problem: This code is 
           //System.out.println("ia1[0]: "+ ia[0]);	//static nature code because
           //System.out.println("ia1[1]: "+ ia[1]);	//as and when the number of
          //System.out.println("ia1[2]: "+ ia[2]);	//values in array object are 
         //System.out.println("ia1[3]: "+ ia[3]);	//increased or decreased
         //System.out.println("ia1[4]: "+ ia[4]);	//we must add and remove	
         //System.out.println();					//these printing statements
			
	 //Solution: we must develop dynamic code by using for loop

	//Approach #2: Reading and printing	by using loop with index	
			for(int i=0; i<ia1.length; i++){			
				int value = ia1[i];
				System.out.println("ia["+i+"]: "+ value); 
			}
			System.out.println();
		
	//Approach #3: Reading and printing by using enhanced for loop(for-each loop) 	
			for(int value : ia1){					
				System.out.println(value); 
			}
			System.out.println();
			
	//Approach #4: Directly printing by using predefined method Arrays.toString(-)
			System.out.println(java.util.Arrays.toString(ia1)); //[3, 4, 5, 6, 7]
			System.out.println();
			
	//Approach #5: by using stream API by using lambda expression
			Arrays.stream(ia1).forEach(value -> System.out.println(value));
			System.out.println();
			
		//by using stream API by using method reference
			Arrays.stream(ia1).forEach(System.out::println);
			
			
	//10. Limitation of an array object	
	      //- It can store only same or similar type values
         //- If we try to store different type values, we will get CE
		  
      //- For example  			

		//int[] ia2 = {5, 6, 7};		//same type of values
		
		int[] ia3 = {5, 'a', 7};	//similar type of values
									//means same type or its lesser type values
									
      //int[] ia4 = {5, 7L, 10.5, true}; //incompatible types and higer range 
								//values are not allowed to store, we will get CE
		
		//solution: we must user defined class object or collection object
		  
	
		}

}
