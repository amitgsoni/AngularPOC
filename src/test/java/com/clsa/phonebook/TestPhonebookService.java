/**
 *
 */
package com.clsa.phonebook;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.clsa.phonebook.controller.PhonebookController;

/**
 * @author Amit Soni
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/spring/applicationContext.xml" })
public class TestPhonebookService {

	// @Autowired
	// private PhonebookService phoneBookService;

	private static final Logger logger = LoggerFactory.getLogger(TestPhonebookService.class);

	@Inject
	private PhonebookController phoneBookController;

	@Test
	public void testPhoneBookService() {
		// final PhonebookController cont = new PhonebookController();
		logger.info("{}", this.phoneBookController.findByName("Joe"));
	}
}
