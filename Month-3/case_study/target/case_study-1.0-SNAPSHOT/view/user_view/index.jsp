<%@ page import="java.util.Locale" %>
<%@ page import="java.text.NumberFormat" %>
<%@ page import="java.text.DecimalFormat" %><%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 10/7/2020
  Time: 2:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html class="no-js" lang="zxx">

<head>
    <link rel="shortcut icon"
          href="view/user_view/img/0.png"
          type="image/x-icon">
    <title>Dương Đỗ Nguyên - C620I1</title>
    <jsp:useBean id="t" class="dao.ProductDAO" scope="request"/>
    <jsp:useBean id="type" class="dao.TypeDAO" scope="request"/>
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title>Restaurant</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- <link rel="manifest" href="site.webmanifest"> -->
    <%--    <link rel="shortcut icon" type="image/x-icon" href="img/0.png">--%>
    <!-- Place favicon.ico in the root directory -->

    <!-- CSS here -->
    <link rel="stylesheet" href="view/user_view/css/bootstrap.min.css">
    <link rel="stylesheet" href="view/user_view/css/owl.carousel.min.css">
    <link rel="stylesheet" href="view/user_view/css/magnific-popup.css">
    <link rel="stylesheet" href="view/user_view/css/font-awesome.min.css">
    <link rel="stylesheet" href="view/user_view/css/themify-icons.css">
    <link rel="stylesheet" href="view/user_view/css/gijgo.css">
    <link rel="stylesheet" href="view/user_view/css/nice-select.css">
    <link rel="stylesheet" href="view/user_view/css/flaticon.css">
    <link rel="stylesheet" href="view/user_view/css/slicknav.css">

    <link rel="stylesheet" href="view/user_view/css/style.css">
    <!-- <link rel="stylesheet" href="css/responsive.css"> -->

</head>

<body>
<!--[if lte IE 9]>
<p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade
    your browser</a> to improve your experience and security.</p>
<![endif]-->

<!-- header-start -->
<header>
    <div class="header-area ">
        <div id="sticky-header" class="main-header-area">
            <div class="container-fluid p-0">
                <div class="header_bottom_border">
                    <div class="row align-items-center no-gutters">
                        <div class="col-xl-3 col-lg-2">
                            <div class="logo">
                                <a href="index.html">
                                    <img src="img/logo.png" alt="">
                                </a>
                            </div>
                        </div>
                        <div class="col-xl-6 col-lg-7">
                            <div class="main-menu  d-none d-lg-block">
                                <nav>
                                    <ul id="navigation">
                                        <li><a class="active" href="index.html">home</a></li>
                                        <li><a href="Menu.html">Menu</a></li>
                                        <li><a href="#">pages <i class="ti-angle-down"></i></a>
                                            <ul class="submenu">
                                                <li><a href="about.html">about</a></li>
                                                <li><a href="elements.html">elements</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="#">blog <i class="ti-angle-down"></i></a>
                                            <ul class="submenu">
                                                <li><a href="blog.html">blog</a></li>
                                                <li><a href="single-blog.html">single-blog</a></li>
                                            </ul>
                                        </li>
                                        <li><a href="contact.html">Contact</a></li>
                                    </ul>
                                </nav>
                            </div>
                        </div>
                        <div class="col-xl-3 col-lg-3 d-none d-lg-block">
                            <div class="say_hello">
                                <a href="#">Book a Table</a>
                            </div>
                        </div>
                        <div class="col-12">
                            <div class="mobile_menu d-block d-lg-none"></div>
                        </div>
                    </div>
                </div>


            </div>
        </div>
    </div>
</header>
<!-- header-end -->

