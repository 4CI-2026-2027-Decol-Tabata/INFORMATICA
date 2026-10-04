
public class Conto{
    private String intestatario;
    private double saldo;
    public Conto(){
        this.intestatario="";
        this.saldo=0.0;
    }
    public Conto(String i, double s){
        if(i!=null){
            this.intestatario = i;
        }
        else{
            this.intestatario = "";
        }

        if(s >= 0.0){
            this.saldo = s;
        }
        else{
            this.saldo = 0.0;
        }
    }

    public void setSaldo(double s){
        if(s >= 0.0){
            this.saldo = s;
        }
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void effettuaPagamento(Pagamento pagamento) throws SaldoInsufficienteException{
    
        if(pagamento.getImporto() <= 0.0){
            throw new SaldoInsufficienteException("Importo non valido");
        }

        if(this.saldo < pagamento.getImporto()){
            throw new SaldoInsufficienteException("Saldo insufficiente per pagare " + pagamento.getImporto()+"euro");
        }

        this.saldo = saldo - pagamento.getImporto();

        System.out.println("Pagamento a " + pagamento.getBeneficiario() + " di " + pagamento.getImporto() + " euro effettuato");
    }
}