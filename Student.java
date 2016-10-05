public class Student {

	private int perm;
	private String name;
	
	public Student(int perm, String name) {
		this.perm = perm;
		this.name = name;
	}
	
	public String getName() { return this.name; }
	
	public int getPerm() { return this.perm; }
	
	
	@Override public String toString() {
		return this.perm + " " + this.name; 
	}

	@Override public boolean equals(Object o) {
		// Start: boilerplate code for .equals
		
		if (this == o) return true;
		if (o == null) return false;
		if (getClass() != o.getClass()) return false;
		Student s  = (Student) o;

		// End boilerplate
		
		return this.perm == s.perm && this.name.equals(s.name);

	}

	@Override public int hashCode() {
		return this.perm ^ this.name.hashCode();
	}

}