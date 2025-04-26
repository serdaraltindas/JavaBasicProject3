import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a,b;
        System.out.print("Please enter the first side : ");
        a = scanner.nextDouble();
        System.out.print("Please enter the second side : ");
        b = scanner.nextDouble();
        System.out.println("Hypotenuse : " + Math.hypot(a,b));
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
