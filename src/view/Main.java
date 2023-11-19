package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Main {

    private JTabbedPane tabbedPane1;
    private JPanel sach;
    private JTable tableS;
    private JButton themButton;
    private JButton suaButton;
    private JButton xoaButton;
    private JTextField textField1;
    private JScrollPane scrollS;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JPanel rootPanel;
    private JPanel banDoc;
    private JPanel qlMuon;

    private void createUIComponents() {
        // TODO: place custom component creation code here

    }

    public Main() {
        createTableS();
    }

    private void createTableS(){
        tableS.setModel(new DefaultTableModel(
                null,
                new String[] {"Ma", "Ten sach", "Ten TG", "Chuyen nganh", "So luong"}
        ));
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public static void main(String[] args) {

    }

}
