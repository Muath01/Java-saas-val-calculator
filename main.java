import java.util.*;

public class main{

    public static void main(String[] args){


        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int k=0;k<n;k++){
                a+=b;
                if(k>0)
                    System.out.print(" ");
                System.out.print(a);

                b=b*2;

            }
        }
        // 5 + 3(1), 5 + 3(2), 5 + 3(3), 5 + 3(4), 5 + 3(5)
        in.close();

    }
}

// This is able to feel the way

