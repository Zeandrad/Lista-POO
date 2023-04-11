import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.println("5 - Potenciação");
        System.out.println("6 - Raiz Quadrada");
        System.out.println("7 - Raiz Cúbica");
        System.out.println("Escolha: ");

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.print("Digite outro número: ");
                double num2 = scanner.nextDouble();
                double soma = num1 + num2;
                System.out.println("O resultado da soma é: " + soma);
                break;
            case 2:
                System.out.print("Digite outro número: ");
                num2 = scanner.nextDouble();
                double subtracao = num1 - num2;
                System.out.println("O resultado da subtração é: " + subtracao);
                break;
            case 3:
                System.out.print("Digite outro número: ");
                num2 = scanner.nextDouble();
                double multiplicacao = num1 * num2;
                System.out.println("O resultado da multiplicação é: " + multiplicacao);
                break;
            case 4:
                System.out.print("Digite outro número: ");
                num2 = scanner.nextDouble();
                double divisao = num1 / num2;
                System.out.println("O resultado da divisão é: " + divisao);
                break;
            case 5:
                System.out.print("Digite o expoente: ");
                int expoente = scanner.nextInt();
                double potencia = Math.pow(num1, expoente);
                System.out.println("O resultado da potenciação é: " + potencia);
                break;
            case 6:
                double raizQuadrada = Math.sqrt(num1);
                System.out.println("O resultado da raiz quadrada é: " + raizQuadrada);
                break;
            case 7:
                double raizCubica = Math.cbrt(num1);
                System.out.println("O resultado da raiz cúbica é: " + raizCubica);
                break;
            default:
                System.out.println("Operação inválida.");
                break;
        }

        scanner.close();
    }
}
