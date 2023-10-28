package Service;

import org.apache.el.stream.Optional;
import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Repository.LoanRepository;
import models.Customers;
import models.Loan;

@Service
public class LoanServiceImplementation implements ILoanService {

    private final LoanRepository loanRepository;

    @Autowired
    public LoanServiceImplementation(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public List getCustomerLoans(Customers customer) {
       
        return loanRepository.findByCustomer(customer);
    }

   

    public String checkLoanStatus(Long loanId) {
        // Retrieve and return the status of a specific loan
        Optional<Loan> loan = loanRepository.findById(loanId);
        if (loan.isPresent()) {
            return loan.get().getStatus();
        } else {
            return "Loan not found";
        }
    }
}

