<%@ taglib uri="/WEB-INF/displaytag-12.tld" prefix="display" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

<bean:parameter id="storyPersistanceId" name="storyPersistanceId" value="0"/>

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 
	<TR> 
		<TD><display:table defaultsort="1" pagesize="10" name="taskList" class="default" style="cellpadding:0;cellspacing=0;border:0;width:100%;align:left" requestURI="task.do?action=list" decorator="net.sf.pmr.struts.agilePlanning.task.table.Decorator">
			  <display:column width="560" property="shortDescription" sortable="true" titleKey="pages.agilePlanning.task.shortDescription"/>
			  <display:column width="90" property="owner.name" sortable="true" titleKey="pages.agilePlanning.task.owner"/>
			  <display:column width="90" property="daysEstimated" sortable="true" titleKey="pages.agilePlanning.task.daysEstimated"/>
			  <display:column width="90" property="percentCompleted" sortable="true" titleKey="pages.agilePlanning.task.completed"/>			  
			  <display:column width="56" property="warningImage" sortable="true" titleKey="pages.common.warning" align="center"/>
			</display:table>
		</TD>
	</TR>
</TABLE>