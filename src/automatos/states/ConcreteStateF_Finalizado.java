package automatos.states;

public class ConcreteStateF_Finalizado implements State_Pedido{
	
	public ConcreteStateF_Finalizado(ContextPedido pedido) {
		pedido.setState(this);
	}

	/* -------------------TRANSI��ES POSS�VEIS-------------------------------*/
	
	@Override
	public void finalizarPedido(ContextPedido pedido) {
		pedido.setState(this);
		System.out.println("Pedido Finalizado");
	}
	
	/* -------------------TRANSI��ES IMPOSS�VEIS-----------------------------*/
	@Override
	public void criarPedido(ContextPedido pedido) {
		System.out.println("O pedido s� pode ser finalizado");
	}
	
	@Override
	public void aprovarPedido(ContextPedido pedido) {
		System.out.println("O pedido s� pode ser finalizado");
	}
	
	@Override
	public void transportarPedido(ContextPedido pedido) {
		System.out.println("O pedido s� pode ser finalizado");
	}
	
	@Override
	public void entregarPedido(ContextPedido pedido) {
		System.out.println("O pedido s� pode ser finalizado");
	}
	
	@Override
	public String cancelarPedido(ContextPedido pedido) {
		return "O pedido s� pode ser finalizado";
	}
	
	/* -------------------M�TODOS DA CLASSE----------------------------------*/
	@Override
	public String print_state() {
		return this.getClass().getSimpleName();
	}
	
}
