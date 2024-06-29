package com.atme.wallet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atme.wallet.dao.WalletDao;
import com.atme.wallet.entity.UserWallet;

@Service
public class WalletServiceImpl implements WalletService{

	@Autowired
	private WalletDao walletDao;
	
	
	@Override
	public UserWallet registerNewWallet(UserWallet userWallet) {
		
		return this.walletDao.save(userWallet);
	}

	@Override
	public Double addFundsToWallet(Integer walletId, Double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double withdrawFundsFromWallet(Integer walletId, Double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserWallet getUserWalletById(Integer walletID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean transferFunds(Integer fromWalletID, Integer toWalletID, Double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserWallet> getAllUserWallets() {
		// TODO Auto-generated method stub
		return null;
	}

}
