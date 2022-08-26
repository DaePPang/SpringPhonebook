<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach var="pb" items="${list}">
<li style="list-style-type: none" onclick="getPhonebook('${pb.idx}')">
<img src="https://w7.pngwing.com/pngs/981/645/png-transparent-default-profile-united-states-computer-icons-desktop-free-high-quality-person-icon-miscellaneous-silhouette-symbol.png" style="width:70px;height:50px">
<c:out value="${pb.name}"/><br>
<c:out value="${pb.hp}"/><br>
<c:out value="${pb.memo}"/><br>
</li>
</c:forEach>