package model;

public class LoginDetail
{
	String uname,passwd;
		
		public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
		public boolean isValidLogin()
		{
		if(uname.equals("NIIT")&&passwd.equals("12345"))
		{
			return true;
		}
			else
			{
	          return false;
			
		}
		}
		
		public String getUname(){
			return uname;
		}
		public void setUname(String uname){
			this.uname=uname;
		}
		

}
