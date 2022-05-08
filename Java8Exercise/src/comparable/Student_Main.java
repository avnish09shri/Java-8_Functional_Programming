package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student_Main {

	public static void main(String[] args) {
		List<Student> list=new ArrayList<>();
		
		list.add(new Student(2,"Himanshi","MCA","Yes"));
		list.add(new Student(1,"Urvashi","B.tech","No"));
		list.add(new Student(3,"Shubham Gupta","B.sc","No"));
		
		System.out.println("By Degree");
		System.out.println("---");
		
		Collections.sort(list);
		for(Student e:list)
			System.out.println(e);	
		
	}

}
