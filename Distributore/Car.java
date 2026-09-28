public class Car{
    private double resa;   // litri per chilometro
    private double gas;    // litri nel serbatoio

    public Car(){
        this.resa = 0.0;
        this.gas = 0.0;
    }

    public Car(double unaResa, double unGas){
        if(unaResa >= 0.0){
            this.resa = unaResa;
        }
        else{
            this.resa = 0.0;
        }
        this.gas = 0.0;
    }

    public void setResa(double unaResa){
        if(unaResa >= 0.0){
            this.resa = unaResa;
        }
    }

    public void setGas(double litri){
        if(litri >= 0.0){
            this.gas = litri;
        }
    }

    public double getResa(){
        return this.resa;
    }

    public double getGas(){
        return this.gas;
    }

    public void addGas(double litri){
        if(litri > 0.0){
            this.gas = this.gas + litri;
        }
    }

    public void drive(double km){
        if(km > 0.0){
            double consumo = km * this.resa;
            if(consumo <= this.gas){
                this.gas = this.gas - consumo;
            }
            else{
                // benzina insufficiente: l'auto si ferma a serbatoio vuoto
                this.gas = 0.0;
            }
        }
    }

    public String CarToString(){
        return "resa (litri/km): " + this.resa + " - benzina nel serbatoio (litri): " + this.gas;
    }
}