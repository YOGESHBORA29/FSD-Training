package newfeatures;

import java.util.Optional;

public class OptinalDemo {

	public static void main(String[] args) {
		/*String s=null;
		Integer a=null;
		System.out.println(s.length());
		 * This will thought Null pOinter exception
*/
		String s=null;
		//String s="hello";
		// Optional object is a container For not null object
		Optional<String> cheNull=Optional.ofNullable(s);
		if(cheNull.isPresent())
		{
			System.out.println("Length of String "+s.length());
			cheNull.ifPresent(System.out::println);
			System.out.println("uppercase"+s.toUpperCase());
			System.out.println(cheNull.get());
		}
		else {
			System.out.println("String is not present");
		}
	}

}
