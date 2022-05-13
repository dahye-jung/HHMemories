<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
    <meta name="description" content="" />
    <meta name="author" content="" />
    <title>index</title>
    <!-- Favicon-->
    <link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
    <!-- Core theme CSS (includes Bootstrap)-->
    <link href="css/common.css" rel="stylesheet" />
<!--     <style>
        *[data-layout="login"] #content{width:100%;height:100%;}
        *[data-layout="login"] .main-box > div{display:inline-block;height:100%;}
        *[data-layout="login"] .box-form.left{width:40%;background:#ddd;}
        *[data-layout="login"] .main-box + div{width:60%;background:#ccc;}
    </style> -->
</head>
<body>

<div id="view-wrap" data-layout="login" data-page-id="00-login" aria-hidden="false">
    <div id="content">
        <div class="main-box">
            <div class="box-form left">
                <div class="box-logo">
                    <img src="img/loginLogo01.png" alt="로고이미지" class="logo"></img>
                    <p>memories</p>
                </div>
            </div>
            <div class="box-form">
                <div class="box-right">
                    <div class="login-logo">
                        <img src="img/loginLogo02.png">
                    </div>
                    <span class="login-logo-txt">HHmemories에 오신걸 환영합니다.</span>
                    <div class="cmm-form">
                        <div class="input">
                            <input type="text" title="이메일아이디" placeholder="이메일아이디">
                            <button class="btn-icon delete"><span>입력값 지우기</span></button>
                        </div>
                    </div>
                    <div class="cmm-form">
                        <div class="input">
                            <input type="text" title="비밀번호" placeholder="비밀번호">
                            <button class="btn-icon delete"><span>입력값 지우기</span></button>
                        </div>
                    </div>
                    <div class="btn-box">
                        <a href="#" class="txt-btn"><span>아이디찾기</span></a>
                        <a href="#" class="txt-btn"><span>비밀번호찾기</span></a>
                        <a href="#" class="txt-btn"><span>회원가입</span></a>
                    </div>
                    <div class="btn-box flex">
                        <button class="btn-puple"><span>로그인</span></button>
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