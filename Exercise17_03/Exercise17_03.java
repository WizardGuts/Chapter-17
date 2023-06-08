import java.io.*;

public class Exercise17_03 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		int sum = 0;
		
		File exercise = new File("Exercise17_03.dat");
		if(!exercise.exists()) {
			try (
				DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise17_03.dat"))
			) {
				for (int i = 0; i < 100; i++) {
					int integers = (((int)(Math.random() * 100)));
					output.writeInt(integers);
				}
			}
		}
		
			try (
				DataInputStream input = new DataInputStream(new FileInputStream("Exercise17_03.dat"))
			) {
				while (true)
				sum += input.readInt();
			}
			catch (EOFException ex) {
				System.out.println("Sum of the integers: " + sum);
			}
	}
}