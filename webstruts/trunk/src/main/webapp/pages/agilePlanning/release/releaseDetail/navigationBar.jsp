<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<p class="textForBodyTitle" align="left"><a href="release.do?action=list"><bean:message key="pages.common.list"/></a> > <bean:message key="pages.common.detail"/>

<logic:notEqual name="releaseForm" property="persistanceId" value="0">
 > <a href="release.do?action=storiesForRelease&releasePersistanceId=<bean:write name="releaseForm" property="persistanceId"/>"><bean:message key="pages.agilePlanning.stories"/>
</logic:notEqual>

</a></p>