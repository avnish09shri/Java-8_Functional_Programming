package comparable;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private String degree;
	private String placed;
	
	public Student() {}

	public Student(int id, String name, String degree, String placed) {
		this.id = id;
		this.name = name;
		this.degree = degree;
		this.placed = placed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getPlaced() {
		return placed;
	}

	public void setPlaced(String placed) {
		this.placed = placed;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", degree=" + degree + ", placed=" + placed + "]";
	}

	@Override
	public int compareTo(Student s) {
		return this.getDegree().compareTo(s.getDegree());
	}
	
	
}
