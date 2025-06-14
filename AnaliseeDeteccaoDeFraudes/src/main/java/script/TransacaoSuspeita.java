package script;

public class TransacaoSuspeita {
    private int idTransacaoOriginal;
    private float distanciaDeCasa;
    private float distanciaUltimaTransacao;
    private float razaoPrecoMedioCompra;
    private boolean repetiuEstabelecimento;
    private boolean usouChip;
    private boolean usouPin;
    private boolean pedidoOnline;
    private boolean fraude;
    private String tipoFraude;
    private String condicao;
    private String modoPagamento;
    
    public TransacaoSuspeita(Transacao transacao, boolean fraude, String tipoFraude, String condicao, String modoPagamento) {
        this.idTransacaoOriginal = transacao.getId();
        this.distanciaDeCasa = transacao.getDistanciaDeCasa();
        this.distanciaUltimaTransacao = transacao.getDistanciaUltimaTransacao();
        this.razaoPrecoMedioCompra = transacao.getRazaoPrecoMedioCompra();
        this.repetiuEstabelecimento = transacao.isRepetiuEstabelecimento();
        this.usouChip = transacao.isUsouChip();
        this.usouPin = transacao.isUsouPin();
        this.pedidoOnline = transacao.isPedidoOnline();
        this.fraude = fraude;
        this.tipoFraude = tipoFraude;
        this.condicao = condicao;
        this.modoPagamento = modoPagamento;
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

    public String getTipoFraude() {
        return tipoFraude;
    }

    public String getCondicao() {
        return condicao;
    } 

    public String getModoPagamento() {
        return modoPagamento;
    }
    
}
