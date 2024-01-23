package domain;

public class Recibo {

    private double pagamentoBase;
    private double tax;

    public Recibo() {
    }

    public Recibo(double pagamentoBase, double tax) {
        this.pagamentoBase = pagamentoBase;
        this.tax = tax;
    }

    public double getPagamentoBase() {
        return pagamentoBase;
    }

    public void setPagamentoBase(double pagamentoBase) {
        this.pagamentoBase = pagamentoBase;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getPagamentoTotal() {
        return pagamentoBase + tax;
    }

    @Override
    public String toString() {
        return "Recibo{" +
                "pagamentoBase=" + pagamentoBase +
                ", tax=" + tax +
                ", total=" + getPagamentoTotal() +
                '}';
    }

}

