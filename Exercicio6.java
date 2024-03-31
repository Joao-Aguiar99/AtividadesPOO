import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String dia;

        System.out.println("Digite um número de 1 a 7 para receber um dia da semana correspondente:");

        // Loop para solicitar entrada válida

        boolean entradaValida = false;

        while (!entradaValida) {
            dia = scanner.nextLine();

            switch (dia) {
                case "1":
                    System.out.println("Domingo");
                    entradaValida = true;
                    break;
                case "2":
                    System.out.println("Segunda");
                    entradaValida = true;
                    break;
                case "3":
                    System.out.println("Terça");
                    entradaValida = true;
                    break;
                case "4":
                    System.out.println("Quarta");
                    entradaValida = true;
                    break;
                case "5":
                    System.out.println("Quinta");
                    entradaValida = true;
                    break;
                case "6":
                    System.out.println("Sexta");
                    entradaValida = true;
                    break;
                case "7":
                    System.out.println("Sábado");
                    entradaValida = true;
                    break;
                default:
                    System.out.println("Erro: número inválido! Digite novamente:");
                    break;
            }
        }

    }
}
