import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner ak = new Scanner(System.in);

        int x,y,z;

        System.out.print("Please enter a number = ");
        x= ak.nextInt();

        for (y=1; y<=x ; y*=4)
            System.out.println("y=" + y );

        for(z=1; z<=x; z*=5)
            System.out.println("z=" + z);
    }
}