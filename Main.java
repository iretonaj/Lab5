import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Student student1 = new Student();
    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");
    
    Student student2 = new Student();
    student2.setName("Andrew Ireton");
    student2.setGPA(4.3);
    student2.setMajor("Finance and IS");

    student1.print();
    student2.print();

    ArrayList<Double> GPAS = new ArrayList<Double>();
    GPAS.add(student1.gpa);
    GPAS.add(student2.gpa);

    double sum = 0;
      for(int i = 0; i < GPAS.size(); i++){
        sum += GPAS.get(i);

    double average = sum/GPAS.size();
      System.out.println("The average GPA is " + average);



  }
}}