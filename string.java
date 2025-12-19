/*This program is about getting three string and combaing the string 
and replacing the vowels with special char  and then combaing the three convert string and print
 we are creating three variable like a,b,c  using the build in function to convert 
 the lowe case into uppercase
 */


//import java.util.*;
import java .util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String r1 = "", r2 = "";
        for (char ch : a.toCharArray())
            r1 += "aeiou".indexOf(ch) >= 0 ? "%" : ch;
        for (char ch : b.toCharArray())
            r2 += "aeiou".indexOf(ch) >= 0 ? ch : "#";
        System.out.println(r1 + r2 + c.toUpperCase());
    
    }
}
