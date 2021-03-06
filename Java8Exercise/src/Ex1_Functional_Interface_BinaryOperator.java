import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Ex1_Functional_Interface_BinaryOperator {

	public static void main(String[] arg) {
		List<Integer> list=Arrays.asList(12,3,5,6,7,8,4,5);
		
		
		//BinaryOperator<Integer> binaryOperator = Integer::sum;
		
		BinaryOperator<Integer> binaryOperator2 = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				// TODO Auto-generated method stub
				return t+u;
			}
			
		};
		
		Integer reduce=list.stream().reduce(0, binaryOperator2); //using method reference
		System.out.println(reduce);
		
		//BinaryOperator<Integer> maximum = Integer::max;
		
		BinaryOperator<Integer> maximum2 = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return Math.max(t, u);
			}
			
		};
		Integer max = list.stream().reduce(Integer.MIN_VALUE, maximum2);
		System.out.println(max);
		
	}
	
}
