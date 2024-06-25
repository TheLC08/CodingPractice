import java.util.*;
import java.io.*;

public class Runner{
    public static void main(String[] args) throws FileNotFoundException{   
        File file = new File("11.in");
        Scanner sc = new Scanner(file);
        
        String str1 = sc.nextLine();
        Scanner s1 = new Scanner(str1);
        long[] cow = new long[s1.nextInt()];
        long[] cane = new long[s1.nextInt()];

        String str2 = sc.nextLine();
        Scanner s2 = new Scanner(str2);
        for (int i = 0; i<cow.length; i++){
            if (s2.hasNextLine()){
                cow[i] = s2.nextLong();
            }
        }

        String str3 = sc.nextLine();
        Scanner s3 = new Scanner(str3);
        for (int i = 0; i<cane.length; i++){
            if (s3.hasNextLine()){
                cane[i] = s3.nextLong();
            }
        }

        for (int i = 0; i < cane.length; i++){
            long above = 0;
            for (int j = 0; j < cow.length; j++) {
                long initial = cow[j];
                if (above < cow[j]){
                    if (cane[i] - (cow[j]-above) < 0){
                        cow[j] += cane[i];
                        cane[i] = 0;
                    }
                    else{
                        cane[i] -= (cow[j] - above);
                        cow[j] += (cow[j] - above);
                        above += (initial - above);
                    }
                }
                if (!(cane[i] > (long)0)){
                    break;
                }
            }
        }

        for (int i = 0; i < cow.length; i++){
            System.out.println(cow[i]);
        }
    }
}