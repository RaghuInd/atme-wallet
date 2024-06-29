package com.atme.wallet.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.atme.wallet.entity.UserWallet;

public interface WalletDao extends JpaRepository<UserWallet, Integer> {
	//@Query("SLECT wallet from UserWallet wallet Where wallet.email=email")
	public UserWallet findByEmail(String email);
}
