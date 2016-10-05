public class EqualsVsDoubleEquals {

	public static void main(String [] args) {
		
		Student a = new Student(1234567,"Alice");
		Student b = new Student(1234567,"Alice");

		Student c = a;
		Student d = b;
		Student e = new Student(1234567,"Alicia");
		Student f = new Student(7654321,"Alice");

		System.out.println("a==a: "  + (a==a));
		System.out.println("a==b: "  + (a==b));
		System.out.println("a==c: "  + (a==c));
		System.out.println("a==d: "  + (a==d));
		System.out.println("b==c: "  + (b==c));
		System.out.println("b==d: "  + (b==d));
		System.out.println("c==d: "  + (c==d));

		System.out.println("a.equals(a) "  + a.equals(a));
		System.out.println("a.equals(b) "  + a.equals(b));
		System.out.println("a.equals(c) "  + a.equals(c));
		System.out.println("a.equals(d) "  + a.equals(d));
		System.out.println("b.equals(c) "  + b.equals(c));
		System.out.println("b.equals(d) "  + b.equals(d));
		System.out.println("c.equals(d) "  + c.equals(d));

		System.out.println("a.equals(e) "  + a.equals(e));
		System.out.println("a.equals(f) "  + a.equals(f));


	}


}