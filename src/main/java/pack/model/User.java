package pack.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "user2")
public class User
{
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id")
int id;	

@Column(name = "name")
String name;

@Column(name = "email")
String email;

@Column(name = "password")
String password;

@Column(name="user_type")
String utype;

@Column(name = "roles")
String roles;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getRoles() {
	return roles;
}

public void setRoles(String roles) {
	this.roles = roles;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getUtype() {
	return utype;
}

public void setUtype(String utype) {
	this.utype = utype;
}
}
