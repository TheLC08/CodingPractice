import java.util.*;
import java.io.*;

public class Runner{
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("traffic.in");
        Scanner sc = new Scanner(file);
        ArrayList<String> line = new ArrayList<>();
        while (sc.hasNextLine()) {
            String a = sc.nextLine();
            line.add(a);
        }
        sc.close();
    }
}