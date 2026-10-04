

public class Pagamento{
    private String beneficiario;
    private double importo;
    
    public Pagamento(){
        this.beneficiario="";
        this.importo=0.0;
    }
    public Pagamento(String b, double i){
        if(b!=null){
            this.beneficiario = b;
        }
        else{
            this.beneficiario = "";
        }

        if(i >= 0.0){
            this.importo = i;
        }
        else{
            this.importo = 0.0;
        }
    }

    public String getBeneficiario(){
        return this.beneficiario;
    }
    public double getImporto(){
        return this.importo;
    }
}