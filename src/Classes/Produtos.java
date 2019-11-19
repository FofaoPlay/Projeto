package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Produtos {
    public int id;
    public String nome;
    public double precocompra;
    public double precovenda;
    public int quantidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecocompra() {
        return precocompra;
    }

    public void setPrecocompra(double precocompra) {
        this.precocompra = precocompra;
    }

    public double getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(double precovenda) {
        this.precovenda = precovenda;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void cadastrar(Connection conn){
        String sqlInsert = "INSERT INTO contas(Nome, Quantidade, PrecoCompra, PrecoVenda) VALUES (?, ?, ?, ?)";
        
        PreparedStatement stm = null;
        try{
            stm = conn.prepareStatement(sqlInsert);
            
            
            stm.setString(1, getNome());
            stm.setDouble(2, getPrecocompra());
            stm.setDouble(3, getPrecovenda());
            stm.setInt(4, getQuantidade());
            
            stm.execute();
        }
        catch (SQLException u) {
            System.out.println("Erro de Banco de dados");
    }
    }
    
}
