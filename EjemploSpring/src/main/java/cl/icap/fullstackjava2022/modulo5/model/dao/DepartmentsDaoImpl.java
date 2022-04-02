package cl.icap.fullstackjava2022.modulo5.model.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.icap.fullstackjava2022.modulo5.model.dto.DepartmentsDto;

@Repository
@Transactional
public class DepartmentsDaoImpl implements DepartmentsDao {
	private String insert = "INSERT INTO Departments VALUES(?,?)";
	private String select = "SELECT * FROM Departments WHERE dept_no=?";
	private String update = "UPDATE Departments SET dept_name=? WHERE dept_no=?";
	private String delete = "DELETE Departments WHERE dept_no=?";
	private String list = "SELECT * FROM Departments";
			
	@Autowired
	private JdbcTemplate jdbcTemplate; //es la clase que hará toda la conexion con BD(hay que crear la Dependencia en Pom)
	
	public DepartmentsDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int insert(DepartmentsDto departmentsDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(DepartmentsDto departmentsDto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public DepartmentsDto get(String dept_no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int delete(String dept_no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<DepartmentsDto> list() { //BeanPropertyRowMapper Mapeo automatico entre BD y la clase
		List <DepartmentsDto> listDepartments = jdbcTemplate.query(list, BeanPropertyRowMapper.newInstance(DepartmentsDto.class));
		return listDepartments;
	}

}
