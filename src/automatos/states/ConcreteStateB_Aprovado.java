package automatos.states;

public class ConcreteStateB_Aprovado implements State_Pedido {

	public ConcreteStateB_Aprovado(ContextPedido pedido) {
		pedido.setState(this);
	}
	
	/* -------------------TRANSIÇÕES POSSÍVEIS-------------------------------*/

	@Override
	public void aprovarPedido(ContextPedido pedido) {
		pedido.setState(this);
		System.out.println("Pedido aprovado! Aguarde pois em breve sairá para transporte");
	}
	
	@Override
	public void transportarPedido(ContextPedido pedido) {
		pedido.setState(new ConcreteStateC_EmTransporte(pedido));
		System.out.println("Pedido em transporte! Chegará em breve, se quiser pode rastrear pelo seu app");
	}

	@Override
	public void cancelarPedido(ContextPedido pedido) {
		pedido.setState(new ConcreteStateE_Cancelado(pedido));
		System.out.println("Pedido cancelado");
	}
	
	/* -------------------TRANSIÇÕES IMPOSSÍVEIS-----------------------------*/
	@Override
	public void entregarPedido(ContextPedido pedido) {
		System.out.println("O pedido ainda não está em transporte");
	}
	
	@Override
	public void criarPedido(ContextPedido pedido) {
		System.out.println("O pedido já foi criado");
	}
	
	@Override
	public void finalizarPedido(ContextPedido pedido) {
		System.out.println("O pedido deve ser cancelado ou entregue");
	}
	
	/* -------------------MÉTODOS DA CLASSE----------------------------------*/
	@Override
	public String print_state() {
		return this.getClass().getSimpleName();
	}
}
