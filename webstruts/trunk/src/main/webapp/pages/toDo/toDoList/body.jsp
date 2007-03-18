<%@ taglib uri="/WEB-INF/displaytag-12.tld" prefix="display" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>

<TABLE width="100%" border="0" cellspacing="0" cellpadding="0"> 
	<TR> 
		<TD><display:table defaultsort="1" pagesize="10" name="toDoList" class="default" style="cellpadding:0;cellspacing=0;border:0;width:100%;align:left" requestURI="toDo.do?action=list" decorator="net.sf.pmr.struts.todo.table.Decorator">
			  <display:column width="681" property="description" sortable="true" titleKey="pages.toDo.description" href="toDo.do?action=detail" paramId="persistanceId" paramProperty="persistanceId"/>
  			  <display:column width="95" property="date" sortable="true" titleKey="pages.toDo.date"/>
			  <display:column width="56" align="center" property="doneImage" sortable="true" titleKey="pages.toDo.done"/> 
			</display:table>
		</TD>
	</TR>
</TABLE>