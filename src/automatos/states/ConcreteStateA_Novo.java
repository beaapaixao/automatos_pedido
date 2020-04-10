package automatos.states;

public class ConcreteStateA_Novo implements State_Pedido {

	public ConcreteStateA_Novo(ContextPedido pedido) {
		pedido.setState(this);
	}
	
	/* -------------------TRANSIÇÕES POSSÍVEIS-------------------------------*/
	
	@Override
	public void criarPedido(ContextPedido pedido) {
		pedido.setState(this);
		System.out.println("Pedido criado com sucesso");
	}
	
	@Override
	public void aprovarPedido(ContextPedido pedido) {
		pedido.setState(new ConcreteStateB_Aprovado(pedido));
		System.out.println("Pedido aprovado");
	}
	
	@Override
	public String cancelarPedido(ContextPedido pedido) {
		pedido.setState(new ConcreteStateE_Cancelado(pedido));
		return "Pedido cancelado";
	}
	
	/* -------------------TRANSIÇÕES IMPOSSÍVEIS-----------------------------*/
	
	@Override
	public void transportarPedido(ContextPedido pedido) {
		System.out.println("Erro - O pedido deve ser Aprovado");
	}
	
	@Override
	public void entregarPedido(ContextPedido pedido) {
		System.out.println("Erro - O pedido ainda não está em transporte");
	}
	
	@Override
	public void finalizarPedido(ContextPedido pedido) {
		System.out.println("Erro - O pedido deve ser cancelado ou entregue");
	}
	
	/* -------------------MÉTODOS DA CLASSE----------------------------------*/
	@Override
	public String print_state() {
		return this.getClass().getSimpleName();
	}
}
