import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {
    static JFrame frame;
    static JPanel buttons, panel;

    public MainFrame() {
        if (frame != null)
            frame.dispose();
        frame = new JFrame("Ibinor Information");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);

        panel = new JPanel(new BorderLayout());
        buttons = new JPanel(new GridLayout(7, 0));

        JButton elementButton = new JButton("Elements");
        elementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.dispose();
                new ElementsFrame();
            }
        });
        elementButton.setBackground(Color.WHITE);
        elementButton.setFocusable(false);

        JButton typesButton = new JButton("Dragon Types");
        typesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.dispose();
                new TypesFrame();
            }
        });
        typesButton.setBackground(Color.WHITE);
        typesButton.setFocusable(false);

        JButton terms = new JButton("Terminology");
        terms.setBackground(Color.WHITE);
        terms.setFocusable(false);
        terms.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.dispose();
                new TermsFrame();
            }
        });

        JButton calendar = new JButton("Calendar");
        calendar.setBackground(Color.WHITE);
        calendar.setFocusable(false);
        calendar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.dispose();
                new CalendarFrame();
            }
        });

        JButton gen = new JButton("Generate Corps");
        gen.setBackground(Color.WHITE);
        gen.setFocusable(false);

        gen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.dispose();
                new CorpsFrame();
            }
        });

        JButton characters = new JButton("Characters");
        characters.setBackground(Color.WHITE);
        characters.setFocusable(false);
        characters.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.dispose();
                new CharsFrame();
            }
        });

        JButton quiz = new JButton("Which draklan are you? Quiz");
        quiz.setBackground(Color.WHITE);
        quiz.setFocusable(false);
        quiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.dispose();
                new DrakQuizFrame(0, new int[12]);
            }
        });

        buttons.add(elementButton);
        buttons.add(typesButton);
        buttons.add(calendar);
        buttons.add(characters);
        buttons.add(terms);
        buttons.add(gen);
        buttons.add(quiz);

        panel.add(buttons, BorderLayout.NORTH);

        frame.add(panel);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }

}
