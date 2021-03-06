package comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee_Main {

	public static void main(String[] args) {
		
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1,"Avnish","Ganeshpura, Morena",25));
		list.add(new Employee(2,"Rahul","Pinto Park, Gwalior",24));
		list.add(new Employee(3,"Gaurav","Sikandar Kampoo, Gwalior",27));
		
		/*
		 * for(Employee e:list) { System.out.println(e);
		 * 
		 * }
		 */
		
		System.out.println("By Name");
		System.out.println();
		Collections.sort(list, new NameComparator() );
		
		for(Employee e:list) { 
			System.out.println(e);
		}
		
		System.out.println("---------");
		System.out.println();
		
		System.out.println("By Age");
		System.out.println();
		
		Collections.sort(list, new AgeComparator());
		
		for(Employee e:list) { 
			System.out.println(e);
		}
		
		System.out.println("---------");
		System.out.println();
		
		System.out.println("By Address");
		System.out.println();
		
		Collections.sort(list, new AddressComparator());
		
		for(Employee e:list) { 
			System.out.println(e);
		}
		
	}

}
