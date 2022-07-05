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
    <title>회원가입</title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="css/common.css" rel="stylesheet" />
</head>
<body>

<div id="view-wrap" data-layout="page" data-page-id="signUpForm" aria-hidden="false">
    <div id="content">
       <form action="/signup" method="POST" id = "signupForm" name= "signupForm"> 
        <div class="main-box">
           <div class="login-logo">
                <img src="img/loginLogo03.png">
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
                    <button type="button" onclick = "idCheck()" class="btn-puple-white"><span>중복확인</span></button>
                </div>
            </div>
            <div class="cmm-form">
                <div class="input">
                    <span class="label">비밀번호<i class="required" aria-label="필수입력항목"></i></span>
                    <input type="password" title="비밀번호" placeholder="비밀번호" id = "memberPw" name = "memberPw">
                    <div class="check_font" id="pw_check"></div>
                </div>
            </div>
            <div class="cmm-form">
                <div class="input">
                    <span class="label">비밀번호 확인<i class="required" aria-label="필수입력항목"></i></span>
                    <input type="password" title="비밀번호 확인" placeholder="비밀번호 확인" id="memberPwChk" name = "memberPwChk">
                    <div class="check_font" id="pw_check"></div>
                </div>
            </div>
            <div class="cmm-form">
                <div class="input">
                    <span class="label">휴대전화번호<i class="required" aria-label="필수입력항목"></i></span>
                    <input type="text" title="휴대전화번호" placeholder="휴대전화번호" id = "phoneNumber" name = "phoneNumber">
                </div>
            </div>
            <div class="cmm-form">
                <div class="select flex" title="Title">
                    <span class="label">생년월일<i class="required" aria-label="필수입력항목"></i></span>
                    <div class="flex">
                        <select title="Label" id = "year" name="year" >
                        </select>
                        <select title="Label" id = "month" name="month">
                        </select>
                        <select title="Label" id = "day" name="day">
                        </select>
                    </div>
                </div>
            </div>
            <div class="cmm-form">
                <div class="input">
                    <span class="label">이메일<i class="required" aria-label="필수입력항목"></i></span>
                    <input type="text" title="이메일" placeholder="이메일" name="memberEmail" id = "memberEmail">
                    <button type="button" class="btn-puple-white" onclick="emailCheck()"><span>인증번호 받기</span></button>
                </div>
            </div>
            <div class="cmm-form">
                <div class="input" id = "checkEmailBox">
                    <span class="label">인증번호<i class="required" aria-label="필수입력항목"></i></span>
                    <input type="text" title="인증번호" placeholder="인증번호" id = "emailNumber" name = "emailNumber" disabled="disabled" style="background-color:#FFFFFF;">
                </div>
                	<div class= "clearfix"></div>
                	<span id = "mail_check_input_box_warn"></span>
            </div>
            <div class="cmm-form">
                <div class="input">
                    <span class="label">우편번호<i class="required" aria-label="필수입력항목"></i></span>
                    <input type="text" title="우편번호" placeholder="우편번호" id = "zipCode" name = "zipCode" readonly="readonly">
                	<button type="button" onclick = "addressFind()" class="btn-puple-white"><span>우편번호 찾기</span></button>
                </div>
            </div>
            <div class="cmm-form">
                <div class="input">
                    <span class="label">주소<i class="required" aria-label="필수입력항목"></i></span>
                    <input type="text" title="주소" placeholder="주소" id = "address" name="address" readonly="readonly">
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
                <button type="button" class="btn-puple" id = "cencle" name = "cencle"><span>취소</span></button>
            </div>
        </div>
        </form>
         <!-- Bootstrap core JS-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
        <!-- Core theme JS-->
        <script src="js/scripts.js"></script>
        <!-- 우편번호 찾기 -->
		<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
		<!-- jQuery에서 제공하는 3.5.1 버전의 jQuery CDN 호스트 --> 
		<script src="http://code.jquery.com/jquery-3.5.1.min.js"></script>
    	<script type="text/javascript" lang="javascript">
    	
    		var code = "";
    	
	    	$(document).ready(function(){
	    		
	    		setDateBox();
	    		
	    		// 취소
	    		$("#cencle").on("click", function(){
	    			location.href = "/login";
	    		})
	    		
	    		$("#signUpComplete").on("click", function(){
	    			
	    			if($("#memberNm").val()==""){
	    				alert("성명을 입력해주세요.");
	    				$("#memberNm").focus();
	    				return false;
	    			}
	    			if($("#memberId").val()==""){
	    				alert("아이디를 입력해주세요.");
	    				$("#memberId").focus();
	    				return false;
	    			}
	    			
	    			/* var idChkVal = $("#idCheck").val();
	    			if(idChkVal == "N"){
	    				alert("중복확인 버튼을 눌러주세요.");
	    			}else if(idChkVal == "Y"){
	    				$("#signupForm").submit();
	    			} */
	    			
	    			if($("#memberPw").val()==""){
	    				alert("비밀번호를 입력해주세요.");
	    				$("#memberPw").focus();
	    				return false;
	    			}
	    			if($("#phoneNumber").val()==""){
	    				alert("휴대전화를 입력해주세요.");
	    				$("#phoneNumber").focus();
	    				return false;
	    			}
	    			if($("#memberBirth").val()==""){
	    				alert("생년월일을 선택해주세요.");
	    				$("#memberBirth").focus();
	    				return false;
	    			}
	    			if($("#memberEmail").val()==""){
	    				alert("이메일을 입력해주세요.");
	    				$("#memberEmail").focus();
	    				return false;
	    			}
	    			if($("#emailNumber").val()==""){
	    				alert("인증번호를 입력해주세요.");
	    				$("#emailNumber").focus();
	    				return false;
	    			}
	    			if($("#zipCode").val()==""){
	    				alert("우편번호를 입력해주세요.");
	    				addressFind();
	    				return false;
	    			}
	    			if($("#address").val()==""){
	    				alert("주소를 입력해주세요.");
	    				addressFind();
	    				return false;
	    			}
	    		});
	    	})
	
	    	function setDateBox() {
			    
	    		var dt = new Date();
			    var year = "";
			    var com_year = dt.getFullYear();
			
			    // 발행 뿌려주기
			    $("#year").append("<option value=''>년도</option>");
			
			    // 올해 기준으로 -100년부터 +100년을 보여준다.
			    for (var y = (com_year - 100); y <= (com_year + 100); y++) {
			      $("#year").append("<option value='" + y + "'>" + y + " 년" + "</option>");
			    }
			
			    // 월 뿌려주기(1월부터 12월)
			    var month;
			    $("#month").append("<option value=''>월</option>");
			    for (var i = 1; i <= 12; i++) {
			      $("#month").append("<option value='" + i + "'>" + i + " 월" + "</option>");
			    }
			
			    // 일 뿌려주기(1일부터 31일)
			    var day;
			    $("#day").append("<option value=''>일</option>");
			    for (var i = 1; i <= 31; i++) {
			      $("#day").append("<option value='" + i + "'>" + i + " 일" + "</option>");
			    }
			
			}
	    	
	    	//아이디 중복 체크
	    	function idCheck() {
	    		var mem = {
	    				memberId : $('#memberId').val()
	    		}
	
	    		if (mem.memberId.length != "") {
	    			$.ajax({
	    				url : "/idCheck",
	    				type : "POST",
	    				data : mem,
	    				success : function(result) {
	    					if (result == 1) {
	    						alert("사용 불가능한 아이디입니다.");
	    					} else if(result == 0){
	    						/* $("#idCheck").attr("value","Y") */
	    						alert("사용 가능한 아이디입니다.");
	    					}
	    				}
	    			}); // ajax 끝
	    		} else {
	    			alert("아이디를 입력해주세요.");
	    			signupForm.memberId.focus();
	    		}
	    	}; // 아이디 체크 끝
	    	
	    	//이메일 중복 체크
	    	function emailCheck() {
	    		var email = {
	    				memberEmail : $('#memberEmail').val()
	    		}
	    		var checkEmail = $('#emailNumber');
	    		var checkBox = $('#checkEmailBox');
	
	    		if (email.memberEmail.length != "") {
	    			$.ajax({
	    				url : "/emailCheck",
	    				type : "GET",
	    				data : email,
	    				success : function(data) {
	    					alert("인증번호를 발송하였습니다.");
	    					checkEmail.attr("disabled",false);
	    					checkBox.attr("id", "mail_check_input_box_true");
	    					code = data;
	    				}
	    			}); // ajax 끝
	    		} else {
	    			alert("이메일을 입력해주세요.");
	    			signupForm.memberEmail.focus();
	    		}
	    	}; // 이메일 체크 끝
    		
	    	/* 인증번호 비교 */
	    	$("#emailNumber").blur(function(){
	    	    
	    		 var inputCode = $("#emailNumber").val();        // 입력코드    
	    		 var checkResult = $("#mail_check_input_box_warn");    // 비교 결과   
	    		 
	    		 if(inputCode == code){                            // 일치할 경우
	    		        checkResult.html("인증번호가 일치합니다.");
	    		        checkResult.css('color', 'blue');
	    		        /* checkResult.attr("class", "correct");   */      
	    		    } else {                                            // 일치하지 않을 경우
	    		        checkResult.html("인증번호를 다시 확인해주세요.");
	    		        checkResult.css('color', 'red');    
	    		    /* checkResult.attr("class", "incorrect"); */
	    		    }    
	    	});	
	    	
	    	
	    	// 우편번호찾기
			function addressFind() {
			       new daum.Postcode({
			           oncomplete: function(data) {
			               // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.
			
			               // 각 주소의 노출 규칙에 따라 주소를 조합한다.
			               // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
			               var addr = ''; // 주소 변수
			               var extraAddr = ''; // 참고항목 변수
			
			               //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
			               if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
			                   addr = data.roadAddress;
			               } else { // 사용자가 지번 주소를 선택했을 경우(J)
			                   addr = data.jibunAddress;
			               }
			
			               // 우편번호와 주소 정보를 해당 필드에 넣는다.
			               document.getElementById('zipCode').value = data.zonecode;
			               document.getElementById("address").value = addr;
			               // 커서를 상세주소 필드로 이동한다.
			               document.getElementById("addressDetail").focus();
			           }
			       }).open();
			}
		</script>
    </div>
</div>
</body>
</html>
