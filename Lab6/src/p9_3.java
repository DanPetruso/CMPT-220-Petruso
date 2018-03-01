import java.util.Date;

public class p9_3 {
    public static void main(String[] args){
        Date date = new Date();
        long time = 10000;
        for (int i = 0; i <= 8; i++){
            date.setTime(time);
            System.out.println("The time fo an elapse of " + time + " is " + date.toString());
            time *=10;
        }

    }
}
