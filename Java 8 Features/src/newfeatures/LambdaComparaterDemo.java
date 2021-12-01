package newfeatures;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/*
 * Java lambda expression can be used in the collection framework.
 *  It provides efficient and concise way to iterate, filter and fetch data
 */


public class LambdaComparaterDemo {

	public static void main(String[] args) {
		Student s1=new Student (101,"rahul",78);
		Student s2=new Student (102,"Yogesh",79);
		Student s3=new Student (103,"rakesh",80);
		Student s4=new Student (104,"reena",90);
		Student s5=new Student (105,"shubham",100);
		
		//add student to arraylist
		List<Student> sList=new ArrayList<Student>();
		sList.add(s1);
		sList.add(s2);
		sList.add(s3);
		sList.add(s4);
		sList.add(s5);
		
		
		//implementing lamda expression to sort user define object useding 
		//comparater interfaces's compare to() meathod 
		Collections.sort(sList,(st1,st2)->{
			return st1.name.compareTo(st2.name);
		});
		
		
		for(Student s:sList)
		{
			System.out.println(s.rollNumber+""+s.name+""+s.marks);
		}
		
	//sort based on marks of student 
	System.out.println("****************desending order*************");
	
	Collections.sort(sList,(st1,st2)->{
		return st1.marks.compareTo(st2.marks);
	});
	//foreach() loop
	sList.forEach(s->System.out.println(s.rollNumber+""+s.name+""+s.marks));
	
	}
		
		
		

	}


