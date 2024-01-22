//Strings
public class Lec13 {
    public static void main(String[] args) {
        //String name=new String("Aayush");
        String name="Aayush";
        System.out.println(name);
    //------------------------------------------------------------------------------
        //Strings are immutable and cannot be changed
        // Creating a string
        String originalString = "Hello, World!";

        // Modifying the string - this creates a new string
        String modifiedString = originalString.concat(" Welcome!");

        // Printing the original and modified strings
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
//----------------------------------------------------------------------------------
        System.out.format("Yo %s",name);    //similar to printf
    }
}
