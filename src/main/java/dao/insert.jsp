<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
Class.forName("oracle.jdbc.driver.OracleDriver"3);
Connection conn = DriverManager();
String sql="";
PreparedStatement pstat = conn.prepareStatement(sql);
pstmt.setStirng(1, "");
pstmt.executeUpdate();
%>