<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/fonts/Login_Registration_fonts/icomoon/style.css">

    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/Login_Registration_css/owl.carousel.min.css">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/Login_Registration_css/bootstrap.min.css">
    
    <!-- Style -->
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/Login_Registration_css/style.css">
    <title>Login</title>
  </head>
  <body>
  

    <header>
        <div class="header-area " style="background-color: #007bff;">
            <div id="sticky-header" class="main-header-area">
                <div class="container-fluid ">
                    <div class="header_bottom_border">
                        <div class="row align-items-center">
                            <div class="col-xl-3 col-lg-2">
                                <div class="logo">
                                    <a href="<c:url value="/Index"/>">
                                        <img src="resources/img/logo.png" alt="">
                                    </a>
                                </div>
                            </div>
                            <div class="col-xl-6 col-lg-7">
                                <div class="main-menu  d-none d-lg-block">
                                    <nav>
                                        <ul id="navigation">
                                            <li><a href="<c:url value="/Index"/>">home</a></li>
                                            <li><a href="#">Browse Jobs<i class="ti-angle-down"></i></a>
                                                <ul class="submenu">
                                                    <li><a href="<c:url value="/Devops"/>" >Devops</a></li>
                                                    <li><a href="<c:url value="/Java"/>" >Java Devoloper</a></li>
													<li><a href="<c:url value="/BigData"/>">Big Data Engineer</a></li>
                                                    <li><a href="<c:url value="/FullStack"/>" >Full Stack Devoloper</a></li>
                                                    <li><a href="<c:url value="/Security"/>">Security Jobs</a></li>                                                    
                                                </ul>
                                            </li>
                                            <li><a href="<c:url value="/About"/>">About us</a></li>
                                            <li><a href="<c:url value="/Contact"/>">Contact</a></li>
                                        </ul>
                                    </nav>
                                </div>
                            </div>
                            <div class="col-xl-3 col-lg-3 d-none d-lg-block">
                                <div class="Appointment">
                                    <div class="d-none d-lg-block">
                                        <a class="boxed-btn3" href="<c:url value="/Login"/>">Login</a>
                                    </div>
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

  <div class="content">
    <div class="container">
      <div class="row">
        <div class="col-md-6">
          <img src="resources/img/banner/illustration.png" alt="Image" class="img-fluid">
        </div>
        <div class="col-md-6 contents">
          <div class="row justify-content-center">
            <div class="col-md-8">
              <div class="mb-4">
              <h3>Registration</h3>
            </div>
            <form action="Register" method="post">

              <div class="form-group first">
                <label for="username">Username</label>
                <input type="text" class="form-control" id="username" name="uname">
              </div>
              
              <div class="form-group last mb-4">
                <label for="password">Password</label>
                <input type="password" class="form-control" id="password" name="password">              
              </div>

              <div class="form-group first">
                <label for="email">email</label>
                <input type="text" class="form-control" id="email" name="email">
              </div>
              <div class="form-group first">
                <label for="phone">phone</label>
                <input type="text" class="form-control" id="phone" name="phone">
              </div>

              
              <div class="d-flex mb-5 align-items-center">
                <span class="caption"><a href="<c:url value="/Login"/>" class="forgot-pass">Already have an account ?</a></span> 
                <span class="ml-auto"><a href="#" class="forgot-pass">Forgot Password</a></span> 
              </div>

              <input type="submit" value="Register" class="btn btn-block btn-primary" style="background-color: #007bff;">

            </form>
            </div>
          </div>
          
        </div>
        
      </div>
    </div>
  </div>
    <script src="<%=request.getContextPath()%>/resources/js/Login_Registration_js/jquery-3.3.1.min.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/Login_Registration_js/popper.min.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/Login_Registration_js/bootstrap.min.js"></script>
    <script src="<%=request.getContextPath()%>/resources/js/Login_Registration_js/main.js"></script>
  </body>
</html>