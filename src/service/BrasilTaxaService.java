package service;

import service.interfaces.TaxaService;

public class BrasilTaxaService implements TaxaService {

    public double taxa(double quantia){

        if (quantia <= 100){
            return quantia * 0.20;
        }

        return quantia * 0.15;
    }


}
