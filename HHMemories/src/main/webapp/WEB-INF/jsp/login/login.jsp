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
    <title>회원 로그인</title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="css/common.css" rel="stylesheet" />
</head>
<body>

<div id="view-wrap" data-layout="login" data-page-id="login" aria-hidden="false">
    <div id="content">
			<form action="/login" method="POST">
				<input type="hidden" name="${_csrf.parameterName }"
					value="${_csrf.token}" />
				<div class="main-box">
					<div class="box-form left">
						<div class="box-logo">
							<img src="img/loginLogo01.png" alt="로고이미지" class="logo"></img>
						</div>
					</div>

					<div class="box-form right">
						<div class="login-logo">
							<img src="img/loginLogo02.png"> <span class="sub-tit-16">HHmemories에
								오신걸 환영합니다.</span>
						</div>

						<div class="box-form">
							<div class="cmm-form">
								<div class="input">
									<input type="text" id="memberId" name="memberId" title="아이디"
										placeholder="아이디">
									<!-- <button class="btn-icon delete"><span>입력값 지우기</span></button> -->
								</div>
							</div>
							<div class="cmm-form">
								<div class="input">
									<input type="password" id="memberPw" name="memberPw"
										title="비밀번호" placeholder="비밀번호">
									<!-- <button class="btn-icon delete"><span>입력값 지우기</span></button> -->
								</div>
							</div>
							<div class="btn-box">
								<a href="/findId" class="txt-btn"><span>아이디찾기</span></a> <a
									href="/findPwd" class="txt-btn"><span>비밀번호찾기</span></a> <a
									href="/signup" class="txt-btn"><span>회원가입</span></a>
							</div>
							<div class="btn-box flex m-t70">
								<button type="submit" class="btn-puple" id = "loginBtn" name = "loginBtn">
									<span>로그인</span>
								</button>
							</div>
						</div>
					</div>
				</div>
			</form>
		<!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
        <!-- jQuery에서 제공하는 3.5.1 버전의 jQuery CDN 호스트 --> 
		<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script type="text/javascript">
	        $(document).ready(function(){
	    		$("#loginBtn").on("click", function(){
	    			
	    			if($("#memberId").val()==""){
	    				alert("아이디를 입력해주세요.");
	    				$("#memberId").focus();
	    				return false;
	    			}
	    			
	    			if($("#memberPw").val()==""){
	    				alert("비밀번호를 입력해주세요.");
	    				$("#memberPw").focus();
	    				return false;
	    			}
	    			
	    		});
	    	})
        </script>
    </div>
</div>
</body>
</html>