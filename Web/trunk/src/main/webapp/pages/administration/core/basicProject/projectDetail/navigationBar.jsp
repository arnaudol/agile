<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<p class="textForBodyTitle" align="left"><a href="basicProject.do?action=list"><bean:message key="pages.common.list"/></a> > <bean:message key="pages.common.detail"/>
<logic:notEqual name="basicProjectForm" property="persistanceId" value="0">
 > <a href="basicProject.do?action=memberList&persistanceId=<bean:write name="basicProjectForm" property="persistanceId" />"><bean:message key="pages.core.basicProjectDetail.member"/></a>
</logic:notEqual>
</p>