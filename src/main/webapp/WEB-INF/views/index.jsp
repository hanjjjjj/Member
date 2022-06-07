<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-23
  Time: 오전 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/resources/css/bootstrap.min.css">
    <script>
        const saveForm = () => {
            location.href = "/board/save";
        }
        const saveFileForm = () => {
            location.href = "/board/saveFile";
        }
        const findAll = () => {
            location.href = "/board/findAll";
        }
        const paging = () => {
            location.href = "/board/paging";
        }
        // 회원가입: /member-save => /member/save
        // 글쓰기: /board-save => /board/save
    </script>
</head>
<body>
<header class="p-3 bg-dark text-white">
    <div class="d-flex flex-wrap align-items-center justify-content-center justify-content-lg-start">
        <ul class="nav col-12 col-lg-auto me-lg-auto mb-2 justify-content-center mb-md-0">
<li><a href="/save-form" class="nav-link px-2 text-secondary">회원가입</a></li><br>
<li><a href="/login-form" class="nav-link px-2 text-white ">로그인</a></li>
            <li><a href="/board/findAll" class="nav-link px-2 text-white">글목록</a></li>
            <li><a href="/logout" class="nav-link px-2 text-secondary">로그아웃</a></li>

${loginMember}
${sessionScope.loginMemberId}
${sessionScope.loginId}
</body>
</html>
