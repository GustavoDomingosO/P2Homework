package br.ufal.ic.p2.election;
import java.util.Scanner;

public class Election {
	
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);

        int nextVote = 0;
        int votePMDB = 0;
        int votePSDB = 0;
        int voteNull = 0;

        while(nextVote != -1) {
        	System.out.println("Declare your vote. PMDB: 15 || PSDB: 45");
        	nextVote = input.nextInt();
        	
        	if(nextVote == 15) {
        		votePMDB++;
        		System.out.println("Voted for PMDB (15).");
        		
        	} else if (nextVote == 45) {
        		votePSDB++;
        		System.out.println("Voted for PSDB (45).");
        		
        	} else if (nextVote == -1) {
        		System.out.println("Election Finished.");
        		break;
        		
        	} else {
        		System.out.println("Voted Null.");
        		voteNull++;
        		
        	}
        }

        input.close();
        
        if(voteNull > (votePMDB + votePSDB)/2) {
        	System.out.println("The election was cancelled.");
        	
        	} else if (votePMDB > votePSDB) {
        		System.out.println("PMDB(15) won the election.");
        	
        	} else if (votePMDB < votePSDB) {
        		System.out.println("PSDB(45) won the election.");
        		
        	} else { 
        		System.out.println("PMDB and PSDB tied");
        		
        	}
        
        System.out.println("Votes for PMDB: " + votePMDB);
        System.out.println("Votes for PSDB: " + votePSDB);
        System.out.println("Null votes: " + voteNull);
    }
}