package com.atme.wallet.service;

import java.util.List;

import com.atme.wallet.entity.UserWallet;

public interface WalletService {

	public UserWallet registerNewWallet(UserWallet userWallet);
	public Double addFundsToWallet(Integer walletId, Double amount);
	public Double withdrawFundsFromWallet(Integer walletId, Double amount);
	public UserWallet getUserWalletById(Integer walletID);
	public Boolean transferFunds(Integer fromWalletID, Integer toWalletID, Double amount);
	public List<UserWallet> getAllUserWallets();
}
