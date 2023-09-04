import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class TermsFrame {
	static JFrame frame;
	static JPanel body, panel;
	static JButton button;

	public TermsFrame() {
		String info = "";

		List<String> sortedKeys = new ArrayList<>(NameSet.termMap.keySet());
		Collections.sort(sortedKeys);

		for (String s : sortedKeys) {
			info += s + ": " + NameSet.termMap.get(s) + "\n\n";
		}

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
				new MainFrame();
			}
		});
		panel.add(button, BorderLayout.NORTH);

		panel.add(body, BorderLayout.SOUTH);
		if (frame != null)
			frame.dispose();
		frame = new JFrame("Terminology");
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
