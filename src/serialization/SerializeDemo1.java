package serialization;

import java.io.*;

class Dog implements Serializable{
	int a=10;
	int b=20;
}
public class SerializeDemo1 {

	public static void main(String[] args)throws Exception {
		Dog d1 = new Dog();
		File file = new File("abc.ser");
		file.createNewFile();
		
		// Serialization
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		//Deserialization
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Dog d2 = (Dog) ois.readObject();
		System.out.println(d2.a+"...."+d2.b);
	}

}
