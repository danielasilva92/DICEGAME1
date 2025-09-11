package se.jensen.daniela.tarningsspel;

// skapar en klass för spelare, den ska representera spelare, samt lagra information om spelaren/poängen
public class Players { // skapar en class med privata attributer
    private String firstName; // detta behövs för att
    private String lastName;
    private int score;

    //konstruktor använder vi för att sätta startvärde, skapa objekt från en klass
    // och för att slippa kalla på extra metoder varje gång man skapar objektet

    public Players() {// skapar en konstruktorn
        this.score = 0;// ALLA spelare börjar med 0 points!

        //skapar flera olika metoder som ska hjälpa till att lagra olika infomation
    }
        public void setFirstName(String firstName){ // sätter spelarens förnamn
        if (firstName == null || firstName.trim().isEmpty()){//  lägger in felhantering ifall strängen blir "tomt"
            throw new IllegalArgumentException ("Förnamnet kan inte vara tomt tyvärr!");
        }else
        this.firstName = firstName;

        } public void setLastName(String lastName){ // sätter spelarens efternamn
        if (lastName == null || lastName.trim().isEmpty()){
            throw new IllegalArgumentException ("Efternamnet kan inte vara tomt tyvärr!");

        }else
            this.lastName = lastName;
    }
   public void addScore(int score){ // denna metoden lägger till poäng till spelarens totala score
        this.score += score;

    }
    public int getScore(){ // skapar en metod som returnerar spelarens aktuella poäng
        return this.score;
    }
    public String getFullName(){ // skapar en metod som returnerar fullt namn
        return firstName + " " + lastName;
   }
   public void restScore(){// denna metoden kan en ny spel startas utan poängen från förra spelet
       this.score = 0; // nollställer poängen
   }
}
