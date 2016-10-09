<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
 <%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>商品管理</title>	
	<link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
	<link rel="stylesheet" type="text/css" href="css/demo.css">
	<link rel="stylesheet" type="text/css" href="fancybox/jquery.fancybox-1.3.4.css" >
	<link rel="stylesheet" type="text/css" href="css/fw.css" >
    <link href="css/user-style.css" rel="stylesheet" type="text/css" media="all" />
	<script type="text/javascript" src="easyui/jquery-1.7.2.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>	
	<script type="text/javascript" src="easyui/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="js/common.js"></script>
	<script type="text/javascript" src="js/JQuery-formui.js"></script>
    <script type="text/javascript" src="js/role.js"></script>
	<script type="text/javascript" src="js/cart.js"></script>
</head>
<body>
	<!-- 数据列表 -->
	<table id="dataview" ></table>
	<table id="cartTable">
                    <tbody>
                    <s:iterator value="stockandsales" var="b">
                 <%--   <s:form action="fruitupdate"> --%>
                        <tr>
                         <td class="unit-price"><s:property value="fruitID"/></td>
                            <td class="goods">
                              <%--   <img src="${b.picture}"> --%>
                                <span><s:property value="stock"/></span>
                            </td>
                            <td class="unit-price"><s:property value="sale"/></td>
                            <td class="count">
                       <s:property value="stock-sale"/>
                             <%--    <span class="reduce"></span>
                                <input type="text" class="count-input" value="1" name="">
                                <span class="add">+</span> --%>
                            </td>
                         <%--    <td class="subtotal"></td>
                               <td class="operation">
                            <s:submit value="更新"/>
                            </td> --%>
                            <td class="operation">
                           <%--    <a href="${pageContext.request.contextPath}/FruitDeleteAction?id=${b.id}">删除</a> --%>
                            </td>
                        </tr>
                        <%-- </s:form> --%>
                        </s:iterator>
                     <%--    <tr>
                            
                            <td class="goods">
                                <img src="images/c11.jpg">
                                <span> 美国新奇士进口脐橙</span>
                            </td>
                            <td class="unit-price">19.9</td>
                            <td class="count">
                                <span class="reduce"></span>
                                <input type="text" class="count-input" value="1" name="">
                                <span class="add">+</span>
                            </td>
                            <td class="subtotal"></td>
                            <td class="operation">
                                <span class="delete">删除</span>
                            </td>
                        </tr>
                        <tr>
                            
                            <td class="goods">
                                <img src="images/c10.jpg">
                                <span>海南芒果 天涯海角</span>
                            </td>
                            <td class="unit-price">29.9</td>
                            <td class="count">
                                <span class="reduce"></span>
                                <input type="text" class="count-input" value="1" name="">
                                <span class="add">+</span>
                            </td>
                            <td class="subtotal"></td>
                            <td class="operation">
                                <s:submit value="删除"/>
                            </td>
                        </tr>
                        <tr>
                            
                            <td class="goods">
                                <img src="images/c9.jpg">
                                <span>新鲜清甜多汁！6个 约1kg -1.5kg 美国新奇士进口脐橙 </span>
                            </td>
                            <td class="unit-price">9.9</td>
                            <td class="count">
                                <span class="reduce"></span>
                                <input type="text" class="count-input" value="1" name="">
                                <span class="add">+</span>
                            </td>
                            <td class="subtotal"></td>
                            <td class="operation">
                                <span class="delete">删除</span>
                            </td>
                        </tr>
                        <tr>
                            
                            <td class="goods">
                                <img src="images/c8.jpg">
                                <span>美国新奇士进口脐橙 新鲜清甜多汁！6个 约1kg -1.5kg</span>
                            </td>
                            <td class="unit-price">29.9</td>
                            <td class="count">
                                <span class="reduce"></span>
                                <input type="text" class="count-input" value="1" name="">
                                <span class="add">+</span>
                            </td>
                            <td class="subtotal"></td>
                            <td class="operation">
                                <span class="delete">删除</span>
                            </td>
                        </tr> --%>
                    </tbody>
    </table>
	<!-- 对话框 -->
	<div id="wedit" class="easyui-window" data-options="title:'商品管理',iconCls:'icon-save',modal:true,closed:true"
        style="width: 500px; height: 340px; padding: 5px;">
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