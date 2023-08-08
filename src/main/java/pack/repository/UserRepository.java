package pack.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import pack.model.User;

public interface UserRepository extends CrudRepository<User,Integer>{
	User findByName(String name);
}
