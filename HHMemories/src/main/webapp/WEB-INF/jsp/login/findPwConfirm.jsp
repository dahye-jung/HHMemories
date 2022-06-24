<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
    <title>�ӽ� ��й�ȣ �߼�</title>
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
	                    <img src="img/loginLogo01.png" alt="�ΰ��̹���" class="logo"></img>
	                </div>
	            </div>
	            <div class="box-form right">
	                <div class="login-logo">
	                    <img src="img/loginLogo02.png">
	                    <span class="sub-tit-16">��й�ȣã��</span>
	                </div>
	                <div class="center-box">
	                    <p class="txt-17"><strong>${memberNm }</strong>&nbsp;ȸ������ �ӽú�й�ȣ��</p>
	                    <p class="txt-17"><strong class="txt-B">${memberEmail }</strong>���� �߼۵Ǿ����ϴ�</p>
	                </div>
	                <div class="box-form">
	                    <div class="btn-box flex">
	                        <a href="#" class="btn-puple"><span>�α���</span></a>
	                        <a href="#" class="btn-puple"><span>���</span></a>
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