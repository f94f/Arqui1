<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>

<!DOCTYPE html>
<!--[if lte IE 8]>               <html class="ie8 no-js" lang="en">    <![endif]-->
<!--[if lte IE 10]>				 <html class="ie10 no-js" lang="en">   <![endif]-->
<!--[if !IE]>-->				 <html class="not-ie no-js" lang="en"> <!--<![endif]-->
    <head>

        <!-- Google Web Fonts
  ================================================== -->
        <link href='http://fonts.googleapis.com/css?family=Roboto:100,300,300italic,400,700|Julius+Sans+One|Roboto+Condensed:300,400' rel='stylesheet' type='text/css'>

        <!-- Basic Page Needs
  ================================================== -->
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

        <title>Accio</title>	

        <meta name="description" content="">
        <meta name="author" content="">

        <!-- Favicons
        ================================================== -->
        <link rel="shortcut icon" href="images/favicon.png">
        <link rel="apple-touch-icon" href="images/apple-touch-icon.png">
        <link rel="apple-touch-icon" sizes="72x72" href="images/apple-touch-icon-72x72.png">
        <link rel="apple-touch-icon" sizes="114x114" href="images/apple-touch-icon-114x114.png">	

        <!-- Mobile Specific Metas
  ================================================== -->
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">

        <!-- CSS
  ================================================== -->
        <link rel="stylesheet" href="css/style.css" />
        <link rel="stylesheet" href="css/grid.css" />
        <link rel="stylesheet" href="css/layout.css" />
        <link rel="stylesheet" href="css/fontello.css" />
        <link rel="stylesheet" href="css/animation.css" />

        <link rel="stylesheet" href="js/layerslider/css/layerslider.css" />
        <link rel="stylesheet" href="js/flexslider/flexslider.css" />
        <link rel="stylesheet" href="js/fancybox/jquery.fancybox.css" />

        <!-- HTML5 Shiv
        ================================================== -->
        <script src="js/jquery.modernizr.js"></script>

    </head>
    <tag:notloggedin>

        <body data-spy="scroll" data-target="#navigation" class="home">

            <!-- - - - - - - - - - - - - - Loader - - - - - - - - - - - - - - - - -->	


            <div class="loader"></div><!--/ .loader-->


            <!-- - - - - - - - - - - - - end Loader - - - - - - - - - - - - - - - -->	


            <!-- - - - - - - - - - - - - - BG Video - - - - - - - - - - - - - - - - -->		


            <a class="player" id="bgndVideo" data-property="{
               videoURL: 'http://www.youtube.com/watch?v=qGsTlYLbwy4',
               containment:'body',
               autoPlay: true,
               quality: 'small',
               mute: true, 
               startAt: 0,
               opacity: 1,
               ratio: '16/9', 
               addRaster: false }">
            </a>


            <!-- - - - - - - - - - - - - end BG Video - - - - - - - - - - - - - - - -->	


            <!-- - - - - - - - - - - - - - Header - - - - - - - - - - - - - - - - -->	


            <header id="header" class="transparent">

                <div class="header-in clearfix">

                    <h1 id="logo"><a href="index.html">#TuMejorOpcion</a></h1>

                    <a id="responsive-nav-button" class="responsive-nav-button" href="#"></a>

                    <nav id="navigation" class="navigation">

                        <ul>
                            <li class="current-menu-item"><a href="#home">Inicio</a></li>
                            <li><a href="#about">Acerca de</a></li>
                        </ul>

                    </nav><!--/ #navigation-->

                </div><!--/ .header-in-->

            </header><!--/ #header-->


            <!-- - - - - - - - - - - - - end Header - - - - - - - - - - - - - - - -->


            <!-- - - - - - - - - - - - - - Wrapper - - - - - - - - - - - - - - - - -->


            <div id="wrapper">

                <section id="home" class="page">

                    <section class="section padding-off">

                        <div id="layerslider-container">

                            <div id="layerslider">

                                <div class="ls-layer" style="slidedirection: left; durationin: 1500; durationout: 1500; easingin: easeInOutQuint; timeshift: -500;">

                                    <img alt="" class="ls-bg" src="http://www.taguritraleigh.com/images/slides/slider3.jpg">

                                    <h1 class="ls-s2 align-center" style="top: 43%; left: 130px; slidedirection : top; slideoutdirection : fade; scaleout : 0.75; durationin : 2000; durationout : 1000; easingin : easeInOutQuint; easingout : easeInOutQuint;">
                                        Regala bonos
                                    </h1>

                                    <h1 class="ls-s2 align-center" style="top: 57%; left: 150px; slidedirection : bottom; slideoutdirection : fade; scaleout : 0.75; durationin : 2000; durationout : 1000; easingin : easeInOutQuint; easingout : easeInOutQuint;">
                                        a tus amigos
                                    </h1>

                                </div><!--/ .ls-layer-->

                                <div class="ls-layer" style="slidedirection: right; durationin: 1500; durationout: 1500; easingin: easeInOutQuint; timeshift: -500;">

                                    <img alt="" class="ls-bg" src="https://www.xm1.cc//images/2045x950b.jpg">

                                    <h1 class="ls-s2 align-center" style="top: 43%; left: 80px; slidedirection : top; slideoutdirection : fade; scaleout : 0.75; durationin : 2000; durationout : 1000; easingin : easeInOutQuint; easingout : easeInOutQuint;">
                                        Redime tus bonos
                                    </h1>

                                    <h1 class="ls-s2 align-center" style="top: 57%; left: 0px; slidedirection : bottom; slideoutdirection : fade; scaleout : 0.75; durationin : 2000; durationout : 1000; easingin : easeInOutQuint; easingout : easeInOutQuint;">
                                        En tu tienda favorita
                                    </h1>

                                </div><!--/ .ls-layer-->


                            </div><!--/ #layerslider-->

                        </div><!--/ #layerslider-container-->	

                        <ul class="keydown">
                            <li class="up"></li>
                            <li class="left"></li>
                            <li class="down"></li>
                            <li class="right"></li>
                        </ul><!--/ .keydown-->	

                    </section><!--/ .section-->

                </section><!--/ .page-->

                <section id="about" class="page">

                    <section class="section">

                        <div class="container">

                            <div class="row">

                                <div class="col-xs-12">
                                    <hgroup class="slogan align-center opacity">
                                        <h1>Regala lo <span>mejor</span> a tus amigos</h1>
                                        <h2>En su tienda favorita, para recoger cuando quieran.</h2>
                                        <br>
                                        <br>
                                        <a href="signin" class="button turquoise large opacityRun" >Ingresa a TMO</a>	
                                    </hgroup>	
                                </div>

                            </div><!--/ .row-->

                            <div class="row">

                                <div class="col-md-7 opacity">
                                    <p>
                                        <img src="http://1.bp.blogspot.com/-lTwUkg93wSU/U19Y5fY2qXI/AAAAAAAAFz8/8XRDkQbYlLc/s1600/stradivarius-ss-2014-2.jpg" alt="" />
                                    </p>
                                </div><!--/ .col-md-6-->

                                <div class="col-md-5">

                                    <p class="opacity">
                                        Tu mejor opcion es una aplicacion pensada en ti, y en esos momentos en los que no sabes que dar a cambio de una valiosa amistad, tan solo ingresa a nuestra aplicacion web y compra los bonos en donde quieras y por el valor que prefieras.
                                    </p>

                                    <ul class="list circle-list opacity">

                                        <li>Ingresa con facebook</li>
                                        <li>Escoge la tienda</li>
                                        <li>Selecciona al amigo a quien le quieres dar el bono</li>
                                        <li>Define el valor de tu regalo</li>
                                        <li>Envialo!</li>

                                    </ul><!--/ .list-->

                                </div><!--/ .col-md-5-->

                            </div><!--/ .row-->
                        </div><!--/ .container-->	

                    </section><!--/ .section-->

                    <section class="section parallax parallax-bg-1 bg-turquoise-color">

                        <div class="full-bg-image"></div>

                        <div class="container">

                            <div class="row">

                                <div class="col-xs-12">

                                    <ul class="quotes opacity" data-timeout="6000">


                                    </ul><!--/ .quotes-->

                                </div>

                            </div><!--/ .row-->

                        </div><!--/ .container-->

                    </section><!--/ .section-->

                </section><!--/ .section-->



                <!-- - - - - - - - - - - - - - Footer - - - - - - - - - - - - - - - - -->


                <footer id="footer">

                    <div class="bottom-footer clearfix">

                        <div class="container">

                            <div class="row">

                                <div class="col-sm-6">

                                    <div class="copyright">
                                        Copyright © 2014. <a target="_blank" href="http://webtemplatemasters.com">Aristogatos</a>. Todos los derechos reservados
                                    </div><!--/ .cppyright-->

                                </div>

                                <div class="col-sm-3 col-sm-offset-3">

                                    <div class="developed">
                                        Developed by <a target="_blank" href="http://webtemplatemasters.com/">los Aristogatos</a>
                                    </div><!--/ .developed-->

                                </div>

                            </div><!--/ .row-->

                        </div><!--/ .container-->

                    </div><!--/ .bottom-footer-->	

                </footer><!--/ #footer-->


                <!-- - - - - - - - - - - - - end Footer - - - - - - - - - - - - - - - -->


            </div><!--/ #wrapper-->


            <!-- - - - - - - - - - - - - end Wrapper - - - - - - - - - - - - - - - -->


            <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
            <script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>
            <!--[if lt IE 9]>
                    <script src="js/respond.min.js"></script>
            <![endif]-->
            <script src="js/jquery.queryloader2.js"></script>
            <script src="js/waypoints.min.js"></script>
            <script src="js/jquery.easing.1.3.min.js"></script>
            <script src="js/jquery.cycle.all.min.js"></script>
            <script src="js/layerslider/js/layerslider.transitions.js"></script>
            <script src="js/layerslider/js/layerslider.kreaturamedia.jquery.js"></script>
            <script src="js/jquery.mixitup.js"></script>
            <script src="js/jquery.mb.YTPlayer.js"></script>
            <script src="js/jquery.smoothscroll.js"></script>
            <script src="js/flexslider/jquery.flexslider.js"></script>
            <script src="js/fancybox/jquery.fancybox.pack.js"></script>
            <script src="http://maps.google.com/maps/api/js?sensor=false"></script>
            <script src="js/jquery.gmap.min.js"></script>
            <script src="twitter/jquery.tweet.js"></script>
            <script src="js/jquery.touchswipe.min.js"></script>
            <script src="js/config.js"></script>
            <script src="js/custom.js"></script>
        </tag:notloggedin>


        <tag:loggedin>
           <body data-spy="scroll" data-target="#navigation" class="page-template">
	
	
	<!-- - - - - - - - - - - - - - Loader - - - - - - - - - - - - - - - - -->	

	
	<div class="loader"></div><!--/ .loader-->
	
	
	<!-- - - - - - - - - - - - - end Loader - - - - - - - - - - - - - - - -->	
	
	
	<!-- - - - - - - - - - - - - - Header - - - - - - - - - - - - - - - - -->	
	

	<header id="header">

		<div class="header-in">

			<h1 id="logo"><a href="index.html">TuMejorOpcion</a></h1>

			<a id="responsive-nav-button" class="responsive-nav-button" href="#"></a>

			<nav id="navigation" class="navigation">

				<ul>
					<li><a href="#">Cuenta</a>
						<ul>
							<li><a href="./logout">Cerrar sesion</a></li>
						</ul>
					</li>

				</ul>

			</nav><!--/ #navigation-->

		</div><!--/ .header-in-->

	</header><!--/ #header-->


	<!-- - - - - - - - - - - - - end Header - - - - - - - - - - - - - - - -->


	<!-- - - - - - - - - - - - - - Wrapper - - - - - - - - - - - - - - - - -->
	

	<div id="wrapper">

		<section class="section">

			<div id="content">

				<div class="container">

					<div class="row">
						<div class="col-xs-12">
							<hgroup class="section-title align-center">
								<h1>Bonos</h1>
							</hgroup>	
						</div>
					</div><!--/ .row-->			

					<div class="row">

						<section id="main" class="col-md-8">

							<article class="entry main-entry single">



								<h2 class="entry-title">Compra un bono</h2><!--/ .entry-title-->

								<div class="wisget widget_categories">
									Seleccione la tienda:
									<br>
