import java.util.HashMap;

public class HashTableDemo {

    public static void addToHashMap
	(HashMap<Integer,Student> permToStudent,
	 Student s) {
	permToStudent.put(s.getPerm(),s);
    }
    
    public static void main(String [] args) {

	HashMap<Student,String> studentToMajor =
	    new HashMap<Student,String> ();

	HashMap<Integer,Student> permToStudent=
	    new HashMap<Integer,Student> ();

	Student cg = new Student(1234567,"Chris Gaucho");
	studentToMajor.put(cg,"CMPSC");
	Student td = new Student(3333333,"Trey De La Playa");
	studentToMajor.put(td,"CMPEN");
	Student pp = new Student(4444444,"Pat Pardall");
	studentToMajor.put(pp,"MATH");

	Student pp2 = new Student(4444444,"Pat Pardall");

	addToHashMap(permToStudent,cg);
	addToHashMap(permToStudent,td);
	addToHashMap(permToStudent,pp);

	System.out.println("permToStudent: " + permToStudent);
	System.out.println("studentToMajor " + studentToMajor);


	String whatMajor = studentToMajor.get(pp2);

	System.out.println("pp2's major is " + whatMajor);

    }
    
}
