//String Methods
public class Lec14 {
    public static void main(String[] args) {
        String a=new String("Aayush");
        String a1="    Aayush      ";

//        int value =a.length();
//        System.out.println(value);

//        String a2=a.toLowerCase();
//        System.out.println(a2);

//        String a2=a.toUpperCase();
//        System.out.println(a2);

//        String a2=a1.trim();
//        System.out.println(a2);
//        System.out.println(a1.trim());

        //System.out.println(a.substring(2));
        //System.out.println(a.substring(1,5));    //1 is included but '5 and' onwards is excluded

        //System.out.println(a.replace('A','b'));

        //System.out.println(a.replace("Aay","shu"));
        //System.out.println(a.replace("a","yo"));

//        System.out.println(a.startsWith("Aa"));
//        System.out.println(a.endsWith("h"));
//        System.out.println(a.endsWith("yh"));

//        System.out.println(a.charAt(2));

        //System.out.println(a.indexOf('A'));       //the index of the first 'A' will be returned

       // System.out.println(a.indexOf('A',3));  //will start looking for 'A' from index 3
       // System.out.println(a.indexOf("sh",3));

       String name="AndbhfbAksvemkA";
       System.out.println(name.lastIndexOf('A'));   //will return the last occurrence index of that character
        System.out.println(name.lastIndexOf('A',10)); //last index before 10 (including 10)
                    //agar ek bhi letter aa gaya required string ka to vohi index return hoga
        System.out.println(a.lastIndexOf("sh"));
        String name2="Hayrryrry";
        System.out.println(name2.lastIndexOf("rry",4));

        System.out.println(a.equals("aayush"));
        System.out.println(a.equalsIgnoreCase("aaYush"));

        System.out.println("yo \"Aayush\" here!");


    }
}
