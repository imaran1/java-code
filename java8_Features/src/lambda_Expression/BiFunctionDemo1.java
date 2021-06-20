package lambda_Expression;

import java.util.function.*;
import java.util.*;
class Student{
	String sName;
	int sRoll;
	public Student(String name, int roll) 
	{
		this.sName=name;
		this.sRoll=roll;
	}
}
public class BiFunctionDemo1 {

	public static void main(String[] args)
	{
		ArrayList<Student> sl = new ArrayList<Student>();
		BiFunction<String,Integer,Student> f = (sName, sRoll)->new Student(sName, sRoll);
		sl.add(f.apply("Imran", 1));
		sl.add(f.apply("Noor", 5));
		sl.add(f.apply("Rehan", 6));
		sl.add(f.apply("Reyaz", 4));
		sl.add(f.apply("Shahil", 2));
		sl.add(f.apply("Faizan", 3));
		for (Student student : sl) {
			System.out.println(student.sName+"...."+student.sRoll);
		}
	}

}
