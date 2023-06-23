public class ContaCorrente {
    public String nomeCorrentista;
    public int numeroConta;
    public double saldo;
    
    public ContaCorrente (String nomeCorrentista, int numeroConta) {
        this.nomeCorrentista = nomeCorrentista;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }
    public void alterarNome (String novoNome) {
        nomeCorrentista = novoNome;
    }

    public void deposito (double valorDeposito) {
        this.saldo += valorDeposito;
    }

    public void saque (double valorSaque) {
        if(valorSaque <= saldo) {
            saldo -= valorSaque;
        } else {
            System.out.println("Saldo insuficiente para realizar o sanque! ");
        }
    }

    //Geters

    public String getNomeCorrentista () {
        return this.nomeCorrentista;
    }

    public int getNumeroConta () {
        return this.numeroConta;
    }

    public double getSaldo () {
        return this.saldo;
    }

}
