package baroja.lenmar.tema4.JsonAnchan;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PersonaJson {
    public static void main(String[] args) {

        final String RUTA_FICH = "src\\main\\java\\baroja\\lenmar\\tema4\\JsonAnchan\\";

        Persona person1 = new Persona("Anchan", "Thai", 33, Arrays.asList("aprender idiomas", "correr", "escuchar música"));
        
        Persona person2 = new Persona("Maria", "Martínez", 20, Arrays.asList("libros", "WWE", "música"));

        List<Persona> listaPeronasOut = Arrays.asList(person1, person2);

        try {
            Writer writer = Files.newBufferedWriter(Paths.get(RUTA_FICH + "persona.json"));
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(listaPeronasOut, writer);
            writer.close();
            System.out.println("Fichero json generado correctamente");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
