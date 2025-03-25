/*
 * Activity 4.9.2
 */
public class Hooved extends Animal
{
  public Hooved(String food, boolean nocturnal, double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("Elephant has arrived at the zoo");
  }
  public void forage()
  {
    System.out.println("The hooved animal forages for food.");
  }
}