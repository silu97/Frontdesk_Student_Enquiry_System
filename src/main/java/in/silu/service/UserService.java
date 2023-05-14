package in.silu.service;

import in.silu.binding.LoginForm;
import in.silu.binding.SignUpForm;
import in.silu.binding.UnlockForm;



public interface UserService {
	
	public String login(LoginForm form); 
	
	public boolean signup(SignUpForm form);
	
	public boolean unlockAccount(UnlockForm form);
	
	public boolean forgotPwd(String email);
	
	

}
