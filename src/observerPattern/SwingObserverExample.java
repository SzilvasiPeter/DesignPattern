package observerPattern;

import javax.swing.*;
import java.awt.*;

public class SwingObserverExample {
    private JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    private void go() {
        frame = new JFrame();

        JButton button = new JButton("Should i do it?");
        button.addActionListener(actionEvent -> System.out.println("Don't do it, you might regret!"));
        button.addActionListener(actionEvent -> System.out.println("Come on, do it!"));

        frame.getContentPane().add(BorderLayout.CENTER, button);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
}
