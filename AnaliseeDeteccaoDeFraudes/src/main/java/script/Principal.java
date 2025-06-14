package script;

import SQL.BancoDeDados;
import SQL.ConectaBanco;
import java.sql.SQLException;

public class Principal {
    public static void main(String[] args) {
        try {
            //instancia a classe do banco
            BancoDeDados banco = new BancoDeDados();
            
            //seleciona os dados e joga na lista
            ListaSimples<Transacao> transacoes = banco.carregarTransacoes();
            
            DetectorDeFraude detector = new DetectorDeFraude();

            ListaSimples<TransacaoSuspeita> suspeitasDetectadas = detector.detectarSuspeitas(transacoes);

            System.out.println("Total de transações suspeitas detectadas: " + suspeitasDetectadas.tamanho());

            banco.inserirFraude(suspeitasDetectadas);
            System.out.println("Transações suspeitas salvas no banco com sucesso.");
            
        } catch (SQLException e) {
            System.err.println("Erro ao processar transações ou acessar o banco de dados: " + e.getMessage());
        }
    }
}