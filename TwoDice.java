// Chapter 5 Game Zone exercise

public class TwoDice
{
   public static void main(String[] args)
   {
   // Instance variables (data fields) for this class

   Die firstDie = new Die();
   Die secondDie = new Die();
   String outcome;

// PROCESSING PHASE
   if(firstDie.getDieValue() > secondDie.getDieValue())
   {
      outcome = "The player wins the game!";
   } // END OF INITIAL IF STATEMENT
   else
   {
      if(firstDie.getDieValue() < secondDie.getDieValue())
      {
         outcome = "Sorry, the computer has won...";
      }
      else
      {
         outcome = "We have a tie game";
      }
}
   System.out.println("Player die roll is " + firstDie.getDieValue());
   System.out.println("Computer die roll is " + secondDie.getDieValue());
   System.out.println(outcome);
}
}