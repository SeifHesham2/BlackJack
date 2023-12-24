
package blackjack;

import java.util.Scanner;


public class BlackJack {

  static  Game g1 = new Game();
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

GUI gui = new GUI();

String name;
Card x;
g1.Deck();
g1.info();
gui.runGUI( g1.Cards ,g1.Players[0].Pcard ,g1.Players[1].Pcard ,  g1.Players[2].Pcard , g1.Players[3].Pcard);     
for ( int i = 0 ; i<3 ; i++){
    
 while (g1.Players[i].getScore()<=21) {
     
     System.out.println("player " + (i+1) + " hit or stand"); 
     name = input.nextLine();
     
    if (name.equals("hit")) {
     x=g1.shuffle();
     g1.Players[i].add_score(x);
     gui.updatePlayerHand(x,i);
     
     
System.out.println("player score = "+ g1.Players[i].getScore());
 if (g1.Players[i].getScore()>21) {
     System.out.println(g1.Players[i].getName()+" you are busted");
 }}
   
    else {
    
        break;
    }
  
 }
}
Card m;
   int w= g1.max_socre();
        

   
    if(g1.Players[0].getScore()>21 && g1.Players[1].getScore()>21 &&g1.Players[2].getScore()>21) {
        if (g1.Players[3].getScore()<=21) {
          System.out.println("Dealar is the winner"); 
            
        }
        
        
    }     
    else {
        
         while (g1.Players[3].getScore() <=w) {
            
             if (g1.Players[3].getScore()<=21){
                
             x=g1.shuffle();
              
             gui.updateDealerHand(x,g1.Cards);
        g1.Players[3].add_score(x);}
            
             
             
         }
        if (g1.Players[3].getScore()>w && g1.Players[3].getScore()<=21) {
        System.out.println("Dealar is the winner");  
        
            
        
        }
    }
int l = 0;
int z=0;
      int o = g1.max_socre();
      String n = null;
    for ( int i = 0 ; i<=2 ; i++) {
        if (g1.Players[i].getScore()==o){
            l++;
           n = g1.Players[i].getName();
        }
        else if (g1.Players[i].getScore()>21 && g1.Players[3].getScore()>21){
            z++;
        }
        
    }
   if (l==1) {
       System.out.println( n  + " is the winnser");
   }
   else if (l>1){
       System.out.println("Game push");
   }
   else if (z==3){
       System.out.println("Game push");
   }
   
        
           
       
          
          
          
      }
           
      
          
       
          
      }
         
         
         
         
         
         
         
        
        
     
       
 
 
      
      
      
 
        
        
        
        
        
        
        

 
    
        
        
        
        
        
        
        
        
        
        
        
        
        
  
   
        
        
 
        
        
    
    

