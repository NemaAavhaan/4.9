/*
 * Activity 4.9.2
 */
public class Giraffe extends Hooved
{
  public Giraffe(String food, boolean nocturnal, double aveLifeSpan)
  {
    super(food, nocturnal, aveLifeSpan);
    System.out.println("Giraffe has arrived at the zoo");
  }
  public void hum()
  {
    System.out.println("The giraffe hums.");
  }
  public void speak(){
    hum();
  }
}