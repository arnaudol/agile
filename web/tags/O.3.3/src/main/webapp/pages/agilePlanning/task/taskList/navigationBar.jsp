<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

<bean:parameter id="storyPersistanceId" name="storyPersistanceId" value="0"/>

<p class="textForBodyTitle" align="left" colspan="1"><a href="story.do?action=list"><bean:message key="pages.common.list"/></a> > <a href="story.do?persistanceId=<bean:write name="storyPersistanceId"/>&action=detail"><bean:message key="pages.common.detail"/></a> > <bean:message key="pages.agilePlanning.task.tasks"/></p>
