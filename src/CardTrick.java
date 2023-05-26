/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Owner
 */
public class CardTrick {
    private static final String[]suits = {
     "2","3","4","5","6","7","8","9","10", "Ace", "King","Queen","Jack"};  
    private static final int HAND_SIZE= 7;
      private String[]hand;
      public CardTrick(){
          hand = new String[HAND_SIZE];
          fillHandWithRandomCards();
      }

    private void fillHandWithRandomCards() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     Random input = new Random();
     for(int n =0; n< HAND_SIZE;n++){
         String inputSuit = suits[input.nextInt(suits.length)];
         String inputValue =values[input.nextInt(values.length)];
         hand[n]= inputValue + "of" + inputSuit;
     }
    
    
}
