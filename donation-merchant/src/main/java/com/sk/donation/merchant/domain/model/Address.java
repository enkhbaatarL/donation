package com.sk.donation.merchant.domain.model;

import javax.persistence.Embeddable;

import com.sk.donation.merchant.base.ValueObject;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Embeddable
public class Address implements ValueObject {
	private Integer zipCode;
	private String homeAddress;
	
	public Address() {
	}
	
	public Address(Integer zipCode, String homeAddress) {
		this.zipCode = zipCode;
		this.homeAddress = homeAddress;
	}
}
