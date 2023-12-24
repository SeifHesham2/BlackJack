
package blackjack;


public class Player {
   private String name;
   private int score=0;
   Card Pcard[]=new Card[11];
   int index=0;

    public Player(String name ) {
        this.name = name;
       
    }

    public Player() {
    }
    

   public void add_score(Card x) {
       Pcard[index]=x;
       index++;
       score += x.getValue();
       
   }

    public int getScore() {
        return score;
    }  

    public String getName() {
        return name;
    }
}

    