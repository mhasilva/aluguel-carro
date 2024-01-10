package service;

public class BrasilTaxaService {


    public double taxa(double quantia){

        if (quantia <= 100){
            return quantia * 0.20;
        }

        return quantia * 0.15;
    }


}
