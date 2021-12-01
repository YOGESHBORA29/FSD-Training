package newfeatures;
// block lamda expresstion
public class LamdaDemo3 {

	public static void main(String[] args) {
		MyString reverseStr=(str)-> {
			String result="";
			for(int i=str.length()-1;i>=0;i--)
				result+=str.charAt(i);
			return result;
		};
		System.out.println(reverseStr.myStringFunction("lamdaExpression"));
	

	// lamda expression with single parent
	MyString MyName=(name)->{return "hello"+name;};
	 System.out.println(MyName.myStringFunction("RAJ"));

	}

}
