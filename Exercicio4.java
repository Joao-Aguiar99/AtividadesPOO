import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String senha, senhaCorreta = "123456";

        System.out.println("Digite a senha:");
        senha = scanner.nextLine();

        if(senha.equals(senhaCorreta)){
            System.out.println("Acesso Liberado!");
        }else{
            System.out.println("Acesso Negado!");
            System.exit(0);
        }
    }
}
