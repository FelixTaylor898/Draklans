import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DrakQuizFrame {
	static JFrame frame;
	static JPanel all, body, buttons;
	final int max = 6;
	int[] results = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	int current = 0;

	private void stuff(int num) {
		results[num] = results[num] + 1;
		current++;
		if (current >= max) {
			frame.dispose();
			int largest = 0;
			for (int k = 0; k < 12; k++) {
				if (results[k] > largest) {
					largest = results[k];
				}
			}
			ArrayList<Integer> biggest = new ArrayList<>();
			for (int k = 0; k < 12; k++) {
				if (results[k] == largest) {
					biggest.add(k);
				}
			}
			int res = biggest.get(ThreadLocalRandom.current().nextInt(0, biggest.size()));
			current = 0;
			for (int k = 0; k < 12; k++) {
				results[k] = 0;
			}
			new TypeFrame(TypeData.types[res]);
		} else
			new DrakQuizFrame(current, results);
	}

	public DrakQuizFrame(int current, int[] results) {
		this.current = current;
		this.results = results;

		String[] questions = { "What is your favorite month?", "What is your favorite color?",
				"What is your favorite element?", "What is your favorite value?", "What is your favorite gem?",
				"What is your favorite lizard?" };
		String[] answer1 = { "Bellim (January)", "Black", "Umbra (Darkness)", "Protection", "Garnet", "Monitor" };
		String[] answer2 = { "Soulim (February)", "Violet", "Astro (Stars)", "Wisdom", "Amethyst", "Tegu" };
		String[] answer3 = { "Yvim (March)", "Pink", "Aero (Air)", "Serenity", "Aquamarine", "Whiptail" };
		String[] answer4 = { "Lerim (April)", "Yellow", "Electro (Electricity)", "Strength", "Diamond", "Gecko" };
		String[] answer5 = { "Tillim (May)", "Brown", "Terra (Earth)", "Hope", "Emerald", "Iguana" };
		String[] answer6 = { "Inim (June)", "Orange", "Lux (Light)", "Love", "Alexandrite", "Chameleon" };
		String[] answer7 = { "Jonim (July)", "Red", "Pyro (Fire)", "Bravery", "Ruby", "Salamander" };
		String[] answer8 = { "Ayim (August)", "Green", "Herbo (Flora)", "Creativity", "Peridot", "Anole" };
		String[] answer9 = { "Morjin (September)", "Gray", "Ferro (Metal)", "Justice", "Sapphire", "Lacerta" };
		String[] answer10 = { "Naylim (October)", "Indigo", "Zoo (Fauna)", "Nurturing", "Tourmaline", "Agama" };
		String[] answer11 = { "Rivim (November)", "Blue", "Hydro (Water)", "Joy", "Citrine", "Caiman" };
		String[] answer12 = { "Hirim (December)", "White", "Cryo (Ice)", "Empathy", "Turquoise", "Skink" };

		JButton a1 = new JButton(answer1[current]);
		JButton a2 = new JButton(answer2[current]);
		JButton a3 = new JButton(answer3[current]);
		JButton a4 = new JButton(answer4[current]);
		JButton a5 = new JButton(answer5[current]);
		JButton a6 = new JButton(answer6[current]);
		JButton a7 = new JButton(answer7[current]);
		JButton a8 = new JButton(answer8[current]);
		JButton a9 = new JButton(answer9[current]);
		JButton a10 = new JButton(answer10[current]);
		JButton a11 = new JButton(answer11[current]);
		JButton a12 = new JButton(answer12[current]);

		buttons = new JPanel(new GridLayout(12, 0));

		JButton[] barray = { a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12 };
		for (JButton b : barray) {
			b.setBackground(Color.WHITE);
			b.setFocusable(false);
			buttons.add(b);
		}

		a1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stuff(0);
			}
		});
		a2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stuff(1);

			}
		});
		a3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stuff(2);

			}
		});
		a4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stuff(3);

			}
		});
		a5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stuff(4);

			}
		});
		a6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stuff(5);

			}
		});
		a7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stuff(6);

			}
		});
		a8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stuff(7);

			}
		});
		a9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stuff(8);

			}
		});
		a10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stuff(9);

			}
		});
		a11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stuff(10);

			}
		});
		a12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				stuff(11);

			}
		});

		Font font = new Font("Arial", Font.PLAIN, 15);

		JTextArea textField = new JTextArea(questions[current]);
		textField.setLineWrap(true);
		textField.setWrapStyleWord(true);
		textField.setSize(500, 500);
		textField.setFont(font);

		JButton back = new JButton("Back");
		back.setBackground(Color.WHITE);
		back.setFocusable(false);
		back.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
				new MainFrame();
			}
		});

		all = new JPanel(new BorderLayout());

		all.add(back, BorderLayout.NORTH);

		body = new JPanel(new BorderLayout());

		body.add(textField, BorderLayout.NORTH);

		body.add(buttons, BorderLayout.SOUTH);

		all.add(body, BorderLayout.SOUTH);

		if (frame != null)
			frame.dispose();
		frame = new JFrame("Draklan Quiz");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(true);

		frame.add(all);
		frame.pack();
		frame.setVisible(true);

	}

}
