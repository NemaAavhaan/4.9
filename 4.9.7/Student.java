/*
 * Activity 4.9.7
 */ 
public class Student 
{ 
  private String name = ""; 
  private int yearInSchool;
  private int id; 

  // Constructor 
  public Student(String inputName, int inputYearInSchool, int id){ 
    name = inputName;
    yearInSchool = inputYearInSchool;
    this.id = id;
  } 
  private String yearInSchoolString = String.valueOf(yearInSchool);
  private String idString  = String.valueof(id);
  public String toString(){
    return name + "" + yearInSchoolString + "" + idString ;
  }
  public boolean equals(Student a, Student b){
    if (a.id == b.id){
      return true;
    }
    else{
      return false;
    }
  }
} 