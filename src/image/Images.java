package image;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Images extends JPanel {
	String pathImage = "c:\\cv.jpg";

	public Images() {

		pathImage = "c:\\cv.jpg";
	}

	public void setImageChemin(String k) {

		this.pathImage = k;

	}

	public String getImageChemin() {

		return pathImage;
	}

	public void paintComponent(Graphics g) {
		try {

			// p="c:\\cv.jpg";

			Image img = ImageIO.read(new File(pathImage));

			// g.drawImage(img, 0, 0, this);
			// Pour une image de fond
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		JFrame fr = new JFrame();

		Images img = new Images();
		img.setImageChemin("c:\\map.jpg");

		fr.getContentPane().add(img);

		fr.setTitle("Tooltip");
		fr.setSize(230, 240);
		fr.setLocationRelativeTo(null);
		fr.setVisible(true);

	}

}