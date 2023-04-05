package main;

public class Cancelamento {

	public static void main(String[] args) {
		
		CancelamentoHandler cancelamentoBasico = new CancelamentoBasicoHandler();
		CancelamentoHandler cancelamentoAvancado = new CancelamentoAvancadoHandler();
		CancelamentoHandler cancelamentoPremium = new CancelamentoPremiumHandler();
		cancelamentoBasico.setProximoCancelamentoHandler(cancelamentoAvancado);
		cancelamentoAvancado.setProximoCancelamentoHandler(cancelamentoPremium);
		
		
		Pedido pedidoCancelar = new Pedido();
		pedidoCancelar.setDescricao("Televisão");
		pedidoCancelar.setNumeroPedido(1);
		pedidoCancelar.setStatus(StatusPedido.ABERTO);

		Pedido pedidoCancelar2 = new Pedido(2, "Micro-ondas", StatusPedido.ABERTO);
		Pedido pedidoCancelar3 = new Pedido(3, "PC", StatusPedido.ABERTO);
		Pedido pedidoCancelar4 = new Pedido(4, "Geladeira", StatusPedido.ABERTO); //Exemplo cancelamento inexistente
		
		cancelamentoBasico.handleCancelamento(pedidoCancelar, TipoDeCancelamento.BASICO);
		cancelamentoBasico.handleCancelamento(pedidoCancelar2, TipoDeCancelamento.AVANÇADO);
		cancelamentoBasico.handleCancelamento(pedidoCancelar3, TipoDeCancelamento.PREMIUM);
		cancelamentoBasico.handleCancelamento(pedidoCancelar4, TipoDeCancelamento.GOLD);
		
	}

}
