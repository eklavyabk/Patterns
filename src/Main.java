import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Enter the number: ");
//        Scanner sc = new Scanner(System.in);
//        int num=sc.nextInt();
        pattern6(5);



    }

//    -----------------------------------------------------------------------------------------------------------------

    static void pattern6(int num){
        for(int row=1 ; row<=num ; row++){
            for(int space=row ; space<num ; space++){
                System.out.print("  ");
            }
            for(int col=1 ; col<=row ; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
//    -----------------------------------------------------------------------------------------------------------------

    static void pattern5(int num){
        for(int row=1 ; row<=2*num-1 ; row++){
            int nxtmove=row>num?2*num-row:row;
            for(int col=1 ; col<=nxtmove ; col++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
//    -----------------------------------------------------------------------------------------------------------------


    static void pattern4(int num){
        for(int row=1 ; row<=num ; row++){
            for(int col=1 ; col<=row ; col++){
                System.out.print(" "+col);
            }
            System.out.println();
        }
    }
//    -----------------------------------------------------------------------------------------------------------------



    static void pattern3(int num){
        for(int row=1 ; row<=num ; row++){
            for(int col=num ; col>=row ; col--){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
//    -----------------------------------------------------------------------------------------------------------------


    static void pattern2(int num){
        for(int row=1 ; row<=num ; row++){
            for(int col=1 ; col<=row ; col++){
                System.out.print(" *");
            }
            System.out.println(" ");
        }

    }
//    -----------------------------------------------------------------------------------------------------------------

    static void pattern1(int num){
        for(int row=1 ; row<=num ; row++){
            for(int col=1 ; col<=num ; col++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }
    }


}