//OOPs
class Employee{
    int id;
    String name;
    int salary;
    public void printdetails(){
        System.out.println("Your name is "+name);
        System.out.println("Your id is "+id);
    }
    public int getsalary(){
        return salary;
    }
}
public class Lec38 {
    public static void main(String[] args) {
        System.out.println("This is our custom Class");
        Employee E1=new Employee();  //Instantiating a new Employee object
        //setting attributes
        E1.id=1;
        E1.name="Aayush";
        E1.salary=99999999;
        System.out.println(E1.id);
        System.out.println(E1.name);
        int salary1=E1.getsalary();

        //Calling a method of the object
        E1.printdetails();
        System.out.println(salary1);

        Employee E2=new Employee();
        E2.name="John Tripathi";
        E2.id=2;
        E2.salary=10999998;
        E2.printdetails();
        int salary2= E2.getsalary();
        System.out.println(salary2);
    }
}
