package kyonggi_oop.view;

import kyonggi_oop.controller.LibraryController;
import kyonggi_oop.view.inputView.LoginPanel;

import javax.swing.*;

public class GUIMain extends JFrame {
    static LibraryController engine;
    public static void startGUI(LibraryController en) {
        engine = en;
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame mainFrame = new JFrame("도서관 자리예약 시스템");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        LoginPanel newContentPane = new LoginPanel();
        JPanel loginPanel = newContentPane.addComponentsToPane();
        mainFrame.add(loginPanel);
        //Display the window.
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

}

