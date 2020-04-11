package principal;

import automatos.states.ConcreteStateA_Novo;
import automatos.states.ContextPedido;

public class StateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ContextPedido pedido = new ContextPedido();

		  ConcreteStateA_Novo novo = new ConcreteStateA_Novo(pedido);
		  novo.criarPedido(pedido);
		
		
		
	}

}
