package org.adapter;

import org.adapter.adapter.*;
import org.adapter.model.Person;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class Main {
    private static final String path = "src" + File.separator +
            "main" + File.separator +
            "resources" + File.separator +
            "files" + File.separator;

    public static void main(String[] args) throws FileNotFoundException {
        /* Read Excel */
//        InputFile fileReader = new ExcelFileAdapter();
//        FileAdapter readerAdapter = new FileAdapter(fileReader);
//
//        InputStream inputStream = new FileInputStream(path + "ArchivoExcel.xlsx");
//        List<Person> personList = readerAdapter.readFile(inputStream);
//
//        System.out.println(personList);

        /* Read CSV */
        InputFile fileReader = new CsvAdapter();
        FileAdapter readerAdapter = new FileAdapter(fileReader);

        InputStream inputStream = new FileInputStream(path + "ArchivoTXT.txt");
        List<Person> personList = readerAdapter.readFile(inputStream);

        System.out.println(personList);
    }
}