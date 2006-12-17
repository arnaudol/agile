<%@ taglib uri="/WEB-INF/displaytag-12.tld" prefix="display" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 
	<TR> 
		<TD>
			<display:table pagesize="10" name="basicProjectList" class="default" style="cellpadding:0;cellspacing=0;border:0;width:100%;align:left" requestURI="basicProject.do?action=list">
			  <display:column property="code" sortable="true" title="Code" href="basicProject.do?action=detail" paramId="&persistanceId" paramProperty="persistanceId"/>
			  <display:column property="name" sortable="true" title="name"/>
			</display:table>
		</TD>
	</TR>
</TABLE>