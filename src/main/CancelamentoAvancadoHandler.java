package main;

public class CancelamentoAvancadoHandler implements CancelamentoHandler {
	
	private CancelamentoHandler proximoCancelamento;

	@Override
	public void handleCancelamento(Pedido pedido, TipoDeCancelamento tipoCancelamentoSolicitado) {
		if (TipoDeCancelamento.AVANÇADO.equals(tipoCancelamentoSolicitado)) {
			pedido.setStatus(StatusPedido.CANCELADO);
			 System.out.println(pedido.toString() + " >>> Cancelado pelo cancelamento do tipo : " + TipoDeCancelamento.AVANÇADO.name());
		} else {
			if(proximoCancelamento != null) {
				proximoCancelamento.handleCancelamento(pedido, tipoCancelamentoSolicitado);
			} else {
				System.out.println(pedido.toString() + " >>> Não é possível efetuar o cancelamento");
			}
		}
	}

	@Override
	public void setProximoCancelamentoHandler(CancelamentoHandler proximoCancelamento) {
		this.proximoCancelamento = proximoCancelamento;
	}
}
