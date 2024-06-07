package org.adapter.adapter;

import org.adapter.model.Person;

import java.io.InputStream;
import java.util.List;

public class FileAdapter {
    private InputFile fileReader;

    public FileAdapter(InputFile fileReader){
        this.fileReader = fileReader;
    }

    public List<Person> readFile(InputStream inputStream){
        return this.fileReader.readFile(inputStream);
    }
}
