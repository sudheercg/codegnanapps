package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialilzationDemo {

	public static void main(String[] args) {
		
		Person person=null;
		
		try(FileInputStream fis = new FileInputStream("person.ser");
		    ObjectInputStream ois = new ObjectInputStream(fis)){
		
			//deserialized Person Object
			person= (Person)ois.readObject();
			
		}catch(IOException io) {
			io.printStackTrace();
		} catch (ClassNotFoundException e) {
					e.printStackTrace();
		}
		
		System.out.println("Deserialized Person::::");
		System.out.println(person);
	}

}
