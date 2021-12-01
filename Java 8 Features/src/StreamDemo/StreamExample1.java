package StreamDemo;

import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] marks= {100,20,30,40};
		//Building array for stream
		Stream <Integer>strm=Stream.of(marks);
		strm.forEach(i->System.out.println(i));

	}

}
