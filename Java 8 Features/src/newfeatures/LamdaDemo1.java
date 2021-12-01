package newfeatures;
@FunctionalInterface
interface MyFI//Fuction interface
{
	public String sayHello();
	//public String sayHello();
	}
public class LamdaDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFI msg= ()->{return "Hello World";};//lamda expression
		System.out.println(msg.sayHello());

	}

}
