package kyonggi_oop.view.inputView;

import kyonggi_oop.controller.LibraryController;


import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    public LoginPanel() {
    }
    public JPanel addComponentsToPane() {
        JLabel studentIdLabel = new JLabel("아이디:");
        JTextField loginField = new JTextField(10);
        JPanel idPanel = new JPanel();
        idPanel.add(studentIdLabel);
        idPanel.add(loginField);

        JLabel studentPasswordLabel = new JLabel("비밀번호:");
        JTextField pwField = new JTextField(10);
        JPanel pwPanel = new JPanel();
        pwPanel.add(studentPasswordLabel);
        pwPanel.add(pwField);

        JButton loginButton = new JButton("로그인");
        JPanel jp = new JPanel();
        jp.add(loginButton);

        JPanel pane = new JPanel();
        pane.add(idPanel);
        pane.add(pwPanel);
        pane.add(jp);

        return pane;
    }
}

