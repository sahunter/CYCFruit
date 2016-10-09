<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
     <%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
function formatParentId(value, row, index) {
	  if (value == 0) {
		    return null;
		  } 
		  return value;
		}

		/**
		 *格式化状态，如果为1，显示正常，为0显示禁用
		 */
		function formatState(value,row,index) {
		  switch (value) {
		  case 1:
		    return '正常';
		  case 0:
		    return '禁用';	
		  }
		}

		/**
		 *格式化操作，在每行的操作栏显示编辑和删除操作
		 */
		function formatAction(value, row, index) {
		  var str = '';

		  if (true) {
		    str += '<a href="javascript:onUpdate()" >编辑</a>';
		  }
		  str += ' | ';
		  if (true) {
		    str += '<a href="javascript:onDelete()">删除</a>';
		  }

		  return str;
		}
		</script>

</head>
<body class="easyui-layout" data-options="fit:true,border:false">
<div>
<span style="white-space:pre">	</span><table id="resourcelist" class="easyui-treegrid"
    data-options="url:'privilegemgmt/resourceAction_getAll.action',idField:'id',treeField:'resourceName',toolbar:'#tb',border:false">
  <thead>
    <tr>
      <th data-options="field:'id',width:40">编号</th>
      <th data-options="field:'Name',width:150">资源名称</th>
   <!--    <th data-options="field:'resourceUrl',width:200">资源路径</th>
      <th data-options="field:'resourceOrder',width:50">排序</th>
      <th data-options="field:'icon',width:80">图标</th>
      <th data-options="field:'resourceType',width:80">资源类型</th> -->
      <th data-options="field:'superCategory',width:80">上级资源ID</th>
      <th data-options="field:'enable',width:50">状态</th>
      <th data-options="field:'action',width:120">操作</th>
    </tr>
  </thead>
<span style="white-space:pre">	</span></table>
<span style="white-space:pre">	</span><div id="tb">
<span style="white-space:pre">		</span><a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="onAdd()">增加</a>
<span style="white-space:pre">	</span>	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="onUpdate()">编辑</a>
<span style="white-space:pre">		</span><a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="onDelete()">删除</a>  
<span style="white-space:pre">	</span></div>
</div>
</body>
</html>