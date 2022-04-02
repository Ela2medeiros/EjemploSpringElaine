package cl.icap.fullstackjava2022.modulo5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.icap.fullstackjava2022.modulo5.model.dao.DepartmentsDao;
import cl.icap.fullstackjava2022.modulo5.model.dto.DepartmentsDto;

@Service
public class DepartmentsServiceImpl implements DepartmentsService {
	
	@Autowired
	DepartmentsDao departmentsDao;

	public DepartmentsServiceImpl() { //constructor
	}

	
	@Override
	public int insert(DepartmentsDto departmentsDao) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(DepartmentsDto departmentsDao) {
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
	public List<DepartmentsDto> list() {
		return departmentsDao.list();
	}

}
