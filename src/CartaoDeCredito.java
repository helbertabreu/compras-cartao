package src;

import java.util.ArrayList;
import java.util.List;

public class CartaoDeCredito {
    private double limiteDoCartao;
    private double saldoDoCartao;
    private List<Compra> compras;

    public CartaoDeCredito(double limiteDoCartao) {
        this.limiteDoCartao = limiteDoCartao;
        this.saldoDoCartao = limiteDoCartao;
        this.compras = new ArrayList<>();
    }

    public boolean lancamentoDeCompra (Compra compra){
        if (this.saldoDoCartao > compra.getValorDaCompra()) {
            this.saldoDoCartao -= compra.getValorDaCompra();
            this.compras.add(compra);
            return true;
        }

        return false;
    }

    public double getLimiteDoCartao() {
        return limiteDoCartao;
    }

    public double getSaldoDoCartao() {
        return saldoDoCartao;
    }

    public List<Compra> getCompras() {
        return compras;
    }
}
