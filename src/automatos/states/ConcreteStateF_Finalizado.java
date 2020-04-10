package automatos.states;

public class ConcreteStateF_Finalizado implements State_Pedido{
	
	public ConcreteStateF_Finalizado(ContextPedido pedido) {
		pedido.setState(this);
	}

	/* -------------------TRANSIÇÕES POSSÍVEIS-------------------------------*/
	
	@Override
	public void finalizarPedido(ContextPedido pedido) {
		pedido.setState(this);
		System.out.println("Pedido Finalizado");
	}
	
	/* -------------------TRANSIÇÕES IMPOSSÍVEIS-----------------------------*/
	@Override
	public void criarPedido(ContextPedido pedido) {
		System.out.println("O pedido só pode ser finalizado");
	}
	
	@Override
	public void aprovarPedido(ContextPedido pedido) {
		System.out.println("O pedido só pode ser finalizado");
	}
	
	@Override
	public void transportarPedido(ContextPedido pedido) {
		System.out.println("O pedido só pode ser finalizado");
	}
	
	@Override
	public void entregarPedido(ContextPedido pedido) {
		System.out.println("O pedido só pode ser finalizado");
	}
	
	@Override
	public String cancelarPedido(ContextPedido pedido) {
		return "O pedido só pode ser finalizado";
	}
	
	/* -------------------MÉTODOS DA CLASSE----------------------------------*/
	@Override
	public String print_state() {
		return this.getClass().getSimpleName();
	}
	
}
