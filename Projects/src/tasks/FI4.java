package tasks;

@FunctionalInterface
interface Str{
	int methodStr(String Str);
}
public class FI4 {
	public static void main(String[] args) {
		//Str str=(String s) -> "2";//Type mismatch: cannot convert from String to int
		//System.out.println(str.methodStr("2"));
	}

}
