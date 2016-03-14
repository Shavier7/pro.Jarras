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
	//D1
		public void llenaDesde(Jarra j){
			while((this.cantidad<this.capacidad)&&(j.cantidad>0)){
				this.cantidad++;
				j.cantidad--;
			} ;

		
		
	public void metodoComunitario(){
		//Comentario incluido para pruebas
			System.out.println("Aquí escribimos todos");
	}
}
