package ejercicio4;

public class procesamiento {

		public static void main(String[] args) {

			ProcesadordePago proveedorA = new Proveedor1();
			ProcesadordePago proveedorB = new Proveedor2();
			
			Cliente clienteA = new Cliente(proveedorA);
			Cliente clienteB = new Cliente(proveedorB);

			clienteA.Reembolsarpago();
			clienteB.Realizarpago();
		}

	}

	interface ProcesadordePago {
		void Realizarpago();
		void Reembolsarpago();
	}

	class Proveedor1 implements ProcesadordePago{

		@Override
		public void Realizarpago() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void Reembolsarpago() {
			// TODO Auto-generated method stub
			
		}
		
	}

	class Proveedor2 implements ProcesadordePago {

		@Override
		public void Realizarpago() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void Reembolsarpago() {
			// TODO Auto-generated method stub
			
		}
		
	}

	class Cliente {
		
		private ProcesadordePago procesadordePago;
		
		public Cliente (ProcesadordePago procesadordePago) {
			this.procesadordePago = procesadordePago;
		}
		
		public void Realizarpago() {

	    procesadordePago.Realizarpago();		
		}

		public void Reembolsarpago() {
			// TODO Auto-generated method stub
		    procesadordePago.Reembolsarpago();			
		}

}
