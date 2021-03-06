package com.cha.product.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cha.product.model.Transaction;
import com.cha.product.repository.TransactionRepository;

@Service
@Transactional
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	private TransactionRepository transactionRepository;
	
	@Override
	public Transaction saveTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}
	
	@Override
	public Transaction updateTransaction(Transaction transaction) {
		return transactionRepository.save(transaction);
	}
	
	@Override
	public List<Transaction> findAllTransaction(){
		return transactionRepository.findAll();
	}
	
	@Override
	public Long nbOfTransactions() {
		return transactionRepository.count();
	}

}
