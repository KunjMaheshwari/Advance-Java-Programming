import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AWTAndSwingExample {
    private JFrame mainFrame;
    private JButton button;

    public AWTAndSwingExample() {
        prepareGUI();
        addButton();
    }

    public static void main(String[] args) {
        AWTAndSwingExample awtSwingExample = new AWTAndSwingExample();
        awtSwingExample.showButton();
    }

    private void prepareGUI() {
        mainFrame = new JFrame("AWT and Swing Example");
        mainFrame.setSize(400, 300);
        mainFrame.setLayout(new FlowLayout());
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void addButton() {
        button = new JButton("Click Me");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(mainFrame, "Button Clicked!");
            }
        });
        mainFrame.add(button);
    }

    private void showButton() {
        mainFrame.setVisible(true);
    }
}
