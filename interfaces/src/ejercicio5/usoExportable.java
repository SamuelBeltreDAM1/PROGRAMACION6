package ejercicio5;

import javax.swing.JOptionPane;

public class usoExportable {

	public static void main(String[] args) {
	    Exportable reporteCSV = new CSV();
	    Exportable reportePDF = new PDF();
	    
	    reporteCSV.exportarDatos();
	    reportePDF.exportarDatos();
	    
		}

	}

	interface Exportable {
		void exportarDatos();
	}

	class CSV implements Exportable{

		@Override
		public void exportarDatos() {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null,"Exportando los datos del Reporte a CSV... ");
		}
		
	}

	class PDF implements Exportable{

		@Override
		public void exportarDatos() {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null,"Exportando los datos del Reporte a PDF... ");

		}
	
}
