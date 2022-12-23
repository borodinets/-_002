package HomeWork002.DataBase;
import java.util.List;

import HomeWork002.Model.Person;

public class Pack {
    String path = "HomeWork002/DataBase/List.txt";
    Store utilities = new Store();
    List<Person> persons = utilities.getList(path);
    
    public List<Person> getPersons() {
        return persons;
    }
}
