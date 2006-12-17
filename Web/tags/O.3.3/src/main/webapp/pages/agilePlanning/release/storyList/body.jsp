<%@ taglib uri="/WEB-INF/displaytag-12.tld" prefix="display" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>


<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 
	<TR> 
		<TD><display:table defaultsort="1" pagesize="10" name="storyList" class="default" style="cellpadding:0;cellspacing=0;border:0;width:100%;align:left" requestURI="iteration.do?action=storiesForIteration" decorator="net.sf.pmr.struts.agilePlanning.story.table.Decorator">
			  <display:column width="355" property="shortDescription" sortable="true" titleKey="pages.agilePlanning.story.shortDescription"/>
  			  <display:column width="95" property="businessValue" sortable="true" titleKey="pages.agilePlanning.story.businessValue"/>
   			  <display:column width="90" property="riskLevel" sortable="true" titleKey="pages.agilePlanning.story.riskLevel"/>
			  <display:column width="90" property="daysEstimated" sortable="true" titleKey="pages.agilePlanning.story.daysEstimated"/>
  			  <display:column width="90" property="percentCompleted" sortable="true" titleKey="pages.agilePlanning.story.completed"/>
			  <display:column width="56" align="center" property="warningImage" sortable="true" titleKey="pages.common.warning"/>
			</display:table>
		</TD>
	</TR>
</TABLE>