import java.util.Scanner;
public class Ejemplo11 {
    public static void main(String[] args) {

        int x;
        int y;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce el primer numero: ");
        x = inputValue.nextInt();

        System.out.println("Introduce el segundo numero: ");
        y = inputValue.nextInt();

        inputValue.close();

        if (x > y) {
            System.out.println(y + " - " + x);
        } else {
            System.out.println(x + " - " + y);
        }
    }
}
