import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ElementsFrame {

    static JFrame frame;
    static JPanel buttons, panel;
    public ElementsFrame() {
    	
        buttons = new JPanel(new GridLayout(4, 3));

    	
        if (frame != null)
            frame.dispose();
        frame = new JFrame("Elements");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(true);
        
        
        for (Element element : TypeData.elements) {
        	JButton typeButton = new JButton(element.getName());
        	typeButton.setFocusable(false);
        	typeButton.setBackground(element.getColor());
        	if (element.getColor().equals(Color.BLACK))
        		typeButton.setForeground(Color.WHITE);
            typeButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent arg0) {
                    frame.dispose();
                    new ElementFrame(element);
                }
            });
        	buttons.add(typeButton);
        }
        


        panel = new JPanel(new BorderLayout());
        
        JButton backButton = new JButton("Back");
        backButton.setBackground(Color.WHITE);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.dispose();
                new MainFrame();
            }
        });
        backButton.setFocusable(false);
        panel.add(backButton, BorderLayout.NORTH);

        panel.add(buttons, BorderLayout.SOUTH);
        
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);



    }
}
