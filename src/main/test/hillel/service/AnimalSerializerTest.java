package hillel.service;

import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;
import hillel.model.Animal;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

/**
 * @author Serhii Klunniy
 */
public class AnimalSerializerTest {

    private final AnimalSerializer animalSerializer = new AnimalSerializer(new YAMLMapper());
    private final Animal dog = new Animal("sharik", "2015.03.11", 7, false, "doberman");
    private final Animal cat = new Animal("myrka", "2016.04.20", 7, false, "persian");


    @Test
    public void serializeTest() {
        animalSerializer.serialize(dog);
    }

    @Test
    public void serializeListTest() {
        animalSerializer.serialize(List.of(cat, dog));
    }

    @Test
    public void deserializeTest() {
        Optional<Animal> deserialize = animalSerializer.deserialize();
        Assert.assertEquals(dog, deserialize.orElse(null));
    }
}
