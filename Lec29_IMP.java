import java.util.Scanner;

public class Lec29_IMP {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //Q1
//        float[] num=new float[5];
//        for (int i=0;i<num.length;i++){
//            System.out.println("Enter number "+(i+1));   //if i=1 then +i+5 =15
//            num[i]=scanner.nextFloat();
//        }
//        float sum=0;
//        for (int i=0;i<5;i++){
//            sum += num[i];
//        }
//        System.out.println("The sum is "+sum);

        //Q2
//        System.out.println("Enter a number");
//        boolean z=false;
//        int num=scanner.nextInt();
//        int[] arr={3,5,7,9,34,56,73,45};
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==num){
//                z=true;
//                break;
//            }
//        }
//        if (z){
//            System.out.println("This number is present in array!");
//        }
//        else {
//            System.out.println("This number is NOT present in array!");
//        }

        //Q3
//        int[] marks={78,88,92,56,100,97,91,100};
//        int num= marks.length;
//        float average=0;
//        for (int element:marks
//             )
//        {
//            average+=element;
//        }
//        average=average/num;
//        System.out.println("The average is "+average);

        //Q4
//        int[][] arr1=new int[2][3];
//        int[][] arr2=new int[2][3];
//        int[][] sum=new int[2][3];
//
//        for (int i=0;i<arr1.length;i++){
//            for (int j=0;j<arr1[i].length;j++){
//                System.out.println("Enter the value of element ["+(i)+"]["+(j)+"] of Array 1");
//                arr1[i][j]=scanner.nextInt();
//                System.out.println("Enter the value of element ["+(i)+"]["+(j)+"] of Array 2");
//                arr2[i][j]=scanner.nextInt();
//            }
//        }
//        for (int i=0;i<arr1.length;i++){
//            for (int j=0;j<arr1[i].length;j++){
//                sum[i][j]=arr1[i][j]+arr2[i][j];
//            }
//        }
//        for (int i=0;i<sum.length;i++){
//            for (int j=0;j<sum[i].length;j++) {
//                System.out.print(sum[i][j]+" ");
//            }
//            System.out.println();
//            }

        //Q5
//        int[] arr=new int[5];
//        for (int i=0;i<arr.length;i++){
//            System.out.println("Enter the value of element "+(i+1));
//            arr[i]=scanner.nextInt();
//        }
//        for (int i=0;i<arr.length/2;i++){
//            int temp;
//            temp=arr[i];
//            arr[i]=arr[arr.length-i-1];
//            arr[arr.length-i-1]=temp;
//        }
//        for (int i=0;i< arr.length;i++){
//            System.out.println(arr[i]);
//        }

        //Q6
//        int[] arr=new int[5];
//        for (int i=0;i<arr.length;i++){
//            System.out.println("Enter the value of element "+(i+1));
//            arr[i]=scanner.nextInt();
//        }
//        int max=arr[0];
//        for (int i=0;i<arr.length-1;i++){
//            if (arr[i+1]>max){
//                max=arr[i+1];
//            }
//        }
//        System.out.println(max);

        //Q7
//        int[] arr=new int[5];
//        for (int i=0;i<arr.length;i++){
//            System.out.println("Enter the value of element "+(i+1));
//            arr[i]=scanner.nextInt();
//        }
//        int min=arr[0];
//        for (int i=0;i<arr.length-1;i++){
//            if (arr[i+1]<min){
//                min=arr[i+1];
//            }
//        }
//        System.out.println(min);

        //Q8
//        int[] arr=new int[5];
//        for (int i=0;i<arr.length;i++){
//            System.out.println("Enter the value of element "+(i+1));
//            arr[i]=scanner.nextInt();
//        }
//        int count=0;
//        for (int i=0;i<arr.length-1;i++){
//            if (arr[i]>=arr[i+1]){
//                System.out.println("Array is not sorted!");
//                count++;
//                break;
//            }
//        }
//        if (count==0){
//            System.out.println("Array is sorted!");
//        }
    }
}
