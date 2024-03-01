package ejercicio2;

public class contrato {

	
	public static void main(String[] args) {

		LibroNotas producto = new LibroNotas(10);
        System.out.println("Stock inicial: " + producto.obtenerStock());
		
		
		producto.actualizarStock(5);
		System.out.println("Stock actualizado: " + producto.obtenerStock());
		
	}

}

interface Intervariable {
	int obtenerStock();
	void actualizarStock(int cantidad);
}

class LibroNotas implements Intervariable{

	private int stock;

    public LibroNotas(int stock) {
        this.stock = stock;
    }

	@Override
	public int obtenerStock() {
		// TODO Auto-generated method stub
		return stock;
	}

	@Override
	public void actualizarStock(int cantidad) {
		// TODO Auto-generated method stub
		stock += cantidad;
	}
}
