<!DOCTYPE HTML><%@ page language="java" pageEncoding="UTF-8"%><%@ include file="/WEB-INF/commons/taglibs.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<d:head />
</head>
<body>
  <%@ include file="/WEB-INF/commons/header_admin.jsp"%>
  <c:if test="${not _blank}">
    <div class="am-cf admin-main">
      <!-- sidebar start -->
      <div class="admin-sidebar am-offcanvas" id="admin-offcanvas">
        <div class=" admin-offcanvas-bar">
          <ul class="am-list admin-sidebar-list">
          </ul>
        </div>
      </div>
      <!-- sidebar end -->
      <div id="module-head"></div>
      <d:body />
    </div>
  </c:if>
  <a href="#" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu"
    data-am-offcanvas="{target: '#admin-offcanvas'}"></a>
  <footer>
    <hr>
    <p class="am-padding-left">© 2015 AllMobilize, Inc. ${sessionScope.WEBURL }.</p>
  </footer>

</body>
</html>
