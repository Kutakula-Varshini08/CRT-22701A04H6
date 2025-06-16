// Define the Student class
class Student{
    String name;
    String roll;
    String branch;
    int year;
    char section;
    // Constructor to initialize a Student object
    Student( String roll,String name,String branch,int year,char section){
        this.name=name;
        this.roll=roll;
        this.branch=branch;
        this.year=year;
        this.section=section;
    }
}
// Main class to run the program
public class Main {
    public static void main(String[] args) {
       Student s1=new Student("varshini","22701A4H6","ECE",4,'D');
       Student s2=new Student("deepthi","22701A4H6","CSE",3,'C');
       System.out.println(s1.name);
       System.out.println(s2.roll);
    }
}