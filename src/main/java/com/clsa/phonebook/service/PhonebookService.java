package com.clsa.phonebook.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.clsa.phonebook.model.Person;
import com.clsa.phonebook.mybatis.PhonebookMapper;

@Component
public class PhonebookService {

	// @Autowired
	// private PhonebookDAO phoneBookDAO;
	@Autowired
	private PhonebookMapper mapper;

	/**
	 * @param name
	 * @return
	 */
	public List<Person> findByName(final String name) {
		final Map<String, Object> map = new HashMap<>();
		map.put("name", name);
		return this.mapper.findByName(map);
	}

}
