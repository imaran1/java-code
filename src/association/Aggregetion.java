package association;

class College{
	String name ;
	String registrationNo ;
	Teacher t;
}

class Teacher{
	String name = "Noor";
	int id = 786;
	public void display() {
		System.out.println("Teacher Name: "+ name);
		System.out.println("Teacher Id: "+ id);
	}
}

public class Aggregetion {

	public static void main(String[] args) {
		College c = new College();
		Teacher tech = new Teacher();
	    tech.display();
		c.name = "BBDNITM";
		c.registrationNo = "1293Noor";
		c=null;
		System.out.println("College Name: "+c.name);
		System.out.println("College Registration No.: "+c.registrationNo);
		
	    c.t=tech;
	}
}
