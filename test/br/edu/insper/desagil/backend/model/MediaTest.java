package br.edu.insper.desagil.backend.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.edu.insper.desagil.backend.Media;

class MediaTest {
	@BeforeEach
	void setUp() {
	}

	@Test
	void FiveSeconds() {
		Media media = new Media ("mediaTeste", 5);
		
		assertEquals("0:00:05", media.getDurationString());
	}

	@Test
	void FiftyFiveSeconds() {
		Media media = new Media ("mediaTeste", 55);
		
		assertEquals("0:00:55", media.getDurationString());
	}

	@Test
	void FiveMinutesFiveSeconds() {
		Media media = new Media ("mediaTeste",305);
		
		assertEquals("0:05:05", media.getDurationString());
	}

	@Test
	void FiveMinutesFiftyFiveSeconds() {
		Media media = new Media ("mediaTeste", 355);
		
		assertEquals("0:05:55", media.getDurationString());
	}

	@Test
	void FiftyFiveMinutesFiveSeconds() {
		Media media = new Media ("mediaTeste", 3305);
		
		assertEquals("0:55:05", media.getDurationString());
	}

	@Test
	void FiftyFiveMinutesFiftyFiveSeconds() {
		Media media = new Media ("mediaTeste", 3355);
		
		assertEquals("0:55:55", media.getDurationString());
	}

	@Test
	void OneHourFiveSeconds() {
		Media media = new Media ("mediaTeste",3605);
		
		assertEquals("1:00:05", media.getDurationString());
	}

	@Test
	void OneHourFiftyFiveSeconds() {
		Media media = new Media ("mediaTeste", 5);
		
		assertEquals("1:00:55", media.getDurationString());
	}

	@Test
	void OneHourFiveMinutesFiveSeconds() {
		Media media = new Media ("mediaTeste", 5);
		
		assertEquals("1:05:05", media.getDurationString());	}

	@Test
	void OneHourFiveMinutesFiftyFiveSeconds() {
		Media media = new Media ("mediaTeste", 5);
		
		assertEquals("1:05:55", media.getDurationString());	}

	@Test
	void OneHourFiftyFiveMinutesFiveSeconds() {
		Media media = new Media ("mediaTeste", 5);
		
		assertEquals("1:55:05", media.getDurationString());	}

	@Test
	void OneHourFiftyFiveMinutesFiftyFiveSeconds() {
		Media media = new Media ("mediaTeste", 5);
		
		assertEquals("1:55:55", media.getDurationString());	}
}
