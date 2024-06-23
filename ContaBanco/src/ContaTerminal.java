import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //Iniciando cadastro do Usuário
        System.out.println("Olá, bem vindo ao DevBank!\n - Vamos iniciar o seu cadastro!");
        System.out.println("\nPrimeiro, digite seu nome: ");
        String nome = scanner.next();
        System.out.println("Seja bem vindo, ".concat(nome)+"!" + "\nPor favor, digite o número de sua agência: ");
        int agencia = scanner.nextInt();
        System.out.println("Agora digite o número de sua conta com dígito: ");
        String conta = scanner.next();
        System.out.println("Agora vamos realizar seu primeiro depósito.\nDigite um valor para ser depositado: ");
        double saldo = scanner.nextDouble();
        //formatando o saldo para aparecer com 2 casas decimais
        String resultado = String.format("%.2f", saldo);
        //Saída no Terminal:
        /* "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque". */

        System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +  ", conta " + conta + " e seu saldo " + resultado + " já está disponível para saque!");

    }
}
