package automatos.states;

public class ConcreteStateD_Entregue implements State_Pedido{
	
	public ConcreteStateD_Entregue(ContextPedido pedido) {
		pedido.setState(this);
	}
	
	/* -------------------TRANSI��ES POSS�VEIS-------------------------------*/
	@Override
	public void entregarPedido(ContextPedido pedido) {
		pedido.setState(this);
		System.out.println("O pedido foi entregue!");
	}
	
	@Override
	public void finalizarPedido(ContextPedido pedido) {
		pedido.setState(new ConcreteStateF_Finalizado(pedido));
	}
	
	/* -------------------TRANSI��ES IMPOSS�VEIS-----------------------------*/
	
	@Override
	public void criarPedido(ContextPedido pedido) {
		System.out.println("O pedido deve ser entregue ou finalizado");
	}
	
	@Override
	public void aprovarPedido(ContextPedido pedido) {
		System.out.println("O pedido deve ser entregue ou finalizado");
	}
	
	@Override
	public void transportarPedido(ContextPedido pedido) {
		System.out.println("O pedido deve ser entregue ou finalizado");
	}
	
	
	@Override
	public void cancelarPedido(ContextPedido pedido) {
		System.out.println("O pedido deve ser entregue ou finalizado");
	}
	
	/* -------------------M�TODOS DA CLASSE----------------------------------*/
	
	@Override
	public String print_state() {
		return this.getClass().getSimpleName();
	}
	
}
