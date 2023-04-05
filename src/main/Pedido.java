package main;

public class Pedido {
	
	int numeroPedido;
	String descricao;
	StatusPedido status;

	public Pedido(int numeroPedido, String descricao, StatusPedido status) {
		super();
		this.numeroPedido = numeroPedido;
		this.descricao = descricao;
		this.status = status;
	}
	
	public Pedido() {
		super();
	}

	public Integer getNumeroPedido() {
		return numeroPedido;
	}
	public void setNumeroPedido(Integer numeroPedido) {
		this.numeroPedido = numeroPedido;
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

	@Override
	public String toString() {
		return "Pedido [numeroPedido=" + numeroPedido + ", descricao=" + descricao + ", status=" + status + "]";
	}
	
	
}

