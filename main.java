import java.util.*;


class userInputDemo{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("What is your ARR: ");
        int arr = sc.nextInt();
        System.out.print("What is your growth rate: ");
        int growth = sc.nextInt();
        System.out.print("What is your Renewal Rate: ");
        int renewal = sc.nextInt();

        System.out.println(arr * growth * 10 * renewal);

        /*
        var value = revenue.value * (growth.value / 100) * 10 * (renewal.value / 100)

        value =  Math.round((value + Number.EPSILON) * 100) /100;
        value = value.toLocaleString("en-US")
        */
// ARR x growth x 10 x renewal rate


    }


}