<!-- slider_area_start -->
<div class="slider_area">
    <div class="slider_active owl-carousel">
        <div class="single_slider  d-flex align-items-center slider_bg_1 overlay">
            <div class="container">
                <div class="row align-items-center justify-content-center">
                    <div class="col-xl-9 col-md-9 col-md-12">
                        <div class="slider_text text-center">
                            <h3>Fresh and Delicious Food
                                For your Health</h3>
                            <a href="menu.html" class="boxed-btn3">View Menus</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="single_slider  d-flex align-items-center slider_bg_2 overlay">
            <div class="container">
                <div class="row align-items-center justify-content-center">
                    <div class="col-xl-9 col-md-9 col-md-12">
                        <div class="slider_text text-center">
                            <h3>Fresh and Delicious Food
                                For your Health</h3>
                            <a href="menu.html" class="boxed-btn3">View Menus</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="single_slider  d-flex align-items-center slider_bg_1 overlay">
            <div class="container">
                <div class="row align-items-center justify-content-center">
                    <div class="col-xl-9 col-md-9 col-md-12">
                        <div class="slider_text text-center">
                            <h3>Fresh and Delicious Food
                                For your Health</h3>
                            <a href="menu.html" class="boxed-btn3">View Menus</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- slider_area_end -->

<!-- about_area_start -->
<div class="about_area">
    <div class="icon_1 d-none d-md-block">
        <img src="view/user_view/img/icon/1.png" alt="">
    </div>
    <div class="icon_2 d-none d-md-block">
        <img src="view/user_view/img/icon/2.png" alt="">
    </div>
    <div class="icon_3 d-none d-md-block">
        <img src="view/user_view/img/icon/3.png" alt="">
    </div>
    <div class="container">
        <div class="row align-items-center">
            <div class="col-lg-6">
                <div class="about_info_wrap">
                    <h3>Sed ut perspiciatis unde <br>
                        omnis iste natus</h3>
                    <span class="long_dash"></span>
                    <p>Omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque
                        ipsa quae ab illo inventore veritatis et quasi. Exercitation photo booth stumptown tote bag todo
                        Banksy, elit small batch freegan sed. Craft beer elit seitan exercitation photo booth et 8-bit
                        kale chips proident chillwave deep vow laborum. Aliquip veniam delectus, marfa eiusmod
                        pinterest.</p>
                    <ul class="food_list">
                        <li>
                            <img src="view/user_view/img/svg_icon/salad.svg" alt="">
                            <span>Fresh Ingredients</span>
                        </li>
                        <li>
                            <img src="view/user_view/img/svg_icon/tray.svg" alt="">
                            <span>Expert cooker</span>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="col-lg-6">
                <div class="about_img">
                    <div class="img_1">
                        <img src="view/user_view/img/about/big.png" alt="">
                    </div>
                    <div class="small_img">
                        <img src="view/user_view/img/about/small.png" alt="">
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- about_area_end -->

