package fr.touboulic.sikulitest;

import java.util.Iterator;
import java.util.List;

import org.sikuli.basics.proxies.OCR;
import org.sikuli.script.*;
//import org.sikuli.script.natives.OCRText;
import org.sikuli.basics.Settings;

public class ApiTest {
	   
	public static void main(String[] args) {
		Settings.OcrTextSearch = true;
		Settings.OcrTextRead = true;
		Region myReg = Region.create(0,0, 1366, 768);

		Screen s = new Screen();

		
		//OCRText o = new OCRText();
        try {
        	
        	//ImageLocator.addImagePath("/src/main/ressources/");
        	//ImagePath.setBundlePath("path to your image folder");

			s.click("images/1412438211654.png", 0);
	        s.wait("images/1412438261906.png");
	        s.click("images/firefox.png", 0);
	        s.paste("http://people.rennes.inria.fr/Benoit.Baudry/");
	        s.type(Key.ENTER);
	        s.hover("images/1412438425604.png");
	        s.click("images/softwareTesting.png");
	        s.wait("images/barreNavFirefox.png");
	        s.click("images/barreNavFirefox.png");
	        s.wait("images/waitfirefoxhiglight.png");
	        s.paste("http://www.w3schools.com/html/tryit.asp?filename=tryhtml_checkbox");
	        s.type(Key.ENTER);
	        //s.wait("images/checkbox.png");
	       // List<Screen> rs = (List<Screen>) s.findAll("checkbox.png");
	        Iterator<Match> matches = s.findAll("images/checkbox.png");
	        for (; matches.hasNext();matches.next()) {
	        	s.click("images/checkbox.png");
	        }
	        
	        Iterator<Match> car = s.findAll("car");
	        for (; car.hasNext(); car.next()) {
		        s.doubleClick("car");
		        s.type("plane");
		    }

	        Iterator<Match> car2 = s.findAll("car");
	        for (; car2.hasNext(); car2.next()) {
		        s.doubleClick("car");
		        s.type("plane");
		    }	        
	        
	        System.out.println(myReg.text());

	       s.click("Submit");
	        
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}


