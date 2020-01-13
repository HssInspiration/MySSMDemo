<%--
  Created by IntelliJ IDEA.
  User: xh999
  Date: 2020/1/13
  Time: 22:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript"
        src="${pageContext.request.contextPath}/core/jquery-3.4.1.min.js"></script>
<body>
<fmt:setBundle basename="i18n/i18n_${system_language}"/>
<div id="footer">
    <div id="copyright">
        <span><fmt:message key="common.copyright"/></span>
    </div>
    <div id="language">
        <span><fmt:message key="common.language"/>:</span>

        <a href="#" data-value="zh_CN">中文</a>
        <span>|</span>
        <a href="#" data-value="en_US">English</a>
        <span>|</span>
        <a href="#" data-value="ru_RU">俄文</a>
    </div>
</div>
</body>
<script type="text/javascript">
    $(function () {
        $('#language').find('a').click(function () {
            var language = $(this).data('value');
            document.cookie = "cookie_language=" + language +
                ";expires=365";
            location.reload();
        });
    });
</script>
</html>
