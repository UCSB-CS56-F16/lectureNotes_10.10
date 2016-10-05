public class EqualsVsDoubleEquals {

	public static void main(String [] args) {
		
		Student a = new Student(1234567,"Alice");
		Student b = new Student(1234567,"Alice");
		Student c = a;
		Student d = b;

		System.out.println("a==a: "  + (a==a));
		System.out.println("a==b: "  + (a==b));
		System.out.println("a==c: "  + (a==c));
		System.out.println("a==d: "  + (a==d));

		System.out.println("b==c: "  + (b==c));
		System.out.println("b==d: "  + (b==d));

		System.out.println("c==d: "  + (c==d));

	}


}