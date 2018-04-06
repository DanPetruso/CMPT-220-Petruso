import java.io.*;
import java.util.*;

public class p12_13 {
    public static void main(String [] args) throws IOException{
        Scanner read = new Scanner(new FileReader(args[0]));
        int lineCount = 0;
        int wordCount = 0;
        int charCount = 0;

        while(read.hasNextLine()){
            lineCount++;
            String line = read.nextLine();

            String[] arr = line.split("\\s+");
            if(!line.equals("")) {
                charCount += line.length();
                wordCount += arr.length;
            }
        }

        System.out.println("Line count: " + lineCount);
        System.out.println("Word count: " + wordCount);
        System.out.println("Char count: " + charCount);

    }
}
