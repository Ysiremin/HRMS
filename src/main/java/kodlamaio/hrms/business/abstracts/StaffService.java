package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.Staff;

public interface StaffService {
	List<Staff> getAll();
}
