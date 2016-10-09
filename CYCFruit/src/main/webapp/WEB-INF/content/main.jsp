<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>后台管理</title>
    
    <link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="css/main.css">
    
    <script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="js/common.js"></script> 
    <script type="text/javascript" src="js/main.js"></script>
</head>
<body style="border:none;visibility:visible;width: 100%;height: 100%;" onload="showTime();">
    <div id="cc" class="easyui-layout" style="width:100%;height:100%;">
        <!-- 页面顶部top及菜单栏 -->  
        <div region="north" style="height:96px;width: 100%;overflow: hidden;">
            <div class="header" style="background-color: #40c4b2;">
                <div style="text-align: right; padding-right: 20px; padding-top: 30px; padding-bottom: 14px;">
                    <span style="color:#FDFDFD" id="loginuserInfo">欢迎你，Admin</span>
                    <span style="color:#FDFDFD" id="loginuserArea"></span>
                    <span style="color:#FDFDFD" id="timeInfo"></span>
                    <a href="login.html" style="color:#FDFDFD;text-decoration:none;">退出</a>
                </div>
                <div class="maintitle"  style="top: 12;font-size:25px;color:#FDFDFD; margin-left:55px;">Fruit后台管理系统</div>
            </div>
            <div id="topmenu" class="topmenu" style="height:34px;background:url('css/images/maintop.png');color:#fff;font-size:14px;font-weight:bold;">
                &nbsp;&nbsp;&nbsp;&nbsp;
            </div>  
        </div>
        <!-- 页面底部信息 -->
        <div region="south" style="height: 18px;background-color: #40c4b2;" >
            <center>
                <span>Copyright © 2016.CYC</span>
            </center>
        </div>  
        <!-- 左侧导航菜单 -->     
        <div region="west"  title="导航菜单栏" style="width:180px;">
        <ul id="tt1" class="easyui-tree" data-options="animate:true,dnd:true">
            <li>商品管理</li>
            <li>库存统计</li>
            <li>销售统计</li>
        </ul>
        </div>  
        <!-- 主显示区域选项卡界面 -->
        <div region="center">
            <div class="easyui-tabs" fit="true" id="tt"> 
                <div title="首页" data-options="closable:true">
                    <iframe width='100%' height='100%'  id='iframe' name='iframe' frameborder='0' scrolling='auto'  src='role.html'></iframe>
                </div>
            </div>
        </div>
        <div id="dd"></div>
    </div>
</body>
</html>