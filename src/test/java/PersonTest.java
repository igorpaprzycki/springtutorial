import com.igypap.Person;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by igypap on 14.01.17.
 */
public class PersonTest {
    @Test
    public void speakTest() throws Exception {
        String name = "Igor";
        String surname = "Paprzycki";
        int age = 29;
        Person person = new Person(1,name,surname,age);
        person.setAge(age);
        person.setName(name);
        person.setSurname(surname);
        assertEquals("Siema! Nazywam się " + name + " " + surname + " i mam " + age + " lat.", person.speak());
    }

}