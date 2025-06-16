class Main{
    public static void main(String[] args){
        Teacher T1 = new Teacher("deepthi","22701A05M9","CSE","Mtech",new String[]  {"c","Java","python"});
        T1.details();
         Teacher T2 = new Teacher("madhavi","22701A04H6","ECE","PHD",new String[]  {"c","Java"});
        T2.details();
    }
}
class Teacher{
    String name;
    String id;
    String[] subjects;
    String dpt;
    String qualification;
    // Constructor to initialize a Student object
    Teacher( String name,String id,String dpt,String qualification, String[] subjects){
        this.name = name;
        this.id = id;
        this.dpt = dpt;
        this.qualification = qualification;
        this.subjects = subjects; 
    }
    void details(){
        System.out.println(" --------------- ");
        System.out.println("Teacher Name:" + name);
        System.out.println("Teacher id:" + id);
        System.out.println("department:" + dpt);
        System.out.println("Qualification:" + qualification);
        System.out.println("Subjects:");
        for(String subjects : subjects){
            System.out.println(subjects + ",");
        }
        System.out.println();
        System.out.println(" --------------- "); 
    }
}
