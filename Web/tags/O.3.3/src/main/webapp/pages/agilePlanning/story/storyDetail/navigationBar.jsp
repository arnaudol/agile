<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<p class="textForBodyTitle" align="left" colspan="1"><a href="story.do?action=list"><bean:message key="pages.common.list"/></a> > <bean:message key="pages.common.detail"/> 

<logic:notEqual name="storyForm" property="persistanceId" value="0">
 > <a href="task.do?action=list&storyPersistanceId=<bean:write name="storyForm" property="persistanceId"/>"><bean:message key="pages.agilePlanning.task.tasks"/></a></p>
</logic:notEqual>
