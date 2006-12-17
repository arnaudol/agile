<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
	
<p class="textForLeftTitle">	
	<bean:write name="basicProject.name" scope="session"/>
</p>
<p class="textForLeftText">
	<bean:write name="numberOfToDo" scope="request"/> <bean:message key="pages.toDo.toDos"/> (&nbsp;<a href="toDo.do?action=detail"><img src="images/add.png" border="0" align="middle">&nbsp;<bean:message key="pages.common.createnew"/></a>)
</p>
