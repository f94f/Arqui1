<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tag" tagdir="/WEB-INF/tags" %>

<html>
    <head>
        <meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
        <title>Sign in with Facebook example</title>
    </head>
    <body>
        <tag:notloggedin>
            <!DOCTYPE html>
        <!--[if lte IE 8]>               <html class="ie8 no-js" lang="en">    <![endif]-->
        <!--[if lte IE 10]>				 <html class="ie10 no-js" lang="en">   <![endif]-->
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
                <link rel="stylesheet" href="js/video-js/video-js.css" />

                <!-- HTML5 Shiv
                ================================================== -->
                <script src="js/jquery.modernizr.js"></script>

            </head>

            <body data-spy="scroll" data-target="#navigation" class="home">


                <!-- - - - - - - - - - - - - - BG Video - - - - - - - - - - - - - - - - -->		




                <!-- - - - - - - - - - - - - end BG Video - - - - - - - - - - - - - - - -->	


                <!-- - - - - - - - - - - - - - Loader - - - - - - - - - - - - - - - - -->	


                <div class="loader"></div><!--/ .loader-->


                <!-- - - - - - - - - - - - - end Loader - - - - - - - - - - - - - - - -->	


                <!-- - - - - - - - - - - - - - Header - - - - - - - - - - - - - - - - -->	


                <header id="header" class="transparent">

                    <div class="header-in clearfix">

                        <h1 id="logo"><a href="index.html">Tu Mejor Opcion</a></h1>

                        <a id="responsive-nav-button" class="responsive-nav-button" href="#"></a>

                        <nav id="navigation" class="navigation">

                            <ul>
                                <li class="current-menu-item"><a href="#home">Inicio</a>

                                </li>
                                <li><a href="#about">Quiénes somos</a></li>
                                <li><a href="#team">Equipo</a></li>

                            </ul>

                        </nav><!--/ #navigation-->

                    </div><!--/ .header-in-->

                </header><!--/ #header-->


                <!-- - - - - - - - - - - - - end Header - - - - - - - - - - - - - - - -->


                <!-- - - - - - - - - - - - - - Wrapper - - - - - - - - - - - - - - - - -->


                <div id="wrapper">

                    <section id="home" class="page">

                        <section class="section parallax padding-off">

                            <div id="layerslider-container">

                                <div id="layerslider">

                                    <div class="ls-layer" style="slidedirection: top; durationin: 1500; durationout: 1500; easingin: easeInOutQuint;">

                                        
						<img alt="" class="ls-bg" src="http://www.taguritraleigh.com/images/slides/slider3.jpg">
                                        
                                        <h1 class="ls-s2 align-center" style="top: 43%; left: 35%; slidedirection : top; slideoutdirection : fade; scaleout : 0.75; durationin : 2000; durationout : 1000; easingin : easeInOutQuint; easingout : easeInOutQuint;">
                                            Regala un bono a tus amigos
                                        </h1>

                                        <h1 class="ls-s2 align-center" style="top: 77%; left: 460px; slidedirection : bottom; slideoutdirection : fade; scaleout : 0.75; durationin : 2000; durationout : 1000; easingin : easeInOutQuint; easingout : easeInOutQuint;">

                                            <a href="signin" class="button turquoise large opacity">Iniciar sesión</a>
                                        </h1>



                                    </div><!--/ .ls-layer-->



                                </div>

                            </div><!--/ #layerslider-container-->	



                        </section><!--/ .section-->

                    </section><!--/ .page-->



                    <section id="about" class="section parallax parallax-bg-1 bg-turquoise-color">

                        <div class="full-bg-image"></div>

                        <div class="container">

                            <div class="row">
                                <div class="col-xs-12">
                                    <ul class="quotes opacity" data-timeout="6000">
                                        <li class="align-center">
                                            <blockquote class="quote-text">
                                                <p>Somos una plataforma que te permite comprar y regalar bonos en tiendas de ropa a tus amigos</p>
                                            </blockquote>
                                            <div class="quote-image"><img alt="Jack Black" src="images/off.gif"></div>
                                        </li>

                                    </ul><!--/ .quotes-->
                                </div>
                            </div><!--/ .row-->

                        </div><!--/ .container-->

                    </section><!--/ .section-->

                    <section class="section parallax parallax-bg-3 bg-dark-color">

                        <div class="full-bg-image"></div>
                        <div class="parallax-overlay"></div>

                        <div class="container">

                            <div class="row">
                                <div class="col-xs-12">
                                    <div class="tweet opacity" data-timeout="6000"></div>
                                </div>
                            </div><!--/ .row-->

                        </div><!--/ .container-->

                    </section><!--/ .section-->


                    <section id="team" class="page">

                        <section class="section bg-gray-color">

                            <div class="container">

                                <div class="row">

                                    <div class="col-xs-12">
                                        <hgroup class="section-title align-center opacity">
                                            <h1>Conoce a nuestro equipo</h1>
                                            <h2>Desarrolladores detrás de esta aplicación</h2>	
                                        </hgroup>			
                                    </div>

                                </div><!--/ .row-->

                            </div><!--/ .container-->	

                            <section class="team-member">

                                <div class="container">

                                    <div class="row">

                                        <div class="col-xs-12">

                                            <div class="team-contents clearfix">

                                                <article class="scale">

                                                    <div class="contents clearfix">

                                                        <div class="team-info">

                                                            <div class="team-image">
                                                                <a><img src="http://placehold.it/250x270" alt="" /></a>
                                                            </div>

                                                            <hgroup class="team-group">
                                                                <h2 class="team-title">Gabriela Camargo</h2>
                                                                <h5 class="team-position">Programadora</h5>
                                                            </hgroup>

                                                        </div><!--/ .team-info-->				

                                                    </div><!--/ .contents-->

                                                </article>

                                                <article class="scale">

                                                    <div class="contents clearfix">

                                                        <div class="team-info">

                                                            <div class="team-image">
                                                                <a><img src="http://placehold.it/250x270" alt="" /></a>
                                                            </div>

                                                            <hgroup class="team-group">
                                                                <h2 class="team-title">Juan Carlos Ruiz</h2>
                                                                <h5 class="team-position">Programador - Documentación</h5>
                                                            </hgroup>

                                                        </div><!--/ .team-info-->


                                                    </div><!--/ .contents-->

                                                </article>	

                                                <article class="scale">

                                                    <div class="contents clearfix">

                                                        <div class="team-info">

                                                            <div class="team-image">
                                                                <a ><img src="http://placehold.it/250x270" alt="" /></a>
                                                            </div>

                                                            <hgroup class="team-group">
                                                                <h2 class="team-title">Felipe Matè</h2>
                                                                <h5 class="team-position">Web Designer</h5>
                                                            </hgroup>

                                                        </div><!--/ .team-info-->



                                                    </div><!--/ .contents-->

                                                </article>				

                                                <article class="scale">

                                                    <div class="contents clearfix">

                                                        <div class="team-info">

                                                            <div class="team-image">
                                                                <a><img src="http://placehold.it/250x270" alt="" /></a>
                                                            </div>

                                                            <hgroup class="team-group">
                                                                <h2 class="team-title">Camilo Alfonso</h2>
                                                                <h5 class="team-position">Programador - Diseñador web</h5>
                                                            </hgroup>

                                                        </div><!--/ .team-info-->


                                                    </div><!--/ .contents-->

                                                </article>	

                                            </div><!--/ .team-contents-->

                                        </div>

                                    </div><!--/ .row-->

                                </div><!--/ .container-->

                            </section><!--/ .team-member-->		



                        </section><!--/ .section-->







                        <footer id="footer">




                            <div class="bottom-footer clearfix">

                                <div class="container">

                                    <div class="row">

                                        <div class="col-sm-6">



                                        </div>

                                        <div class="col-sm-3 col-sm-offset-3">

                                            <div class="developed">
                                                Developed by <a target="_blank" >Aristogatos</a>
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
                <script src="js/video-js/video.js"></script>
                <script>
                    videojs.options.flash.swf = "js/video-js/video-js.swf";
                </script>
                <script src="js/jquery.smoothscroll.js"></script>
                <script src="js/flexslider/jquery.flexslider.js"></script>
                <script src="js/fancybox/jquery.fancybox.pack.js"></script>
                <script src="http://maps.google.com/maps/api/js?sensor=false"></script>
                <script src="js/jquery.gmap.min.js"></script>
                <script src="twitter/jquery.tweet.js"></script>
                <script src="js/jquery.touchswipe.min.js"></script>
                <script src="js/config.js"></script>
                <script src="js/custom.js"></script>

            </body>
        </html>

    </tag:notloggedin>
    <tag:loggedin>
        <h1>Welcome ${facebook.name} (${facebook.id})</h1>
        <form action="./post" method="post">
            <textarea cols="80" rows="2" name="message"></textarea>
            <input type="submit" name="post" value="statuses" />
        </form>
        <a href="./logout">logout</a>
    </tag:loggedin>
</body>
</html>