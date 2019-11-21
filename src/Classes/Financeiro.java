package Classes;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Financeiro {

    public int id;
    public String parceiro;
    public String produto;
    public double valorunit;
    public int quantidade;
    public double total;
    public Date datacompra;
    public Date vencimento;
    public String tipo;
    public String status;

    /*public Financeiro(double valorunit, int quantidade, double total, Date datacompra, Date vencimento) {
        this.valorunit = valorunit;
        this.quantidade = quantidade;
        this.total = total;
        this.datacompra = datacompra;
        this.vencimento = vencimento;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getParceiro() {
        return parceiro;
    }

    public void setParceiro(String parceiro) {
        this.parceiro = parceiro;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getValorunit() {
        return valorunit;
    }

    public void setValorunit(double valorunit) {
        this.valorunit = valorunit;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getDatacompra() {
        return datacompra;
    }

    public void setDatacompra(Date datacompra) {
        this.datacompra = datacompra;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void cadastrar(Connection conn) {
        String sqlInsert = "INSERT INTO contas(Parceiro, Produto, ValorUnit, Quantidade, Total, DataCompra, Vencimento, Tipo, Status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement stm = null;
        try {
            stm = conn.prepareStatement(sqlInsert);

            stm.setString(1, getParceiro());
            stm.setString(2, getProduto());
            stm.setDouble(3, getValorunit());
            stm.setInt(4, getQuantidade());
            stm.setDouble(5, getTotal());
            stm.setDate(6, getDatacompra());
            stm.setDate(7, getVencimento());
            stm.setString(8, getTipo());
            stm.setString(9, getStatus());

            stm.execute();
        } catch (SQLException u) {
            System.out.println("Erro de Banco de dados");
        }
        
    }

}
