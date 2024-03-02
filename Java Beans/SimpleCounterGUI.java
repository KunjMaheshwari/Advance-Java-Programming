import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Java Bean class
class CounterBean {
    private int count;

    public CounterBean() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void incrementCount() {
        count++;
    }

    public void decrementCount() {
        count--;
    }
}

// GUI class
public class SimpleCounterGUI extends JFrame {
    private CounterBean counterBean;
    private JLabel countLabel;

    public SimpleCounterGUI(CounterBean counterBean) {
        this.counterBean = counterBean;

        setTitle("Simple Counter");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Label to display count
        countLabel = new JLabel("Count: " + counterBean.getCount(), JLabel.CENTER);
        add(countLabel, BorderLayout.CENTER);

        // Button to increment count
        JButton incrementButton = new JButton("Decrement");
        incrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counterBean.incrementCount();
                countLabel.setText("Count: " + counterBean.getCount());
            }
        });
        add(incrementButton, BorderLayout.NORTH);

        // Button to decrement count
        JButton decrementButton = new JButton("Decrement");
        decrementButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counterBean.decrementCount();
                countLabel.setText("Count: " + counterBean.getCount());
            }
        });
        add(decrementButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of CounterBean
        CounterBean counterBean = new CounterBean();
        // Create an instance of SimpleCounterGUI
        SimpleCounterGUI gui = new SimpleCounterGUI(counterBean);
    }
}
