/**
 *
 */
package com.clsa.phonebook.mybatis;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.mapping.StatementType;

import com.clsa.phonebook.model.Person;

/**
 * @author Amit Soni
 *
 */
public interface PhonebookMapper {

	// @Select("SELECT * FROM person p left outer join contact c on p.person_id
	// = c.person_id where first_name like '%#{name}%' or last_name like
	// '%#{name}%'")
	@Options(statementType = StatementType.PREPARED)
	public List<Person> findByName(Map<String, Object> params);
}
