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
	//metodos
		//D
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

		
		
	public void metodoComunitario(){
		//Comentario incluido para pruebas
			System.out.println("Aquí escribimos todos");
	}
}
