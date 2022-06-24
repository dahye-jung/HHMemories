<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>회원가입 정보 입력</title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="css/common.css" rel="stylesheet" />
</head>
<body>

<div id="view-wrap" data-layout="page" data-page-id="signUpForm" aria-hidden="false">
    <div id="content">
       <form action="/signup" method="POST"> 
        <div class="main-box">
           <div class="box-logo">
               <img src="img/loginLogo02.png" alt="로고이미지" class="logo"></img>
            </div>
            <div class="cmm-form">
                <div class="input">
                    <span class="label">이름<i class="required" aria-label="필수입력항목"></i></span>
                    <input type="text" title="이름" placeholder="이름" id= "memberNm" name = "memberNm">
                </div>
            </div>
            <div class="cmm-form">
                <div class="input">
                    <span class="label">아이디<i class="required" aria-label="필수입력항목"></i></span>
                    <input type="text" title="아이디" placeholder="아이디" id = "memberId" name = "memberId">
                    <button type="button" class="btn-puple-white"><span>중복확인</span></button>
                </div>
            </div>
            <div class="cmm-form">
                <div class="input">
                    <span class="label">비밀번호<i class="required" aria-label="필수입력항목"></i></span>
                    <input type="password" title="비밀번호" placeholder="비밀번호" id = "memberPw" name = "memberPw">
                </div>
            </div>
            <div class="cmm-form">
                <div class="input">
                    <span class="label">비밀번호 확인<i class="required" aria-label="필수입력항목"></i></span>
                    <input type="password" title="비밀번호 확인" placeholder="비밀번호 확인" id="memberPw2" name = "memberPw2">
                </div>
            </div>
            <div class="cmm-form">
                <div class="input">
                    <span class="label">휴대전화번호<i class="required" aria-label="필수입력항목"></i></span>
                    <input type="text" title="휴대전화번호" placeholder="휴대전화번호" id = "phoneNumber" name = "phoneNumber">
                    <!-- <button class="btn-puple-white"><span>중복확인</span></button> -->
                </div>
            </div>
            <div class="cmm-form">
                <div class="input">
                    <span class="label">생년월일<i class="required" aria-label="필수입력항목"></i></span>
                    <input type="text" title="생년월일" placeholder="생년월일" id = "memberBirth" name="memberBirth">
                    <div class="btn-puple-white" id = "memberGender" >
                        <label class="radio" >
                            <input type="radio" id = "memberGender" name="memberGender" value = "M" checked>
                            <span class="label">남</span>
                        </label>
                        <label class="radio">
                            <input type="radio" id = "memberGender" name="memberGender" name="radio01" value="W">
                            <span class="label">여</span>
                        </label>
                    </div>
                </div>
            </div>
            <div class="cmm-form">
                <div class="input">
                    <span class="label">이메일<i class="required" aria-label="필수입력항목"></i></span>
                    <input type="text" title="이메일" placeholder="이메일" name="memberEmail" id = "memberEmail">
                    <button type="button" class="btn-puple-white"><span>중복확인</span></button>
                </div>
            </div>
            <!-- <div class="cmm-form">
                <div class="input">
                    <span class="label">인증번호<i class="required" aria-label="필수입력항목"></i></span>
                    <input type="text" title="인증번호" placeholder="인증번호">
                    <button class="btn-puple-white"><span>확인</span></button>
                </div>
            </div> -->
            <div class="cmm-form">
                <div class="input">
                    <span class="label">우편번호<i class="required" aria-label="필수입력항목"></i></span>
                    <input type="text" title="우편번호" placeholder="우편번호" id = "zipCode" name = "zipCode">
                	<button type="button" class="btn-puple-white"><span>주소 검색</span></button>
                </div>
            </div>
            <div class="cmm-form">
                <div class="input">
                    <span class="label">주소</span>
                    <input type="text" title="주소" placeholder="주소" id = "address" name="address">
                </div>
            </div>
            <div class="cmm-form">
                <div class="input">
                    <span class="label">상세주소</span>
                    <input type="text" title="상세주소" placeholder="상세주소" id= "addressDetail" name="addressDetail">
                </div>
            </div>
            <div class="btn-box flex m-t40">
                <button type="submit" class="btn-puple" id = "signUpComplete" name="signUpComplete"><span>확인</span></button>
                <button type="button" class="btn-puple" onclick="location.href='/login'"><span>취소</span></button>
            </div>
        </div>
        </form>
         <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </div>
</div>
</body>
</html>
