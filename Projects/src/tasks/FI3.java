package tasks;

 interface Add1 {
	int add(int b);
	//int add(int a,int b);
}
 public class FI3{
	public static void main(String[] args) {
		int a=10;
		Add1 add= b -> b+b;
		System.out.println(add.add(a));
	}
}

