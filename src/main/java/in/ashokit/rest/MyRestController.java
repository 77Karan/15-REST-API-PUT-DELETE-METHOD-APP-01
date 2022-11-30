package in.ashokit.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController
{
	@PutMapping(value="/customer/{sid}")
	public ResponseEntity<String> updateCustomer(@PathVariable Integer sid)
	{
		//logic
		String msg = "Customer Updated Sucessfully";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/customer/{sid}")
	public ResponseEntity<String> deleteCustomer(@PathVariable Integer sid)
	{
		//logic
		String msg = "Deleting my customer";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
	

}
