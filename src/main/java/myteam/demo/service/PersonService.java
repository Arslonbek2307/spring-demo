package myteam.demo.service;

import myteam.demo.dao.PersonDao;
import myteam.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final PersonDao personDao;

    @Autowired
    public PersonService(@Qualifier("Fake user") PersonDao personDao) {
        this.personDao = personDao;
    }

public void addPerson(Person person) {
        personDao.insertPerson(person);
}

}

