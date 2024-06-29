package com.atme.wallet.service;

import java.util.List;

import com.atme.wallet.entity.LoginDTO;
import com.atme.wallet.entity.UserWallet;
import com.atme.wallet.exception.UserLoginException;

public interface WalletService {

	public UserWallet registerNewWallet(UserWallet userWallet);
	public Double addFundsToWallet(Integer walletId, Double amount);
	public Double withdrawFundsFromWallet(Integer walletId, Double amount);
	public UserWallet getUserWalletById(Integer walletID);
	public List<UserWallet> getAllUserWallets();
	public Boolean userLogin(LoginDTO loginDTO) throws UserLoginException;
	public Boolean transferFunds(String fromEmailID, String toEmailID, Double amount)throws UserLoginException;
	
}
