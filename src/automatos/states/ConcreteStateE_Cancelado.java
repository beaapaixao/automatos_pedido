package automatos.states;

public class ConcreteStateE_Cancelado implements State_Pedido{
	
	public ConcreteStateE_Cancelado(ContextPedido pedido) {
		pedido.setState(this);
	}

	/* -------------------TRANSIÇÕES POSSÍVEIS-------------------------------*/
	
	@Override
	public void cancelarPedido(ContextPedido pedido) {
		pedido.setState(this);
		System.out.println("Pedido cancelado");
	}
	
	@Override
	public void finalizarPedido(ContextPedido pedido) {
		pedido.setState(new ConcreteStateF_Finalizado(pedido));
		System.out.println("Pedido Finalizado");
	}
	
	/* -------------------TRANSIÇÕES IMPOSSÍVEIS-----------------------------*/
	
	@Override
	public void criarPedido(ContextPedido pedido) {
		System.out.println("Erro - O pedido deve ser Cancelado");
	}
	
	@Override
	public void aprovarPedido(ContextPedido pedido) {
		System.out.println("Erro - O pedido deve ser Cancelado");
	}
	
	@Override
	public void transportarPedido(ContextPedido pedido) {
		System.out.println("Erro - O pedido deve ser Cancelado");
	}
	
	@Override
	public void entregarPedido(ContextPedido pedido) {
		System.out.println("Erro - O pedido deve ser Cancelado");
	}
	
	/* -------------------MÉTODOS DA CLASSE----------------------------------*/
	
	@Override
	public String print_state() {
		return "Cancelado";
	}
}
