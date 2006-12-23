<%@ taglib uri="/WEB-INF/displaytag-12.tld" prefix="display" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 
	<TR> 
		<TD><display:table pagesize="10" name="memberList" class="default" style="cellpadding:0;cellspacing=0;border:0;width:100%;align:left">
			  <display:column property="firstName" sortable="false" title="First name"/>
			  <display:column property="lastName" sortable="false" title="Last name"/>
			  <display:column property="company.name" sortable="true" title="Company"/>
			</display:table>
		</TD>
	</TR>
</TABLE>