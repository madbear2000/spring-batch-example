package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemWriter;
import org.springframework.batch.item.file.transform.PassThroughLineAggregator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Component;

@Component
public class ProcessWritter {

	@Value("${batch.output.file:demo.csv}")
	private String outputLoc;

	@Value("${batch.output.delete.existing:false}")
	private boolean deleteExisting;

	private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

	public ItemWriter<Person> writer() {
		
		log.info("Creating Process File Writer");
		
		FlatFileItemWriter<Person> writer = new FlatFileItemWriter<Person>();

		writer.setResource(new FileSystemResource(outputLoc));
		writer.setShouldDeleteIfExists(deleteExisting);

		writer.setLineSeparator("\n");
		writer.setLineAggregator(new PassThroughLineAggregator<Person>());

		return writer;
	}

}
