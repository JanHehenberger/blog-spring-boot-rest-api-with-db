package at.janhehenberger.blogspringbootrestapi.controller;

import at.janhehenberger.blogspringbootrestapi.dto.PersonDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController
{
    //Create a get method to retrieve all Persons
    @GetMapping("/persons")
    public List<PersonDTO> getPersons()
    {
        List<PersonDTO> persons = new ArrayList<>();
        persons.add(new PersonDTO("John", "Doe"));
        persons.add(new PersonDTO("Jane", "Smith"));
        return persons;
    }
}
