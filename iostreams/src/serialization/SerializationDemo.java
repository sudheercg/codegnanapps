package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args)  {

		Person person = new Person("Sam", 22,"secret");
		
		try(FileOutputStream fos = new FileOutputStream("person.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos)){
		
		//Serializaing a person object	
		oos.writeObject(person);
		System.out.println("Serialized data is in person.ser");
		
		}catch(IOException io) {
			io.printStackTrace();
		}
		}
		
		
	}

