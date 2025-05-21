package script;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Principal {

    public static void main(String[] args) {
        int totalTransacoes = 0;
        Connection conexao = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conexao = ConectaBanco.conexao();
            stmt = conexao.createStatement();
            rs = stmt.executeQuery("SELECT COUNT(*) FROM transacoes");

            if (rs.next()) {
                totalTransacoes = rs.getInt(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conexao != null) conexao.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        System.out.println(totalTransacoes + " dados foram carregados.");
    }
}