<ul><li>
									<form action="./funcionalidadBonos" method="get">

										<select name="Select" value="seleccionarTienda" multiple="multiple">
											<option value="1">Zara</option>
											<option value="2">Arturo Calle</option>
											<option value="3">Fuera De Serie</option>
											<option value="4">Bkul</option>
											<option value="5">Lec Lee</option>
											<option value="6">Studio F</option>
											<option value="7">Pronto</option>
											<option value="8">Armi</option>
										</select>

										Ingresar valor (debe ser mayor a COP $10.000):
										<input type="text"  name="messagecomprar"></input>
                                                                                <input type="text"  name="usuario" value="${facebook.id}"></input>
										<br><Br>
										<input type="submit" class="button turquoise large opacityRun" name="comprarBonos" value="Comprar Bonos" />
									</form>
									<br><br>
</li><li>

									<h2 class="entry-title">Regala un bono</h2><!--/ .entry-title-->
									<form action="./enviarBono" method="get">
										Seleccione la tienda:
										<select name="Select" value="seleccionarTienda" multiple="multiple">
											<option value="1">Zara</option>
											<option value="2">Arturo Calle</option>
											<option value="3">Fuera De Serie</option>
											<option value="4">Bkul</option>
											<option value="5">Lec Lee</option>
											<option value="6">Studio F</option>
											<option value="7">Pronto</option>
											<option value="8">Armi</option>
										</select>

										Ingresar valor (debe ser mayor a COP $10.000):
										<input type="text"  name="messageEnviar"></input>
										Ingresar correo del amigo al que deseas enviar el bono:
										<input type="text"  name="email"></input>
										<br><br>
										<input type="submit" class="button turquoise large opacityRun" name="enviarBono" value="Enviar Bono" />

									</form>   
