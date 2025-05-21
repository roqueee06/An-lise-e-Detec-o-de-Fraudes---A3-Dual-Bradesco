package script;

public class Transacoes {
    private int valorTransacao;
    private String numeroCartao;
    private String idLojista;
    private int mesTransacao;
    private int anoTransacao;
    private int diaTransacao;
    private int horaTransacao;
    private int minutoTransacao;
    private int segundoTransacao;
    private boolean indicadorFraude;

    public Transacoes(int valorTransacao, String numeroCartao, String idLojista, int mesTransacao, int anoTransacao, int diaTransacao, int horaTransacao, int minutoTransacao, int segundoTransacao, boolean indicadorFraude) {
        this.valorTransacao = valorTransacao;
        this.numeroCartao = numeroCartao;
        this.idLojista = idLojista;
        this.mesTransacao = mesTransacao;
        this.anoTransacao = anoTransacao;
        this.diaTransacao = diaTransacao;
        this.horaTransacao = horaTransacao;
        this.minutoTransacao = minutoTransacao;
        this.segundoTransacao = segundoTransacao;
        this.indicadorFraude = indicadorFraude;
    }

    public int getValorTransacao() {
        return valorTransacao;
    }

    public void setValorTransacao(int valorTransacao) {
        this.valorTransacao = valorTransacao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getIdLojista() {
        return idLojista;
    }

    public void setIdLojista(String idLojista) {
        this.idLojista = idLojista;
    }

    public int getMesTransacao() {
        return mesTransacao;
    }

    public void setMesTransacao(int mesTransacao) {
        this.mesTransacao = mesTransacao;
    }

    public int getAnoTransacao() {
        return anoTransacao;
    }

    public void setAnoTransacao(int anoTransacao) {
        this.anoTransacao = anoTransacao;
    }

    public int getDiaTransacao() {
        return diaTransacao;
    }

    public void setDiaTransacao(int diaTransacao) {
        this.diaTransacao = diaTransacao;
    }

    public int getHoraTransacao() {
        return horaTransacao;
    }

    public void setHoraTransacao(int horaTransacao) {
        this.horaTransacao = horaTransacao;
    }

    public int getMinutoTransacao() {
        return minutoTransacao;
    }

    public void setMinutoTransacao(int minutoTransacao) {
        this.minutoTransacao = minutoTransacao;
    }

    public int getSegundoTransacao() {
        return segundoTransacao;
    }

    public void setSegundoTransacao(int segundoTransacao) {
        this.segundoTransacao = segundoTransacao;
    }

    public boolean isIndicadorFraude() {
        return indicadorFraude;
    }

    public void setIndicadorFraude(boolean indicadorFraude) {
        this.indicadorFraude = indicadorFraude;
    }
    
    
}
