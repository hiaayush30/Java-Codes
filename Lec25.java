public class Lec25 {
    public static void main(String[] args) {
        //Q1
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //Q2
        int s = 5;
        int t = 0;
        int jim=0;
        while(t<=s){
            jim +=(2*t);
            t++;
        }
        System.out.println(jim);

        //Q5
        int yo = 6;
        int fact = 1;
//        for (int i = 1; i <= yo; i++) {
//            fact = fact * i;
//        }
//        System.out.println(fact);


        //Q6
        int i = 1;
        while (i <= yo) {
            fact *= i;
            i++;
        }
        System.out.println(fact);

        //Q7
        int x = 1;
        int ya = 4;
        while (x <= ya) {
            int y = ya;
            while (y >= x) {
                System.out.print("*");
                y--;
            }
            x++;
            System.out.println();
        }

        //Q9
        int jam = 0;
        for (int q = 1; q <= 10; q++) {
            jam += (8 * q);
        }
        System.out.println(jam);


        //Q11
//        int n = 5;
//        int sum = 0;
//        for (int i = 0; i <= n; i++) {
//            sum = sum + 2 * i;
//        }
//        System.out.println(sum);

    }
}
