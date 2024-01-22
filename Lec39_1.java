class Employee1{      //cant keep 2 classes with same name under 1 package
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public String setName(String yo){
        name=yo;
        return name;
    }
}
public class Lec39_1 {
    public static void main(String[] args) {
      Employee1 E1=new Employee1();
      E1.salary=45000000;
        System.out.println("Name: "+E1.getName());    //be default String is null until not given a value
        E1.setName("Aayush");
        System.out.println("Name: "+E1.getName());
        int salary1=E1.getSalary();
        System.out.println("The salary of "+E1.name+" is "+salary1);


    }
}
