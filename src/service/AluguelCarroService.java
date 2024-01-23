package service;

import domain.AluguelCarro;
import domain.Recibo;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.TemporalUnit;

public class AluguelCarroService {

    private double precoPorHora;
    private double precoPorDia;

    private BrasilTaxaService brasilTaxaService;

    public AluguelCarroService() {
    }

    public AluguelCarroService(double precoPorHora, double precoPorDia, BrasilTaxaService brasilTaxaService) {
        this.precoPorHora = precoPorHora;
        this.precoPorDia = precoPorDia;
        this.brasilTaxaService = brasilTaxaService;
    }

    public double getPrecoPorHora() {
        return precoPorHora;
    }

    public void setPrecoPorHora(double precoPorHora) {
        this.precoPorHora = precoPorHora;
    }

    public double getPrecoPorDia() {
        return precoPorDia;
    }

    public void setPrecoPorDia(double precoPorDia) {
        this.precoPorDia = precoPorDia;
    }

    public BrasilTaxaService getBrasilTaxaService() {
        return brasilTaxaService;
    }

    public void setBrasilTaxaService(BrasilTaxaService brasilTaxaService) {
        this.brasilTaxaService = brasilTaxaService;
    }

    public void processarRecibo(AluguelCarro aluguelCarro){
         Duration duracaoAluguel = Duration.between(aluguelCarro.getInicio(), aluguelCarro.getFim());

         int quantidadeHoras = (int) Math.ceil(duracaoAluguel.toMinutes()/ 60);
         int quantidadeDias = (int) Math.ceil(duracaoAluguel.toHours() / 24);
         double pagamentoBase;
         if (quantidadeHoras <= 12){
             pagamentoBase = precoPorHora * quantidadeHoras;
         } else {
             pagamentoBase = precoPorDia * quantidadeHoras;
        }
    }



}
