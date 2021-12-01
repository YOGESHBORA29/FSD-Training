package newfeatures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 
forEach() Method In Iterable Interface
Java 8 has introduced a “forEach” method in the interface java.lang.
Iterable that can iterate over the elements in the collection. 
“forEach” is a default method defined in the Iterable interface. 
It is used by the Collection classes that extend the Iterable interface to iterate elements.The “forEach” method takes the Functional Interface as a single parameter
 i.e. you can pass Lambda Expression as an argument.


 */

public class ForEachDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<String>languages = new ArrayList<String>();//Declear arrylist
	//add languages
	languages.add("java");
	languages.add("python");
	languages.add("cs");
	languages.add(".net");
	System.out.println("******* java programing********");
	languages.forEach(i -> System.out.println(i));
	// i : input parameter on the left side
	//System.out.println(i)) :meathod body on Right side
	
	//print element useing shorthand
	System.out.println("**********print useing method referance operater");
	languages.forEach(System.out::println);
	
	//Map
	Map<Integer,String> customer=new HashMap<Integer,String>();
	//add elements 
	customer.put(101, "yogesh");
	customer.put(102, "rahul");
	customer.put(103, "rakesh");
	System.out.println("******* customer Account********");
	customer.forEach((k,v) -> System.out.println("key"+ k +"-->values =" + v));
	
	//using lamda expression to print content 
	ArrayList<Integer> arrL = new ArrayList<Integer>();
	arrL.add(1);
	arrL.add(2);
	arrL.add(3);
	arrL.add(4);
	System.out.println("******* Arraylist********");
	arrL.forEach(i -> System.out.println(i));
	
	
	System.out.println("******* Even no display********");
	arrL.forEach(n -> {if(n%2==0) System.out.println(n);});
	
	
	}

}
