package newfeatures;

public class LamdaDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Addtion op1=(a,b) -> (a+b);
		System.out.println("Addtion of 2 no:"+op1.calculater(200,500));
		
		 Addtion op2=(a,b) -> (a-b);
			System.out.println("Substration of 2 no:"+op2.calculater(200,500));

			 Addtion op3=(a,b) -> (a*b);
				System.out.println("multipilcationof 2 no:"+op3.calculater(200,500));

				 Addtion op4=(a,b) -> (a/b);
					System.out.println("divison of 2 no:"+op4.calculater(200,500));


	}

}
