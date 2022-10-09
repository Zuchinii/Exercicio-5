
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o número em metros para conversão");
        
        double a = entrada.nextDouble();

        double b = a * 100;
        
        System.out.printf("O resultado da conversão em cm foi de:" + b);

        entrada.close();


    }
}
