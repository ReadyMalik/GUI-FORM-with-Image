import javax.swing.*;

public class RunApps {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Registrasi Data");
        jFrame.setContentPane(new FormwithImage().getRootPanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(550, 650);
        jFrame.setVisible(true);
    }
}
