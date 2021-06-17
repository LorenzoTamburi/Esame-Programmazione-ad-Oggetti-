package CiampichettiTamburiTaras.OOPProject.Model.Data;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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
import CiampichettiTamburiTaras.OOPProject.Model.Classifica;

public class ClassificaApi {

	private Vector<Classifica> classificaFromAPI =  new Vector<Classifica>();

	public ClassificaApi(String idCompetizione, int tipoClassifica) throws IOException, ParseException {

		try {
			URLConnection openConnection = new URL("https://api.football-data.org/v2/competitions/"+ idCompetizione +"/standings"
					).openConnection();
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

			
			JSONArray season = (JSONArray) obj.get("standings");
			
			JSONObject standings = (JSONObject) season.get(tipoClassifica);
			
			JSONArray squads = (JSONArray) standings.get("table");

			Classifica squadra;

			for(int i = 0; i < squads.size(); i++) {
				
				squadra = new Classifica();

				JSONObject oggettoTable = (JSONObject) squads.get(i);
				JSONObject oggettoTeam = (JSONObject) oggettoTable.get("team");
				String nomeSquad = oggettoTeam.get("name").toString();

				squadra.setPosizione(((Long)oggettoTable.get("position")).intValue());
				squadra.setNomeSquadra(nomeSquad);
				squadra.setPartiteGiocate(((Long) oggettoTable.get("playedGames")).intValue());
				squadra.setPunti(((Long) oggettoTable.get("points")).intValue());
				squadra.setGolFatti(((Long) oggettoTable.get("goalsFor")).intValue());
				squadra.setGolSubiti(((Long) oggettoTable.get("goalsAgainst")).intValue());
				squadra.setDifferenzaReti(((Long) oggettoTable.get("goalDifference")).intValue());
				classificaFromAPI.add(squadra);
			}

		} catch(Exception e) {
			System.out.print(e);
		}
	}


	public String readVectors() {
		String lunga = "";
		for (int i = 0; i < classificaFromAPI.size(); i++) {
			System.out.println(classificaFromAPI.get(i).getNomeSquadra() + " " + classificaFromAPI.get(i).getPosizione() + " " + classificaFromAPI.get(i).getPunti());
			System.out.println(classificaFromAPI.get(i).getPartiteGiocate() + " " + classificaFromAPI.get(i).getGolFatti() + " " + classificaFromAPI.get(i).getGolSubiti() + " " + classificaFromAPI.get(i).getDifferenzaReti());
		}
		return lunga;
	}

}
