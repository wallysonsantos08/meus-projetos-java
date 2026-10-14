public class UsuarioDoBanco {

    private double saldo = 0;
    private double deposito;
    private double saque;

    //get e set

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getDeposito() {
        return deposito;
    }
    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }
    public double getSaque() {
        return saque;
    }
    public void setSaque(double saque) {
        this.saque = saque;
    }

    //metodos 

    public void adicionarValor(double valor){
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito de R$ "+valor+", feito com sucesso!");
        }
        else{
            System.out.println("Valor invalido");
        }
    }

    public void sacarValor(double valor){
        if (valor < saldo) {
            this.saldo -= valor;
            System.out.println("Saque de R$ "+valor+", feito com sucesso!");
        }
        else{
            System.out.println("Valor de saque invalido!!");
        }
    }

    





    
    







}
