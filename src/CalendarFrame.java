import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class CalendarFrame {
    static JFrame frame;
    static JPanel body, panel;
    static JButton button;

    public CalendarFrame() {
        String info = NameSet.calendarString();

        Font font = new Font("Arial", Font.PLAIN, 15);

        JTextArea textField = new JTextArea(info);
        textField.setLineWrap(true);
        textField.setWrapStyleWord(true);
        textField.setSize(450, 450);

        textField.setFont(font);
        textField.setEditable(false);
        body = new JPanel();
        body.add(textField);
        panel = new JPanel(new BorderLayout());
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        button = new JButton("Back");
        button.setBackground(Color.WHITE);
        button.setFocusable(false);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.dispose();
                new MainFrame();
            }
        });
        panel.add(button, BorderLayout.NORTH);

        panel.add(body, BorderLayout.SOUTH);
        if (frame != null)
            frame.dispose();
        frame = new JFrame("Calendar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);

        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setPreferredSize(new Dimension(450, 450));

        frame.add(scrollPane);
        frame.pack();
        frame.setVisible(true);

    }

}
