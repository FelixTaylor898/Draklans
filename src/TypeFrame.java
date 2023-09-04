import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class TypeFrame {
	static JFrame frame;
	static JPanel body, panel;
	static JButton button;
	public TypeFrame(Type type) {
		String info = "";
		info += type.getName() + "\n";
		info += "Element: " + type.getMagic() + "\n";
		info += "Gem: " + type.getGem() + "\n";
		info += "Month: " + type.getMonth() + "\n";
		info += "Titanic: " + type.getTitanic() + "\n";
		info += "Physical traits: " + type.getTraits() + "\n";
		info += "Characters: " + type.getCharacters();

		
		
		
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
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        panel.setBackground(type.getRgb());
        button = new JButton("Back");
        button.setBackground(Color.WHITE);
        button.setFocusable(false);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.dispose();
                new TypesFrame();
            }
        });        
        panel.add(button, BorderLayout.NORTH);
        panel.add(body, BorderLayout.SOUTH);
        if (frame != null)
            frame.dispose();
        frame = new JFrame(type.getName());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
        
		
	}

}
