<!DOCTYPE HTML>
<%@ page language="java" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/commons/taglibs.jsp" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title><d:title default="xxx"/></title>
    <meta name="keywords" content="">
    <meta name="description" content="">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="icon" type="image/png" href="/images/logo.ico">

    <link rel="stylesheet" href="/libs/bootstrap/css/bootstrap.min.css" type="text/css"/>
    <link rel="stylesheet" href="/libs/bootstrap/css/bootstrap-theme.min.css" type="text/css"/>

    <script src="/libs/jquery/jquery-1.9.1.min.js?v=20150723"></script>
    <script src="/libs/bootstrap/js/bootstrap.min.js"></script>
    <script src="/libs/jquery/jquery.validate.min.js?v=20150723"></script>
    <script src="/libs/jquery/jquery.form.min.js?v=20150723"></script>
    <d:head/>
</head>

<body>
<%@ include file="/WEB-INF/commons/header.jsp" %>
<c:if test="${not empty _error}">
    <div id="message" class="alert alert-info">${_error}</div>
</c:if>
<c:if test="${not empty _msg}">
    <div id="message" class="alert alert-info">${_msg}</div>
</c:if>
<c:if test="${not _blank}">
    <d:body/>
</c:if>
<%@ include file="/WEB-INF/commons/footer.jsp" %>
</body>
</html>