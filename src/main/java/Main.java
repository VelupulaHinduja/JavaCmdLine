import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File inFile = null;
        if (0 < args.length) {
            inFile = new File(args[0]);
            BufferedReader br
                    = new BufferedReader(new FileReader(inFile));
            String st;
            while ((st = br.readLine()) != null)
                System.out.println(st);
        } else {
            System.err.println("Invalid arguments count:" + args.length);
        }
    }
}
