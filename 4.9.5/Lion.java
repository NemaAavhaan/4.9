/*
 * Activity 4.9.2
 */
public class Lion extends Feline
{
  public Lion(String food, boolean nocturnal, double aveLifeSpan) 
  {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("Lion has arrived at the zoo");
  }
  public void huntInPack()
  {
    System.out.println("The lion hunts.");
  }
}