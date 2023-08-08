package pack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pack.model.Debtor;

@Repository
public interface DebtorRepository extends   JpaRepository<Debtor,Integer> {
	public Debtor findById(int id);
}
