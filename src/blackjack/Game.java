
package blackjack;

 import java.util.Random;
import java.util.Scanner;
public class Game {
    Player[] Players = new Player[4];
     int w ;
    Card [] Cards = new Card [52];

    public Game() {
           for ( w = 0 ; w<=3 ; w++) {
    Players[w]= new Player();
}
        
    }
     public void Deck () {
         int m = 0;
        for (int i = 0 ; i<=3 ;i++) {  
        for(int j = 0; j <= 12; j++){
           
           if (j>9) {
           Cards[m]=new Card(i,j,10);
                   
           }
           else {
           Cards[m]=new Card(i,j,j+1);   
           }
        
        m++;
        } }
                         }      
     
       public Card shuffle() {
        boolean y= true;
            Card x = null;
        while (y) {
            Random rand = new Random();
        int random;
        random = rand.nextInt(52);
        if (Cards[random]==null){
           
        } 
        
        else {
        x=Cards[random];
         Cards[random]=null;
         y=false;
            
            }
        
        }  
         
       return  x;  }
       
       
  public void info () {
      Scanner input = new Scanner(System.in);
      Card x = null;
     for (int i = 0 ; i<3 ; i++) {
         System.out.println("Enter Name of player No " + (i+1)); 
         String player_name;
          player_name = input.nextLine();
          
       Player p1 = new Player (player_name );
 Players[i]=p1;
  for (int j = 0 ; j <2 ; j++) {      
      
     x=this.shuffle();
  Players[i].add_score(x);}
         System.out.println("player score = "+ Players[i].getScore());   
       }

     Player d1 = new Player ("Dealar" );
       
     for (int i = 0 ; i <2 ; i++) {      
      
          x=this.shuffle();
       Players[3].add_score(x);
 
     }        
      
     }

  public int max_socre () {
    
      int max = 0;
       for ( int i = 0 ; i<=3 ; i++) {
        if(Players[i].getScore()<=21) {
           if(Players[i].getScore()>max){
            max=Players[i].getScore();  
           }    }
        
       }
           
      return max;}
   
  }
   
        
     
      
      
      
  
    
      
      
      
      
       
       
             
      
         
   
       
       
 

    
    
    

