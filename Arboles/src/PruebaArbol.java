public class PruebaArbol {
	public static void main(String[] args) {
		Arbol bonsai=new Arbol();
		bonsai.insert(new Nodo(10));
		if(bonsai.buscar(new Nodo(10))){
			System.out.println("El 10 se encuentro");
		}
		
		Nodo AB;
	
	    AB= new Nodo(0);
		if(bonsai.buscar(AB)){
			System.out.println("El "+AB+" se encuentro");
		}else {
			System.out.println("El "+AB+" no se encuentro");	
		}
	
		AB= new Nodo(5);
		bonsai.insert(AB);
		if(bonsai.buscar(AB)){
	       	System.out.println("El "+AB+" se encuentro");
		}else {
		    System.out.println("El "+AB+" no se encuentro");	
			}
	
		AB= new Nodo(15);
		bonsai.insert(AB);
		if(bonsai.buscar(AB)){
	       	System.out.println("El "+AB+" se encuentro");
		}else {
		    System.out.println("El "+AB+" no se encuentro");	
			}

		AB= new Nodo(4);
		bonsai.insert(AB);
		if(bonsai.buscar(AB)){
	       	System.out.println("El "+AB+" se encuentro");
		}else {
		    System.out.println("El "+AB+" no se encuentra");	
			}
	
		AB= new Nodo(16);
		bonsai.insert(AB);
		if(bonsai.buscar(AB)){
	       	System.out.println("El "+AB+" se encuentro");
		}else {
		    System.out.println("El "+AB+" no se encuentro");	
			}
	
		AB= new Nodo(8);
		bonsai.insert(AB);
		if(bonsai.buscar(AB)){
	       	System.out.println("El "+AB+" se encuentro");
		}else {
		    System.out.println("El "+AB+" no se encuentro");	
			}
		
		AB= new Nodo(11);
		bonsai.insert(AB);
		if(bonsai.buscar(AB)){
	       	System.out.println("El "+AB+" se encuentro");
		}else {
		    System.out.println("El "+AB+" no se encuentro");	
			}

		AB= new Nodo(1111);
		if(bonsai.buscar(AB)){
	       	System.out.println("El "+AB+" se encuentro");
		}else {
		    System.out.println("El "+AB+" no se encuentro");	
			}
		
	}

}
