import java.util.*;
import java.io.*;

public class Runner{
    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("1.in");
        Scanner sc = new Scanner(file);
        
        // first line
        String str1 = sc.nextLine();
        Scanner s1 = new Scanner(str1);
        int[] cow = new int[s1.nextInt()];
        int[] cane = new int[s1.nextInt()];

        // second line
        String str2 = sc.nextLine();
        Scanner s2 = new Scanner(str2);
        for (int i = 0; i<cow.length; i++){
            if (s2.hasNextLine()){
                cow[i] = s2.nextInt();
            }
        }

        // third line
        String str3 = sc.nextLine();
        Scanner s3 = new Scanner(str3);
        for (int i = 0; i<cane.length; i++){
            if (s3.hasNextLine()){
                cane[i] = s3.nextInt();
            }
        }

        for (int i = 0; i < cane.length; i++){
            int above = 0;
            for (int j = 0; j < cow.length; j++) {
                int count = cow[j];
                int initial = cow[j];
                while (above < initial && count > 0){
                    if (cane[i] < 1){
                        break;
                    }
                    cane[i] --;
                    above ++;
                    cow[j] ++;
                    count--;
                }
                if (cane[i] < 0){
                    break;
                }
            }
        }

        for (int i = 0; i < cow.length; i++){
            System.out.println(cow[i]);
        }
    }
}