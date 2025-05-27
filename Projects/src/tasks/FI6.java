package tasks;

@FunctionalInterface
interface NIT2{
	String get(String nit);
}
public class FI6 {
	public static void main(String args[]) {
		NIT2 nit=(str) -> str + "WELCOME to";
		NIT2 nit1=(str) -> str + "NARESHIT";
		information("Hai ",nit);
		information("Hai",nit1);
		}

	private static void information(String str, NIT2 nit) {
		String result=nit.get(str);
		System.out.println(result);
		
	}

}
