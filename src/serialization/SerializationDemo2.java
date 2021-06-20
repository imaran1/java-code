package serialization;

import java.io.*;

class Student implements Serializable{
	transient int a=10; int b=20;
}

public class SerializationDemo2 {

	public static void main(String[] args)throws Exception {
		Student s1 = new Student();
		
		FileOutputStream fos = new FileOutputStream("abc1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);

		FileInputStream fis = new FileInputStream("abc1.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student s2 = (Student) ois.readObject();
		System.out.println(s2.a+"....."+s2.b);
	}

}
