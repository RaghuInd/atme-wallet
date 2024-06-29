package com.atme.wallet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atme.wallet.entity.FundTransferDTO;
import com.atme.wallet.entity.LoginDTO;
import com.atme.wallet.entity.UserWallet;
import com.atme.wallet.exception.UserLoginException;
import com.atme.wallet.service.WalletService;

@RestController
public class WalletController {

	@Autowired
	private WalletService walletService;
	
	@GetMapping("/") // handler method
	public String greeting() {
		return "Welcome to my spring boot !";
	}

	@PostMapping("/")
	public String addData() {
		return "Post method";
	}

	@PutMapping("/")
	public String updateData() {
		return "update methd";
	}

	@DeleteMapping("/")
	public String deleteData() {
		return "delete methd";
	}

	@PostMapping("/wallet")
	public UserWallet registerNewUser(@RequestBody UserWallet userWallet) {
		return this.walletService.registerNewWallet(userWallet);
	}
	@PostMapping("wallet/login")
	public Boolean loginUser(@RequestBody LoginDTO loginDTO) throws UserLoginException {
		
		return this.walletService.userLogin(loginDTO);
		
	}
	
	@PatchMapping("/wallet/amount")
	public Boolean transferFunds(@RequestBody FundTransferDTO fundTransferDTO) throws UserLoginException {
		
		return this.walletService.transferFunds(fundTransferDTO.getFromEmailId(),fundTransferDTO.getToEmailId(), 
						fundTransferDTO.getAmount());
	}
	

}
