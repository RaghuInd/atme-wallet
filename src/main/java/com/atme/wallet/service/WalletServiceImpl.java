package com.atme.wallet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atme.wallet.dao.WalletDao;
import com.atme.wallet.entity.LoginDTO;
import com.atme.wallet.entity.UserWallet;
import com.atme.wallet.exception.UserLoginException;

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
	public List<UserWallet> getAllUserWallets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean userLogin(LoginDTO loginDTO) throws UserLoginException {
		
		UserWallet foundUserWallet = this.walletDao.findByEmail(loginDTO.getEmail());
		
				if(foundUserWallet !=null)
				{
					if(foundUserWallet.getPassword().equals(loginDTO.getPassword()))
						return true;
					else
						throw new UserLoginException("User email / pssword does not match:");
						
				}
				else
					throw new UserLoginException("User email does not exists:"+loginDTO.getEmail());
				
	}

	@Override
	public Boolean transferFunds(String fromEmailID, String toEmailID, Double amount)throws UserLoginException {
		
		UserWallet fromUserWallet = this.walletDao.findByEmail(fromEmailID);
		// not found throw exception
		UserWallet toUserWallet = this.walletDao.findByEmail(toEmailID);
		// not found throw exception
		if(fromUserWallet.getBalace() >= amount) {
			Double fromCurrentBalance = fromUserWallet.getBalace();
			fromUserWallet.setBalace(fromCurrentBalance -amount);
			
			Double toCurrentBalance = toUserWallet.getBalace();
			toUserWallet.setBalace(toCurrentBalance+amount);
		}
		else
			throw new UserLoginException("Insuficent Balance");
		
		this.walletDao.save(fromUserWallet);
		this.walletDao.save(toUserWallet);
		return true;
	}

}
