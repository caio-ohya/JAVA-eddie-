publi class contaScanner{
    double verificarSaldo(){

    };
    void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
            System.out.println(" Saque de r$ " + valor "realizado!")           
        }else{
            System.out.println("Saldo insuficiente para o saque de r$ " + valor)
        }
    }
}