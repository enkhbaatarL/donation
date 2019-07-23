package com.sk.donation.donate.domain.service;

import java.util.List;

import com.sk.donation.donate.domain.model.Donate;

public interface DonateService {
	
	List<Donate> findAll();
	
	Donate findByDonateSeq(int donateSeq);
	
	/*
	Page<Donate> findAll(Pageable pageable);
	
	List<Donate> findByNameLike(String name);
	Donate findByEmail(String email);
	
	Donate register(Donate account);
	Donate update(Long id, Donate account);

	void delete(Long id);
	*/
}
