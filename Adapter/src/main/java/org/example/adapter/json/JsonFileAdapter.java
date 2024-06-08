package org.example.adapter.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.example.adapter.InputFile;
import org.example.model.Person;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class JsonFileAdapter implements InputFile {
    @Override
    public List<Person> readFile(InputStream inputStream) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode rootNode = mapper.readTree(inputStream);

            for (JsonNode node : rootNode) {
                if (node instanceof ObjectNode) {
                    ObjectNode objectNode = (ObjectNode) node;

                    String nombre = objectNode.remove("Nombre").asText();
                    String apellido = objectNode.remove("Apellido").asText();
                    int edad = objectNode.remove("Edad").asInt();

                    objectNode.put("name", nombre);
                    objectNode.put("lastName", apellido);
                    objectNode.put("age", edad);
                }
            }

            List<Person> personList = mapper.convertValue(rootNode, new TypeReference<List<Person>>() {});
            return personList;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
