import java.util.ArrayList;
import java.util.Scanner;

public class Prospect {

    private String name;
    private String school;
    private String position;
    
    
    public Prospect(String name, String school, String position) {
            this.name = name;
            this.school = school;
            this.position = position;
            
        }
    private static ArrayList<Prospect> generatePlayers() {
        
    	ArrayList<Prospect> players = new ArrayList<>();

        players.add(new Prospect("Caleb Williams", "USC", "QB"));
        
        players.add(new Prospect("Marvin Harrison Jr.", "OSU", "WR"));
        
        players.add(new Prospect("Drake Maye", "UNC", "QB"));
        
        players.add(new Prospect("Olumuyiwa Fashanu", "Penn State", "T"));
        
        players.add(new Prospect("Brock Bowers", "UGA", "TE"));
        
        players.add(new Prospect("Laiatu Latu", "UCLA", "EDGE"));
        
        players.add(new Prospect("Joe Alt", "Notre Dame", "T"));
       
        players.add(new Prospect("Malik Nabers", "LSU", "WR"));
        
        players.add(new Prospect("Jer'Zhan Newton", "UI", "DI"));
        
        players.add(new Prospect("Taliese Fuaga", "OSU", "T"));
        
        return players;
    }
    
    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public String getPosition() {
        return position;
    }

    private static void addCustomPlayers(ArrayList<Prospect> players) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Do you want to add your own players? (yes/no): ");
        String userChoice = scanner.nextLine().toLowerCase();

        if (userChoice.equals("yes")) {
            System.out.println("Enter player details (Name, School, Position):");
            for (int i = 0; i < 3; i++) {
                String[] playerDetails = scanner.nextLine().split(" , ");
                players.add(new Prospect(playerDetails[0], playerDetails[1], playerDetails[2]));
            }
        }
    }
    private static void printDraftBoard(ArrayList<Prospect> players) {
    	String draftBoard = "Draft Board:\n";

    	for (int i = 0; i < players.size(); i++) {
    		Prospect player = players.get(i);
    	    draftBoard += (i + 1) + ". " + "Name: " + player.getName() + ", " + "School: " + player.getSchool() + ", " +"Position: " + player.getPosition() + "\n";
    	}
    	
    	System.out.println(draftBoard);

    	
    }

}

public class Prospect {
	private String playerName;
	private String school;
	
	
	public void setName(String n) {
		playerName = n;
		
	}
	
	public String getName() {
		return playerName;
	}
	
	public void setSchool(String s){
		school = s;
	}

	public String getSchool(){
		return school;
	}
}
