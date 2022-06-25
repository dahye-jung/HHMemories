<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
    <title>임시 비밀번호 발송</title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="css/common.css" rel="stylesheet" />
</head>
<body>
	<div id="view-wrap" data-layout="login" data-page-id="findPwConfirm" aria-hidden="false">
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
	                    <span class="sub-tit-16">비밀번호찾기</span>
	                </div>
	                <div class="center-box">
	                    <p class="txt-17"><strong>${memberNm }</strong>&nbsp;회원님의 임시비밀번호를</p>
	                    <p class="txt-17"><strong class="txt-B">${memberEmail }</strong>으로 발송되었습니다</p>
	                </div>
	                <div class="box-form">
	                    <div class="btn-box flex">
	                        <a href="#" class="btn-puple"><span>로그인</span></a>
	                        <a href="#" class="btn-puple"><span>취소</span></a>
	                    </div>
	                </div>
	            </div>
	        </div>
	        <!-- Bootstrap core JS -->
	        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
	        <!-- Core theme JS-->
	        <script src="js/scripts.js"></script>
	    </div>
	</div>
</body>
</html>