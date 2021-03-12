import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Java Swing (the default Java GUI lib) is so fucking shit
// PATH: C:\Users\itsno\Desktop\java_shit\app.java

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI implements ActionListener {
    private int clicks = 0;
    private JLabel label = new JLabel("Number of clicks:  0     ");
    private JFrame frame = new JFrame();

    public GUI() {

        // the clickable button
        JButton button = new JButton("Click Me");
        button.addActionListener(this);

        // the panel with the button and text
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        // set up the frame and display it
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Click Me");
        frame.pack();
        frame.setVisible(true);// Why the fuck is this a method that takes a bool as it's only param?? shouldn't it be a bool itself i.e frame.setVisible or frame.setVisible = true ??
    }

    // process the button clicks
    public void actionPerformed(ActionEvent e) {
        clicks++;
        label.setText("Number of clicks:  " + clicks);
    }

    // create one Frame
    public static void main(String[] args) {
        new GUI();
        System.out.println("program success"); // for debugging purposes
    }
}
