import java.util.*;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        String s1 = "a?c";
        String s2 = "??b";
        String q1 = "";
        String q2 = "";
        int count = 0;
        int min = 0;
        int max = 0;
        Scanner inp = new Scanner(System.in);
        int tcNumber = inp.nextInt();
        int stringInput = (2 * tcNumber);
        String[] s = new String[12];
        for (int i = 0; i < stringInput; i++) {
            s[i] = inp.next();
        }
        for (int i = 0; i < tcNumber; i += 2) {
            q1 = s[i];
            
            for (int k = 1; k < tcNumber; k += 2) {
                q2 = s[k];
                
                for (int j = 0; j < q1.length(); j++)
                {

                    char c1 = q1.charAt(j);
                    char c2 = q2.charAt(j);
                    if (c1 != c2 && c1 != '?' && c2 != '?') {
                        min++;
                    }
                    if (c1 == '?' || c2 == '?') {
                        count++;
                    }
                }
                max = min + count;
                System.out.println(min + " " + max);
            }

        }

    }

}
