/*
 * Q10.Choose the correct output for following code Snippet?
  
   A] [15, 5565, 646, 233, 100]
      []

   B] [15, 5565, 646, 233, 100]  
      [5565, 646]

   c] [15, 5565, 646, 233, 100]  
      [646, 233]

   D] Runtime Exception 
 */

package com.nt.mcqs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test10 {
public static void main(String args[]) {
List mylist = new ArrayList();
int[] val = {15, 5565, 646, 233, 100};
for (int element : val)
mylist.add(new Integer(element));
System.out.println(mylist);
Iterator iterator = mylist.iterator();
int i = mylist.size(); //i =
while (iterator.hasNext()) {
Integer element = (Integer) iterator.next();
int value = element.intValue();
i--;
if ((value < 100) || mylist.get(i).equals(100))
iterator.remove();
}
System.out.println(mylist);
}
}

/*
 Output: A] [15, 5565, 646, 233, 100]
            []
*/
