<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 
	<TR> 
		<TD height="17" class="textForLeftTitle"><bean:message key="pages.core.summary.title"/></TD> 
	</TR> 
	<TR> 
		<TD height="23" class="textForLeftText"><bean:message key="pages.core.summary.numberOfProject"/>: <bean:write name="numberOfProject" scope="request"/> (<a href="basicProject.do?action=detail"><bean:message key="pages.common.createnew"/></a>)</TD> 
	</TR> 
	<TR> 
		<TD height="23" class="textForLeftText"><bean:message key="pages.core.summary.numberOfUser"/>: <bean:write name="numberOfUser" scope="request"/> (<a href="user.do?action=detail"><bean:message key="pages.common.createnew"/></a>)</TD> 
	</TR> 
	<TR> 
		<TD height="23" class="textForLeftText">&nbsp;</TD> 
	</TR> 
	<TR> 
		<TD> </TD> 
	</TR> 
</TABLE>