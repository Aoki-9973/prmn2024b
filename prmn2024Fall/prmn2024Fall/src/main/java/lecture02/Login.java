package lecture02;

public class Login {
    String name;
    int num;
    Login(String name,int num){
        this.name = name;
        this.num = num;
    }
    void message(String name_n,int num_n){
        if(name_n.equals(name)){
            if(num==num_n){
                System.out.println("ログイン成功。");
            }
            else{
                System.out.println("ログイン失敗。");
            }
        }
    }
}
