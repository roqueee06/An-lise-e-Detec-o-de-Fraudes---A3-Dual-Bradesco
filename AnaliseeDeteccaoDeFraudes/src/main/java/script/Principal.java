package script;

import SQL.ConectaBanco;
import Interface.Acesso;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Connection conexao = ConectaBanco.conexao();
        
        if(conexao != null){
            new Acesso();
        } else {
            JOptionPane.showMessageDialog(null, "Houve falhas na conexão do banco de dados!");
        }
    }
}