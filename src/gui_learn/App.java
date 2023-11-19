package gui_learn;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JButton buttonMess;
    private JPanel panelMain;

    public App(){

        buttonMess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "hello");
            }
        });
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("App");
        jFrame.setContentPane(new App().panelMain);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
