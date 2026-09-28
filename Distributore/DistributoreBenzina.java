public class DistributoreBenzina{
    private double deposito;     
    private double euroPerLitro; 

    public DistributoreBenzina(){
        this.deposito = 0.0;
        this.euroPerLitro = 0.0;
    }

    public DistributoreBenzina(double unPrezzoPerLitro){
        if(unPrezzoPerLitro > 0.0){
            this.euroPerLitro = unPrezzoPerLitro;
        }
        else{
            this.euroPerLitro = 0.0;
        }
        this.deposito = 0.0;
    }

    public void setDeposito(double litri){
        if(litri >= 0.0){
            this.deposito = litri;
        }
    }

    public void setEuroPerLitro(double unPrezzoPerLitro){
        if(unPrezzoPerLitro > 0.0){
            this.euroPerLitro = unPrezzoPerLitro;
        }
    }

    public double getDeposito(){
        return this.deposito;
    }

    public double getEuroPerLitro(){
        return this.euroPerLitro;
    }

    public void rifornisci(double unaQuantita){
        if(unaQuantita > 0.0){
            this.deposito = this.deposito + unaQuantita;
        }
    }

    public void vendi(double euro, Car unaAutomobile){
        if(euro > 0.0 && unaAutomobile != null && this.euroPerLitro > 0.0){
            double litri = euro / this.euroPerLitro;

            if(litri > this.deposito){
                litri = this.deposito;
                System.out.println("Attenzione: il distributore non ha abbastanza benzina.");
            }

            unaAutomobile.addGas(litri);
            this.deposito = this.deposito - litri;

            double costo = litri * this.euroPerLitro;
            System.out.println("Erogati " + litri + " litri, costo " + costo + " euro, resto " + (euro - costo) + " euro.");
        }
    }

    public void aggiorna(double unPrezzoPerLitro){
        if(unPrezzoPerLitro > 0.0){
            this.euroPerLitro = unPrezzoPerLitro;
        }
    }

    public String DistributoreBenzinaToString(){
        return "deposito (litri): " + this.deposito + " - prezzo (euro/litro): " + this.euroPerLitro;
    }
}