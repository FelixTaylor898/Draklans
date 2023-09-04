import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class CorpsFrame {
	    static JFrame frame;
	    static JPanel buttons, panel, body;
	    public CorpsFrame() {
	        if (frame != null)
	            frame.dispose();
	        frame = new JFrame("Random Corps");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setResizable(true);
	        
	        String info = CorpsGen.corps();
	        
	        Font font = new Font("Arial", Font.PLAIN, 15);

	        JTextArea textField = new JTextArea(info);
	        textField.setLineWrap(true);
	        textField.setWrapStyleWord(true);
	        textField.setSize(500, 500);
	        
	        textField.setFont(font);
	        textField.setEditable(false);
	        body = new JPanel();
	        body.add(textField);
	        
	        
	        panel = new JPanel(new BorderLayout());
	        buttons = new JPanel(new GridLayout(0, 2));
	        
	        
	        JButton home = new JButton("Home");
	        JButton generate = new JButton("Generate");
	        home.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent arg0) {
	                frame.dispose();
	                new MainFrame();
	            }
	        });
	        generate.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent arg0) {
	                frame.dispose();
	                new CorpsFrame();
	            }
	        });
	        buttons.add(home);
	        buttons.add(generate);
	        
	        panel.add(buttons, BorderLayout.NORTH);
	        panel.add(body, BorderLayout.SOUTH);
	        if (frame != null)
	            frame.dispose();
	        frame = new JFrame("Corps Generator");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setResizable(true);
	        
	        
	        JScrollPane scrollPane = new JScrollPane(panel);
	        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	        scrollPane.setPreferredSize(new Dimension(600, 600));

	        frame.add(scrollPane);
	        
	        
	        
	   
	        frame.pack();
	        frame.setVisible(true);
	    }
}
