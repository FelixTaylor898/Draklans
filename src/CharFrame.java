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

public class CharFrame {
	static JFrame frame;
	static JPanel body, panel;
	static JButton button;

	public CharFrame(Character ch) {
		String info = "";
		info += "Name: " + ch.getName() + "\n";
		info += "Gender: " + ch.getGender() + "\n";
		info += "Birthdate: " + ch.getBirthdate() + "\n";
		info += "Species: " + ch.getSpecies() + "\n";
		info += "Physical: " + ch.getPhysical() + "\n";
		info += "Description: " + ch.getDescription() + "\n";
		info += "Connections: " + ch.getConnections();

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
		button = new JButton("Back");
		button.setBackground(Color.WHITE);
		button.setFocusable(false);
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				new CharsFrame();
			}
		});
		panel.add(button, BorderLayout.NORTH);

		JPanel txtimage = new JPanel(new BorderLayout());
		txtimage.add(body, BorderLayout.NORTH);

		panel.add(txtimage, BorderLayout.SOUTH);
		if (frame != null)
			frame.dispose();
		frame = new JFrame(ch.getName());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);

		frame.add(panel);
		frame.pack();
		frame.setVisible(true);

	}

}