<!-- Delicious area start  -->
<div class="Delicious_area">
    <div class="container">
        <div class="row">
            <div class="col-xl-12">
                <div class="section_title text-center mb-50">
                    <h3>Delicious Food For You</h3>
                </div>
            </div>
        </div>
        <div class="tablist_menu">
            <div class="row">
                <div class="col-xl-12">
                    <ul class="nav justify-content-center" id="pills-tab" role="tablist">
                        <li class="nav-item">
                            <a class="nav-link active" id="pills-home-tab" data-toggle="pill" href="#pills-home"
                               role="tab" aria-controls="pills-home" aria-selected="true">
                                <div class="single_menu text-center">
                                    <div class="icon">
                                        <i class="flaticon-lunch"></i>
                                    </div>
                                    <h4>Món Chính</h4>
                                </div>
                            </a>
                        </li>

                        <li class="nav-item">
                            <a class="nav-link" id="pills-profile-tab" data-toggle="pill" href="#pills-profile"
                               role="tab" aria-controls="pills-profile" aria-selected="false">
                                <div class="single_menu text-center">
                                    <div class="icon">
                                        <i class="flaticon-food"></i>
                                    </div>
                                    <h4>Thức Uống</h4>
                                </div>
                            </a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" id="pills-contact-tab" data-toggle="pill" href="#pills-contact"
                               role="tab" aria-controls="pills-contact" aria-selected="false">
                                <div class="single_menu text-center">
                                    <div class="icon">
                                        <i class="flaticon-kitchen"></i>
                                    </div>
                                    <h4>Tráng Miệng</h4>
                                </div>
                            </a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="tab-content" id="pills-tabContent">
            <div class="tab-pane fade show active" id="pills-home" role="tabpanel" aria-labelledby="pills-home-tab">
                <div class="row">
                    <c:forEach items="${t.listMainDishes()}" var="maindish">
                        <div class="col-md-6 col-lg-6">
                            <div class="single_delicious d-flex align-items-center">
                                <div class="thumb">
                                    <a href="${pageContext.request.contextPath}/home?action=view&id=${maindish.id}"
                                       target="_blank"><img style="width: 180px; height: 180px;" src="${maindish.image}"
                                                            alt=""></a>
                                </div>
                                <div class="info">
                                    <a
                                            href="${pageContext.request.contextPath}/home?action=view&id=${maindish.id}"
                                            target="_blank"><h3>#${maindish.id}. ${maindish.name}</h3>
                                    </a>
                                    <p>${maindish.description}.</p>
                                    <span>$ ${maindish.price}</span>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
            <div class="tab-pane fade" id="pills-profile" role="tabpanel" aria-labelledby="pills-profile-tab">
                <div class="row">
                    <c:forEach items="${t.listDrinks()}" var="maindish">
                        <div class="col-md-6 col-lg-6">
                            <div class="single_delicious d-flex align-items-center">
                                <div class="thumb">
                                    <a href="${pageContext.request.contextPath}/home?action=view&id=${maindish.id}"
                                       target="_blank"><img style="width: 180px; height: 180px;"
                                                            src="${maindish.image}"
                                                            alt=""></a>
                                </div>
                                <div class="info">
                                    <a
                                            href="${pageContext.request.contextPath}/home?action=view&id=${maindish.id}"
                                            target="_blank"><h3 class="name-product">
                                        #${maindish.id}. ${maindish.name}</h3>
                                    </a>
                                    <p>${maindish.description}.</p>
                                    <span>$${maindish.price}</span>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
            <div class="tab-pane fade" id="pills-contact" role="tabpanel" aria-labelledby="pills-contact-tab">
                <div class="row">
                    <c:forEach items="${t.listDesserts()}" var="maindish">
                        <div class="col-md-6 col-lg-6">
                            <div class="single_delicious d-flex align-items-center">
                                <div class="thumb">
                                    <a href="${pageContext.request.contextPath}/home?action=view&id=${maindish.id}"
                                       target="_blank"><img style="width: 180px; height: 180px;" src="${maindish.image}"
                                                            alt=""></a>
                                </div>
                                <div class="info">
                                    <a href="${pageContext.request.contextPath}/home?action=view&id=${maindish.id}"
                                       target="_blank"><h3>#${maindish.id}. ${maindish.name}</h3>
                                    </a>
                                    <p>${maindish.description}.</p>
                                    <span>$${maindish.price}</span>
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </div>
            </div>
        </div>
    </div>
</div>


<!--/ Delicious area start  -->


<!-- gallery_start -->
<div class="gallery_area">
    <div class="container">
        <div class="row">
            <div class="col-xl-12">
                <div class="section_title text-center mb-75">
                    <h3>TOP 3 sản phẩm bán chạy nhất</h3>
                </div>

                <c:forEach items="${t.top3HotProduct()}" var="o">
                    <div class="single_gallery small_img">
                            <%--                        <a class="popup-image" href="img/gallery/2.png"></a>--%>
                        <img src="${o.image}" alt="">
                    </div>
                </c:forEach>
                <p>
                    ___________________________________________________________________________________________________</p>
                <div class="section_title text-center mb-75">
                    <h3>TOP 6 sản phẩm mới nhất</h3>
                </div>
                <c:forEach items="${t.top10NewProduct()}" var="o">
                    <div class="single_gallery small_img">
                            <%--                        <a class="popup-image" href="img/gallery/2.png"></a>--%>
                        <img src="${o.image}" alt="">
                    </div>
                </c:forEach>

            </div>
        </div>
    </div>

</div>


