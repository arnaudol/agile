<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>

<p class="textForBodyTitle" align="left"><a href="iteration.do?action=list"><bean:message key="pages.common.list"/></a> > <a href="iteration.do?action=detail&persistanceId=<bean:write name="iterationPersistanceId" scope="request"/>"><bean:message key="pages.common.detail"/></a> > <bean:message key="pages.agilePlanning.stories"/></p>
