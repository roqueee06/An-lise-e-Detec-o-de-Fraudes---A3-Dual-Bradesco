package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConectaBanco {
    public static Connection conexao(){
        Connection conexao = null;
        int dados = 0;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/FraudeDeCompras", "root", "1234");
            Statement stmt = conexao.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) FROM transacoes");
            if (rs.next()){
            dados = rs.getInt(1);
            System.out.println("Conexão ao banco de dados realizada com sucesso!");
            System.out.println(dados + " dados foram carregados.");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do banco de dados não foi encontrado!");
        } catch (SQLException ex) {
            System.out.println("Ocorreu um erro ao conectar ao banco de dados:" + ex.getMessage());
        }
        return conexao;
    }
    
    public boolean autenticar(String usuario, String senha) {
        String sql = "SELECT * FROM administradores WHERE login_usuario = ? AND senha_usuario = SHA1(?)";

        try (Connection conn = ConectaBanco.conexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario);
            stmt.setString(2, senha);

            return stmt.executeQuery().next();
        } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao acessar o banco: " + ex.getMessage());
                return false;
        }
    }
}
