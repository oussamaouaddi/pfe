package com.ibm.service;

import javax.swing.JFrame;


public class picture  extends JFrame{
	
	String pathImage;
	
  public picture(){
		
		pathImage="c:\\cv.jpg";
	}
	

	public String getPathImage() {
		return pathImage;
	}

	public void setPathImage(String pathImage) {
		this.pathImage = pathImage;
	}
	
	public void draw (String k ){
		

    	Images img = new Images();
    	
    	picture pic = new picture();
    	pic.setPathImage(k);
        String p =img.pathImage=k;
        
      img.setImageChemin(p);    
         pic.getContentPane().add(img);

        pic.setTitle("IBM ");
       pic.setSize(230, 240);
        pic.setLocationRelativeTo(null);
    	pic.setVisible(true);

	}

	public static void main(String[] args) {
		
picture poo = new picture();
   poo.draw("c:\\map.jpg");
    	
	}

}
