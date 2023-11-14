import java.util.Scanner;
import java.util.HashMap;
public class Team {
	
	//which class should be the "populateEmployeeDatabase" class? aka the class which holds the live draft actions
	protected HashMap<Integer, Team> teams = new HashMap<Integer, Team>();
	
	
	private String teamName;
	
	public String[] needs = new String[3];
	
	private int draftPosition;
	
	public Team() {
		teamName = "tbd";
		draftPosition = 0;
		
	}
	
	public Team(String t, int d) {
		teamName = t;
		draftPosition = d;
	}
	
	public void addTeam(String t, int d) {
		Team club = new Team(t, d);
		teams.put(club.getDraftPosition(), club);	
	}
	
	public HashMap<Integer, Team> getTeamList() {
		return teams;
	}
	
	public void setTeam(Scanner scnr) {
		teamName = scnr.next();
	}
	
	public void setTeam(String name) {
		teamName = name;
	}
	
	public String getTeamName() {
		return teamName;
	}
	
	public void setDraftPosition(int dp) {
		draftPosition = dp;
	}
	
	public int getDraftPosition() {
		return draftPosition;
	}
	
	public void printTeamSummary() {
		System.out.println("Team: " + teamName);
		System.out.println("Draft Position: " + draftPosition);
		System.out.print("Team Needs: ");
		for(String need: needs) {
			System.out.print(need + " ");
		}
		System.out.println();
		
	}
	
	
	
	public String[] generateNeeds(String need1, String need2, String need3) {
		needs[0] = need1;
		needs[1] = need2;
		needs[2] = need3;
		
		return needs;
	}
	
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		Team bears = new Team("Chicago Bears", 1);
		bears.generateNeeds("QB", "WR", "LB");
		bears.printTeamSummary();
		
		Team panthers = new Team("Carolina Panthers", 2);
		
		
		System.out.println();
		
	
		
		
		
		
		
		
		
		
	}
	
	
}

