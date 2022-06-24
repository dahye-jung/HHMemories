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
    <title>회원가입 완료</title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="css/common.css" rel="stylesheet" />
    <script type="text/javascript" src="js/commonui.js"></script>
</head>
<body>

<!-- 회원가입 완료 S -->
<div id="signUpComplete" class="cmm-alert" data-layout="layer" data-page-id="signUpComplete" aria-hidden="false">
    <div class="inner">
        <div class="header">
            <div class="login-logo">
                <img src="img/loginLogo02.png">
                <span class="txt-17"><strong>홍길동님</strong> 환영합니다<br>회원가입이 완료되었습니다.</span>
            </div>
        </div>
        <div class="content">
            <div class="box-form">
                <div class="cmm-form">
                    <div class="input">
                        <span class="input-title">아이디</span><span class="input-txt">abcdefu123</span>
                    </div>
                </div>
                <div class="cmm-form">
                    <div class="input">
                        <span class="input-title">이메일</span><span class="input-txt">abcdefu123</span>
                    </div>
                </div>
            </div>
            <div class="btn-box m-t100">
                <a href="/login" class="btn-puple full"><span>로그인</span></a>
            </div>
        </div>
    </div>
    <button type="button" class="btn-dim" data-layer-close="true"><span>닫기</span></button>
</div>
<!-- 회원가입 완료 E -->
</body>
</html>