</li></ul>
								</div><!--/ .entry-body-->

							</article><!--/ .entry-->									

						</section><!--/ #main-->

						<aside id="sidebar" class="col-md-4">

							<div class="widget widget_search">

								<form action="./redimirBono" method="get">
                <h2 class="entry-title">Redime</h2><!--/ .entry-title-->
                <input type="text"  name="message1"></input>
                <BR><BR>
                <input type="submit" class="button turquoise large opacityRun" name="comprarBonos" value="Redimir Bonos" />

            </form>

							</div><!--/ .widget-->

							<div class="widget widget_text">

								<h3 class="widget-title">Edita tus tiendas</h3>

								 <form action="./agregarTienda" method="get">
                Renombrar tienda:
                <select name="Select1" value="seleccionarTienda" multiple="multiple">
                    <option value="1">Zara</option>
                    <option value="2">Arturo Calle</option>
                    <option value="3">Fuera De Serie</option>
                    <option value="4">Bkul</option>
                    <option value="5">Lec Lee</option>
                    <option value="6">Studio F</option>
                    <option value="7">Pronto</option>
                    <option value="8">Armi</option>
                </select>
                Ingrese el nombre de la tienda que quiere agregar:
                <input type="text"  name="message2"></input>
                <BR><BR>
                <input type="submit" class="button turquoise large opacityRun" name="agregarTienda" value="gestion de Tiendas" />
               
                <br>


            </form>
                                                                
                                                                 <br>
            <form action="./verAmigos" method="post">

                <input type="submit" class="button turquoise large opacityRun" name="ver" value="Ver Amigos" />

            </form>
