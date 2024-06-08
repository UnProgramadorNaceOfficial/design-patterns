package org.example.adapter.xml;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.example.adapter.InputFile;
import org.example.model.Person;

import java.io.InputStream;
import java.util.List;

public class XmlFileAdapter implements InputFile {
    @Override
    public List<Person> readFile(InputStream inputStream) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            PeopleWrapperXml peopleWrapperXml = xmlMapper.readValue(inputStream, PeopleWrapperXml.class);
            List<Person> personList = peopleWrapperXml.getPeople();
            return personList;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
