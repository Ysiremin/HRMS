package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.StaffService;
import kodlamaio.hrms.dataAccess.abstracts.StaffDao;
import kodlamaio.hrms.entities.concretes.Staff;

@Service
public class StaffManager implements StaffService{

	private StaffDao staffDao;
	
	@Autowired
	public StaffManager(StaffDao staffDao) {
		super();
		this.staffDao = staffDao;
	}
	
	@Override
	public List<Staff> getAll() {
		return null;
	}
}
