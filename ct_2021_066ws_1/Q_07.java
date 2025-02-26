import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Q_07 {
    public static void main(String[] args) {
        Date now = new Date();

        SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");

        String currentTime = timeFormat.format(now);

        JFrame frame = new JFrame(currentTime);
        frame.setSize(500,300);
        frame.setVisible(true);
    }
}

