package main;

public enum StatusPedido {

	CONCLUIDO(1),
	ABERTO(2),
	CANCELADO(3);

	private int value;
	
	StatusPedido(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
