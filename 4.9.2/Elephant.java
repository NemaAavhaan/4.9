/*
 * Activity 4.9.2
 */
public class Elephant extends Animal
{
  public Elephant(String food, boolean nocturnal, double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("Elephant has arrived at the zoo");
  }
  public void trumpet()
  {
    System.out.println("The elephant trumpets.");
  }
  public void forages()
  {
    System.out.println("The elephant forages.");
  }
}