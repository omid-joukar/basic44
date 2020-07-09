import java.util.Scanner;

/**
 * Created by KPS on 7/9/2020.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number : ");
        int n =  scanner.nextInt();
        int sum = 0;
        sum = (n*1)+(n*11)+(n*111);
        System.out.println(sum);
    }
}
