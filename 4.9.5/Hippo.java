/*
 * Activity 4.9.2
 */
public class Hippo extends Hooved
{
  public Hippo(String food, boolean nocturnal, double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("Giraffe has arrived at the zoo");
  }
  public void groan()
  {
    System.out.println("The hippo groans.");
  }
  public void speak(){
    groan();
  }
}