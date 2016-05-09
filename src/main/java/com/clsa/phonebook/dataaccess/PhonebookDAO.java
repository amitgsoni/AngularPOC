/**
 *
 */
package com.clsa.phonebook.dataaccess;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.clsa.phonebook.model.Person;
import com.clsa.phonebook.mybatis.PhonebookMapper;

/**
 * @author Amit Soni
 *
 */
@Repository("phoneBookDAO")
public class PhonebookDAO {

	// @Autowired
	private PhonebookMapper phoneBookMapper;

	/**
	 * @param name
	 * @return
	 */
	public List<Person> findByName(final String name) {
		final Map<String, Object> map = new HashMap<>();
		map.put("name", name);
		return this.phoneBookMapper.findByName(map);
	}

}
