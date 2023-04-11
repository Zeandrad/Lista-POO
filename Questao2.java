import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float temperatura = 0;
        char ConversordeTemperatura;

        do{
            System.out.print("Digite uma temperatura: ");
            try{
                temperatura = Float.parseFloat(scanner.nextLine());
                System.out.print("\n");
                break;
            } catch (NumberFormatException e){
                System.out.println("Valor inválido. Digite outro valor!\n");
            }
        } while(true);

        do{
            System.out.print("Indique qual a escala desta temperatura\n" + 
            "[C] --> Celsius\n" +
            "[K] --> Kelvin\n" +
            "[F] --> Fahrenheit\n" +
            "Escolha: ");

            ConversordeTemperatura = scanner.next().charAt(0);
            scanner.nextLine();

            ConversordeTemperatura = Character.toUpperCase(ConversordeTemperatura);

            if(ConversordeTemperatura != 'C' && ConversordeTemperatura != 'K' && ConversordeTemperatura != 'F'){
                System.out.println("Escala Não válida. Dessa vez, digite uma escala válida!\n");
            }
        } while(ConversordeTemperatura != 'C' && ConversordeTemperatura != 'K' && ConversordeTemperatura != 'F');

        conversao(temperatura, ConversordeTemperatura);
    }

    public static void conversao(float temperatura, char ConversordeTemperatura){
        double C, K, F;
        System.out.println("\nA Converção da escala para:");

        switch(ConversordeTemperatura){
            case 'C':
                C = temperatura;
                System.out.printf("Celsius: %.1f°C\n", C);

                K = C + 273.15;
                System.out.printf("Kelvin: %.1fK\n", K);

                F = C * 1.8 + 32;
                System.out.printf("Fahrenheit: %.1f°F\n", F);
                break;
            case 'K':
                K = temperatura;
                System.out.printf("Kelvin: %.1fK\n", K);

                C = K - 273.15;
                System.out.printf("Celsius: %.1f°C\n", C);

                F = K * 1.8 - 459.67;
                System.out.printf("Fahrenheit: %.1f°F\n", F);
                break;
            case 'F':
                F = temperatura;
                System.out.printf("Fahrenheit: %.1f°F\n", F);

                C = (F - 32) / 1.8;
                System.out.printf("Celsius: %.1f°C\n", C);

                K = (F + 459.67) * 5/9;
                System.out.printf("Kelvin: %.1fK\n", K);
                break;
        }
    }
}
