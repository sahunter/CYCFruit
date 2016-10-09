<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>更新入库</title>
    <link rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="css/demo.css">
    <link rel="stylesheet" type="text/css" href="css/fw.css">
    <script type="text/javascript" src="easyui/jquery-1.7.2.min.js"></script>
    <script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="easyui/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="js/common.js"></script>
    <script type="text/javascript" src="js/JQuery-formui.js"></script>
    <!-- <script type="text/javascript" src="roleedit.js"></script> -->
</head>

<body>
    <div data-options="fit:true">
        <!-- 内容栏 -->
        <div class="editcontent" style="padding:10px;background:#fff;border:1px solid #ccc;height:200px;">
            <div id="maindata">
                <!-- 不需要显示的字段 -->
                <div style="display:none;">
                    <input id="LEVEL" type="text">
                    <input id="ICODE" type="text">
                </div>
                <s:form action="stockadd">
                <table class="table table-hover table-condensed">
                    <tr>
                        <th>商品编号</th>
                        <td colspan="3">
                            <s:textfield id="FULLNAME" name="fruitID" class="span5" style="width:322px;"/>
                        </td>
                    </tr>
                  <!--   <tr>
                        <th>商品图片</th>
                        <td colspan="3">
                            <input id="FULLNAME" type="file" class="span5" style="width:322px;">
                        </td>
                    </tr> -->
                   <!--  <tr>
                        <th>商品单价</th>
                        <td colspan="3">
                              <s:textfield id="FULLNAME" name="fruit.price" class="span5" style="width:322px;"/>
                        </td>
                    </tr> -->
                    <tr>
                        <th>更新入库</th>
                        <td colspan="3">
                              <s:textfield id="FULLNAME" name="stock" class="span5" style="width:322px;"/>
                        </td>
                    </tr>	
                    <tr><td><s:submit  value="保存"/></td><td><s:reset value="重填"/></td></tr>
                </table>
                </s:form>
            </div>
        </div>
        <!-- 保存按钮栏 -->
     <!--    <div style="text-align:center;padding:5px 0;">
            <a id="btnSave" class="easyui-linkbutton" data-options="iconCls:'icon-ok'">保 存</a> &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
            <a id="btnCancel" class="easyui-linkbutton" data-options="iconCls:'icon-cancel'">取 消</a>
        </div> -->
    </div>
</body>

</html>
