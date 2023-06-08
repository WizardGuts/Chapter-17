import java.io.*;
import java.util.*;

public class Exercise17_01 {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> list = new ArrayList<>();
		
		File textFile = new File("Exercise17_01, 100 Random Integers");
		if(textFile.exists()) {
			try (
				Scanner input = new Scanner(textFile);
			) {
				while (input.hasNext()) {
					list.add(input.nextLine());
				}
			}
		}
		
		for (int i = 0; i < 100; i++) {
			list.add(((int)(Math.random() * 100) + ""));
		}
		
		try ( 
			PrintWriter output = new PrintWriter(textFile);
		) {
				output.print(list);
		}
	}
}