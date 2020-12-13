package org.alura.com.mudi.dto;

import javax.validation.constraints.NotBlank;

import org.alura.com.mudi.model.Pedido;
import org.alura.com.mudi.model.StatusPedido;

public class PedidoRequisicao {

    @NotBlank
    private String nomeProduto;

    @NotBlank
    private String urlProduto;

    @NotBlank
    private String urlImagem;
    private String descricaoProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

	public Pedido toPedido() {
        Pedido pedido = new Pedido();
        pedido.setDescricao(descricaoProduto);
        pedido.setNomeProduto(nomeProduto);
        pedido.setUrlProduto(urlProduto);
        pedido.setUrlProdutoImagem(urlImagem);
        pedido.setStatus(StatusPedido.AGUARDANDO);
        return pedido;
	}

}
