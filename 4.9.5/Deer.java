/*
 * Activity 4.9.2
 */
public class Deer extends Hooved
{
  public Deer(String food, boolean nocturnal, double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("Giraffe has arrived at the zoo");
  }
  public void grunt()
  {
    System.out.println("The deer grunts.");
  }
  public void speak(){
    grunt();
  }
}