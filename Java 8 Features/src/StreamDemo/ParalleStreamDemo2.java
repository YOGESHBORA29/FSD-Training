package StreamDemo;

import java.util.ArrayList;
import java.util.List;

// java program to count Employee Hows salary is greater then15000
public class ParalleStreamDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List < Employee > empList = new ArrayList < Employee > ();
		for (int i = 0; i < 100; i++) {
		empList.add(new Employee("Allen", 20000));
		empList.add(new Employee("Boon", 3000));
		empList.add(new Employee("Cavin", 15002));
		empList.add(new Employee("Duke", 7856));
		empList.add(new Employee("Eon", 200));
		empList.add(new Employee("Fred", 50000));
		}
		empList.stream().forEach(i->System.out.println(i.getName()+""+i.getSalary()));
long t1 =System.currentTimeMillis();

	}

}
