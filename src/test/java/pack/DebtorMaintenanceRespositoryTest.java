package pack;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import pack.model.Bank;
import pack.model.Debtor;
import pack.repository.BankRepository;
import pack.repository.DebtorRepository;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DebtorMaintenanceRespositoryTest {
    @Autowired
    DebtorRepository debtorRepository;
    
    @Autowired
    BankRepository bankRepository;
    
    static Debtor dbt;
    static Bank b;
	
	static int id;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		            //(name,address1,address2,faxno,phno,email);	
	 dbt=new Debtor("roy","elm street","near police station","49293","923823882","roy123@gmail.com");
	           //(bank name,branch, address,accno,curr)
	 b=new Bank("axis","new york","near cafe","10393929","USD");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	 @Test
	 public void DebtorDetailsTest()
		{
		
			 debtorRepository.save(dbt);
			 System.out.println(dbt.getId());
			 id=dbt.getId();
			 Debtor debtor= debtorRepository.findById(id);
			 System.out.println(debtor.getName());
		     Assertions.assertEquals("roy", debtor.getName());
		     System.out.println(debtor.getFaxno());
		     Assertions.assertEquals("49293", debtor.getFaxno());
		}
	 @Test
	 public void BankDetailsTest()
		{
		     b.setId(id);
			 bankRepository.save(b);
			 Bank bank=bankRepository.findById(id);
			 System.out.println(bank.getName());
		     Assertions.assertEquals("axis", bank.getName());
		     System.out.println(bank.getAccno());
		     Assertions.assertEquals("10393929", bank.getAccno());
			
		}
	 
	 @Test
	 public void DebtorIncorrect()
		{
		
			 debtorRepository.save(dbt);
			 System.out.println(dbt.getId());
			 id=dbt.getId();
			 Debtor debtor= debtorRepository.findById(id);
			 System.out.println(debtor.getName());
		     Assertions.assertEquals("fake", debtor.getName());
		     System.out.println(debtor.getFaxno());
		     Assertions.assertEquals("4999", debtor.getFaxno());
		}
}
