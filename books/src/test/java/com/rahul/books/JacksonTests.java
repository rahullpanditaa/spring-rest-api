package com.rahul.books;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rahul.books.domain.Book;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class JacksonTests {

    @Test
    public void objectMapperJavaObjectToJSON() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper(); // jackson object mapper
        Book book = Book.builder().isbn("978-0-13-478627-5")
                .title("The Enigma of Eternity")
                .author("Aria Montgomery")
                .yearPublished("2005")
                .build();

        String result = objectMapper.writeValueAsString(book);
        assertThat(result).isEqualTo("blah");

    }
}
