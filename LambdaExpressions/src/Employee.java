import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Employee{

	public static void main(String[] args)
	{
List<Integer> jesus = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);

System.out.println("Even Number are : ");

eval(jesus,n -> n%2 == 0);

System.out.println("Odd Number are : ");

eval(jesus,n -> n%2 != 0);

System.out.println("Greter Than 5 : ");

eval(jesus,n -> n>5);


System.out.println("Love you God so much");
	}
	
	public static void eval(List<Integer> jesus,Predicate<Integer> predicte)
	{
		for(Integer n:jesus)
		{
			if(predicte.test(n))
			{
				Consumer<Integer> prabhu = a ->System.out.println(n);

				prabhu.accept(n);
			}
		}
	}

}		
		



