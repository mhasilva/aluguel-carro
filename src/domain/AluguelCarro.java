package domain;

import java.time.LocalDateTime;

public class AluguelCarro {

    private LocalDateTime inicio;
    private LocalDateTime fim;

    private Veiculo veiculo;

    private Recibo recibo;


    public AluguelCarro() {
    }


    public AluguelCarro(LocalDateTime inicio, LocalDateTime fim, Veiculo veiculo) {
        this.inicio = inicio;
        this.fim = fim;
        this.veiculo = veiculo;
    }


    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFim() {
        return fim;
    }

    public void setFim(LocalDateTime fim) {
        this.fim = fim;
    }


    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Recibo getRecibo() {
        return recibo;
    }

    public void setRecibo(Recibo recibo) {
        this.recibo = recibo;
    }

    @Override
    public String toString() {
        return "AluguelCarro{" +
                "inicio=" + inicio +
                ", fim=" + fim +
                ", veiculo=" + veiculo +
                ", recibo=" + recibo +
                '}';
    }

}
