package org.adapter.adapter;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.adapter.model.Person;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

public class CsvAdapter implements InputFile {

    @Override
    public List<Person> readFile(InputStream inputStream) {
        try {
            Reader reader = new InputStreamReader(inputStream);

            ColumnPositionMappingStrategy<Person> strategy = new ColumnPositionMappingStrategy<>();
            strategy.setType(Person.class);
            strategy.setColumnMapping("name", "lastName", "age");

            CsvToBean<Person> csvToBean = new CsvToBeanBuilder<Person>(reader)
                    .withMappingStrategy(strategy)
                    .withType(Person.class)
                    .withSeparator(';')
                    .withSkipLines(1)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            List<Person> personList = csvToBean.parse();
            return personList;
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
