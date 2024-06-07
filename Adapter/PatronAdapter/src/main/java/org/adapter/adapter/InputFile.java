package org.adapter.adapter;

import org.adapter.model.Person;

import java.io.InputStream;
import java.util.List;

public interface InputFile {
    List<Person> readFile(InputStream inputStream);
}
