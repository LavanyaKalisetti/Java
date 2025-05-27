

class Example{
	int x=10;
	{
		System.out.println("aa");
	}
	Example(){
		System.out.println("bb");
	}
}
public class Sample extends Example {
	int y=20;
	{
		System.out.println("cc");
	}
	Sample(){
		System.out.println("dd");
	}
	public static void main(String []args) {
		Sample s1=new Sample();
	}

}
