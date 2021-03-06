import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex_StreamMethods {

	public static void main(String[] arg) {
		List<Integer> list=Arrays.asList(12,3,5,6,7,8,4,5);
		
		
		long count = Stream.of(12,9,6).count();
		System.out.println(count);
	
		
		Integer sum = Stream.of(12,4,5,6).reduce(0, Integer::sum);
		System.out.println(sum);
		
		int[] arr= {12,3,5,6,7,8,4,5};
		
		int sum2 = Arrays.stream(arr).sorted().sum();
		System.out.println(sum2);
		
		//IntStream.range(1, 100).forEach(System.out::println);
		
		IntStream.iterate(1, e -> e+2).limit(15).peek(System.out::println).sum();
		
		List<Integer> collect = IntStream.iterate(1, e->e+2).limit(20).boxed().collect(Collectors.toList());
		System.out.println(collect);
		
		
		BigInteger product = LongStream.rangeClosed(1, 40).mapToObj(BigInteger::valueOf)
				.reduce(BigInteger.ONE, BigInteger::multiply);
		System.out.println(product);
	}
	
}
