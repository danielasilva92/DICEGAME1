package se.jensen.daniela.tarningsspel;


public class tarningsSpelare { // skapar en class med privata atributer
    private String firstName;
    private String lastName;
    private int score;

    public tarningsSpelare() {// skapar en konstruktor
        this.score = 0;// start poäng alltid på 0

    }
        public void setFirstName(String firstName){ // lägger in felhantering ifall inget namn anges
        if (firstName == null && firstName.trim().isEmpty()){
            throw new IllegalArgumentException("Förnamnet kan inte vara tomt tyvärr!");
        }
        this.firstName = firstName;

        } public void setLastName(String lastName){
        if (lastName == null && lastName.trim().isEmpty()){
            throw new IllegalArgumentException("Efternamnet kan inte vara tomt tyvärr!");

        }
        this.lastName = lastName;
    }
    public void addScore(int score){ // skapar en metod som tar in en score och lagrar den i klassen
        this.score += score; //

    }
    public int getScore(){ // skapar en metod som returnerar totala poängen
        return this.score;
    }
    public String getFullName(){ // skapar en metod som returnerar fullt namn
        return firstName + " " + lastName;
    }
    public void restScore(){// med denna metoden kan en ny spel startas utan poängen från förra spelet
        this.score = 0; // nollställer poängen
    }
}
