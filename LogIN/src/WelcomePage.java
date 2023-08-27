import java.awt.*;
import javax.swing.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel welcomeLabel = new JLabel("Hello!");
    ImageIcon icon = new ImageIcon("D:\\intelij\\Nowy 2.0\\LogIN\\src\\Без названия.jpg");

    WelcomePage(String userID){
        welcomeLabel.setForeground(Color.darkGray);
        welcomeLabel.setBounds(75,-25,300,250);
        welcomeLabel.setFont(new Font(null,Font.PLAIN,20));
        welcomeLabel.setText("<html>Hello " + userID + "<br>This is my first 'Login' platform in Java</html>");

        welcomeLabel.setIcon(icon);

        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
         frame.setLayout(null);
        frame.setVisible(true);
    }
}