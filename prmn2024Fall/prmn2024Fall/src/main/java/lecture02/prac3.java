package lecture02;
import java.util.Scanner;
public class prac3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GakuPass gp = new GakuPass();
        String[][] data = new String[70][2];
        int i=0;
        while(true){
            System.out.println("追加:1,終了:1以外");
            int a = input.nextInt();
            if(a==1){
                System.out.print("学籍番号を入力:");
                data[i][0] = input.next();
                System.out.print("パスワードを入力:");
                data[i][1] = input.next();
                i++;
            }
            else{
                System.out.println("情報入力を終了します");
                break;
            }
        }
        System.out.print("あなたの学籍番号を入力してください:");
        String bangou = input.next();
        gp.Login1(data, bangou);
    }
}
