/*This program is about the for loop 
  we are going to use the  two variables start and sc 
  and using one more variable room inside the for loop
  and print the ouput by using increment of 10*/



  import java.util.Scanner;

public class ANT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        for (int rooms = start; rooms <= 100; rooms += 10) {
            System.out.print(rooms + " ");
        }

        sc.close();
    }
}
