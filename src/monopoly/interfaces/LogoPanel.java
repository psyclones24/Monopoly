package monopoly.interfaces;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class LogoPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final String imagePath = "/resources/startPage_logo.png";
	private BufferedImage image;

	public LogoPanel() {
		super();
		if (image == null) {
			try {
				URL url = this.getClass().getResource(imagePath);
				image = ImageIO.read(url);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		repaint();
		setSize(image.getWidth(null), image.getHeight(null));
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		if (image != null)
			g.drawImage(image, 0, 0, this);

	}

	public Image getImage() {
		return image;
	}

}
