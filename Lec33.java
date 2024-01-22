public class Lec33 {
//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b,int c){
//        return a+b+c;
//    }
    static  int sum(int ...arr){   //will behave as int[] arr
        int yo=0;
        for(int element: arr){   //read as "For element in arr"

            yo+=element;
        }
        return yo;
    }
    //if we have to make atleast 1 entry compulsary
    static  int sum1(int a,int ...arr){   //will behave as int[] arr
        int yo=a;
        for(int element: arr){   //read as "For element in arr"

            yo+=element;
        }
        return yo;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Varargs tutorial!");
        System.out.println("The sum of nothing is "+sum());
        System.out.println("The sum of 4 and 5 is "+sum(4,5));
        System.out.println("The sum of 5, 4 and 5 is "+sum(5,4,5));
        System.out.println("4+5= "+sum1(4,5));

    }
}
