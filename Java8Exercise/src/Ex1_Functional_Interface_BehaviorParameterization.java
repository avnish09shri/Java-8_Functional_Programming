import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Ex1_Functional_Interface_BehaviorParameterization {

	public static void main(String[] arg) {
		List<Integer> list=Arrays.asList(12,3,5,6,7,8,4,5);
		
		//Predicate<? super Integer> evenpredicate = x->x%2==0;
		
		
		extracted(list, x->x%2==0);
		
		//Predicate<? super Integer> oddpredicate = x->x%2!=0;
		
		extracted(list, x->x%2!=0);
		
	}

	private static void extracted(List<Integer> list, Predicate<? super Integer> predicate) {
		list.stream().filter(predicate).forEach(System.out::println);
	}
	
}
