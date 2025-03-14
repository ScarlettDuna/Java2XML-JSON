package baroja.lenmar.tema4.JsonAnchan;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;

public class AnchanCVTest {
    public static void main(String[] args) {
        final String RUTA_FICH = "src\\main\\java\\baroja\\lenmar\\tema4\\JsonAnchan\\";

        Gson gson = new Gson();
        try {
            Reader reader = Files.newBufferedReader(Paths.get(RUTA_FICH + "AnchanCV.json"));
            CV cvAnchan = gson.fromJson(reader, CV.class);
            System.out.println("CV de Anchan: " + cvAnchan);
            reader.close();
            // Cambiamos la dirección de getEmail
            cvAnchan.setEmail("arantxa.rg.1991@hotmail.com");
            // Actualizamos el fichero json
            Writer writer = Files.newBufferedWriter(Paths.get(RUTA_FICH + "AnchanCV.json"));
            gson.toJson(cvAnchan, writer);
            writer.close();
            System.out.println("Fichero json actualizado correctamente");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
