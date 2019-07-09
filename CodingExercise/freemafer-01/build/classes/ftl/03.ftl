<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>大家好我是${user.id}号-----我叫：${user.name}-----今年${user.age}了，很高兴认识大家</h1>
<#if user.age lt 12>
    ${user.name}还是一个小孩
<#elseif user.age lt 18>
    ${user.name}快成年
<#else>
    ${user.name}已经成年
</#if>
</body>
</html>