<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <title>四川移动割接管理平台</title>
    <meta name="keywords" content="四川移动割接管理平台">
    <meta name="description" content="四川移动割接管理平台">

    <link rel="shortcut icon" href="favicon.ico">
    <link href="css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/style.min862f.css?v=4.1.0" rel="stylesheet">
</head>

<body class="fixed-sidebar full-height-layout gray-bg" style="overflow:hidden">
    <div id="wrapper">
        <!--左侧导航开始-->
        <nav class="navbar-default navbar-static-side" role="navigation">
            <div class="nav-close"><i class="fa fa-times-circle"></i>
            </div>
            <div class="sidebar-collapse">
                <ul class="nav" id="side-menu">
                    <li class="nav-header">
                        <div class="dropdown profile-element">
                            <span><img alt="image" class="img-circle" src="" /></span>
                            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                                <span class="clear">
                               <span class="block m-t-xs"><strong class="font-bold">jk_wuxian</strong></span>
                                <!--<span class="text-muted text-xs block">超级管理员<b class="caret"></b></span>
                                </span>-->
                            </a>
                            
                        </div>
                        <div class="logo-element">割接<br>平台
                        </div>
                    </li>
                    <li>              
						<a class="J_menuItem" href="table_bootstrap.jsp"><i class="fa fa-home"></i> <span class="nav-label">主页</span></a>
                    </li>
                    <li>
                        <a class="J_menuItem" href="table_bootstrap_quanyewu.jsp"><i class="fa fa-columns"></i> <span class="nav-label">全业务</span></a>
                    </li>
                    <li>
                    	    <a class="J_menuItem" href="table_bootstrap_hexinwang.jsp"><i class="fa fa fa-bar-chart-o"></i> <span class="nav-label">核心网</span></a>
                        
                    </li>

                    <li>
                        <a class="J_menuItem" href="table_bootstrap_wuxianwang.jsp"><i class="fa fa-envelope"></i> <span class="nav-label">无线网</span></a>
                     
                    </li>
                    <li>
                        <a class="J_menuItem" href="table_bootstrap_donghuan.jsp"><i class="fa fa-edit"></i> <span class="nav-label">动力设备</span></a>
                        
                    </li>
                    <li>
                        <a class="J_menuItem" href="table_bootstrap_chuanshuwang.jsp"><i class="fa fa-desktop"></i> <span class="nav-label">传输网</span></a>
                       
                    </li>
                    <li>
                        <a class="J_menuItem" href="table_bootstrap_qita.jsp"><i class="fa fa-flask"></i> <span class="nav-label">其他</span></a>
                      
                    </li>

                </ul>
            </div>
        </nav>
        <!--左侧导航结束-->
        <!--右侧部分开始-->
        <div id="page-wrapper" class="gray-bg dashbard-1">
            <div class="row border-bottom">
                <nav class="navbar navbar-static-top" role="navigation" style="margin-bottom: 0">
                    <div class="navbar-header"><a class="navbar-minimalize minimalize-styl-2 btn btn-primary " href="#"><i class="fa fa-bars"></i> </a>
                      
                 
                   		<br>
                   		<span> <img src="img/admin-text-dark.png" ></span>
                      

                    </div>
                 </nav>
            </div>
            <div class="row content-tabs">
                <button class="roll-nav roll-left J_tabLeft"><i class="fa fa-backward"></i>
                </button>
                <nav class="page-tabs J_menuTabs">
                    <div class="page-tabs-content">
                        <a href="javascript:;" class="active J_menuTab" data-id="index.jsp">主页</a>
                    </div>
                </nav>
                <button class="roll-nav roll-right J_tabRight"><i class="fa fa-forward"></i>
                </button>
                <div class="btn-group roll-nav roll-right">
                    <button class="dropdown J_tabClose" data-toggle="dropdown">关闭操作<span class="caret"></span>

                    </button>
                    <ul role="menu" class="dropdown-menu dropdown-menu-right">
                        <li class="J_tabShowActive"><a>定位当前选项卡</a>
                        </li>
                        <li class="divider"></li>
                        <li class="J_tabCloseAll"><a>关闭全部选项卡</a>
                        </li>
                        <li class="J_tabCloseOther"><a>关闭其他选项卡</a>
                        </li>
                    </ul>
                </div>
                <a href="login.jsp" class="roll-nav roll-right J_tabExit"><i class="fa fa fa-sign-out"></i> 退出</a>
            </div>
            <div class="row J_mainContent" id="content-main">
                <iframe class="J_iframe" name="iframe0" width="100%" height="100%" src="table_bootstrap.jsp" frameborder="0" data-id="table_bootstrap.jsp" seamless></iframe>
            </div>
            <div class="footer">
                <div class="pull-right">2018 &copy; CMCC </a>
                </div>
            </div>
        </div>
        <!--右侧部分结束-->
        <!--右侧边栏开始-->

    </div>
    <script src="js/jquery.min.js?v=2.1.4"></script>
    <script src="js/bootstrap.min.js?v=3.3.6"></script>
    <script src="js/plugins/metisMenu/jquery.metisMenu.js"></script>
    <script src="js/plugins/slimscroll/jquery.slimscroll.min.js"></script>
    <script src="js/plugins/layer/layer.min.js"></script>
    <script src="js/hplus.min.js?v=4.1.0"></script>
    <script type="text/javascript" src="js/contabs.min.js"></script>
    <script src="js/plugins/pace/pace.min.js"></script>
</body>


<!-- Mirrored from www.zi-han.net/theme/hplus/ by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 20 Jan 2016 14:17:11 GMT -->
</html>
