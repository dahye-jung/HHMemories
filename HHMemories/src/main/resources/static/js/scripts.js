/*!
* Start Bootstrap - Simple Sidebar v6.0.5 (https://startbootstrap.com/template/simple-sidebar)
* Copyright 2013-2022 Start Bootstrap
* Licensed under MIT (https://github.com/StartBootstrap/startbootstrap-simple-sidebar/blob/master/LICENSE)
*/
// 
// Scripts
// 

//window.addEventListener('DOMContentLoaded', event => {

    // Toggle the side navigation
    //const sidebarToggle = document.body.querySelector('#sidebarToggle');
    //if (sidebarToggle) {
        // Uncomment Below to persist sidebar toggle between refreshes
        // if (localStorage.getItem('sb|sidebar-toggle') === 'true') {
        //     document.body.classList.toggle('sb-sidenav-toggled');
        // }
        //sidebarToggle.addEventListener('click', event => {
            //event.preventDefault();
            //document.body.classList.toggle('sb-sidenav-toggled');
            //localStorage.setItem('sb|sidebar-toggle', document.body.classList.contains('sb-sidenav-toggled'));
        //});
    //}

//});


/****************************** UI Layout S ******************************/

$(function(){
    // uiLayout
    function skipLayout(){
        // $('#content').wrap('<div id="content-wrap"></div>');
        // $('#content-wrap').prepend('<div id="snb" class="toggle-box">snb</div>');
    }
    var uiSnb = '<div id="snb">';
        uiSnb += '<a class="logo" href="javascript:void(0);"><span>HHmemories</span></a>';
        // uiSnb += '<button type="button" class="btn-icon close"><span>닫기</span></button>';
        uiSnb += '<div class="menu">';
            uiSnb += '<div class="menu1 active"><span>내드라이브</span></div>';
            uiSnb += '<div class="sub">';
                uiSnb += '<a href="#"><span>최근문서함</span></a>';
                uiSnb += '<a class="active" href="#"><span>중요문서</span></a>';
                uiSnb += '<a href="#"><span>개인폴더</span></a>';
            uiSnb += '</div>';
            uiSnb += '<div class="menu2"><span>공유드라이브</span></div>';
            uiSnb += '<div class="sub">';
                uiSnb += '<a href="#"><span>공유받은 문서</span></a>';
                uiSnb += '<a href="#"><span>공유한문서</span></a>';
            uiSnb += '</div>';
            uiSnb += '<div class="menu3"><span>고객센터</span></div>';
            uiSnb += '<div class="sub">';
                uiSnb += '<a href="#"><span>FAQ</span></a>';
                uiSnb += '<a href="#"><span>공지사항</span></a>';
            uiSnb += '</div>';
        uiSnb += '</div>';
    uiSnb += '</div>';
    if($('#view-wrap').attr('data-layout') == 'main'){
        alert('hello');
        if($('#view-wrap').find('#snb').length == 0){
            // $('#view-wrap').prepend('<div id="skip-menu"><a href="#snb"><span>서브메뉴 바로가기</span></a><a href="#content"><span>컨텐츠 바로가기</span></a></div>');
            $('#content').wrap('<div id="content-wrap"></div>');
            $('#content-wrap').prepend(uiSnb);
        }
    }
/****************************** UI Layout E ******************************/
