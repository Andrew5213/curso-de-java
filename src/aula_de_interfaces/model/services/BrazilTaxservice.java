package aula_de_interfaces.model.services;

public class BrazilTaxservice implements TaxService{
    public double tax (double amount){
        //isto e para calcular o valor do imposto.
        if(amount<=100.0){
            return amount*0.2;
        }else
            return amount *0.15;
    }
}
