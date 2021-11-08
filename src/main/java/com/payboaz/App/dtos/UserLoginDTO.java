package com.payboaz.App.dtos;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 
 * @author JULIA SOBRAL
 * @since 1.0
 *
 */
public class UserLoginDTO {

	private @NotBlank(message = "Inserir 'email' valido") @Email String email;
	private @NotBlank(message = "Inserir 'password' de 4 á 15 caracteres") @Size(min = 3, max = 15) String password;

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

}
