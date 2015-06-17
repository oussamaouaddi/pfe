package image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
 
public class WriteImage 
{	
    public static void main( String[] args )
    {
    	
    	BufferedImage image = null;
        try {
 
            //URL url = new URL("http://www.mkyong.com/image/mypic.jpg");
        	File k = new File("c:\\cv.jpg");
        	String a = new File("").getAbsolutePath();
        	File dir = new File (a+"\\kira");
        	dir.mkdirs();
        	System.out.println(a);
            image = ImageIO.read(k);
 
            ImageIO.write(image, "jpg",new File(dir+"\\out.jpg"));
            ImageIO.write(image, "gif",new File("D:\\out.gif"));
            ImageIO.write(image, "png",new File("D:\\out.png"));
 
        } catch (IOException e) {
        	e.printStackTrace();
        }
        System.out.println("Done");   
    	
    }
}