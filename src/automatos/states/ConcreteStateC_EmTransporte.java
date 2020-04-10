package automatos.states;

public class ConcreteStateC_EmTransporte implements State_Pedido {
	
	public ConcreteStateC_EmTransporte(ContextPedido pedido) {
		pedido.setState(this);
	}
	
	/* -------------------TRANSI��ES POSS�VEIS-------------------------------*/

	@Override
	public void transportarPedido(ContextPedido pedido) {
		pedido.setState(this);
		System.out.println("O pedido j� est� em transporte! Chegar� em breve, se quiser pode rastrear pelo seu app");
	}
	
	@Override
	public void entregarPedido(ContextPedido pedido) {
		pedido.setState(new ConcreteStateD_Entregue(pedido));
	}
	
	/* -------------------TRANSI��ES IMPOSS�VEIS-----------------------------*/
	
	@Override
	public void criarPedido(ContextPedido pedido) {
		System.out.println("Erro - Esse pedido j� saiu para entrega.");
	}
	
	@Override
	public void aprovarPedido(ContextPedido pedido) {
		System.out.println("Seu pedido j� foi aprovado anteriormente e j� saiu para entrega");
	}
	
	@Override
	public String cancelarPedido(ContextPedido pedido) {
		return "Sinto muito, n�o ser� poss�vel cancelar, pois o seu pedido j� saiu para entrega";
	}
	
	@Override
	public void finalizarPedido(ContextPedido pedido) {
		System.out.println("O pedido deve ser primeiramente entregue");
	}
	
	/* -------------------M�TODOS DA CLASSE----------------------------------*/
	
	@Override
	public String print_state() {
		return this.getClass().getSimpleName();
	}
}
