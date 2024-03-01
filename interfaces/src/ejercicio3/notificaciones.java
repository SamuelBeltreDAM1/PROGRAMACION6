package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class notificaciones {

public static void main(String[] args) {
		
		List<Notificable> notificadores = new ArrayList<>();
        notificadores.add(new CorreoElectronico());
        notificadores.add(new SMS());
        notificadores.add(new MensajeAplicacion());
        
        for (Notificable notificable : notificadores) {
            notificable.enviarNotificacion();
	}

}

}
	
interface Notificable {
	void enviarNotificacion();
}

class CorreoElectronico implements Notificable {

	@Override
	public void enviarNotificacion() {
		// TODO Auto-generated method stub
		System.out.println("Enviando notificacion al Correo Correspondiente... ");
	}
	
}

class SMS implements Notificable {

	@Override
	public void enviarNotificacion() {
		// TODO Auto-generated method stub
		System.out.println("Enviando notificacion al SMS Correspondiente... ");
	}
	
}

class MensajeAplicacion implements Notificable {

	@Override
	public void enviarNotificacion() {
		System.out.println("Notificando el mensaje de la aplicacion... ");		
	}
	
}
