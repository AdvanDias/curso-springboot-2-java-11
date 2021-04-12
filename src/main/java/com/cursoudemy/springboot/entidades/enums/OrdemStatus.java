package com.cursoudemy.springboot.entidades.enums;

public enum OrdemStatus {

	AGUARDANDO_PAGAMENTO(1),
	PAGO(2),
	ENVIADO(3),
	ENTREGUE(4),
	CANCELADO(5);
	
	private int codigo;
	
	private OrdemStatus(int Codigo) {
		this.codigo = Codigo;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public static OrdemStatus valueOf(int Codigo) {
		for(OrdemStatus valor: OrdemStatus.values()) {
			if(valor.getCodigo() == Codigo) {
				return valor;
			}
		}
		throw new IllegalArgumentException("Código do status da ordem é inválido!");
	}
}
