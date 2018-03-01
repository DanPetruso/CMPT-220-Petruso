import java.util.GregorianCalendar;

public class p9_5 {
    public static void main(String[] args){
        GregorianCalendar cal = new GregorianCalendar();

        System.out.println(cal.get(cal.MONTH) + "/" + cal.get(cal.DAY_OF_MONTH) + "/" + cal.get(cal.YEAR));

        long set = 1234567898765L;
        cal.setTimeInMillis(set);
        System.out.println(cal.get(cal.MONTH) + "/" + cal.get(cal.DAY_OF_MONTH) + "/" + cal.get(cal.YEAR));
    }
}
