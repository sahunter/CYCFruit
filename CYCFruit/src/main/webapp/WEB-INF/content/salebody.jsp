<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>商品管理</title>
    <link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="css/demo.css">
    <link rel="stylesheet" type="text/css" href="fancybox/jquery.fancybox-1.3.4.css">
    <link rel="stylesheet" type="text/css" href="css/fw.css">
    <link href="css/user-style.css" rel="stylesheet" type="text/css" media="all" />
    <script type="text/javascript" src="easyui/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="easyui/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="js/common.js"></script>
    <script type="text/javascript" src="js/JQuery-formui.js"></script>
    <script type="text/javascript" src="js/goods-body.js"></script>
    <script type="text/javascript" src="js/cart.js"></script>
</head>

<body>
    <!-- 数据列表 -->
    <div class="catbox">
        <div class="cart-mainBody">
            <h2>销售统计</h2></div>
        <table id="cartTable">
            <thead>
                <tr>
                    <th>
                        商品ID
                    </th>
                    <th>商品信息</th>
                    <th>单价</th>
                    <th>销售数量</th>
                    <th>销售额</th>
                    <th>备注</th>
                </tr>
            </thead>
            <tbody>
             <s:iterator value="sales" var="b">
                <tr>
                    <td class="checkbox">
                        <span><s:property value="id"/></span>
                    </td>
                    <td class="goods">
                      <!--   <img src="images/c12.jpg"> -->
                        <span><s:property value="fruitName"/></span>
                    </td>
                    <td class="unit-price"><s:property value="price"/></td>
                    <td class="count">
                        <span><s:property value="sale"/></span>
                    </td>
                    <td class="subtotal"><s:property value="totalprice"/></td>
                    <td class="operation">
                        <span class="delete"></span>
                    </td>
                </tr>
                 </s:iterator>
             <%--    <tr>
                    <td class="checkbox">
                        <span>002</span>
                    </td>
                    <td class="goods">
                        <img src="images/c11.jpg">
                        <span> 美国新奇士进口脐橙</span>
                    </td>
                    <td class="unit-price">19.9</td>
                    <td class="count">
                        <span>11</span>
                    </td>
                    <td class="subtotal">19.9</td>
                    <td class="operation">
                        <span class="delete"></span>
                    </td>
                </tr>
                <tr>
                    <td class="checkbox">
                        <span>003</span>
                    </td>
                    <td class="goods">
                        <img src="images/c10.jpg">
                        <span>海南芒果 天涯海角</span>
                    </td>
                    <td class="unit-price">29.9</td>
                    <td class="count">
                        <span>11</span>
                    </td>
                    <td class="subtotal">29.9</td>
                    <td class="operation">
                        <span class="delete"></span>
                    </td>
                </tr>
                <tr>
                    <td class="checkbox">
                        <span>004</span>
                    </td>
                    <td class="goods">
                        <img src="images/c9.jpg">
                        <span>新鲜清甜多汁！6个 约1kg -1.5kg 美国新奇士进口脐橙 </span>
                    </td>
                    <td class="unit-price">9.9</td>
                    <td class="count">
                        <span>11</span>
                    </td>
                    <td class="subtotal">9.9</td>
                    <td class="operation">
                        <span class="delete"></span>
                    </td>
                </tr>
                <tr>
                    <td class="checkbox">
                        <span>005</span>
                    </td>
                    <td class="goods">
                        <img src="images/c8.jpg">
                        <span>美国新奇士进口脐橙 新鲜清甜多汁！6个 约1kg -1.5kg</span>
                    </td>
                    <td class="unit-price">29.9</td>
                    <td class="count">
                        <span>11</span>
                    </td>
                    <td class="subtotal">29.9</td>
                    <td class="operation">
                        <span class="delete"></span>
                    </td>
                </tr> --%>
            </tbody>
        </table>
    </div>
    <!-- 对话框 -->
    <div id="wedit" class="easyui-window" data-options="title:'商品管理',iconCls:'icon-save',modal:true,closed:true" style="width: 500px; height: 340px; padding: 5px;">
        <div class="easyui-layout" data-options="fit:true">
            <div data-options="region:'center',border:false" style="padding: 10px; background: #fff;
                border: 1px solid #ccc;">
                <iframe id="iframemain" scrolling="yes" frameborder="0" src="#" style="width: 100%;
                    height: 98%;"></iframe>
            </div>
        </div>
    </div>
</body>

</html>
