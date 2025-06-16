//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        var scanner = new Scanner(System.in);

        /*
         * todo
         * importar a classe scanner
         * mensagem para usuario
         * obter pela classe os calores pelo terminal
         * exibir a mensagem final
         *
         */
        System.out.println("Numero da conta ");
        var numero= scanner.nextInt();
        System.out.println("Informe numero da Agencia");
        var agencia = scanner.next();
        System.out.println("Informe nome cliente");
        String nomeCliente = scanner.next();
        System.out.println("informe valor deposito inicial");
        var saldo = scanner.next();


        System.out.printf("Olá %s , obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque\n",nomeCliente,agencia,numero,saldo);

        scanner.close();

    }
}
