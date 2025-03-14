package baroja.lenmar.tema4.JsonAnchan;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class FicheroJsonIn {
    public static void main(String[] args) {
        final String RUTA_FICH = "src\\main\\java\\baroja\\lenmar\\tema4\\JsonAnchan\\";

        Gson gson = new Gson();
        try {
            Reader reader = Files.newBufferedReader(Paths.get(RUTA_FICH + "persona.json"));
            // convertir a objeto persona
            // leo el archivo linea a linea y por cada atributo y valor lo voy asignando a un "new Persona()"
            List<Persona> listaPersonaIn = Arrays.asList(gson.fromJson(reader, Persona[].class));
            System.out.println("Lista de personas de entrada " + listaPersonaIn);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
