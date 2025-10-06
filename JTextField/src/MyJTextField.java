import javax.swing.*;
import java.awt.*;

public class MyJTextField extends JFrame {
    public MyJTextField() {
        setTitle("MyJTextField");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 40));

        JLabel label = new JLabel("UserName:");
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.BOLD, 16));
        JTextField userName = new JTextField(15);
        userName.setForeground(Color.BLACK);
        userName.setFont(new Font("Arial", Font.BOLD, 16));
        add(label);
        add(userName);

        setVisible(true);

        getContentPane().setBackground(new Color(135, 206, 250));
    }
}
