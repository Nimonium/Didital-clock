import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DigitalClock extends JFrame {

    private JLabel clockLabel;

    public DigitalClock() {
        setTitle("Digital Clock");
        setSize(400, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        clockLabel = new JLabel();
        clockLabel.setFont(new Font("Arial", Font.BOLD, 28));
        clockLabel.setHorizontalAlignment(SwingConstants.CENTER);

        add(clockLabel);

        // Timer to update every second
        Timer timer = new Timer(1000, e -> updateClock());
        timer.start();

        setVisible(true);
    }

    private void updateClock() {
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss | dd-MM-yyyy");
        Date date = new Date();
        clockLabel.setText(formatter.format(date));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DigitalClock::new);
    }
}