<br>
            <form action="./verHistorial" method="post">

                <input type="submit"  class="button turquoise large opacityRun" name="verAmigos" value="Ver bonos comprados" />


            </form>

							</div><!--/ .widget-->

							
							

							<div class="widget widget_recent_posts">

							

								<section>

									<article class="entry"> 

										<div class="quote-image">
											<a href="#" class="single-image">
												<img alt="" src="http://viatoreschristi.com/wp-content/uploads/2013/02/clothes.jpg" />
											</a>	
                                                                                     <a href="./logout">logout</a>

										</div><!--/ .entry-image-->

										
									</article><!--/ .entry-->

									


								</section>
</div>
							

						</aside><!--/ #sidebar-->		

					</div><!--/ .row-->

				</div><!--/ .container-->

			</div><!--/ #content-->

		</section><!--/ .section-->


		<!-- - - - - - - - - - - - - - Footer - - - - - - - - - - - - - - - - -->


		<footer id="footer">

			<div class="bottom-footer clearfix">

				<div class="container">

					<div class="row">

						<div class="col-sm-6">

							<div class="copyright">
								Copyright © 2013. <a target="_blank" href="http://webtemplatemasters.com">ThemeMakers</a>. All rights reserved
							</div><!--/ .cppyright-->

						</div>

						<div class="col-sm-3 col-sm-offset-3">

							<div class="developed">
								Developed by <a target="_blank" href="http://webtemplatemasters.com/">ThemeMakers</a>
							</div><!--/ .developed-->

						</div>

					</div><!--/ .row-->

				</div><!--/ .container-->

			</div><!--/ .bottom-footer-->	

		</footer><!--/ #footer-->


		<!-- - - - - - - - - - - - - end Footer - - - - - - - - - - - - - - - -->


	</div><!--/ #wrapper-->


	<!-- - - - - - - - - - - - - end Wrapper - - - - - - - - - - - - - - - -->


	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
	<script>window.jQuery || document.write('<script src="js/jquery.min.js"><\/script>')</script>
<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->
	<script src="js/jquery.queryloader2.js"></script>
	<script src="js/jquery.easing.1.3.min.js"></script>
	<script src="js/jquery.cycle.all.min.js"></script>
	<script src="js/jquery.smoothscroll.js"></script>
	<script src="js/waypoints.min.js"></script>
	<script src="twitter/jquery.tweet.js"></script>
	<script src="js/fancybox/jquery.fancybox.pack.js"></script>
	<script src="js/config.js"></script>
	<script src="js/custom.js"></script>

        </tag:loggedin>


    </body>
</html>
