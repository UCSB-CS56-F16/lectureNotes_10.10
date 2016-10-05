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


}