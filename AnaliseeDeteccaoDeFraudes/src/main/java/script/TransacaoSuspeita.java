package script;

public class TransacaoSuspeita implements Comparable<TransacaoSuspeita> {
    private int idTransacaoOriginal;
    private float distanciaDeCasa;
    private float distanciaUltimaTransacao;
    private float razaoPrecoMedioCompra;
    private boolean repetiuEstabelecimento;
    private boolean usouChip;
    private boolean usouPin;
    private boolean pedidoOnline;
    private boolean fraude;

    public TransacaoSuspeita(Transacao transacao, boolean fraude) {
        this.idTransacaoOriginal = transacao.getId();
        this.distanciaDeCasa = transacao.getDistanciaDeCasa();
        this.distanciaUltimaTransacao = transacao.getDistanciaUltimaTransacao();
        this.razaoPrecoMedioCompra = transacao.getRazaoPrecoMedioCompra();
        this.repetiuEstabelecimento = transacao.isRepetiuEstabelecimento();
        this.usouChip = transacao.isUsouChip();
        this.usouPin = transacao.isUsouPin();
        this.pedidoOnline = transacao.isPedidoOnline();
        this.fraude = fraude;
    }

    public int getIdTransacaoOriginal() {
        return idTransacaoOriginal;
    }

    public float getDistanciaDeCasa() {
        return distanciaDeCasa;
    }

    public float getDistanciaUltimaTransacao() {
        return distanciaUltimaTransacao;
    }

    public float getRazaoPrecoMedioCompra() {
        return razaoPrecoMedioCompra;
    }

    public boolean isRepetiuEstabelecimento() {
        return repetiuEstabelecimento;
    }

    public boolean isUsouChip() {
        return usouChip;
    }

    public boolean isUsouPin() {
        return usouPin;
    }

    public boolean isPedidoOnline() {
        return pedidoOnline;
    }

    public boolean isFraude() {
        return fraude;
    }

    @Override
    public int compareTo(TransacaoSuspeita outra) {
        // ordena pelo id original da base do inicio
        return Float.compare(outra.idTransacaoOriginal, this.idTransacaoOriginal);
    }
}
