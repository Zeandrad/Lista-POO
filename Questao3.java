import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = sc.nextLine();
        
        String[] nomeSobrenome = nomeCompleto.split(" ");
        String nome = nomeSobrenome[0];
        String sobrenome = nomeSobrenome[nomeSobrenome.length - 1];
        
        if (sobrenome.equalsIgnoreCase("Wayne")) {
            System.out.println("Acesso liberado, Sr. Wayne");
        } else if (sobrenome.equalsIgnoreCase("Kent")) {
            System.out.println("Saí daí, mané!");
        } else if (nome.equalsIgnoreCase("Diana")) {
            System.out.println("Bem-vinda, Princesa de Themyscara");
        } else {
            System.out.println("Cai fora!");
        }
        
        sc.close();
    }
}
