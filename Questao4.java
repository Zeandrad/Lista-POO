import java.util.Scanner;

public class Questao4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            double raizCubica = Math.cbrt(numero);
            System.out.println("A raiz cúbica de " + numero + " é: " + raizCubica);
        } else {
            double raizQuadrada = Math.sqrt(numero);
            System.out.println("A raiz quadrada de " + numero + " é: " + raizQuadrada);
        }

        scanner.close();
    }
}
