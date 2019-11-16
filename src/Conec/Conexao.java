package Conec;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

    public Connection getConnection() {
        try {
            return (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/banco", "root", "");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao Conexão do Banco de Dados" + "\n" + e, "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
