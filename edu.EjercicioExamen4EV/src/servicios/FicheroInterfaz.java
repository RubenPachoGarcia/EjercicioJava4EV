package servicios;

import java.io.IOException;

public interface FicheroInterfaz {

	public void cargarInicalFichero() throws IOException;
	public void escribirFicheroLog(String mensaje);
}
