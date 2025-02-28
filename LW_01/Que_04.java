package Q_04;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Que_04 {
    public static void main(String[] args) {
        Date today;
        SimpleDateFormat sdf;
        today = new Date();
        sdf = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(sdf.format(today));
    }
}
