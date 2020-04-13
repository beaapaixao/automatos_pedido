package principal;

import automatos.states.ConcreteStateA_Novo;
import automatos.states.ConcreteStateB_Aprovado;
import automatos.states.ConcreteStateC_EmTransporte;
import automatos.states.ConcreteStateD_Entregue;
import automatos.states.ConcreteStateE_Cancelado;
import automatos.states.ConcreteStateF_Finalizado;
import automatos.states.ContextPedido;

public class StateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ContextPedido pedido = new ContextPedido();

		  ConcreteStateA_Novo novo = new ConcreteStateA_Novo(pedido);
		  novo.criarPedido(pedido);
		  
		  ConcreteStateB_Aprovado aprovado = new ConcreteStateB_Aprovado(pedido);
		  aprovado.aprovarPedido(pedido);
		  
		  ConcreteStateC_EmTransporte transportando = new ConcreteStateC_EmTransporte(pedido);
		  transportando.transportarPedido(pedido);
		  
		  ConcreteStateD_Entregue entregue = new ConcreteStateD_Entregue(pedido);
		  entregue.entregarPedido(pedido);
		 
		  
		  ConcreteStateF_Finalizado finalizar = new ConcreteStateF_Finalizado(pedido);
		  finalizar.finalizarPedido(pedido);
		  
		  ConcreteStateE_Cancelado cancelar = new ConcreteStateE_Cancelado(pedido);
		  cancelar.cancelarPedido(pedido);
		  	  
		  
		  /* ---------------TRANSIÇÕES IMPOSSÍVEIS--------------------------*/
		  System.out.println("");
		  System.out.println(" /* ---------------TRANSIÇÕES IMPOSSÍVEIS--------------------------*/");
		 
		  
		  novo.finalizarPedido(pedido);
		  novo.entregarPedido(pedido);
		  
		  aprovado.criarPedido(pedido);
		  aprovado.entregarPedido(pedido);
		  
		  transportando.aprovarPedido(pedido);
		  transportando.cancelarPedido(pedido);
		  
		  entregue.criarPedido(pedido);
		  entregue.aprovarPedido(pedido);
		  
		  finalizar.aprovarPedido(pedido);
		  finalizar.criarPedido(pedido);
		  
		  cancelar.entregarPedido(pedido);
		  cancelar.aprovarPedido(pedido);
	}

}
