package pack.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import pack.model.User;
import pack.repository.UserRepository;

@Service
public class UserService implements UserDetailsService
{
   
	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = userRepository.findByName(username);
		if(user==null)
			throw new UsernameNotFoundException("User Not Found");
		
		return new UserImplementation(user);
	}

}
