package com.atme.wallet.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.atme.wallet.entity.UserWallet;

public interface WalletDao extends JpaRepository<UserWallet, Integer> {

}
