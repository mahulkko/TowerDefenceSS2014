package de.htwg.towerdefence2014.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;

import org.apache.http.HttpException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * <b>Rest Class</b>
 * <br>
 * Make Post and Get Request to a URL via Json
 * @author chknetsc
 */
public class RESTClass {
	
	/************************************************************
	 * Private variables
	 ***********************************************************/
	
	/** Inner Class that contains a Highscore */
	private Highscore highscore;
	
	
	/************************************************************
	 * Public constructor
	 ***********************************************************/
	
	/**
	 * Default Contructor - Creates a Highscore Object
	 */
	public RESTClass() {
		highscore = new Highscore();
	}
	
	
	/************************************************************
	 * Public methods
	 ***********************************************************/
	
	/**
	 * @param getUrl - Set the URL for the request
	 * @return Returns the Highscore that was save on the URL Server
	 * @throws HttpException
	 * @throws IOException
	 * @throws URISyntaxException
	 */
	public Highscore getHighscoreFromServer(String getUrl) throws HttpException, IOException, URISyntaxException  {
		// Set up Client and HTTP Request Mode
		HttpClient client = new DefaultHttpClient();
        HttpGet request = new HttpGet(getUrl);
        HttpResponse response = client.execute(request);
        
        // Read the input from the Request wiht BufferedReader
        BufferedReader rd = new BufferedReader (new InputStreamReader(response.getEntity().getContent()));
        String string;
        do{
        	string = rd.readLine();
        	System.out.print(string);
        } while(string != null);
        
        // Maps the json string objet to the Highscore class
        ObjectMapper mapper = new ObjectMapper();
		highscore = mapper.readValue(rd, Highscore.class);
        
		return highscore;
	}
	
	/**
	 * @param postUrl - Set the URL for the request
	 * @throws IOException
	 * @throws URISyntaxException
	 * @throws HttpException
	 */
	public void saveHighscoreOnServer(String postUrl) throws IOException, URISyntaxException, HttpException  {
		// Set up Client and HTTP Request Mode
		HttpClient client = new DefaultHttpClient();
        HttpPost post = new HttpPost(postUrl);
        
        // Maps the Highscore object the a json string
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(highscore);
        System.out.println("Json String = \n" + json);
        
        // Set the json String to a StringEntity
        StringEntity se = new StringEntity(json.toString());
        // Set the Type of the Entity
        se.setContentType("application/json");
   
        post.setEntity(se);
        
		HttpResponse response = client.execute(post);
        System.out.println(response.getStatusLine().toString());
	}
	
	/**
	 * <b>Inner Highscore Class</b>
	 * <br>
	 * A class that contains the Score of one Player
	 * @author chknetsc
	 */
    public class Highscore {
    	private String game = "TowerDefenceSS2014";
    	private String player = "Player1";
    	private String score = "1234";
    	
		public String getGame() {
			return game;
		}
		public void setGame(String game) {
			this.game = game;
		}
		public String getPlayer() {
			return player;
		}
		public void setPlayer(String player) {
			this.player = player;
		}
		public String getScore() {
			return score;
		}
		public void setScore(String score) {
			this.score = score;
		}
    }
}
