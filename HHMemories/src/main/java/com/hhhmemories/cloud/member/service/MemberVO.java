package com.hhhmemories.cloud.member.service;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class MemberVO {
	
	private int memberSeq;
	
	private String memberId;
	
	private String memberPw;

	private String memberNm;

	private String memberEmail;

	private String memberBirth;
	
	private String memberGender;
	
	private String phoneNumber;
	
	private Date loginLastDt;
	
	private Date pwChgDt;
	
	private String lockAt;
	
	private String lockCnt;
	
	private Date lockLastDt;

	private String npwYn;
	
	private String verify;

	private String zipcode;
	
	private String address;
	
	private String addressDetail;
	
	private Date regDt;

	private Date updDt;

	public int getMemberSeq() {
		return memberSeq;
	}

	public void setMemberSeq(int memberSeq) {
		this.memberSeq = memberSeq;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPw() {
		return memberPw;
	}

	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}

	public String getMemberNm() {
		return memberNm;
	}

	public void setMemberNm(String memberNm) {
		this.memberNm = memberNm;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	public String getMemberBirth() {
		return memberBirth;
	}

	public void setMemberBirth(String memberBirth) {
		this.memberBirth = memberBirth;
	}

	public String getMemberGender() {
		return memberGender;
	}

	public void setMemberGender(String memberGender) {
		this.memberGender = memberGender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getLoginLastDt() {
		return loginLastDt;
	}

	public void setLoginLastDt(Date loginLastDt) {
		this.loginLastDt = loginLastDt;
	}

	public Date getPwChgDt() {
		return pwChgDt;
	}

	public void setPwChgDt(Date pwChgDt) {
		this.pwChgDt = pwChgDt;
	}

	public String getLockAt() {
		return lockAt;
	}

	public void setLockAt(String lockAt) {
		this.lockAt = lockAt;
	}

	public String getLockCnt() {
		return lockCnt;
	}

	public void setLockCnt(String lockCnt) {
		this.lockCnt = lockCnt;
	}

	public Date getLockLastDt() {
		return lockLastDt;
	}

	public void setLockLastDt(Date lockLastDt) {
		this.lockLastDt = lockLastDt;
	}

	public String getNpwYn() {
		return npwYn;
	}

	public void setNpwYn(String npwYn) {
		this.npwYn = npwYn;
	}

	public String getVerify() {
		return verify;
	}

	public void setVerify(String verify) {
		this.verify = verify;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressDetail() {
		return addressDetail;
	}

	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	public Date getRegDt() {
		return regDt;
	}

	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}

	public Date getUpdDt() {
		return updDt;
	}

	public void setUpdDt(Date updDt) {
		this.updDt = updDt;
	}
	
}
