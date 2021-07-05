package com.example.patterns;

import com.example.patterns.service.FileReader;
import com.example.patterns.service.reader_operation.FileReaderFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatternsApplication.class, args);
		FileReaderFactory fileReaderFactory = new FileReaderFactory();
		FileReader fileReader = fileReaderFactory.getFileReader("xlsx");
		fileReader.readFile("/dfvsdfv.xlsx");
	}

}
