import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex_ReplaceAll {

	public static void main(String[] arg) {
		List<String> list=Arrays.asList("Spring","Docker","AWS","Kubernetes","Spring");
		
		
		List<String> courses=new ArrayList<>(list);
		courses.replaceAll(str->str.toUpperCase());
		
		System.out.println(courses);
		
		courses.removeIf(str->str.equalsIgnoreCase("spring"));
		System.out.println(courses);
	}

	
}
