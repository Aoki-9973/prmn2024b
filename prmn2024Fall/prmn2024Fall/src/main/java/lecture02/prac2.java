package lecture02;
import java.util.Scanner;
public class prac2 {
    public static void main(String[] args) {
        int[] num = new int[5];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("数字"+i+"つ目");
            num[i] = scan.nextInt();
            System.out.println("\n");
        }
        Keisan keisan = new Keisan();
        int sum = keisan.goukei(num);
        keisan.hanbetsu(sum);
    }
}
