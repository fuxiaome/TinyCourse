<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link href="/js/kindeditor-4.1.10/themes/default/default.css" type="text/css" rel="stylesheet">
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/kindeditor-all-min.js"></script>
<script type="text/javascript" charset="utf-8" src="/js/kindeditor-4.1.10/lang/zh_CN.js"></script>
<script type="text/javascript">
	//图片预览的JS代码
	function setImagePreview(avalue) {
		var docObj=document.getElementById("doc");

		var imgObjPreview=document.getElementById("preview");
		if(docObj.files &&docObj.files[0]){
			imgObjPreview.style.display = 'block';
			imgObjPreview.style.width = '150px';
			imgObjPreview.style.height = '180px'; 

			imgObjPreview.src = window.URL.createObjectURL(docObj.files[0]);
		}else{
			docObj.select();
			var imgSrc = document.selection.createRange().text;
			var localImagId = document.getElementById("localImag");
			localImagId.style.width = "150px";
			localImagId.style.height = "180px";
			try{
				localImagId.style.filter="progid:DXImageTransform.Microsoft.AlphaImageLoader(sizingMethod=scale)";
			localImagId.filters.item("DXImageTransform.Microsoft.AlphaImageLoader").src = imgSrc;
			}catch(e){
				alert("图片上传错误!");
				return false;
			}
			imgObjPreview.style.display = 'none';
			document.selection.empty();
		}
		return true;
	}


</script>
<div style="padding:10px 10px 10px 10px">
	<form id="userAddForm"  class="itemForm" method="post" >
	    <table cellpadding="5">
	        <tr>
	            <td>用户名:</td>
	            <td><input class="easyui-textbox" type="text" name="userName" data-options="required:true" style="width: 180px;"></input></td>
	        </tr>
	        
	         <tr>
	            <td>性别:</td>
	            <td>
	            	<select class="easyui-combobox"  name="userSex" data-options="required:true" style="width: 180px;">
				  	 	<option value="男">男</option>   
 		  			 	<option value="女">女</option> 
	            	</select>
				</td>
	        </tr>
	         <tr>
	            <td>所在学院:</td>
	            <td>
	            	<input style="width: 180px;" class="easyui-combobox" name="proId" data-options="
	            			valueField: 'proId', textField: 'proName', url: '/user/getProList'  "
	            		></input>
	            </td>
	        </tr>
	        <tr>
	            <td>密码:</td>
	            <td><input class="easyui-textbox" name="userPwd" data-options="required:true, validType:'length[0,150]'" style="width: 180px;"></input></td>
	        </tr>
	        <tr>
	            <td>生日:</td>
	            <td>
	            	<input id="dd" type="text" name="userBirthday" class="easyui-datebox" required="required"></input>  
	            </td>
	        </tr>
	        <tr>
	            <td>QQ:</td>
	            <td><input class="easyui-numberbox" type="text" name="userQq" data-options="min:1,max:9999999999,precision:0" /></td>
	        </tr>
	        <tr>
	            <td>邮箱:</td>
	            <td>
	                <input class="easyui-textbox" type="text" name="userEmail" data-options="required:true, validType:'length[1,30]' " />
	            </td>
	        </tr>
	        <tr>
	            <td>用户图像:</td>
	            <td>
					 <table width="100%" border="0" cellspacing="0" cellpadding="0">
							<tbody>
							<tr>
								<td align="center" style="padding-top:10px;">
									<input type="file" name="userImage" id="doc" style=	"width:150px;" onchange="javascript:setImagePreview();">
								</td>
							</tr>
							<tr>
								<td height="101" align="center">
									<div id="localImag"><img id="preview" src="http://blog.chuangling.net/Public/images/top.jpg" width="110" height="130" style="display: block; width: 110px; height: 130px;"></div>
								</td>
							</tr>
						</tbody>
					</table>
	            </td>
	        </tr>
	    </table>
	</form>
	
	<div style="padding:5px">
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="submitForm()">提交</a>
	    <a href="javascript:void(0)" class="easyui-linkbutton" onclick="clearForm()">重置</a>
	</div>
</div>
<script type="text/javascript">
	
	//提交表单
	function submitForm(){
		//有效性验证
 		if(!$('#userAddForm').form('validate')){
			$.messager.alert('提示','表单还未填写完成!');
			return ;
		} 
		
		/* $.post("/user/addUser",$("#userAddForm").serialize(), function(data){
			if(data.status == 200){
				$.messager.alert('提示','新增用户成功!');
			}
		}); */
		var formData = new FormData($('#userAddForm')[0]);  
		$.ajax({
			url: "/user/addUser",
			data: formData,
			type: "post",
			processData: false,
            contentType: false,
			success: function(data){
				$.messager.alert('提示','新增用户成功!');
			}
		});
	}
	
	function clearForm(){
		$('#userAddForm').form('reset');
	}
</script>

