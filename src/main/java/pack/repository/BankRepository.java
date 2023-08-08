package pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pack.model.Bank;

@Repository
public interface BankRepository extends   JpaRepository<Bank,Integer> {
	public Bank findById(int id);
}
