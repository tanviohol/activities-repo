package Repository;

import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Customers;
import models.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {

	List findByCustomer(Customers customer);
    // Define custom query methods if needed

	
}

