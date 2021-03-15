package com.cerner.devessentials.authenticate;



public interface IAuthenticator {
	/**
	 * User authentication method definition.
	 *
	 * @param username 
	 * 		The user name to authenticate.
	 * @param password 
	 * 		The password to authenticate the user.
	 * @return True 
	 * 		if the user has been authenticated; false if it has not.
	 * @throw EmptyCredentialsException
	 * 
	 *  		If the received credentials (username,password)are empty.
	 */
	public boolean authenticateUser(String username, String password);

}
