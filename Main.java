import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		 LinkedList list = new LinkedList(); 
		 File file = new File("/Users/codyblanford/Desktop/Numbers.txt");
			Scanner sc;
			try {
				sc = new Scanner(file);
				 while (sc.hasNextDouble()) {
					    System.out.println(list.mean()); 
					    list.sd(list.mean());
				 }
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
	}
}

