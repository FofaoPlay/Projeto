package Conec;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TestaConexao {

    public static void main(String[] args) throws SQLException {
        try (Connection connection = new Conexao().getConnection()) {
            JOptionPane.showMessageDialog(null, "Conexão Efetuada com Sucesso", "Mensagemdo Sistema ", JOptionPane.WARNING_MESSAGE);
        }
    }
}
