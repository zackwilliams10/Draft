import java.util.Scanner;

public class contract {
	 	
    public static void playerInDraft(int draftPick) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Draft pick " + draftPick + " - Choose a contract option:");
        displayContractOptions(draftPick);
        int choice = getContractChoice();
    }

    private static void displayContractOptions(int draftPick) {
    	if (draftPick == 1) {
        	System.out.println("1. Option A: $20 million/4 years");
            System.out.println("2. Option B: $15 million/3 years");
            System.out.println("3. Option C: $24 million/5 years");
    	}
    	if (draftPick == 2) {
        	System.out.println("1. Option A: $19 million/4 years");
            System.out.println("2. Option B: $14 million/3 years");
            System.out.println("3. Option C: $23 million/5 years");
    	}
    	if (draftPick == 3) {
        	System.out.println("1. Option A: $18 million/4 years");
            System.out.println("2. Option B: $14 million/3 years");
            System.out.println("3. Option C: $22 million/5 years");
    	}
    	if (draftPick == 4) {
        	System.out.println("1. Option A: $17 million/4 years");
            System.out.println("2. Option B: $13 million/3 years");
            System.out.println("3. Option C: $21 million/5 years");
    	}
    	if (draftPick == 5) {
        	System.out.println("1. Option A: $16 million/4 years");
            System.out.println("2. Option B: $12 million/3 years");
            System.out.println("3. Option C: $20 million/5 years");
    	}
    	if (draftPick == 6) {
        	System.out.println("1. Option A: $15 million/4 years");
            System.out.println("2. Option B: $11 million/3 years");
            System.out.println("3. Option C: $19 million/5 years");
    	}
    	if (draftPick == 7) {
        	System.out.println("1. Option A: $14 million/4 years");
            System.out.println("2. Option B: $10 million/3 years");
            System.out.println("3. Option C: $18 million/5 years");
    	}
    	if (draftPick == 8) {
        	System.out.println("1. Option A: $13 million/4 years");
            System.out.println("2. Option B: $9 million/3 years");
            System.out.println("3. Option C: $17 million/5 years");
    	}
    	if (draftPick == 9) {
        	System.out.println("1. Option A: $12 million/4 years");
            System.out.println("2. Option B: $8 million/3 years");
            System.out.println("3. Option C: $16 million/5 years");
    	}
    	if (draftPick == 10) {
        	System.out.println("1. Option A: $11 million/4 years");
            System.out.println("2. Option B: $7 million/3 years");
            System.out.println("3. Option C: $15 million/5 years");
    	}
    }

    private static int getContractChoice() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.print("Enter the number of your contract choice (1, 2, or 3): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            choice = scanner.nextInt();
            if (choice < 1 || choice > 3) {
                System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        } while (choice < 1 || choice > 3);

        return choice;
    }
    
    public int getContractCoiceTwo(int choice) {
    	Scanner scnr = new Scanner(System.in);
    	
    	System.out.print("Enter the number of your contract choice (1, 2, or 3): ");
    	
    	int choice = scnr.nextInt();
    	
    	if(choice >= 1 && choice <= 3) {
    		
    	}
    }

}
