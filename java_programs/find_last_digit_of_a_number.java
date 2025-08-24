import java.util.Scanner;
public class find_last_digit_of_a_number {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = Math.abs(n);
        int x = y%10;
        System.out.print(x);
    }
}