<!-- footer_start  -->
<footer class="footer">
    <div class="footer_top">
        <div class="container">
            <div class="row">
                <div class="col-xl-3 col-md-6 col-lg-3 ">
                    <div class="footer_widget">
                        <div class="footer_logo">
                            <a href="#">
                                <img src="img/footer_logo.png" alt="">
                            </a>
                        </div>
                        <p>Duong Do Nguyen C0620I1 <br> CodeGym <br>
                            <a href="#">+84 34544.9875</a> <br>
                            <a href="#">duongdonguyen96@gmail.com</a>
                        </p>
                        <p>
                        </p>
                        <div class="socail_links">
                            <ul>
                                <li>
                                    <a href="#">
                                        <i class="ti-facebook"></i>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="ti-twitter-alt"></i>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="fa fa-instagram"></i>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="fa fa-pinterest"></i>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <i class="fa fa-youtube-play"></i>
                                    </a>
                                </li>
                            </ul>
                        </div>

                    </div>
                </div>
                <div class="col-xl-4 col-md-6 col-lg-4 offset-xl-1">
                    <div class="footer_widget">
                        <h3 class="footer_title">
                            Useful Links
                        </h3>
                        <ul>
                            <li><a href="#">Menu</a></li>
                            <li><a href="#">About</a></li>
                            <li><a href="#"> Blog</a></li>
                        </ul>
                    </div>
                </div>
                <div class="col-xl-4 col-md-6 col-lg-4">
                    <div class="footer_widget">
                        <h3 class="footer_title">
                            Subscribe
                        </h3>
                        <form action="#" class="newsletter_form">
                            <input type="text" placeholder="Enter your mail">
                            <button type="submit">Subscribe</button>
                        </form>
                        <p class="newsletter_text">Esteem spirit temper too say adieus who direct esteem esteems
                            luckily.</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="copy-right_text">
        <div class="container">
            <div class="footer_border"></div>
            <div class="row">
                <div class="col-xl-12">
                    <p class="copy_right text-center">
                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                        Copyright &copy;<script>document.write(new Date().getFullYear());</script>
                        All rights reserved | This template is made with <i class="fa fa-heart-o"
                                                                            aria-hidden="true"></i> by <a
                            href="https://colorlib.com" target="_blank">Colorlib</a>
                        <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                    </p>
                </div>
            </div>
        </div>
    </div>
</footer>
<!-- footer_end  -->

<!-- JS here -->
<script src="view/user_view/js/vendor/modernizr-3.5.0.min.js"></script>
<script src="view/user_view/js/vendor/jquery-1.12.4.min.js"></script>
<script src="view/user_view/js/popper.min.js"></script>
<script src="view/user_view/js/bootstrap.min.js"></script>
<script src="view/user_view/js/owl.carousel.min.js"></script>
<script src="view/user_view/js/isotope.pkgd.min.js"></script>
<script src="view/user_view/js/ajax-form.js"></script>
<script src="view/user_view/js/waypoints.min.js"></script>
<script src="view/user_view/js/jquery.counterup.min.js"></script>
<script src="view/user_view/js/imagesloaded.pkgd.min.js"></script>
<script src="view/user_view/js/scrollIt.js"></script>
<script src="view/user_view/js/jquery.scrollUp.min.js"></script>
<script src="view/user_view/js/wow.min.js"></script>
<script src="view/user_view/js/gijgo.min.js"></script>
<script src="view/user_view/js/nice-select.min.js"></script>
<script src="view/user_view/js/jquery.slicknav.min.js"></script>
<script src="view/user_view/js/jquery.magnific-popup.min.js"></script>
<script src="view/user_view/js/plugins.js"></script>


<!--contact js-->
<script src="view/user_view/js/contact.js"></script>
<script src="view/user_view/js/jquery.ajaxchimp.min.js"></script>
<script src="view/user_view/js/jquery.form.js"></script>
<script src="view/user_view/js/jquery.validate.min.js"></script>
<script src="view/user_view/js/mail-script.js"></script>


<script src="view/user_view/js/main.js"></script>

<script>
    $('#datepicker').datepicker({
        iconsLibrary: 'fontawesome',
        icons: {
            rightIcon: '<span class="fa fa-calendar-o"></span>'
        }
    });
    $('#datepicker2').datepicker({
        iconsLibrary: 'fontawesome',
        icons: {
            rightIcon: '<span class="fa fa-calendar-o"></span>'
        }

    });


    function formatNumber(num) {
        return num.toString().replace(/(\d)(?=(\d{3})+(?!\d))/g, '$1,')
    }

</script>

</body>

</html>