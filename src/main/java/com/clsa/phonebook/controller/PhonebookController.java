package com.clsa.phonebook.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.clsa.phonebook.model.Person;
import com.clsa.phonebook.service.PhonebookService;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/services")
public class PhonebookController {

	private static final Logger logger = LoggerFactory.getLogger(PhonebookController.class);

	@Autowired
	private PhonebookService phoneBookService;

	/**
	 * @return the phoneBookService
	 */
	public PhonebookService getPhoneBookService() {
		return this.phoneBookService;
	}

	/**
	 * @param phoneBookService
	 *            the phoneBookService to set
	 */
	public void setPhoneBookService(final PhonebookService phoneBookService) {
		this.phoneBookService = phoneBookService;
	}

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/search/{name}", method = RequestMethod.GET)
	public @ResponseBody List<Person> findByName(@PathVariable final String name) {
		logger.info("Find person phones by name");
		return this.phoneBookService.findByName(name);
	}

}
