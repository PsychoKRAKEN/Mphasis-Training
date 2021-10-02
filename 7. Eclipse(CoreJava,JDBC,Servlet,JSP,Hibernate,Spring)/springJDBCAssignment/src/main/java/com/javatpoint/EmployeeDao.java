package com.javatpoint;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDao {
private JdbcTemplate template;

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

public List<Employee> getAllEmployeesRowMapper(){
	return template.query("select * from employee",new RowMapper<Employee>(){
		@Override
		public Employee mapRow(ResultSet rs, int rownumber) throws SQLException {
			Employee e=new Employee();
			e.setId(rs.getInt(1));
			e.setName(rs.getString(2));
			e.setSalary(rs.getInt(3));
			return e;
		}
	});
}

public Boolean saveEmployeeByPreparedStatement(Employee e)
{
	String query="insert into employee values(?,?,?)";
	return template.execute(query,new PreparedStatementCallback<Boolean>()
	{
		@Override
		public Boolean doInPreparedStatement(PreparedStatement ps)
				throws SQLException, DataAccessException {
			ps.setInt(1,e.getId());
			ps.setString(2,e.getName());
			ps.setFloat(3,e.getSalary());
			
			return ps.execute();
			
		}
	});
}

public Boolean updateEmployeeByPreparedStatement(float sal,int id)
{
	String query="update employee set salary=? where id=?";
	return template.execute(query,new PreparedStatementCallback<Boolean>()
	{
		@Override
		public Boolean doInPreparedStatement(PreparedStatement ps)
				throws SQLException, DataAccessException {
			ps.setFloat(1,sal);
			ps.setInt(2,id);
			
			
			return ps.execute();
			
		}
	});
}

public Boolean deleteEmployeeByPreparedStatement(int id)
{
	String query="delete from employee where id=?";
	return template.execute(query,new PreparedStatementCallback<Boolean>()
	{
		@Override
		public Boolean doInPreparedStatement(PreparedStatement ps)
				throws SQLException, DataAccessException {
			ps.setInt(1,id);
			
			
			return ps.execute();
			
		}
	});
}


}
