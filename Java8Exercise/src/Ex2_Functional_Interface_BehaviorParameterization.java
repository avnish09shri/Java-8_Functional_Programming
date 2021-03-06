import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex2_Functional_Interface_BehaviorParameterization {

	public static void main(String[] arg) {
		List<Integer> list=Arrays.asList(12,3,5,6,7,8,4,5);
	
		//Function<? super Integer, ? extends Integer> mapper = x->x*x;
		
		extracted(list, x->x*x);
	}

	private static void extracted(List<Integer> list, Function<? super Integer, ? extends Integer> mapper) {
		list.stream().map(mapper).collect(Collectors.toList()).forEach(System.out::println);;
	}
	
}
