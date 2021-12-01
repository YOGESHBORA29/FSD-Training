package StreamDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StremExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Book> list=new ArrayList<Book>();

		//Creating Books
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
		Book b2=new Book(102,"Data Communications and Networking","Forouzan","Mc Graw Hill",4);
		Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
		Book b4=new Book(104,"Python","yogesh","BORA",9);

		//Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		List<Integer> list1 = list.stream().filter(b->b.quantity>7).map(b->b.quantity).collect(Collectors.toList());
		        System.out.println("Book with quantity");
		        System.out.println(list1);
		        
		        System.out.println("Books with quantity greater than 7");
		        System.out.println(list1);



		        System.out.println("Books Details with quantity greater than 7:");
		        list.stream().filter(b->b.quantity>7).forEach(b-> System.out.println(b.id+ "| "+b.name+"| "+b.author+" |"+b.publisher+" |"+b.quantity));
		        
		        
		        Book bk1=list.stream().max((book1,book2)-> book1.quantity>book2.quantity ? 1:-1).get();
		        System.out.println("Max qnty of books: "+bk1.quantity + bk1.name);





		        Book bk2=list.stream().min((book1,book2)-> book1.quantity>book2.quantity ? 1:-1).get();
		        System.out.println("Max qnty of books: "+bk2.quantity +bk2.name);



		        //count()



		        long count=list.stream().count();
		        System.out.println("Total no. of books: "+count);



		        long count1=list.stream().filter(b->b.quantity<7).count();
		        System.out.println("Total books with quantity less then 7: "+count1);
		        }

	}


