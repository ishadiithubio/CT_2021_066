import java.util.Date;
import java.text.SimpleDateFormat;
public class Q_04 {
    public static void main(String[] args) {
        Date today;
        SimpleDateFormat sdf;
        today = new Date();
        sdf = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(sdf.format(today));
    }
}

