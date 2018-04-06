import java.io.*;
import java.util.*;

public class p12_11 {
    public static void main (String[] args) throws IOException {
        String removeText = args[0];
        File inFile = new File(args[1]);
        File tmpFile = File.createTempFile("p12_11", null);

        BufferedWriter out = new BufferedWriter(new FileWriter(tmpFile));
        BufferedReader in = new BufferedReader(new FileReader(inFile));

        String line = in.readLine();
        while (line != null) {
            out.write(line.replace(removeText, ""));
            out.newLine();
            line = in.readLine();
        }

        out.close();
        in.close();

        inFile.delete();
        tmpFile.renameTo(new File("p12_11.txt"));
    }
}
