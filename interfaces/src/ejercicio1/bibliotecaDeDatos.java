package ejercicio1;

import javax.swing.JOptionPane;

public class bibliotecaDeDatos {
	
	public static void main(String[] args) {
		 Dato1 dato1 = new Dato1(15);
		Datos datos = new Datos();
       datos.filtrar();
       
       datos.ordenar();
       dato1.mostrar();
       
	}

}

interface Filtrable {
	void filtrar();
}

interface Ordenable {
	void ordenar();
}

class Datos implements Filtrable, Ordenable {

	@Override
	public void ordenar() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Ordenando datos de la biblioteca, espere un segundo... ");
	}

	@Override
	public void filtrar() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Filtrando los datos... ");
	}
	
}

class Dato1 extends Datos implements Filtrable, Ordenable{
	int Datos;
	
	public Dato1(int Datos) {
this.Datos = Datos;
}

	public int getDatos() {
		return Datos;
	}

	public void setDatos(int datos) {
		Datos = datos;
	}

	public void mostrar() {
		System.out.println("Los datos ya estan en la biblioteca: " + this.Datos);
	}

}
