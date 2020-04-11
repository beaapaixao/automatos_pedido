package automatos.states;

public class ConcreteStateC_EmTransporte implements State_Pedido {
	
	public ConcreteStateC_EmTransporte(ContextPedido pedido) {
		pedido.setState(this);
	}
	
	/* -------------------TRANSIÇÕES POSSÍVEIS-------------------------------*/

	@Override
	public void transportarPedido(ContextPedido pedido) {
		pedido.setState(this);
		System.out.println("O pedido já está em transporte! Chegará em breve, se quiser pode rastrear pelo seu app");
	}
	
	@Override
	public void entregarPedido(ContextPedido pedido) {
		pedido.setState(new ConcreteStateD_Entregue(pedido));
	}
	
	/* -------------------TRANSIÇÕES IMPOSSÍVEIS-----------------------------*/
	
	@Override
	public void criarPedido(ContextPedido pedido) {
		System.out.println("Erro - Esse pedido já saiu para entrega.");
	}
	
	@Override
	public void aprovarPedido(ContextPedido pedido) {
		System.out.println("Seu pedido já foi aprovado anteriormente e já saiu para entrega");
	}
	
	@Override
	public void cancelarPedido(ContextPedido pedido) {
		System.out.println("Sinto muito, não será possível cancelar,"
				+ " pois o seu pedido já saiu para entrega");
	}
	
	@Override
	public void finalizarPedido(ContextPedido pedido) {
		System.out.println("O pedido deve ser primeiramente entregue");
	}
	
	/* -------------------MÉTODOS DA CLASSE----------------------------------*/
	
	@Override
	public String print_state() {
		return this.getClass().getSimpleName();
	}
}
