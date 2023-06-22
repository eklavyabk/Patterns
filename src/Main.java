import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        System.out.println("Enter the number: ");
//        Scanner sc = new Scanner(System.in);
//        int num=sc.nextInt();
        pattern11(5);



    }
//    -----------------------------------------------------------------------------------------------------------------


//    -----------------------------------------------------------------------------------------------------------------

    static void pattern11(int num){
        for(int row=0 ; row<=num ; row++){
            for(int space=0; space<row ; space++){
                System.out.print("  ");
            }
            for(int col=row; col<num; col++){
                System.out.print("   *");
            }
            System.out.println();
        }
    }
//    -----------------------------------------------------------------------------------------------------------------
    static void pattern10(int num){
        for(int row=0 ; row<num ; row++){
            for(int space=row; space<num-1 ; space++){
                System.out.print("  ");
            }
            for(int col=0 ; col<=row ; col++){
                System.out.print("   *");
            }
            System.out.println();
        }
    }
//    -----------------------------------------------------------------------------------------------------------------

    static void pattern9(int num){
        for(int row=0 ; row<num ; row++){
            for(int space=0 ; space<row ; space++){
                System.out.print("  ");
            }
            for(int col=row*2 ; col<2*num-1 ; col++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
//    -----------------------------------------------------------------------------------------------------------------

    static void pattern8(int num){
        for(int row=1 ; row<=num ; row++){
            for(int space=row ; space<num ; space++){
                System.out.print("  ");
            }
            for(int col=1 ; col<2*row ; col++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
//    -----------------------------------------------------------------------------------------------------------------

    static void pattern7(int num){
        for(int row=1 ; row<=num ; row++){
            for(int space=1; space<row; space++){
                System.out.print("  ");
            }
            for(int col=row ; col<=num ; col++){
                System.out.print(" *");
            }
            System.out.println();
        }
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