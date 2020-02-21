package com.app.beyondmeat.service.repository;

import org.springframework.data.repository.CrudRepository;

import com.app.beyondmeat.model.ConfirmationToken;

public interface ConfirmationTokenRepository extends CrudRepository<ConfirmationToken, String> {
	ConfirmationToken findByConfirmationToken(String confirmationToken);
}
