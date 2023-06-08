import java.io.*;
import java.util.*;

public class Exercise17_15 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an input file name: ");
            String inFile = input.next();
        System.out.print("Enter output file name: ");
            String outFile = input.next();
            
        try (
            RandomAccessFile encryptedFile = new RandomAccessFile(inFile, "i");
            RandomAccessFile decryptedFile = new RandomAccessFile(outFile, "o");
        ) {
            int i;
            encryptedFile.seek(0);
            while ((i = encryptedFile.read()) != -1) {
                decryptedFile.write(((byte)i) - 5);
            }
        }
    }
}