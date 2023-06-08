import java.io.*;
import java.util.*;

public class Exercise17_14 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an input file name: ");
            String inputFile = input.next();
        System.out.print("Enter output file name: ");
            String outputFile = input.next();
            
        try (
            RandomAccessFile in = new RandomAccessFile(inputFile, "i");
            RandomAccessFile out = new RandomAccessFile(outputFile, "o");
        ) {
            int i = 0;
            in.seek(0);
            while ((i = in.read()) != -1) {
                out.write(((byte)i) + 5);
            }
        }
    }
}