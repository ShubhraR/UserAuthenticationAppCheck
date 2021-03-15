package com.cerner.devessentials.authenticate;

public class AuthenticateApplication {
	IAuthenticator authenticator;
	/**
	* AuthenticatorApplication constructor.
	*
	* @param authenticator Authenticator interface implementation.
	*/
	
	public  AuthenticateApplication(IAuthenticator authenticator)
	{
		this.authenticator = authenticator;
	}
	/**
	* Tries to authenticate an user with the received user name and password, with the received
	* AuthenticatorInterface interface implementation in the constructor.
	*
	* @param name 
	* 		The user name to authenticate.
	* @param pwd 
	* 		The password to authenticate the user.
	* @return True 
	* 		if the user has been authenticated; false if it has not.
	*/

	public boolean authenticate(String name,String pwd)
	{
		boolean authenticateStatus;
		authenticateStatus = this.authenticator.authenticateUser(name, pwd);
		return authenticateStatus;
	}

}
