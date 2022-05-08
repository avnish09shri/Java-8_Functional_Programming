import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayDistinct {

	public static void main(String[] arg) {
		List<String> list=Arrays.asList("Spring","Docker","AWS","Kubernetes","Spring");
		
		
		//list.stream().distinct().forEach(System.out::println);
		
		//.stream().sorted().forEach(System.out::println);
		
		//.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		//list.stream().sorted(Comparator.comparing(str->str.length())).forEach(System.out::println);
	
		List<Integer> numbers=Arrays.asList(12,3,5,6,7,8,4,5);
		
		//numbers.stream().filter(n->n%2==1).distinct().sorted(Comparator.reverseOrder()).collect(Collectors.toList())
		//.forEach(System.out::println);;
		
		List<Integer> collect = numbers.stream().filter(n->n%2==0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(collect);
	}

	
}
