package service;

import service.interfaces.TaxaService;

public class EstadosUnidosTaxaService implements TaxaService {

    public double taxa(double quantia) {
        return quantia * 0.12;
    }
}
