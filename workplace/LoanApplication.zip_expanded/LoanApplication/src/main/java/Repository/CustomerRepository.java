package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import models.Customers;

@Repository
	public interface CustomerRepository extends JpaRepository<Customers, Integer> {
	   
	@Query("select e from Employee e where e.email=?1")   
	public Customers findByEmail(String email);
	}

