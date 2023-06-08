import java.io.*;
public class Exercise17_07 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	
		Loan loan1 = new Loan();
		Loan loan2 = new Loan(1.8, 10, 10000);
		
		try (
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_07.dat"));
		) {
			
			output.writeObject(loan1);
			output.writeObject(loan2);
			}
			
				catch (IOException ex) {
			System.out.println("File could not be opened");
		}

		try (
			ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_07.dat"));
		) {
			while (true) {
				Loan loan = (Loan)input.readObject();
				System.out.println(loan);
				System.out.printf("Total loan amount: $%.2f\n", loan.getTotalPayment());
				System.out.println();
				}
			} catch (EOFException ex) {
	
		}
	}
}