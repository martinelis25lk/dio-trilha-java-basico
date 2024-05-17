package ContaBanco;
import java.util.Scanner;

public class ContaTerminal {

    private double saldo;
    private int numeroConta;
    private String agencia;
    private String nomeCliente;


    public ContaTerminal(double saldoInicial){
        this.saldo = saldoInicial;
        inserirInformacoes();
        exibirMensagem();
    }




    private void inserirInformacoes(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Agência:");
        this.agencia = scanner.nextLine();


        System.out.println("Por favor, digite o numero da conta:");
        this.numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o seu nome:");
        this.nomeCliente = scanner.nextLine();

    }


    private void exibirMensagem(){
        System.out.println(" Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é: "+ agencia +
                " . conta: " + numeroConta + " e o seu saldo: " + saldo + " já está disponìvel para o saque! "
                );
    }

    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo){
        this.saldo = saldo;
    }


    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal(0);
    }

}
