package lecture02;

public class Keisan {
    int goukei(int[] data){
        int sum = 0;
        for(int i=0;i<data.length;i++){
            sum += data[i];
        }
        System.out.println("合計値:"+sum);
        return sum;
    }
    void hanbetsu(int s){
        if(s>=100){
            System.out.println("great!!");
        }
        else if(s>=50){
            System.out.println("big");
        }
        else{
            System.out.println("small");
        }
    }
}
