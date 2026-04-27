public class conta_bancaria {

    private double saldo;

    public conta_bancaria(double saldo_inicial) {

        if (saldo_inicial > 0.0) {

            this.saldo = saldo_inicial;

        } else {

            this.saldo = 0;

        }

    }

    public void depositar(double valor) {

        if (valor > 0){

            this.saldo += valor;

            System.out.println("Depósito realizado no valor de: " + valor);

        } else {

            System.out.println("*Valor do depósito inválido*");

        }
    }

    public void sacar(double valor) {

        if (valor > 0 && valor <= this.saldo){

            this.saldo -= valor;

            System.out.println("Saque de R$ " + valor + " foi depositado com sucesso, novo saldo: " + this.saldo);

        }else {

            System.out.println("Você tentou sacar mais do que tem na conta, seu saldo atual é de R$ " + this.saldo);

        }
    }

    public double getSaldo(){return this.saldo;}
}
