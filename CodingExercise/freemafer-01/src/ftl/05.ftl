<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
<hr/>
<#list users as user>
我是：${user.id}号---------${user.name}-------今年${user.age}岁了<br/>
</#list>
</body>
</html>