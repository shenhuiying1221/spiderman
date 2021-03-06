<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>


<!-- Mirrored from www.zi-han.net/theme/hplus/table_bootstrap.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 20 Jan 2016 14:20:03 GMT -->
<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>四川移动割接管理平台</title>
    <meta name="keywords" content="四川移动割接管理平台">
    <meta name="description" content="四川移动割接管理平台">

    <link rel="shortcut icon" href="favicon.ico"> <link href="css/bootstrap.min14ed.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.min93e3.css?v=4.4.0" rel="stylesheet">
    <link href="css/plugins/bootstrap-table/bootstrap-table.min.css" rel="stylesheet">
    <link href="css/animate.min.css" rel="stylesheet">
    <link href="css/style.min862f.css?v=4.1.0" rel="stylesheet">
    <link href="css/newstyles.css" rel="stylesheet">

</head>

<body class="gray-bg">
    <div class="wrapper wrapper-content animated fadeInRight">
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>数据统计 </h5>
                <div class="ibox-tools">
                    <a class="collapse-link">
                        <i class="fa fa-chevron-up"></i>
                    </a>
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-wrench"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <li><a href="#">选项1</a>
                        </li>
                        <li><a href="#">选项2</a>
                        </li>
                    </ul>
                    <a class="close-link">
                        <i class="fa fa-times"></i>
                    </a>
                </div>
            </div>
            <div class="ibox-content">
               <div class="row">
                 	<div class="col-md-5ths">
                    	  <div class="panel panel-success">
                            <div class="panel-heading"> 已完成<font size="+3"></font>
<!--<div class="pull-right"><a href="#" data-perform="panel-collapse"><i class="ti-minus"></i></a> <a href="#" data-perform="panel-dismiss"></a> </div>-->
                             <div class="pull-right"><font size="+3">2</font></div>

                             </div>

                        </div>
                    </div>
                    <div class="col-md-5ths">
<!-- 	             	 <div class="col-lg-3 col-sm-6 col-xs-12">
-->                        <div class="panel panel-info">
                            <div class="panel-heading">正在进行<font size="+3"></font>
                                <div class="pull-right"><font size="+3">2</font></div>
                            </div>
                          
                        </div>
                    </div>
                    <div class="col-md-5ths">
		              	<div class="panel panel-primary">
                            <div class="panel-heading">即将开始<font size="+3"></font>
                            <div class="pull-right"><font size="+3">2</font></div>
                            </div>
                           
                        </div>
                    </div>
                
                 	<div class="col-md-5ths">
                        <div class="panel panel-danger">
                            <div class="panel-heading">割接超时<font size="+3"></font>
                                 <div class="pull-right"><font size="+3">2</font></div>
                            </div>
                            
                        </div>
                 </div>  
                    <div class="col-md-5ths">
                 	 <div class="panel panel-warning">
                            <div class="panel-heading">取消割接<font size="+3"></font>
 	                            <div class="pull-right"><font size="+3">2</font></div>
                            </div>
                           
                        </div>
                    </div>
              </div>
        </div>

        <!-- Panel Other -->
        <div class="ibox float-e-margins">
            <div class="ibox-title">
                <h5>详细列表</h5>
                <div class="ibox-tools">
                    <a class="collapse-link">
                        <i class="fa fa-chevron-up"></i>
                    </a>
                    <a class="dropdown-toggle" data-toggle="dropdown" href="#">
                        <i class="fa fa-wrench"></i>
                    </a>
                    <ul class="dropdown-menu dropdown-user">
                        <!--<li><a href="#">选项1</a>
                        </li>
                        <li><a href="#">选项2</a>
                        </li>-->
                    </ul>
                    <a class="close-link">
                        <i class="fa fa-times"></i>
                    </a>
                </div>
            </div>
            <div class="ibox-content">
                <div class="row row-lg">

                    <div class="col-sm-12">
                        <!-- Example Events -->
                        <div class="example-wrap">
                            <!--<h4 class="example-title">事件</h4>
                            <div class="example">
                                <div class="alert alert-success" id="examplebtTableEventsResult" role="alert">
                                    事件结果
                                </div>-->
                                <div class="btn-group hidden-xs" id="exampleTableEventsToolbar" role="group">
                                    <button type="button" class="btn btn-outline btn-default">
                                        <i class="glyphicon glyphicon-plus" aria-hidden="true"></i>
                                    </button>
                                    <button type="button" class="btn btn-outline btn-default">
                                        <i class="glyphicon glyphicon-heart" aria-hidden="true"></i>
                                    </button>
                                    <button type="button" class="btn btn-outline btn-default">
                                        <i class="glyphicon glyphicon-trash" aria-hidden="true"></i>
                                    </button>
                                </div>
                                <table id="exampleTableEvents" data-height="400" data-mobile-responsive="true">
                                    <thead>
                                        <tr>
                                              <th data-field="state" data-checkbox="true"></th>
                                            <th data-field="stated">状态</th><!--ID  <span class="label label-danger label-rouded"></span>-->
                                            <th data-field="id">工单号</th><!--ID-->
                                            <th data-field="name">工单主题</th>
                                            <th data-field="place">地市</th>
                                            <th data-field="major">专业</th>
                                            <th data-field="level">级别</th>
                                            <th data-field="begintime">开始时间</th>
                                            <th data-field="endtime">结束时间</th>
                                            <th data-field="info">网元</th>
                                            <th data-field="operate">操作</th>
                                        </tr>
                                    </thead>
                                </table>
                            </div>
                        </div>
                        <!-- End Example Events -->
                    </div>
                </div>
            </div>
        </div>
        <!-- End Panel Other -->
    </div>
    <script src="js/jquery.min.js?v=2.1.4"></script>
    <script src="js/bootstrap.min.js?v=3.3.6"></script>
    <script src="js/content.min.js?v=1.0.0"></script>
    <script src="js/plugins/bootstrap-table/bootstrap-table.min.js"></script>
    <script src="js/plugins/bootstrap-table/bootstrap-table-mobile.min.js"></script>
    <script src="js/plugins/bootstrap-table/locale/bootstrap-table-zh-CN.min.js"></script>
    <script src="js/demo/bootstrap-table-demo.min.js"></script>
    <script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>

</body>


<!-- Mirrored from www.zi-han.net/theme/hplus/table_bootstrap.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 20 Jan 2016 14:20:06 GMT -->
</html>
