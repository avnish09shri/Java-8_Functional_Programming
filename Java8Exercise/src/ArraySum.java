import java.util.Arrays;
import java.util.List;

public class ArraySum {

	public static void main(String[] arg) {
		List<Integer> list=Arrays.asList(12,3,5,6,7,8,4,5);
		
		//Integer reduce = list.stream().reduce(0, (a,b)->a+b); // a is aggregate and b is next number
		
		Integer reduce=list.stream().reduce(0, Integer::sum); //using method reference
		System.out.println(reduce);
		
		Integer max = list.stream().reduce(0, Integer::max); //to find maximum number in list using method reference.
		
		//list.stream().reduce(INTEGER.MIN_VALUE,(x,y)->x>y?x:y); using aggregate and next number
		System.out.println(max);
	
		
		Integer min = list.stream().reduce(Integer.MAX_VALUE, Integer::min); //to find minimum number in list using method reference.
		
		//list.stream().reduce(INTEGER.MIN_VALUE,(x,y)->x>y?x:y); using aggregate and next number
		
		System.out.println(min);
		
		Integer squaresum = list.stream().map(x ->  x*x).reduce(0, Integer::sum);
		System.out.println(squaresum);
		
		Integer oddsum = list.stream().filter(x ->  x%2==1).reduce(0, Integer::sum);
		System.out.println(oddsum);
		
		//list.stream().distinct().forEach(System.out::println);
	}
	
}
