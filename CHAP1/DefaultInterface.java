
interface Bounce{
	default int method1(){
		System.out.println(1);
		return 1;
	}
	static int method2(){
		return 42;
	}
}

public class DefaultInterface implements Bounce{
	public static void main(String [] args){
		// Call static method using Interface Reference
		System.out.println(Bounce.method2());
		// Call Default method using Instance Reference
		new DefaultInterface().method1();
	}
}