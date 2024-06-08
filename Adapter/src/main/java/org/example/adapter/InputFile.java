package org.example.adapter;

import org.example.model.Person;

import java.io.InputStream;
import java.util.List;

public interface InputFile {
    List<Person> readFile(InputStream inputStream);
}
