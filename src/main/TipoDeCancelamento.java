package main;

public enum TipoDeCancelamento {
	BASICO(1), AVANÇADO(2), PREMIUM(3), GOLD(4);
	
	private int value;

	TipoDeCancelamento(int i) {
		this.value = i;
	}

	public int getValue() {
		return value;
	}
}
