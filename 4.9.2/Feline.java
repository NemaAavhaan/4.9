/*
 * Activity 4.9.2
 */
public class Feline extends Animal
{
  public Feline(String food, boolean nocturnal, double aveLifeSpan)  {
    super(food, nocturnal, aveLifeSpan);
  }
  public void roar()
  {
    System.out.println("The feline animal roars.");
  }
  public void growl()
  {
    System.out.println("The feline animal growls.");
  }
}