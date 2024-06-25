import java.util.*;
import java.io.*;

public class Runner{
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("file.in");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String i = sc.nextLine();
            System.out.println(i);
        }
    }
}