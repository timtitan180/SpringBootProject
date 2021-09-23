package perscholas;

public class Users {
		private String FullName;
		private String Email;
		private String Password;

		public void setFullName(String FullName) {
			this.FullName = FullName;
		}

		public String getFullName() {
			return FullName;
		}

		public void setPassword(String Password) {
			this.Password = Password;
		}

		public String getPassword() {
			return Password;
		}

		public void setEmail(String Email) {
			this.Email = Email;
		}

		public String getEmail() {
			return Email;
		}
		
		@Override
		public String toString() {
			return "User [" + this.getFullName() + "" + this.getEmail() + "" + this.getPassword() + "]";
		}

	}

