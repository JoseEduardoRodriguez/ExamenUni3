public class PruebaArbol {
	public static void main(String[] args) {
		Arbol bonsai=new Arbol();
		bonsai.insert(new Nodo(10));
		if(bonsai.buscar(new Nodo(10))){
			System.out.println("El 10 se encontro");
		}
		Nodo AB;
		
	    AB= new Nodo(0);
		if(bonsai.buscar(AB)){
			System.out.println("El "+AB+" se encontro");
		}else {
			System.out.println("El "+AB+" no se encontro");	
		}
		
		AB= new Nodo(5);
		bonsai.insert(AB);
		if(bonsai.buscar(AB)){
	       	System.out.println("El "+AB+" se encontro");
		}else {
		    System.out.println("El "+AB+" no se encontro");	
			}
		
		AB= new Nodo(15);
		bonsai.insert(AB);
		if(bonsai.buscar(AB)){
	       	System.out.println("El "+AB+" se encontro");
		}else {
		    System.out.println("El "+AB+" no se encontro");	
			}
		
		AB= new Nodo(4);
		bonsai.insert(AB);
		if(bonsai.buscar(AB)){
	       	System.out.println("El "+AB+" se encontro");
		}else {
		    System.out.println("El "+AB+" no se encontro");	
			}
		
		AB= new Nodo(16);
		bonsai.insert(AB);
		if(bonsai.buscar(AB)){
	       	System.out.println("El "+AB+" se encontro");
		}else {
		    System.out.println("El "+AB+" no se encontro");	
			}
		
		AB= new Nodo(8);
		bonsai.insert(AB);
		if(bonsai.buscar(AB)){
	       	System.out.println("El "+AB+" se encontro");
		}else {
		    System.out.println("El "+AB+" no se encontro");	
			}
		
		AB= new Nodo(11);
		bonsai.insert(AB);
		if(bonsai.buscar(AB)){
	       	System.out.println("El "+AB+" se encontro");
		}else {
		    System.out.println("El "+AB+" no se encontro");	
			}
		
		AB= new Nodo(1111);
		if(bonsai.buscar(AB)){
	       	System.out.println("El "+AB+" se encontro");
		}else {
		    System.out.println("El "+AB+" no se encontro");	
			}
		System.out.println("==========Recorridos===========");
		System.out.println("Pre-Order(VID) :");
		System.out.println(bonsai.toStringPreOrder());
		System.out.println("In-Order(IVD) :");
		System.out.println(bonsai.toStringInOrder());
		System.out.println("Post-Order(IDV) :");
		System.out.println(bonsai.toStringPostOrder());
		
	}
}
