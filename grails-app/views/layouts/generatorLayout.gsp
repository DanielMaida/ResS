<%--
  Created by IntelliJ IDEA.
  User: danielmaida
  Date: 08/10/15
  Time: 11:34
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>ResS - Dashboard</title>

    <!-- Bootstrap Core CSS -->
    <link href="../css/generatorDashboard/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="../css/generatorDashboard/simple-sidebar.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>

    <![endif]-->
    <g:layoutHead/>
</head>

<body>

<div id="wrapper">

    <!-- Sidebar -->
    <div id="sidebar-wrapper">
        <ul class="sidebar-nav">
            <li class="sidebar-brand">
                <a href="#">
                    Painel de controle
                </a>
            </li>
            <li>
                <g:link controller="generatorDashboard" action="index">Histórico de coletas</g:link>
            </li>
            <li>
                <a href="#">Solicitar coleta</a>
            </li>
            <li>
                <a href="#">Configurações da conta</a>
            </li>
            <li>
                <a href="#">Contato</a>
            </li>
            <li>
                <a href="#">Sair</a>
            </li>
        </ul>
    </div>
    <!-- /#sidebar-wrapper -->
    <g:layoutBody/>
    <!-- Page Content -->

    <!-- /#page-content-wrapper -->

</div>
<!-- /#wrapper -->

<!-- jQuery -->
<script src="../js/generatorDashboard/jquery.js"></script>

<!-- Bootstrap Core JavaScript -->
<script src="../js/generatorDashboard/bootstrap.min.js"></script>

<!-- Menu Toggle Script -->
<script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });
</script>

</body>

</html>