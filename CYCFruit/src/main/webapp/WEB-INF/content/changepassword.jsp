<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8">
    <title>修改密码</title>
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
                    <a href="login.html" class="link-login">你好，请登录</a>&nbsp;&nbsp;
                    <a href="register.html" class="link-regist style-red">免费注册</a>
                </li>
                <li class="spacer"></li>
                <li class="fore2" id="ttbar-login">
                    <a href="order.html" class="link-login">&nbsp;&nbsp;&nbsp;我的订单</a>
                </li>
                <li class="spacer"></li>
                <li class="fore2" id="ttbar-login">
                    <a href="collect" class="link-login">&nbsp;&nbsp;&nbsp;我的收藏</a>
                </li>
                <li class="spacer"></li>
                <li class="spacer"></li>
                <li class="fore3" id="ttbar-login">
                    <a href="find-password.html" class="link-login">&nbsp;&nbsp;&nbsp;找回密码</a>
                </li>
                <li class="spacer"></li>
                <li class="spacer"></li>
                <li class="fore3" id="ttbar-login">
                    <a href="change-password.html" class="link-login">&nbsp;&nbsp;&nbsp;修改密码</a>
                </li>
                <li class="spacer"></li>
                <li class="fore3" id="ttbar-login">
                    <a href="cart.html" class="link-login">&nbsp;&nbsp;&nbsp;我的购物车</a>
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
                        <li><a class="active-icon c1" href="cart.html"><i>3</i></a>
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
                        <li><a href="classify.html">水果分类</a></li> |
                        <li><a href="other.html">热带水果</a></li> |
                        <li><a href="classify.html">温带水果</a></li> |
                        <li><a href="other.html">春季水果</a></li> |
                        <li><a href="classify.html">夏季水果</a></li> |
                        <li><a href="other.html">秋季水果</a></li> |
                        <li><a href="classify.html">冬季水果</a></li> |
                        <li><a href="other.html">进口水果</a></li> |
                        <li><a href="classify.html">精选优惠</a></li>
                    </ul>
                </div>
                <div class="clear"></div>
            </div>
        </div>
    </div>

    <!-- start main -->
    <div class="container mainBody">
            <div class="row">
             <div class="col-sm-3 "></div>
                <div class="col-sm-6 ">
                    <s:form  action="resetpassword" class="form-horizontal form-style">
                  <div class="form-group">
                    <label for="name" class="col-sm-3 control-label">用户名</label>
                    <div class="col-sm-9">
                      <s:textfield  class="form-control" id="inputEmail3" name="username" placeholder="请输入用户名"/>
                    </div>
                  </div>
                  <div class="form-group">
                    <label for="inputPassword1" class="col-sm-3 control-label">原密码</label>
                    <div class="col-sm-9">
                        <s:password class="form-control" id="inputPassword3" name="password" placeholder="请输入原密码"/>
                    </div>
                  </div>
                   <div class="form-group">
                    <label for="inputPassword1" class="col-sm-3 control-label">新密码</label>
                    <div class="col-sm-9">
                      <s:password class="form-control" id="inputPassword3"name="newpassword" placeholder="请设置新密码"/>
                    </div>
                  </div>
                  <div class="form-group">
                    <label for="inputPassword3" class="col-sm-3 control-label">确认密码</label>
                    <div class="col-sm-9">
                      <s:password class="form-control" id="inputPassword3" name="newpassword2"placeholder="再次确认密码"/>
                    </div>
                  </div>
                  <div class="form-group">
                    <div class="col-sm-offset-3 col-sm-9">
                      <s:submit class="btn btn-info" style="width: 206px;" value="修改"/>
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