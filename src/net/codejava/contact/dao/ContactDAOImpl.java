/**
 * 
 */
package net.codejava.contact.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import net.codejava.contact.model.Contact;

/**
 * @author abdykili
 *
 */
public class ContactDAOImpl implements ContactDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	public ContactDAOImpl(DataSource dataSource) {
		 this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public int save(Contact c) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO Contact (name, email, address, phone) VALUES (?, ?, ?, ?)";
		return jdbcTemplate.update(sql, c.getName(), c.getEmail(), c.getAddress(),c.getPhone()); 
	}

	@Override
	public int update(Contact contact) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Contact get(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Contact> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
