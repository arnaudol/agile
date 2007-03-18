<%@ taglib uri="/WEB-INF/displaytag-12.tld" prefix="display" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

<bean:parameter id="storyPersistanceId" name="storyPersistanceId" value="0"/>
<bean:parameter id="taskPersistanceId" name="taskPersistanceId" value="0"/>

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 
	<TR> 
		<TD><display:table defaultsort="1" pagesize="10" name="chargeList" class="default" style="cellpadding:0;cellspacing=0;border:0;width:100%;align:left" requestURI="task.do?action=list" decorator="net.sf.pmr.struts.agilePlanning.charge.table.Decorator">
			  <display:column width="194" property="day" sortable="true" titleKey="pages.common.day"/>
			  <display:column width="194" property="user.lastName" sortable="true" titleKey="pages.common.user"/>
			  <display:column width="194" property="timeUsedToday" sortable="true" titleKey="pages.agilePlanning.charge.timeUsed" align="center"/>
  			  <display:column width="194" property="daysNeededToFinish" sortable="true" titleKey="pages.agilePlanning.charge.daysNeededToFinish" align="center"/>
			</display:table>
		</TD>
	</TR>
</TABLE>