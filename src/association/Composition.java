package association;

class Engine
{
	String model ;
	String engineNo ;
}

class Car 
{
	String name ;
	double price ;
	Engine e = new Engine();
	public void display() 
	{
		e.engineNo = "1nfu9404";
		e.model = "238InNo";
		System.out.println("Engine No.: "+e.engineNo);
		System.out.println("Engine ModelNo.: "+e.model);
	}
}

public class Composition<K, V> 
{
	String name;
	Composition(String n)
	{
		this.name=n;
	}

	public static void main(String[] args) {
		Car c = new Car();
		//c=null;
		c.name = "Alto";
		c.price = 109384.38475; 
		System.out.println("Car Name: "+ c.name);
		System.out.println("Car Price: "+c.price);
		c.display();
	}

}
