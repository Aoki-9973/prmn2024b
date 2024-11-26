package jp.ac.chitose.db_prac;
import java.sql.SQLException;
import java.util.Scanner;
public class InsertDemo {
    public static void main(String[] args) {
        System.out.println("中間テストの得点を追加する学生コードは?");
        Scanner scan = new Scanner(System.in);
        String gakusekicode =scan.nextLine();
        System.out.print("その学生の名前は?\n性:");
        String familyName =scan.nextLine();
        System.out.print("名:");
        String fisrtName =scan.nextLine();
        System.out.print(gakusekicode+"の得点は?:");
        int point = Integer.valueOf(scan.nextLine());
        try{
            PreExamDAO2 preExamDAO = new PreExamDAO2();
            int n = preExamDAO.insertPreExam(gakusekicode,familyName,fisrtName,point);
            System.out.println(n);
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
