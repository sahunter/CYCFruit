<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE HTML>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>我的收藏</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
    <link href="css/user-style.css" rel="stylesheet" type="text/css" media="all" />
    <style type="text/css">
    </style>
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
                        <li class="active"><a href="index">首页</a></li> |
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

	<div class="container">
        <div class="row">
            <div class="catbox">
                <div class="cart-mainBody">
                    <h2>我的收藏</h2></div>
                <table id="cartTable">
                    <thead>
                        <tr>
                            <th>
                                <label>
                                    <input type="checkbox" class="check-all check" name="">全选
                                </label>
                            </th>
                            <th>商品信息</th>
                            <th>单价</th>
                            <th>操作</th>
                        </tr>
                    </thead>
                    <tbody>
                        <s:iterator value="fruits" var="f">
                      <s:iterator value="collections" status="c">  
 							<s:if test="f.id == c.fruitID">
                        <tr>
                            <td class="checkbox">
                                <input type="checkbox" class="check-one check">
                            </td>
                            <td class="goods">
                                <img src="images/${f.picture }">
                                <span>${f.fruitName }新鲜清甜多汁！每份6个 </span>
                            </td>
                            <td class="unit-price">${f.price }</td>
                            
                           
                            <td class="operation">
                                <span class="delete">删除</span>
                                <input type="hidden" class="shoppingCarId" value="${c.id}"/>
                            </td>
                        </tr>
                        </s:if>
                        </s:iterator>
                       </s:iterator>
                        
                    </tbody>
                </table>
                <div id="foot" class="foot">
                    <label class="fl select-all">
                        <input type="checkbox" class="check-all check " name="">全选
                    </label>
                    <a class="fl delete" id="deleteAll" href="javascript:;">删除</a>
                    
                </div>
            </div>
        </div>
    </div>

<%-- <table  border="1">
	<s:iterator value="collections" var="b">
		<tr>
			<td><s:property value="id"/></td>
			<td><s:property value="customerID"/></td>
			<td><s:property value="fruitID"/></td>
			<td><a href="${pageContext.request.contextPath}/deleteCollection?id=${b.id}">删除</a></td>
		</tr>
	</s:iterator>
</table> --%>

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

<script type="text/javascript" src="js/jquery.min.js"></script>
    <script src="js/owl.carousel.js"></script>
    <script src="js/move-top.js"></script>
    <script src="js/easing.js"></script>
    <script type="text/javascript" src="js/cart.js"></script>
</body>
</html>