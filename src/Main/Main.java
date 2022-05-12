package Main;

import Cliente.Cliente;
import Contas.Conta;
import Contas.ContaCorrente;
import Contas.ContaPoupanca;
public class Main {
    public static void main(String[] args) {
        Cliente pedro = new Cliente();
        pedro.setNomeCliente("Pedro");
        Cliente airk = new Cliente();
        airk.setNomeCliente("Wellingthon");

        Conta  conta1 = new ContaCorrente(airk);
        Conta poupanca = new ContaPoupanca(pedro);

        conta1.depositar(2000);
        conta1.transferir(250, poupanca);

        conta1.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
