/*
 Java Program to Add two Complex Numbers:
------------------------------------------
Complex numbers are numbers that consist of two parts — a real number and an imaginary number.
Complex numbers are the building blocks of more intricate math, such as algebra.
The standard format for complex numbers is a + bi, 
with the real number first and the imaginary number last.
 */
package gfg.programs;

public class ComplexNumber {
	int real,image;

	public ComplexNumber(int real, int image) {
		super();
		this.real = real;
		this.image = image;
	}
	public void show()
    {
        System.out.print(this.real + " +i" + this.image);
    }
	 public static ComplexNumber add(ComplexNumber num1,
                                     ComplexNumber num2){
		 ComplexNumber cn=new ComplexNumber(0,0);
		 cn.real = num1.real + num2.real;
		 cn.image = num1.image + num2.image;
		return cn;
	 }
	 public static void main(String arg[])
	    {
	        ComplexNumber c1 = new ComplexNumber(4, 5);
	        ComplexNumber c2 = new ComplexNumber(10, 5);
	   
	          System.out.print("First Complex number: ");
	          c1.show();
	         
	          System.out.print("\nSecond Complex number: ");
	          c2.show();
	 
	         ComplexNumber cn = add(c1, c2);
	 
	         System.out.println("\nAddition is :");
	         cn.show();
	    }
	}

