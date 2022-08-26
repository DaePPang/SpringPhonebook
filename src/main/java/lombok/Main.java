package lombok;

public class Main {

	public static void main(String[] args) {
		Student s= new Student();
		s.setName("dae");
		s.setHp("010-1111-1111");
		System.out.println(s.getName());
		System.out.println(s.getHp());
		System.out.println(s.toString());
		
		Student s1 = new Student("hak", "010-3213-1415");

		System.out.println(s1.getName());
		System.out.println(s1.getHp());
		System.out.println(s1.toString());
		
		
	}
}
