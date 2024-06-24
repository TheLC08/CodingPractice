// reading files
// i have no idea how this works i copy pasted from internet

import java.util.*;
import java.io.*;

public class Runner{
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("file.in");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String i = sc.nextLine();
            
            // prints out, replace with add to array or something to use
            System.out.println(i);
        }
    }
}