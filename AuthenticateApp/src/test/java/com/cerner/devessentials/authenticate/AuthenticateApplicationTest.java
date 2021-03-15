package com.cerner.devessentials.authenticate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class AuthenticateApplicationTest {
	@Test
	public void authenticateTest() {
		IAuthenticator authenticatorMock;
		AuthenticateApplication authenticator;
		String username = "Shubhra";
		String password = "S12345";
		authenticatorMock = mock(IAuthenticator.class);
		authenticator = new AuthenticateApplication(authenticatorMock);
		// setting up the expectations
		
		when(authenticatorMock.authenticateUser(username, password)).thenReturn(false);
		boolean actual = authenticator.authenticate(username, password);
		assertFalse(actual);
		
		verify(authenticatorMock).authenticateUser(username, password);

		
	}
}
