/*
 Q17.Choose the correct output for following code Snippet?
  
  A] Employee [id=5, name=Ram]
     Employee [id=7, name=Tear]  
     Employee [id=4, name=Jerry]

  B] Employee [id=7, name=Tear]
     Employee [id=5, name=Ram]
     Employee [id=1, name=John]

  c] Employee [id=1, name=John]
     Employee [id=5, name=Ram]
     Employee [id=7, name=Tear]

  D] Employee [id=22, name=You]
     Employee [id=4, name=Jerry]
     Employee [id=7, name=Tear]  
 
 */

package com.nt.mcqs;

import java.util.*;
public class Test20 {
static class Employee
{
private Integer id;
private String name;
public Integer getId() {
return id;
}
public String getName() {
return name;
}
public Employee(Integer id, String name) {
super();
this.id = id;
this.name = name;
}
@Override
public String toString() {
return "Employee [id=" + id + ", name=" + name + "]";
}
}
public static void main(String[] args) {
List<Employee> list = List.of(new Employee(1, "John") ,
new Employee(5, "Ram") ,
new Employee(7, "Tear") ,
new Employee(4, "Jerry") ,
new Employee(22, "You"));
list.stream().limit(3).sorted((o1,o2)->o1.getId() - o2.getId()).forEach(System.out::println);
}
}

/*
   c] Employee [id=1, name=John]
      Employee [id=5, name=Ram]
      Employee [id=7, name=Tear]
 */
