package automatos.states;

public interface State_Pedido {
	

	 void criarPedido(ContextPedido pedido);
	 void aprovarPedido(ContextPedido pedido);
	 void transportarPedido(ContextPedido pedido);
	 void entregarPedido(ContextPedido pedido);
	 void cancelarPedido(ContextPedido pedido);
	 void finalizarPedido(ContextPedido pedido);
	
	 String print_state();
}
