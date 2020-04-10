package automatos.states;

public class ConcreteStateE_Cancelado implements State_Pedido{
	
	public ConcreteStateE_Cancelado(ContextPedido pedido) {
		pedido.setState(this);
	}

	/* -------------------TRANSI��ES POSS�VEIS-------------------------------*/
	
	@Override
	public String cancelarPedido(ContextPedido pedido) {
		pedido.setState(this);
		return "Pedido cancelado";
	}
	
	@Override
	public void finalizarPedido(ContextPedido pedido) {
		pedido.setState(new ConcreteStateF_Finalizado(pedido));
		System.out.println("Pedido Finalizado");
	}
	
	/* -------------------TRANSI��ES IMPOSS�VEIS-----------------------------*/
	
	@Override
	public void criarPedido(ContextPedido pedido) {
		System.out.println("O pedido deve ser Cancelado");
	}
	
	@Override
	public void aprovarPedido(ContextPedido pedido) {
		System.out.println("O pedido deve ser Cancelado");
	}
	
	@Override
	public void transportarPedido(ContextPedido pedido) {
		System.out.println("O pedido deve ser Cancelado");
	}
	
	@Override
	public void entregarPedido(ContextPedido pedido) {
		System.out.println("O pedido deve ser Cancelado");
	}
	
	/* -------------------M�TODOS DA CLASSE----------------------------------*/
	
	@Override
	public String print_state() {
		return this.getClass().getSimpleName();
	}
}
