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
    <title>아이디 확인</title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="css/common.css" rel="stylesheet" />
</head>
<body>

<div id="view-wrap" data-layout="login" data-page-id="findIdConfirm" aria-hidden="false">
    <div id="content">
	        <div class="main-box">
	            <div class="box-form left">
	                <div class="box-logo">
	                    <img src="img/loginLogo01.png" alt="로고이미지" class="logo"></img>
	                </div>
	            </div>
	            <div class="box-form right">
	                <div class="login-logo">
	                    <img src="img/loginLogo02.png">
	                    <span class="sub-tit-16">아이디찾기</span>
	                </div>
	                <div class="center-box">
	                    <p class="txt-17"><strong>${memberVO.memberNm}</strong>&nbsp;회원님의 아이디는&nbsp;<span class="txt-B">${memberVO.memberId}</span>&nbsp;입니다.</p>
	                    <p class="txt-15 light">(가입날짜&nbsp;:&nbsp;<span>${memberVO.regDt}</span>)</p>
	                </div>
	                <div class="box-form">
	                    <div class="btn-box flex">
	                        <a href="/login" class="btn-puple"><span>로그인</span></a>
	                        <a href="/findPwd" class="btn-puple"><span>비밀번호찾기</span></a>
	                    </div>
	                </div>
	            </div>
	        </div>
        <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
    </div>
</div>
</body>
</html>