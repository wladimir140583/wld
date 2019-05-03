public class Conta {

    /*Criando Atributos*/
    private float saldo;
    private Cliente cliente;


    /*Criando Método*/
    public void sacar(float qtdDinheiro){
        if (qtdDinheiro>saldo){
            System.out.println("Valor de saque excedido. Você não tem limite suficiente");
        }else {
            saldo=saldo-qtdDinheiro
        }
    }
    public float depositar (float valor) {
        saldo=valor+saldo;
        System.out.println("Seu saldo atual é " + saldo);
    }

    public void imprimir () {
        System.out.println("Seu saldo atual é " + saldo);
    }
}
