package CiampichettiTamburiTaras.OOPProject.Model.Data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.ParseException;

import CiampichettiTamburiTaras.OOPProject.Model.Date;

public class ApiDate {
	private Vector<Date> dataPartita= new Vector<Date>();
	
	private String idCompetizione=null;
	private int season=0;
	private String dateFrom=null;
	private String dateTo=null;
	
	public ApiDate(String idCompetizione, int season, String dateFrom, String dateTo)  throws  IOException, ParseException {
		
		this.idCompetizione=idCompetizione;
		this.season=season;
		this.dateFrom=dateFrom;
		this.dateTo=dateTo;
		
try {
			
			URLConnection openConnection = new URL("https://api.football-data.org/v2/competitions/"+ this.idCompetizione+"/matches?season="+this.season+"&dateFrom="+this.dateFrom+"&dateTo="+this.dateTo).openConnection();
			openConnection.addRequestProperty("X-Auth-Token", "d83eba6e4c5b47aeab76f99e35c2aef5");
			InputStream in = openConnection.getInputStream();	

			String data = "";
			String line = "";
			
			try {
				InputStreamReader inR = new InputStreamReader( in );
				BufferedReader buf = new BufferedReader( inR );

				while ( ( line = buf.readLine() ) != null ) {
					data+= line;
				}
			} finally {
				in.close();
			}
			JSONObject obj = (JSONObject) JSONValue.parseWithException(data);
			
			JSONArray partite =(JSONArray) obj.get("matches");
			
			Date datePartita;
			
			for(int i=0; i<partite.size(); i++) {
				
				datePartita = new Date();
				
				JSONObject partitaSingola=(JSONObject) partite.get(i);
				
				String dataStart=partitaSingola.get("utcDate").toString();
				datePartita.setDataPartita(dataStart);
				
				JSONObject oggettoPunteggio=(JSONObject) partitaSingola.get("score");
				JSONObject punteggioFullTime=(JSONObject) oggettoPunteggio.get("fullTime");
				datePartita.setPunteggioCasa(((Long) punteggioFullTime.get("homeTeam")).intValue());
				datePartita.setPunteggioOspite(((Long) punteggioFullTime.get("awayTeam")).intValue());
				
				JSONObject oggettoCasa=(JSONObject) partitaSingola.get("homeTeam");
				String squadraNomeCasa = oggettoCasa.get("name").toString();
				datePartita.setSquadraCasa(squadraNomeCasa);
				
				JSONObject oggettoOspite=(JSONObject) partitaSingola.get("awayTeam");
				String squadraNomeOspite = oggettoOspite.get("name").toString();
				datePartita.setSquadraOspite(squadraNomeOspite);
				
				dataPartita.add(datePartita);
			}
			
	}	catch(Exception e) {
		System.out.print(e);}
	
	
	}
	public String readVectors() {
		String lunga = "";
		for (int i = 0; i < dataPartita.size(); i++) {
			System.out.println(dataPartita.get(i).getSquadraCasa() + "-" + dataPartita.get(i).getSquadraOspite()+ " " + dataPartita.get(i).getPunteggioCasa()+ "-" +
		dataPartita.get(i).getPunteggioOspite() + " " + dataPartita.get(i).getDataPartita());
			}
		return lunga;
}
}
