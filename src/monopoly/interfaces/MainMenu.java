package monopoly.interfaces;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.LayoutStyle.ComponentPlacement;

public class MainMenu extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final JPanel contentPane = new JPanel(null);
	private static final String imagePath = "/resources/startPage_logo.png";
	private Image image;
	private JLabel lbl_image;
	private JLabel lblWelcomeToMonopoly;
	private JLabel lblName;
	private JLabel lblAddress;
	private JTextField textField_name;
	private JTextField textField_address;
	private JPanel panelMain;
	private JButton btnStart;
	private ButtonGroup buttonGroup;
	private AbstractButton rdbtnJoin;
	private AbstractButton rdbtnHost;
	private JLabel lblMyIp;

	public MainMenu() {
		// set the super classes properties
		super("Monopoly");
		image = getImage(imagePath);

		setSize(image.getWidth(null), 600);
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

	// This will be in a different class soon
	private Image getImage(String path) {
		URL url = this.getClass().getResource(path);
		try {
			image = ImageIO.read(url);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}

	private void init() {
		lbl_image = new JLabel("");
		lbl_image.setBounds(0, 0, image.getWidth(null), image.getHeight(null));
		lbl_image.setIcon(new ImageIcon(image));
		contentPane.add(lbl_image);

		panelMain = new JPanel();
		panelMain.setBounds(0, 357, 720, 213);
		contentPane.add(panelMain);

		lblWelcomeToMonopoly = new JLabel("Welcome To Monopoly!");
		lblWelcomeToMonopoly.setHorizontalAlignment(SwingConstants.CENTER);

		lblName = new JLabel("Name:");

		lblAddress = new JLabel("Address:");

		rdbtnJoin = new JRadioButton("Join");
		rdbtnHost = new JRadioButton("Host");
		buttonGroup = new ButtonGroup();
		buttonGroup.add(rdbtnJoin);
		buttonGroup.add(rdbtnHost);
		rdbtnJoin.addActionListener(this);
		rdbtnHost.addActionListener(this);

		textField_name = new JTextField();
		textField_name.setColumns(10);

		textField_address = new JTextField();
		textField_address.setColumns(10);

		btnStart = new JButton("Start");
		btnStart.addActionListener(this);

		lblMyIp = new JLabel("192.168.1.1");
		GroupLayout gl_panelMain = new GroupLayout(panelMain);
		gl_panelMain
				.setHorizontalGroup(gl_panelMain
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panelMain
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gl_panelMain
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_panelMain
																		.createSequentialGroup()
																		.addGroup(
																				gl_panelMain
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								lblWelcomeToMonopoly,
																								GroupLayout.DEFAULT_SIZE,
																								700,
																								Short.MAX_VALUE)
																						.addGroup(
																								gl_panelMain
																										.createParallelGroup(
																												Alignment.TRAILING,
																												false)
																										.addGroup(
																												gl_panelMain
																														.createSequentialGroup()
																														.addComponent(
																																rdbtnHost)
																														.addGap(18)
																														.addComponent(
																																lblMyIp,
																																GroupLayout.DEFAULT_SIZE,
																																GroupLayout.DEFAULT_SIZE,
																																Short.MAX_VALUE))
																										.addGroup(
																												Alignment.LEADING,
																												gl_panelMain
																														.createSequentialGroup()
																														.addComponent(
																																rdbtnJoin)
																														.addGap(18)
																														.addComponent(
																																lblAddress)
																														.addGap(18)
																														.addComponent(
																																textField_address))
																										.addGroup(
																												Alignment.LEADING,
																												gl_panelMain
																														.createSequentialGroup()
																														.addComponent(
																																lblName)
																														.addGap(18)
																														.addComponent(
																																textField_name,
																																GroupLayout.PREFERRED_SIZE,
																																238,
																																GroupLayout.PREFERRED_SIZE))))
																		.addContainerGap())
														.addGroup(
																Alignment.TRAILING,
																gl_panelMain
																		.createSequentialGroup()
																		.addComponent(
																				btnStart,
																				GroupLayout.PREFERRED_SIZE,
																				100,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(295)))));
		gl_panelMain
				.setVerticalGroup(gl_panelMain
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_panelMain
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(lblWelcomeToMonopoly,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGap(18)
										.addGroup(
												gl_panelMain
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblName)
														.addComponent(
																textField_name,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(
												gl_panelMain
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(rdbtnHost)
														.addComponent(lblMyIp))
										.addGap(18)
										.addGroup(
												gl_panelMain
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(rdbtnJoin)
														.addComponent(
																lblAddress)
														.addComponent(
																textField_address,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addComponent(btnStart,
												GroupLayout.PREFERRED_SIZE, 50,
												GroupLayout.PREFERRED_SIZE)
										.addGap(19)));
		panelMain.setLayout(gl_panelMain);
		
		// Everything that goes after goes here ;P
		rdbtnHost.doClick();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {
			if (e.getSource() == btnStart) {

			}
		} else if (e.getSource() instanceof JRadioButton) {
			if (e.getSource() == rdbtnHost) {
				if (textField_address.isEnabled())
					textField_address.setEnabled(false);
				if (lblAddress.isEnabled())
					lblAddress.setEnabled(false);
				if (!lblMyIp.isEnabled())
					lblMyIp.setEnabled(true);
			} else if (e.getSource() == rdbtnJoin) {
				if (!textField_address.isEnabled())
					textField_address.setEnabled(true);
				if (!lblAddress.isEnabled())
					lblAddress.setEnabled(true);
				if (lblMyIp.isEnabled())
					lblMyIp.setEnabled(false);
			}
		}
	}
}
