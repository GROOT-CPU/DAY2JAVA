/*This program is about to allow a students to a exam hall  based on the attendes percentage
 and medical and total class attend in the class.....we are going to use if else condition to check the  percentage and medical condition 
 we are going to take the four input form the user and the variable are used is totalclasses,attendedclasses\
 percentage and medical
  */


import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalClasses = sc.nextInt();
        int attendedClasses = sc.nextInt();
        int percentage = (attendedClasses * 100) / totalClasses;
        System.out.println(percentage + "%");
        char medical = 'N'; 
        if (percentage >= 75) {
            System.out.println("Allowed");
        } else {
            medical = sc.next().charAt(0);
            if (medical == 'Y' || medical == 'y') {
                System.out.println("Allowed");
            } else {
                System.out.println("Not allowed");
            }
        }

        sc.close();
    }
}
