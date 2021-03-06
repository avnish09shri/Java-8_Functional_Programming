import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex_Functional_Interface {

	public static void main(String[] arg) {
		List<Integer> list=Arrays.asList(12,3,5,6,7,8,4,5);
		
		
		//Predicate<Integer> predicate = x->x%2==0;
		
		@SuppressWarnings("unused")
		Predicate<Integer> predicate2 = new Predicate<Integer>() {

			@Override
			public boolean test(Integer t) {
				return t%2==0;
			}
			
		};
		//Function<Integer, Integer> mapper = x->x*x;
		
		@SuppressWarnings("unused")
		Function<Integer, Integer> mapper2 = new Function<Integer, Integer>(){

			@Override
			public Integer apply(Integer t) {
				
				return t*t;
			}
			
		};
		
		//Consumer<Integer> action = System.out::println;
		
		@SuppressWarnings("unused")
		Consumer<Integer> action2 = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
			
		};
		
		list.stream()
		.filter(predicate2)
		.map(mapper2)
		.forEach(action2);
		
	
	}
	
}
