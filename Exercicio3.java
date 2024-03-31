import java.sql.SQLOutput;
import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String nome1 = null, nome2 = null, nome3 = null, nome4 = null, nome5 = null, menorNome;
        int i = 0;

        for(i = 1; i <= 5; i++){
            if(i == 1){
                System.out.printf("Digite o nome %d\n", i);
                nome1 = scanner.nextLine();
            }else if(i == 2){
                System.out.printf("Digite o nome %d\n", i);
                nome2 = scanner.nextLine();
            }else if(i == 3){
                System.out.printf("Digite o nome %d\n", i);
                nome3 = scanner.nextLine();
            }else if(i == 4){
                System.out.printf("Digite o nome %d\n", i);
                nome4 = scanner.nextLine();
            }else{
                System.out.printf("Digite o nome %d\n", i);
                nome5 = scanner.nextLine();
            }
        }

        if (nome1.compareTo(nome2) < 0){
            menorNome = nome1;
        }else if(nome2.compareTo(nome3) < 0){
            menorNome = nome2;
        }else if(nome3.compareTo(nome4) < 0){
            menorNome = nome3;
        }else if(nome4.compareTo(nome5) < 0){
            menorNome = nome4;
        }else{
            menorNome = nome5;
        }

        System.out.println("O nome mais próximo da letra 'A' é: " + menorNome);
    }
}
