package sprint1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	 //@GeneratedValue(strategy=GenerationType.AUTO)
	private
		//Integer id;
	 @Id
		String username="";
		String email="";
		String password="";
		String type="";
		public User() {}
		public User(String username, String email, String password, String type) {
			super();
			this.username = username;
			this.email = email;
			this.password = password;
			this.type = type;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
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
		public String getType() {
			return type;
		}
		public void setType(String type) {
			this.type = type;
		}

	
		
		
		
}
