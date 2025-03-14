package baroja.lenmar.tema4.JsonAnchan;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class JsonEjemplo {
    public static void main(String[] args) throws IOException {
        final String RUTA_FICH = "src\\main\\java\\baroja\\lenmar\\tema4\\JsonAnchan";

        JsonObject objetoJson1 = new JsonObject();
        objetoJson1.addProperty("coche", "rojo");
        objetoJson1.addProperty("temperatura", 22.5);
        objetoJson1.addProperty("año", 2025);

        JsonObject objetoJson2 = new JsonObject();
        objetoJson2.addProperty("Hola", "DAW");
        objetoJson1.add("mensaje", objetoJson2);

        // Array Meses
        JsonArray jsonArrayMeses = new JsonArray();
        jsonArrayMeses.add("Enero");
        jsonArrayMeses.add("Febrero");
        jsonArrayMeses.add("Marzo");
        jsonArrayMeses.add("Abril");
        objetoJson1.add("meses", jsonArrayMeses);

        System.out.println("Fich JSON generado: " + objetoJson1);


        //  lo volcamos a fichero
        try {
            FileWriter file = new FileWriter(RUTA_FICH+"miPrimerJson.json", StandardCharsets.UTF_8, false);
            file.write(objetoJson1.toString());
            file.close();
            System.out.println("Archivo json generado correctamente");
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo");
        }
        
        
    }
    
}
