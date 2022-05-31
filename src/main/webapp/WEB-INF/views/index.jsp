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
<a href="/save-form">회원가입</a><br>
<a href="/login-form">로그인</a><br>
<a href="/board/findAll">글목록</a><br>
<a href="/logout">로그아웃</a>

${loginMember}
${sessionScope.loginMemberId}
${sessionScope.loginId}
</body>
</html>
