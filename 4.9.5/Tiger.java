/*
 * Activity 4.9.2
 */
public class Tiger extends Feline
{
  public Tiger(String food, boolean nocturnal, double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("Tiger has arrived at the zoo");
  }
  public void huntAlone()
  {
    System.out.println("The Tiger hunts.");
  }
  public void swim()
  {
    System.out.println("The Tiger swims.");
  }
}
