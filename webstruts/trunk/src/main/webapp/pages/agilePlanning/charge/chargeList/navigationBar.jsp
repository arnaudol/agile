<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

<p class="textForBodyTitle" align="left"><a href="story.do?action=list"><bean:message key="pages.common.list"/></a> > <a href="story.do?persistanceId=<bean:write name="storyPersistanceId"/>&action=detail"><bean:message key="pages.common.detail"/></a> > <a href="task.do?action=list&storyPersistanceId=<bean:write name="storyPersistanceId"/>"><bean:message key="pages.agilePlanning.task.tasks"/></a> > <a href="task.do?action=detail&storyPersistanceId=<bean:write name="storyPersistanceId"/>&persistanceId=<bean:write name="taskPersistanceId"/>"><bean:message key="pages.common.detail"/></a> > <bean:message key="pages.agilePlanning.charge.charges"/></p>

