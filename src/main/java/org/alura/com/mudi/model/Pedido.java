package org.alura.com.mudi.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeProduto;
    private BigDecimal valorNegociado;
    private LocalDate dataEntrega;
    private String urlProduto;
    private String urlProdutoImagem;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private StatusPedido status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public BigDecimal getValorNegociado() {
        return valorNegociado;
    }

    public void setValorNegociado(BigDecimal valorNegociado) {
        this.valorNegociado = valorNegociado;
    }

    public LocalDate getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public String getUrlProdutoImagem() {
        return urlProdutoImagem;
    }

    public void setUrlProdutoImagem(String urlProdutoImagem) {
        this.urlProdutoImagem = urlProdutoImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public Pedido(Long id, String nomeProduto, BigDecimal valorNegociado, LocalDate dataEntrega, String urlProduto,
            String urlProdutoImagem, String descricao, StatusPedido status) {
        setId(id);
        setNomeProduto(nomeProduto);
        setValorNegociado(valorNegociado);
        setDataEntrega(dataEntrega);
        setUrlProduto(urlProduto);
        setUrlProdutoImagem(urlProdutoImagem);
        setDescricao(descricao);
        setStatus(StatusPedido.AGUARDANDO);
    }

    public Pedido() {

    }
}
