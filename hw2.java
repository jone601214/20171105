import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
       int a =scn.nextInt();
if (a%4==0) {
    System.out.println("Bissextile Year");
}else if (a%4!=0&&a%100!=0){
    System.out.println("Common Year");
}
    }
}
