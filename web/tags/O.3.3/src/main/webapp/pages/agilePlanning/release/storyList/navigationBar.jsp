<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>

<p class="textForBodyTitle" align="left"><a href="release.do?action=list"><bean:message key="pages.common.list"/></a> > <a href="release.do?action=detail&persistanceId=<bean:write name="releasePersistanceId" scope="request"/>"><bean:message key="pages.common.detail"/></a> > <bean:message key="pages.agilePlanning.stories"/></p>
