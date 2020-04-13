package automatos.states;

public class ContextPedido {

	//Criar um objeto da interface dentro de Pedido
	
	private State_Pedido state;
	public int id;
	public String nome;
	public int qtd;
	public String cliente;
	
		
	public ContextPedido(){
		state = null;
	}
	/* -------------------ESTADOS POSSÍVEIS---------------------------------*/
	
	public void criarPedido(ContextPedido pedido) {
		state.criarPedido(this);
	}
	
	public void aprovarPedido(ContextPedido pedido) {
		state.aprovarPedido(this);
	}
	
	public void transportarPedido(ContextPedido pedido) {
		state.transportarPedido(this);
	}
	
	public void entregarPedido(ContextPedido pedido) {
		state.entregarPedido(this);
	}
	
	public void cancelarPedido(ContextPedido pedido) {
		state.cancelarPedido(this);
	}
	
	public void finalizarPedido(ContextPedido pedido) {
		state.finalizarPedido(this);
	}
	
	/*-------------------------GETS E SETS----------------------------------*/

	public void setState(State_Pedido state){
		this.state = state;		
	   }

	public State_Pedido getState(){
		return state;
	   }
	
	/*----------------------------------------------------------------------*/
	
	public int getId() {
			return id;
	}
	
}
