package students.jana_sergejenko.lesson_4.level_2.task_6;

import java.util.Scanner;

public class Program6{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num = scan.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = scan.nextInt();
        scan.close();

        if (num<num2) {
            System.out.println(num+" is less than "+num2);
        } else  {
            System.out.println(num2+" is less than "+num);
        }
    }
}
