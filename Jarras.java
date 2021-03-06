package prJarras;

public class Jarras {
	//variables de instancia
		private int cantidad;
		private int capacidad;
	//constructor
		public Jarras(int capacidadInicial){
			if(capacidadInicial<=0){
				throw new RuntimeException ("ERROR: no se pueden crear jarras con capacidad menor o igual a cero." );
			}
			this.capacidad=capacidadInicial;
		}

	//metodos 1
		//B1
		public int capacidad(){
			return this.capacidad;
		}
		//B2
		public int cantidad(){
			return this.cantidad;
		}

	//metodos 2
		
		//C1
		public void llena(){
			this.cantidad=this.capacidad;
		}	
		//C2
		public void vacia(){
			this.cantidad=0;
		}

	//metodos 3

		//D1
				public void llenaDesde(Jarra a){
					 int x;
					
					if(a.contenido>(this.capacidad-this.contenido)){
						a.contenido-=(this.capacidad-this.contenido);
						this.llena();
					}else if(a.contenido<(this.capacidad-this.contenido)){
						this.contenido+=a.contenido;
						a.vacia();
					} else{
						x=this.contenido;
						this.contenido+=a.contenido;
						x=this.contenido-x;
						a.contenido-=x;
					}
				}

		//D2
				public String toString(){
					return "Jarra("+this.capacidad+","+this.contenido+")";
				}
		
		
	public void metodoComunitario(){
		//Comentario incluido para pruebas
			System.out.println("Aqu� escribimos todos");
	}
}
