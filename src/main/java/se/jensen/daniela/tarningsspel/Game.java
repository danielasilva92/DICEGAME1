package se.jensen.daniela.tarningsspel;
import java.util.Scanner;

//Denna klassen är spelets HJÄRNA!!
//Den hanterar allt i spelet, spelrundor, poängräkning, tärningskast, läser in spelarens input och vinnare.

public class Game {
    private Players player1;// första spelare instans av players
    private Players player2; // andra spelare instans av players
    private Dice dice; //instans av dice och används för att kasta träningen
    private Scanner scanner;// används för att läsa in spelarens input

    //Konstruktor
    public Game() {
        player1 = new Players();
        player2 = new Players();
        dice = new Dice();
        scanner = new Scanner(System.in);
    }
 // olika metoder som får spellogiken att fungera

    public void start() { // startar spelet
        System.out.println("==============================");
        System.out.println("Welcome to Danis DICEGAME!!");
        System.out.println("==============================");

        // endast spelarinmatning och inget annat ansvar
        setupPlayers(); // delegerar till setupplayers och startar spelet


        // skapar en meny med 2 val för spelaren att starta/avsluta spelet
        while (true) {
            System.out.print("\n====================MENY====================");
            System.out.print("\nvälj ett alternativ");
            System.out.println("\nSkriv play följt av enter för att STARTA SPELET");
            System.out.println("Skriv quit följt av enter för att AVSLUTA SPELET");
            System.out.println("===============================================");
            String input = scanner.next();

            // lägger in en if stats som ser till att spelet startar eller avslutas
            if (input.equals("quit")) {
                System.out.println("Spelet avslutas nu.........");
                break;
            } else if (input.equals("play")) {
                playMatch();
            } else {
                System.out.println("Fel inmatning, vänligen välj ett alternativ");
            }

        }

      //Stänger scanner sist när hela applikationen avslutas
        scanner.close();
}
    private void setupPlayers() { // lägger in spelarens namn och startar spelet
        while (true) { // lägger in en loop med felhantering tills inmatning blir rätt
            try {
                System.out.print("Välkommen spelare 1, vänligen ange ditt förnamn tack : ");
                player1.setFirstName(scanner.nextLine());
                System.out.println("Ange nu ditt efternamn tack: ");
                player1.setLastName(scanner.nextLine());
                break; // avsluta denna loopen om  både för och efternamn blir imatade
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + "FEL, vänligen försök igen");
            }
        }
        while (true) {
            try {
                System.out.print("Välkommen spelare 2, vänligen ange ditt förnamn tack : ");
                player2.setFirstName(scanner.next());
                System.out.println("Ange nu ditt efternamn tack: ");
                player2.setLastName(scanner.next());
                break; // avsluta denna loopen om  både för och efternamn blir imatade
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + "FEL, vänligen försök igen");

            }
        }
    }

    private void playMatch() {
        player1.restScore();
        player2.restScore();

        System.out.println("==============================");
        System.out.println("==========SPELET BÖRJAR==========");
        System.out.println("==============================");

        // spelare 1 kastar tärningen 2 gånger
        for (int i = 0; i < 2; i++) {
            int roll = dice.roll(); // delegerar till dice
            player1.addScore(roll); // delegerar till players
            System.out.println(player1.getFullName() + " Slog " + roll);
        }

        //Spelar 2 spelar 2 gånger
        for (int i = 0; i<2;i++){
        int roll = dice.roll();
        player2.addScore(roll);
        System.out.println(player2.getFullName() + " Slog " + roll);
        }

        //RESULTAT
        System.out.println("==============================");
        System.out.println("=========RESULTAT=========");
        System.out.println(player1.getFullName() + " " + player1.getScore());
        System.out.println(player2.getFullName() + " " + player2.getScore());
        System.out.println("==============================");

        if(player1.getScore()>player2.getScore()){
        System.out.println("VINNARE -----> " + player1.getFullName());
        }else if(player1.getScore()<player2.getScore()){
            System.out.println("VINNARE -----> " + player2.getFullName());

        }else{
            System.out.println("Det blev oavgjort!");
        }
    }
    }