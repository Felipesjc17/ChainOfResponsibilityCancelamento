package main;

public interface CancelamentoHandler {

	public void handleCancelamento(Pedido pedido, TipoDeCancelamento tipoCancelamento);
	public void setProximoCancelamentoHandler(CancelamentoHandler proximoCancelamento);
}
