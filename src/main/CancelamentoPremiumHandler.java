package main;

public class CancelamentoPremiumHandler implements CancelamentoHandler {
	
	
	private CancelamentoHandler proximoCancelamento;

	@Override
	public void handleCancelamento(Pedido pedido, TipoDeCancelamento tipoCancelamentoSolicitado) {
		if (TipoDeCancelamento.PREMIUM.equals(tipoCancelamentoSolicitado)) {
			pedido.setStatus(StatusPedido.CANCELADO);
			System.out.println(pedido.toString() + " >>> Cancelado pelo cancelamento do tipo : " + TipoDeCancelamento.PREMIUM.name());
		} else {
			if(proximoCancelamento != null) {
				proximoCancelamento.handleCancelamento(pedido, tipoCancelamentoSolicitado);
			} else {
				System.out.println(pedido.toString() + " >>> Não foi possível efetuar o cancelamento");
			}
		}
	}

	@Override
	public void setProximoCancelamentoHandler(CancelamentoHandler proximoCancelamento) {
		this.proximoCancelamento = proximoCancelamento;
	}
	
}
