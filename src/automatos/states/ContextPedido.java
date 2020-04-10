package automatos.states;

public class ContextPedido {

	//Criar um objeto da interface dentro de Pedido
	private State_Pedido state;
	
	
	public int id;
	public String nome;
	public int qtd;
	public String Cliente;
	
	//Sempre que a classe pedido for instanciada, um novo pedido será criado
	
	public ContextPedido(){
		state =  new ConcreteStateA_Novo(this);
	}
	
	/*--------------------------------------------------------------------- */

	public void setState(State_Pedido state){
		this.state = state;		
	   }

	public State_Pedido getState(){
		return state;
	   }
	
	/*--------------------------------------------------------------------- */
	
	public int getId() {
			return id;
	}
	
	public void setId(){
		//Criar um Arraylist de pedidos 
	}
	
}
