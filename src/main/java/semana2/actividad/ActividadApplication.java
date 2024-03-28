package semana2.actividad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("semana2")  // Escanea el paquete raíz y sus subpaquetes
public class ActividadApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActividadApplication.class, args);
	}

}
