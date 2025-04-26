import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b,c,perimeter;
        System.out.print("Please enter the first side : ");
        a = scanner.nextDouble();
        System.out.print("Please enter the second side : ");
        b = scanner.nextDouble();
        System.out.println("Hypotenuse : " + Math.hypot(a,b));
        c = Math.hypot(a,b);
        System.out.println("Third side : " + c);
        System.out.println("Triangle perimeter is : " + 2 * ((a+b+c)/2));
    }
}

/*
public class Test {
  public static void main(String args[]) {
  double base_x = 8;
  double height_y = 10;
  System.out.println(Math.hypot(base_x, height_y));
  }}
*/
