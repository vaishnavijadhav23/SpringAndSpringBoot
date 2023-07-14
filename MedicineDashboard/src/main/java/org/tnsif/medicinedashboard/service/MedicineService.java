package org.tnsif.medicinedashboard.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.medicinedashboard.entities.Medicine;
import org.tnsif.medicinedashboard.repository.MedicineRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class MedicineService {
	
	@Autowired
	private MedicineRepository repo;
	
	//Creation
	public Medicine registerMedicine(Medicine medicine)
	{
		return repo.save(medicine);
	}
	
	//retrieve a specific data
	public List<Medicine>getMedicine()
	{
		return (List<Medicine>) repo.findAll();
	}
	
	//delete a data
	public void daleteMadicine(Integer id)
	{
		repo.deleteById(id);
	}
	
	//update
	public Medicine updateMedicine(Medicine medicine)
	{
		Integer id = medicine.getId();
		Medicine m = repo.findById(id).get();
		m.setName(medicine.getName());
		m.setPrice(medicine.getPrice());
		return repo.save(m);
	}	

}
