package de.htwg.towerdefence2014.util;

import java.io.IOException;
import java.net.URISyntaxException;

import org.apache.http.HttpException;
import org.apache.log4j.Logger;

import de.htwg.towerdefence2014.util.RESTClass.Highscore;
import junit.framework.TestCase;

public class RESTClassTest extends TestCase {
	
	/** Logger for log4j connection */
    static Logger log = Logger.getLogger("TowerDefence.util.RESTClassTest");
	
	Highscore highscore;
	RESTClass rest;
	
	String url = "http://de-htwg-sa-highscores.herokuapp.com/";
	
	public void setUp() throws IOException {
		rest = new RESTClass();
	}
	
	public void testDoc() {
		
		try {
			rest.saveHighscoreOnServer(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
