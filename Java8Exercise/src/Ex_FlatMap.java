import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_FlatMap {

	public static void main(String[] arg) {
		List<String> list=Arrays.asList("Spring","Docker","AWS","Kubernetes","Spring");
		
		String collect = list.stream().collect(Collectors.joining(","));
		System.out.println(collect);
	
		List<String> collect2 = list.stream().map(str->str.split(" "))
				.flatMap(Arrays::stream).distinct().collect(Collectors.toList());
		System.out.println(collect2);
		
	}
	
	

	
}
