import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {

	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,5,6,7,8,9,10};
		
		/*
		 * Arrays.stream(arr).average(); IntStream stream=Arrays.stream(arr);
		 * 
		 * IntSummaryStatistics summary=stream.summaryStatistics();
		 * 
		 * double average = summary.getAverage(); //System.out.println(average);
		 * System.out.println(average);
		 */

		ArrayList<Integer> list=new ArrayList<>();
		for(int a:arr)
			list.add(a);
		
		double orElse = list.stream().mapToInt(Integer::intValue).average().orElse(Double.NaN);
		System.out.println(orElse);
	}

}
