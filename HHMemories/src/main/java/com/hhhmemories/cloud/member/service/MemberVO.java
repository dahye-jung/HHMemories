package com.hhhmemories.cloud.member.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MemberVO {
	
	//회원 일련번호
	private int memberSeq;
	
	//회원 아이디
	private String memberId;
	
	//회원 비밀번호
	private String memberPw;

	//회원명
	private String memberNm;

	//회원 이메일
	private String memberEmail;

	//생년월일
	private String memberBirth;
	
	//성별
	private String memberGender;
	
	//휴대전화번호
	private String phoneNumber;
	
	//마지막 로그인 일자
	private String loginLastDt;
	
	//비밀번호 변경 일자
	private String pwChgDt;
	
	//잠금여부
	private String lockAt;
	
	//잠금횟수
	private String lockCnt;
	
	//잠금 최종 시점
	private String lockLastDt;

	//임시비밀번호 여부
	private String npwYn;
	
	//권한
	private String verify;

	//우편번호
	private String zipCode;
	
	//주소
	private String address;
	
	//상세주소
	private String addressDetail;
	
	//등록일자
	private String regDt;

	//수정일자
	private String updDt;
	
	//사용여부
	private String useYn;

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

	public String getLoginLastDt() {
		return loginLastDt;
	}

	public void setLoginLastDt(String loginLastDt) {
		this.loginLastDt = loginLastDt;
	}

	public String getPwChgDt() {
		return pwChgDt;
	}

	public void setPwChgDt(String pwChgDt) {
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

	public String getLockLastDt() {
		return lockLastDt;
	}

	public void setLockLastDt(String lockLastDt) {
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

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
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

	public String getRegDt() {
		return regDt;
	}

	public void setRegDt(String regDt) {
		this.regDt = regDt;
	}

	public String getUpdDt() {
		return updDt;
	}

	public void setUpdDt(String updDt) {
		this.updDt = updDt;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}
	
	
}
