package lecture02;
import java.util.Scanner;
public class GakuPass {
    void Login1(String[][] student,String bangou){
        for(int i=0;i<student.length;i++){
            if(student[i][0].equals(bangou)){
                Login2(student);
            }
            else{
                System.out.println("error!!");
                System.exit(0);
            }
        }
    }
    void Login2(String[][] student){
        Scanner input = new Scanner(System.in);
        System.out.println("あなたのパスワードを入力してください");
        System.out.print("password:");
        String password = input.next();
        for(int i=0;i<student.length;i++){
            if(student[i][1].equals(password)){
                System.out.println("ログイン完了");
                System.exit(0);
            }
            else{
                System.out.println("不正なアクセス");
                System.exit(0);
            }
        }
    }
}
