/*
 * Activity 4.9.7
 */ 
public class StudentRunner
{ 
  public static void main(String args[]) 
  { 
    Student s = new Student("TestName",8,129875); 
    Student t = new Student("Testname",5,129875);
    Student r = new Student("New Name",5,881134);

    // Below two statements are equivalent 
    System.out.println(s.equals(t)); 
    System.out.println(s.equals(r)); 
  } 
} 