import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Ex1_Functional_Interface_UnaryOperator {

	public static void main(String[] arg) {
		List<Integer> list=Arrays.asList(12,3,5,6,7,8,4,5);
		
		
		Supplier<Integer> randomSupplier = () -> {
			return new Random().nextInt(1000);
		};
		System.out.println(randomSupplier.get());
		
		UnaryOperator<Integer> unaryOperator = x -> 2*x;
		System.out.println(unaryOperator.apply(10));
		
		BiPredicate<Integer, String> biPredicate = (number,str) -> number > 10 && str.length() >=4;
		System.out.println(biPredicate.test(12, "String"));
		
		BiFunction<Integer, Integer, String> biFunction = (num, num1) -> {
				return num+num1+"";
		};
		System.out.println(biFunction.apply(45, 23));
		
		BiConsumer<Integer, String> biConsumer =(num,str) ->{
			System.out.println(num);
			System.out.println(str);
		};
		
		biConsumer.accept(12, "Avnish");
	}
	
}
