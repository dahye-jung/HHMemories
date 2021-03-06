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
    <title>아이디 찾기 정보 입력 </title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="css/common.css" rel="stylesheet" />
</head>
<body>

<div id="view-wrap" data-layout="login" data-page-id="findIdForm" aria-hidden="false">
    <div id="content">
     <form action="/findId" method="POST"> 
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
                <div class="box-form">
                    <div class="cmm-form">
                        <div class="input">
                            <input type="text" title="이름" maxlength="10" id = "memberNm" name="memberNm" placeholder="이름" oninput="this.value = this.value.replace(/[^a-zA-Zㄱ-힣]+/g, '').replace(/(\..*)\./g);">
                            <!-- <button class="btn-icon delete"><span>입력값 지우기</span></button> -->
                        </div>
                    </div>
                    <div class="cmm-form">
                        <div class="input">
                            <input type="text" title="이메일" id="memberEmail" name = "memberEmail" placeholder="이메일">
                            <!-- <button class="btn-icon delete"><span>입력값 지우기</span></button> -->
                        </div>
                    </div>
                    <div class="btn-box flex m-t100">
                        <button type="submit" class="btn-puple" id="findIdConfirm" name = "findIdConfirm"><span>확인</span></button>
                        <button type="button" id = "cencle" name = "cencle" class="btn-puple"><span>취소</span></button>
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
        <script type="text/javascript" lang="javascript">
	    	$(document).ready(function(){
	    		// 취소
	    		$("#cencle").on("click", function(){
	    			location.href = "/login";
	    		})
	    		
				$("#findIdConfirm").on("click", function(){
					
					var regEmail = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/;
	    			
	    			if($("#memberNm").val()==""){
	    				alert("이름을 입력해주세요.");
	    				$("#memberNm").focus();
	    				return false;
	    			}
	    			
	    			if($("#memberEmail").val()==""){
	    				alert("이메일을 입력해주세요.");
	    				$("#memberEmail").focus();
	    				return false;
	    			}else if(!regEmail.test($("#memberEmail").val())){
                        alert("이메일 형식이 올바르지 않습니다. 다시 입력해주세요.");
                        $("#memberEmail").focus();
                        return false;
                    }
	    			
	    		});
	    	})
		</script>
    </div>
</div>
</body>
</html>