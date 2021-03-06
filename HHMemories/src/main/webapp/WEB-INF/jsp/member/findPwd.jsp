<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>비밀번호 찾기 정보 입력</title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="css/common.css" rel="stylesheet" />
    
    <script type="text/javascript">
    	function submit() {
    		$("#click").submit();
    	}
    
    </script>
</head>
<body>

<div id="view-wrap" data-layout="login" data-page-id="findPwForm" aria-hidden="false">
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
                <form action="/findPwd" method="post">
	                <div class="box-form">
	                    <div class="cmm-form">
	                        <div class="input">
	                            <input type="text" name="memberNm" title="이름" placeholder="이름">
	                            <!-- <button class="btn-icon delete"><span>입력값 지우기</span></button> -->
	                        </div>
	                    </div>
	                    <div class="cmm-form">
	                        <div class="input">
	                            <input type="text" name="memberId" title="아이디" placeholder="아이디">
	                            <!-- <button class="btn-icon delete"><span>입력값 지우기</span></button> -->
	                        </div>
	                    </div>
	                    <div class="cmm-form">
	                        <div class="input">
	                            <input type="text" name="memberEmail" title="이메일" placeholder="이메일">
	                            <!-- <button class="btn-icon delete"><span>입력값 지우기</span></button> -->
	                        </div>
	                    </div>
	                    <div class="btn-box flex m-t70">
	                    	<button type="submit" class="btn-puple" id="" name = ""><span>확인</span></button>
	                        <a href="/login" class="btn-puple"><span>취소</span></a>
	                    </div>
	                </div>
                </form>
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