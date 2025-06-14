package script;

public class DetectorDeFraude {

    public ListaSimples<TransacaoSuspeita> detectarSuspeitas(ListaSimples<Transacao> transacoes) {

        ListaSimples<TransacaoSuspeita> suspeitas = new ListaSimples<>();

        float limiteRazaoPreco = 4.0f;
        float limiteDistanciaCasa = 100.0f;
        float limiteUltimaTrans = 30.0f;
        float limitePrecoExtremo = 20.0f;

        for (int i = 0; i < transacoes.tamanho(); i++) {
            Transacao t = transacoes.get(i);

            boolean eFraude = false;
            String tipoFraude = "";
            String condicao = "";
            String modoPagamento = "";
            
            if (t.isPedidoOnline()) {
                modoPagamento = "Compra Online";     
            } else {
                modoPagamento = "Compra Presencial";          
            }

            if (!t.isUsouPin() && t.isPedidoOnline()) {
                int condicoesAdicionaisSuspeitas = 0;
                if (t.getRazaoPrecoMedioCompra() > limiteRazaoPreco) {
                    condicoesAdicionaisSuspeitas++;
                    condicao = "Preço Incomum";
                }
                if (t.getDistanciaDeCasa() > limiteDistanciaCasa) {
                    condicoesAdicionaisSuspeitas++;
                    condicao = "Distância da Casa";
                }
                if (t.getDistanciaUltimaTransacao() > limiteUltimaTrans) {
                    condicoesAdicionaisSuspeitas++;
                    condicao = "Distância da Última Compra";
                }
                if (!t.isUsouChip()) {
                    condicoesAdicionaisSuspeitas++;
                }
                if (condicoesAdicionaisSuspeitas >= 2) {
                    eFraude = true;
                    tipoFraude = "Compra Online";
                }
            } 
            else if (t.getRazaoPrecoMedioCompra() > limitePrecoExtremo) {
                eFraude = true;
                tipoFraude = "Preço Incomum";
            } 
            else if (t.getDistanciaDeCasa() > 1000.0f) {
                eFraude = true;
                tipoFraude = "Distância da Casa";
            } 
            else if (t.getDistanciaUltimaTransacao() > 500.0f) {
                eFraude = true;
                tipoFraude = "Distância da Última Compra";
            }

            if (eFraude) {
                suspeitas.adicionar(new TransacaoSuspeita(t, true, tipoFraude, condicao, modoPagamento));
            }
        }

        return suspeitas;
    }
}
