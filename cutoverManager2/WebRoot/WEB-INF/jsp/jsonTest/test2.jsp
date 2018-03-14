<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/common/common.jsp"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'test2.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  <!-- 
  <script type="text/javascript">
  	setInterval(
						function() {

							//$('ul li').remove();
							//alert(value);
							
									$.ajax({
										url : "/cutoverManager/jsonTestAction_test2", 
										//data:{method:"ajaxTest",val:value},  
										async : true, //�Ƿ�Ϊ�첽����
										cache : false, //�Ƿ񻺴���
										type : "GET", //����ʽΪget
										dataType : "json", //���������ص������ʲô���� 
										success : function(data) {
												console.log(data);
											},
										error : function() {
											window.location.reload(true)
										}
									})
						}, 5000);
			</script>
  </script>
   -->
  <body>
    
  </body>
</html>
