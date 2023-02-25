package facades;

import dtos.PersonDTO;
import dtos.PersonsDTO;

public interface IPersonFacade {
    public PersonDTO addPerson(String fName, String lName, String phone);

    public PersonDTO deletePerson(long id);

    public PersonDTO getPerson(int id);

    public PersonsDTO getAllPersons();

    public PersonDTO editPerson(PersonDTO p);

}
