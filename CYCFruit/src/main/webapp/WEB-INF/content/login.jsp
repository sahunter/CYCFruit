<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
    <script type="text/javascript" src="js/jquery.min.js"></script>
    <link href="css/slider.css" rel="stylesheet" type="text/css" media="all" />
    <script type="text/javascript" src="js/modernizr.custom.28468.js"></script>
    <script type="text/javascript" src="js/jquery.cslider.js"></script>
    <link href="css/owl.carousel.css" rel="stylesheet">
    <script src="js/owl.carousel.js"></script>
    <script src="js/move-top.js"></script>
    <script src="js/easing.js"></script>
</head>
<body>
    <!-- 1.start header -->
    <div id="shortcut-2014">
        <div class="w">
            <!-- 左边内容 -->
            <ul class="fl">
                <li class="dorpdown" id="ttbar-mycity">
                    <div class="dt cw-icon">
                        <i class="ci-right"><s>◇</s></i> 在线统计：
                        <span>20人</span>
                    </div>
                </li>
            </ul>
            <!-- 右边内容 -->
            <ul class="fr">
                <li class="fore1" id="ttbar-login">
                    <a href="login" class="link-login">你好，请登录</a>&nbsp;&nbsp;
                    <a href="register" class="link-regist style-red">免费注册</a>
                </li>
                <li class="spacer"></li>
                <li class="fore2" id="ttbar-login">
                    <a href="order" class="link-login">&nbsp;&nbsp;&nbsp;我的订单</a>
                </li>
                <li class="spacer"></li>
                <li class="fore2" id="ttbar-login">
                    <a href="collect" class="link-login">&nbsp;&nbsp;&nbsp;我的收藏</a>
                </li>
                <li class="spacer"></li>
                <li class="spacer"></li>
                <li class="fore3" id="ttbar-login">
                    <a href="find-password" class="link-login">&nbsp;&nbsp;&nbsp;找回密码</a>
                </li>
                <li class="spacer"></li>
                <li class="spacer"></li>
                <li class="fore3" id="ttbar-login">
                    <a href="change-password" class="link-login">&nbsp;&nbsp;&nbsp;修改密码</a>
                </li>
                <li class="spacer"></li>
                <li class="fore3" id="ttbar-login">
                    <a href="cart" class="link-login">&nbsp;&nbsp;&nbsp;我的购物车</a>
                </li>
                <li class="spacer"></li>
            </ul>
        </div>
    </div>
    <!-- 2.start search -->
    <div class="header_bg">
        <div class="wrap">
            <div class="header">
                <div class="logo">
                    <div class="yj-logo">CYC-FRUIT</div>
                </div>
                <div class="h_icon">
                    <ul class="icon1 sub-icon1">
                        <li><a class="active-icon c1" href="cart"><i>3</i></a>
                        </li>
                    </ul>
                </div>
                <div class="h_search">
                    <form>
                        <input type="text" value="">
                        <input type="submit" value="">
                    </form>
                </div>
                <div class="clear"></div>
            </div>
        </div>
    </div>
    <!-- 3.start muen -->
    <div class="header_btm">
        <div class="wrap">
            <div class="header_sub">
                <div class="h_menu">
                    <ul>
                        <li class="active"><a href="index.html">首页</a></li> |
                        <li><a href="classify">水果分类</a></li> |
                        <li><a href="other">热带水果</a></li> |
                        <li><a href="classify">温带水果</a></li> |
                        <li><a href="other">春季水果</a></li> |
                        <li><a href="classify">夏季水果</a></li> |
                        <li><a href="other">秋季水果</a></li> |
                        <li><a href="classify">冬季水果</a></li> |
                        <li><a href="other">进口水果</a></li> |
                        <li><a href="classify">精选优惠</a></li>
                    </ul>
                </div>
                <div class="clear"></div>
            </div>
        </div>
    </div>

    <!-- start main -->

    <div class="container" style="width:80%;margin: 80px auto;">
        <div class="row">
         <div class="col-sm-3 "></div>
            <div class="col-sm-6 ">
                <s:form action="cusLogin"  class="form-horizontal" style="border: 1px solid #ccc;padding: 60px; box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);">
              <div class="form-group">
                <label for="inputEmail3" class="col-sm-2 control-label">账号</label>
                <div class="col-sm-10">
                  <s:textfield  class="form-control" id="customer.username"name="customer.username" value="${password}"/>
                </div>
              </div>
              <div class="form-group">
                <label for="inputPassword3" class="col-sm-2 control-label">密码</label>
                <div class="col-sm-10">
                  <s:password type="password" class="form-control" id="customer.password" name="customer.password" value="${username}"/>
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                  <div class="checkbox">
                    <label>
                    <s:checkboxlist name="a"  list="#{'atuo':'记住密码'}"
                    listKey="key"
                    listValue="value"/>
                    </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="register">没有账号？点我注册</a>
                  </div>
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                  <s:submit value="登录" class="btn btn-info" style="width: 206px;"/>
                </div>
              </div>
                </s:form>
            </div>
        </div>
         <div class="col-sm-3 "></div>  
    </div>

   
    <!-- start footer -->
    <div class="footer_bg">
        <div class="wrap">
            <div class="footer">
                <!-- start grids_of_4 -->
                <div class="grids_of_4">
                    <div class="grid1_of_4">
                        <h4>购物指南</h4>
                        <ul class="f_nav">
                            <li><a href="">会员介绍</a></li>
                            <li><a href="">购物流程</a></li>
                            <li><a href="">上门自提</a></li>
                            <li><a href="">货到付款</a></li>
                            <li><a href="">在线支付</a></li>
                            <li><a href="">海外配送</a></li>
                            <li><a href="">售后服务</a></li>
                            <li><a href="">其他咨询</a></li>
                        </ul>
                    </div>
                    <div class="grid1_of_4">
                        <h4>配送方式</h4>
                        <ul class="f_nav">
                           <li><a href="">会员介绍</a></li>
                            <li><a href="">购物流程</a></li>
                            <li><a href="">上门自提</a></li>
                            <li><a href="">货到付款</a></li>
                            <li><a href="">在线支付</a></li>
                            <li><a href="">海外配送</a></li>
                            <li><a href="">售后服务</a></li>
                            <li><a href="">其他咨询</a></li>
                        </ul>
                    </div>
                    <div class="grid1_of_4">
                        <h4>支付方式</h4>
                        <ul class="f_nav">
                            <li><a href="">会员介绍</a></li>
                            <li><a href="">购物流程</a></li>
                            <li><a href="">上门自提</a></li>
                            <li><a href="">货到付款</a></li>
                            <li><a href="">在线支付</a></li>
                            <li><a href="">海外配送</a></li>
                            <li><a href="">售后服务</a></li>
                            <li><a href="">其他咨询</a></li>
                        </ul>
                    </div>
                    <div class="grid1_of_4">
                        <h4>售后服务</h4>
                        <ul class="f_nav">
                            <li><a href="">会员介绍</a></li>
                            <li><a href="">购物流程</a></li>
                            <li><a href="">上门自提</a></li>
                            <li><a href="">货到付款</a></li>
                            <li><a href="">在线支付</a></li>
                            <li><a href="">海外配送</a></li>
                            <li><a href="">售后服务</a></li>
                            <li><a href="">其他咨询</a></li>
                        </ul>
                    </div>
                    <div class="clear"></div>
                </div>
            </div>
        </div>
    </div>
    <!-- start footer-top -->
    <div class="footer_bg1">
        <div class="wrap">
            <div class="footer">
                <!-- scroll_top_btn -->
                <a href="#" id="toTop" style="display: block;"><span id="toTopHover" style="opacity: 1;"></span></a>
                <!--end scroll_top_btn -->
                <div class="copy">
                    <p class="link">Copyright &copy; 2016.CYC</p>
                </div>
                <div class="clear"></div>
            </div>
        </div>
    </div>
</body>

</html>
