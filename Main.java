import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exercício 2

        String senha = null, senhaCompare = null;
        int num1 = 0, num2 = 0, i = 0;

        System.out.println("Defina uma senha:");
        senha = scanner.nextLine();
        for(i = 0; i < 2; i++) {
            System.out.println("Agora, digite dois números inteiros:");
            if(i == 0) {
                num1 = scanner.nextInt();
            }else if(i == 1){
                num2 = scanner.nextInt();
            }
        }

        float divisao = (float) num1 / num2;

        scanner.nextLine(); // Limpando o buffer

        System.out.println("Confirme sua senha:");
        senhaCompare = scanner.nextLine();

        if(senhaCompare.equals(senha)){
            System.out.println("Senha correta. O resultado da divisão é:" + divisao);
        }else{
            System.out.println("Erro! Senha incorreta!!");
            System.exit(0);
        }

    }
}