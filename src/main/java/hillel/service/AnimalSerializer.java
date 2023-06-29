package hillel.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import hillel.model.Animal;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

/**
 * @author Serhii Klunniy
 */
@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AnimalSerializer<T extends ObjectMapper> {

    final T mapper;
    final File path;
    final String message1 = "Cannot create file";
    final String message2 = "cannot read file";

    public AnimalSerializer(T mapper) {
        this.mapper = mapper;
        String extension = ".txt";
        if (mapper instanceof JsonMapper) extension = ".json";
        if (mapper instanceof XmlMapper) extension = ".xml";
        if (mapper instanceof YAMLMapper) extension = ".yaml";
        this.path = new File("src/main/resources/animal" + extension);
    }

    public static void main(String[] args) {
        final Animal dog = new Animal("sharik66", "2015.03.11", 7, false, "doberman");
        AnimalSerializer<JsonMapper> animalSerializer = new AnimalSerializer<>(new JsonMapper());
        animalSerializer.serialize(dog);
    }

    public void serialize(Animal animal) {
        try {
            mapper.writeValue(path, animal);
        } catch (IOException e) {
            System.out.println(message1);
            e.printStackTrace();
        }
    }

    public void serialize(List<Animal> animals) {
        try {
            mapper.writeValue(path, animals);
        } catch (IOException e) {
            System.out.println(message1);
            e.printStackTrace();
        }
    }

    public Optional<Animal> deserialize() {
        try {
            return Optional.of(mapper.readValue(path, Animal.class));
        } catch (IOException e) {
            System.out.println(message2);
            e.printStackTrace();
            return Optional.empty();
        }
    }
}
