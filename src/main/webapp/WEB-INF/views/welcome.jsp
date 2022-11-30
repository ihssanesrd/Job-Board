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
    
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700&display=swap" rel="stylesheet">

	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/semantic-ui@2.2.13/dist/semantic.min.css">
	<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/predictionPageCss/style.css">

    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/owl.carousel.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/magnific-popup.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/font-awesome.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/themify-icons.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/nice-select.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/flaticon.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/gijgo.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/animate.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/slick.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/slicknav.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/style.css">
    
    <title>Prediction</title>

    <style>
        
.bg {
  animation:slide 3s ease-in-out infinite alternate;
  background-image: linear-gradient(-60deg, #6c3 50%, #09f 50%);
  bottom:0;
  left:-50%;
  opacity:.5;
  position:fixed;
  right:-50%;
  top:0;
  z-index:-1;
}

.bg2 {
  animation-direction:alternate-reverse;
  animation-duration:4s;
}

.bg3 {
  animation-duration:5s;
}


h1 {
  text-align: center;
  color: rgb(8, 8, 8);
  font-family:monospace;
}

@keyframes slide {
  0% {
    transform:translateX(-25%);
  }
  100% {
    transform:translateX(25%);
  }
}
    </style>
    <!-- <link rel="stylesheet" href="css/responsive.css"> -->
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
                                            <li><a href="<c:url value="/Statistics"/>">Statistics</a></li>
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
    <!--[if lte IE 9]>
            <p class="browserupgrade">You are using an <strong>outdated</strong> browser. Please <a href="https://browsehappy.com/">upgrade your browser</a> to improve your experience and security.</p>
        <![endif]-->

        <!-- header-start -->

    
    <!--/ bradcam_area  -->

    <div class="bg"></div>
    <div class="bg bg2"></div>
    <div class="bg bg3"></div>

	<section class="ftco-section">
		<div class="container" style="margin-top: 80px;">
			<div class="row justify-content-center">

			</div>
			<div class="row justify-content-center">
				<div class="col-lg-4 col-md-6 d-flex justify-content-center align-items-center" style="margin-top: 100px;"> 
					<div class="inline w-100 field">
				      <h1>Select your Skills</h1>
                      <select name="skills" multiple="multiple" class="label ui selection fluid dropdown" id="skills" style="margin-top: 20px;">
				      <option value="">Select Skill</option>
				      <option value="html">html</option>
				      <option value="css">css</option>
				      <option value="javascript">javascript</option>
				      <option value="react">react</option>
				      <option value="vue">vue</option>
				      <option value="jquery">jquery</option>
				      <option value="angular">angular</option>
				      <option value="bootstrap">bootstrap</option>
				      <option value="python">python</option>
				      <option value="c++">c++</option>
				      <option value="swift">swift</option>
				      <option value="flutter">flutter</option>
				      <option value="type script">type script</option>
				      <option value="sass">sass</option>
				      <option value="agile">agile</option>
				      <option value="hadoop">hadoop</option>
				      <option value="docker">docker</option>
				      <option value="json">json</option>
				      <option value="shell">shell</option>
				      <option value="kubernetes">kubernetes</option>				      <option value="10"> c </option>
				      <option value="linux">linux</option>
				      <option value="spark">spark</option>
				      <option value="ccna"> ccna </option>				      <option value="10"> c </option>
				      <option value="ccnp"> ccnp </option>
				      <option value="git"> git </option>
				      <option value="moa"> moa </option>				      <option value="10"> c </option>
				      <option value="sql"> sql </option>
				      <option value="oracle"> oracle </option>
				      <option value="spring"> spring </option>				      <option value="10"> c </option>
				      <option value="php"> php </option>
				      <option value="aws"> aws </option>
				      <option value="power bi"> power bi </option>				      <option value="10"> c </option>
				      <option value="java"> java </option>

				      
				    </select>
				  </div>
                  
				</div>
			</div>
		</div>
        <div class="col-md-12 text-center">
        <input type="submit" value="submit" id ="submit" class="btn" style="background-color: #007bff;margin-top: 80px">
    </div>
	</section>

  <script type="text/javascript">
  		document.getElementById('submit').onclick = function(){
  			var selected = [];
  			for(var option of document.getElementById('skills').options){
  				if(option.selected){
  					selected.push(option.value);
  				}
  			}
  			$.ajax({
  				url:"http://localhost:8081/welcome",
  				method:"POST",
  				dataType: "text",
  				data:{
  						skills: JSON.stringify(selected)
  				},
  				success: function(result){
  					const obj = JSON.parse(result);
  					$(".job").text(obj.job);
  					$(".jobdesc").text(obj.description);
					document.getElementById("show").click();
  				},
  				
  				error: function(xhr, status, error){
  					console.log("Erreur !")
  				}
  				
  			});
  		}
  
  </script>
  <script src="resources/js/predictionPageJS/jquery.min.js"></script>
  <script src="resources/js/predictionPageJS/popper.js"></script>
  <script src="resources/js/predictionPageJS/bootstrap.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/semantic-ui@2.2.13/dist/semantic.min.js"></script>
  <script src="resources/js/predictionPageJS/main.js"></script>
 </body>
</html>
