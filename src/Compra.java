package src;

public class Compra implements Comparable<Compra> {
    private String descricao;
    private double valorDaCompra;

    public Compra(String descricao, double valorDaCompra) {
        this.descricao = descricao;
        this.valorDaCompra = valorDaCompra;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorDaCompra() {
        return valorDaCompra;
    }

    @Override
    public String toString() {
        return "Compra: descricao = " + descricao +
                "valorDaCompra = " + valorDaCompra;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valorDaCompra).compareTo(Double.valueOf(outraCompra.valorDaCompra));
    }
}
