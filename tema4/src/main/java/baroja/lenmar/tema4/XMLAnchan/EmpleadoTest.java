package baroja.lenmar.tema4.XMLAnchan;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

public class EmpleadoTest {
    public static void main(String[] args) {
        final String RUTA_FICH = "C:\\Users\\Usuario_Mañana\\Documents\\Lenguaje de marcas\\Java\\tema4\\src\\main\\java\\baroja\\lenmar\\tema4\\XMLAnchan\\";
        Gson gson = new Gson();
        try {
            Reader reader = Files.newBufferedReader(Paths.get(RUTA_FICH + "empleado.json"));
            Empleado empleado1 = gson.fromJson(reader, Empleado.class);
            System.out.println("Empleado " + empleado1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
