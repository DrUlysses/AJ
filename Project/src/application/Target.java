package application;

import java.applet.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.Date;

public class Target extends Applet {
	
	private String label = "";
	private String description = "";
	Image picture;
	Calendar limitation = new GregorianCalendar();
	
	public void setLabel() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		label = br.readLine();
	}
	
	public void setDescription() throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		description = br.readLine();
	}
	
	public void setPicture() throws IOException {

		picture = getImage(getDocumentBase(), getParameter("img"));

		}
	
	public void setLimitation() {
		
		//»—œ–¿¬»“‹!!11
		limitation = new GregorianCalendar();
	}
	
	public String getLabel() {
		
		return label;
	}
	
	public String getDescription() {
		
		return description;
	}
	
	public Date getLimitation() {
		
		return limitation.getTime();
	}
	
	public void getPicture(Graphics g) {

		g.drawImage(picture, 0, 0, this);

		}
		
}
