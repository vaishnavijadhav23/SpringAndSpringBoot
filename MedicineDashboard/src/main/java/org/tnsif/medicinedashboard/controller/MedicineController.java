package org.tnsif.medicinedashboard.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.tnsif.medicinedashboard.entities.Medicine;
import org.tnsif.medicinedashboard.service.MedicineService;
/*because it is used to create controllers for REST APIs which 
 * can return JSON
 */
@RestController
@CrossOrigin(allowedHeaders="*",origins="*")
public class MedicineController {
	
	@Autowired
	private MedicineService service;
	
	@PostMapping("/registerMedicine")
	public Medicine createMedicine(@RequestBody Medicine medicine)
	{
		return service.registerMedicine(medicine);
	}
	
	//update
	@PutMapping("/updateMedicine")
	public Medicine updatMedicine(@RequestBody Medicine medicine)
	{
		return service.updateMedicine(medicine);
	}
	
	//retrieve
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/retrieveMedicine")
	public List<Medicine>getMedicine()
	{
		return service.getMedicine();
	}
	
	//delete
	@DeleteMapping("/deleteMedicine/{id}")
	public void deleteMedicine(@PathVariable Integer id)
	{
		service.daleteMadicine(id);
	}
	
	
	
	
	
	
	
	
	
	
	

}
