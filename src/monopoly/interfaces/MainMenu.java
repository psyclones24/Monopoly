package monopoly.interfaces;

import java.awt.GridBagLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainMenu extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final JPanel contentPane = new JPanel(new GridBagLayout());
	private static final LogoPanel logoPanel = new LogoPanel();
	private static final JPanel bottomPane = new JPanel(new GridBagLayout());

	public MainMenu() {
		// set the super classes properties
		super("Monopoly");
		try {
			setSize(logoPanel.getImage().getWidth(this), logoPanel.getImage()
					.getHeight(this)); // 16:9 Window size
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent we) {
				System.exit(0); // Stop the JVM if we quit early
			}
		});
		setResizable(false);
		setLocationRelativeTo(getOwner());
		setContentPane(contentPane);

		// initialize the contents
		init();
		// finally lets show or amazing colors
		// pack();
		setVisible(true);
		toFront();
	}

	private void init() {
		contentPane.add(logoPanel);
		contentPane.add(bottomPane);
	}

}
