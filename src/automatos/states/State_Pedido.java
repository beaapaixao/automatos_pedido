package automatos.states;

public interface State_Pedido {
	

	public void criarPedido(ContextPedido pedido);
	public void aprovarPedido(ContextPedido pedido);
	public void transportarPedido(ContextPedido pedido);
	public void entregarPedido(ContextPedido pedido);
	public String cancelarPedido(ContextPedido pedido);
	public void finalizarPedido(ContextPedido pedido);
	
	public String print_state();
}
