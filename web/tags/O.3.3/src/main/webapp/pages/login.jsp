<%@ page language="java" %>
<%@ taglib uri="/tags/struts-bean" prefix="bean" %>
<%@ taglib uri="/tags/struts-html" prefix="html" %>
<%@ taglib uri="/tags/struts-logic" prefix="logic" %>

<!DOCTYPE HTML PUBLIC "-//w3c//dtd html 4.0 transitional//en">
<html>
<head>
<title><bean:message key="pages.login.title"/></title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" type="text/css" href="styles/styles.css"/>
</head>
<body class="body"> 

<table width="350" border="0" cellpadding="0" cellspacing="0" align="center">  


	<tr>
		<td>&nbsp;</td>
	</tr>	
	<tr>
		<td>&nbsp;</td>
	</tr>	
	<tr>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td class="configTexte09" align="center">
		<bean:message key="pages.login.heading"/>
		</td>
	<tr>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td>&nbsp;</td>
	</tr>
	

	
	
	<html:form action="/login.do?o=login" method="POST" enctype="multipart/form-data" focus="login">
	
	<tr>
		<td class="configTexte11"><bean:message key="pages.common.login"/> : <html:text property="login" maxlength="100" size="20" styleClass="field" /></td>
	</tr>
	<tr>
		<td height="5">&nbsp;</td>
	</tr>
		<tr>
		<td class="configTexte11"><bean:message key="pages.common.password"/> : <html:password property="password" maxlength="10" size="10" styleClass="field"/></td>
	</tr>
	<tr>
		<td height="5">&nbsp;</td>
	</tr>	
	<tr>
		<td>&nbsp;</td>
	</tr>
	<tr>
		<td align="right">
				<TABLE width="130" border="0" cellpadding="0" cellspacing="0">
					<TR>
					  <TD colspan="2" rowspan="3"><IMG src="images/coin2_h_g.gif" width="3" height="3"></TD>
					  <TD width="128" class="configFond08"><IMG src="images/vide.gif" width="1" height="1"></TD>
					  <TD colspan="2" rowspan="3"><IMG src="images/coin2_h_d.gif" width="3" height="3"></TD>
					</TR>
					<TR>
					  <TD class="configFond06"><IMG src="images/vide.gif" width="1" height="1"></TD>
					</TR>
					<TR>
					  <TD class="configFond14"><IMG src="images/vide.gif" width="1" height="1"></TD>
					</TR>
					<TR>
					  <TD width="1" class="configFond08"><IMG src="images/vide.gif" width="1" height="1"></TD>
					  <TD width="2" class="configFond14"><IMG src="images/vide.gif" width="2" height="1"></TD>
					  <TD height="13" align="center" class="configFond14">&nbsp;&nbsp;&nbsp;&nbsp;<a href="javascript:window.document.loginForm.submit()" class="configLien11" title="<bean:message key="pages.login.enter"/>"><bean:message key="pages.login.enter"/></A>&nbsp;&nbsp;&nbsp;&nbsp;</TD>
					  <TD width="2" class="configFond14"><IMG src="images/vide.gif" width="2" height="1"></TD>
					  <TD width="1" class="configFond08"><IMG src="images/vide.gif" width="1" height="1"></TD>
					</TR>
					<TR>
					  <TD colspan="2" rowspan="3"><IMG src="images/coin2_b_g.gif" width="3" height="3"></TD>
					  <TD class="configFond14"><IMG src="images/vide.gif" width="1" height="1"></TD>
					  <TD colspan="2" rowspan="3"><IMG src="images/coin2_b_d.gif" width="3" height="3"></TD>
					</TR>
					<TR>
					  <TD class="configFond16"><IMG src="images/vide.gif" width="1" height="1"></TD>
					</TR>
					<TR>
					  <TD class="configFond08"><IMG src="images/vide.gif" width="1" height="1"></TD>
					</TR>
				</TABLE>
		</td>
	</tr>

	</html:form>
	
</table>



<TABLE width="232" border="0" cellpadding="0" cellspacing="0" class="configFond18">
        <TR>
          <TD colspan="2" rowspan="2"><IMG src="images/coin3_h_g.gif" width="5" height="5"></TD>
          <TD class="configFond04"><IMG src="images/vide.gif" width="1" height="1"></TD>
          <TD colspan="2" rowspan="2"><IMG src="images/coin3_h_d.gif" width="5" height="5"></TD>
        </TR>
        <TR>
          <TD><IMG src="images/vide.gif" width="1" height="4"></TD>
        </TR>
        <TR>
          <TD width="1" class="configFond04"><IMG src="images/vide.gif" width="1" height="1"></TD>
          <TD width="4"><IMG src="images/vide.gif" width="4" height="1"></TD>
          <TD width="232">
            <TABLE width="232" border="0" cellspacing="0" cellpadding="0">
              <TR>
                <TD height="17" class="configTexte16"><bean:message key="pages.login.availableModules"/></TD>
              </TR>
              
              <logic:present name="projectManagerVersion" scope="application">
              <TR>
                <TD>
                  <TABLE width="232" border="0" cellspacing="0" cellpadding="0">
                    <TR>
                      <TD width="20"><IMG src="images/puce_bleue_2.gif" width="13" height="13"></TD>
                      <TD width="212" height="20" class="configTexte10"><bean:message key="pages.login.modules.ProjectManager"/> (<bean:message key="pages.login.version"/>  )</TD>
                    </TR>
                  </TABLE>
                </TD>
              </TR>
              </logic:present>
              
              <logic:present name="documentManagerVersion" scope="application">
              <TR>
                <TD>
                  <TABLE width="232" border="0" cellspacing="0" cellpadding="0">
                    <TR>
                      <TD width="20"><IMG src="images/puce_bleue_2.gif" width="13" height="13"></TD>
                      <TD width="212" height="20" class="configTexte10"><bean:message key="pages.login.modules.documentManager"/> (<bean:message key="pages.login.version"/>  <bean:write name="documentManagerVersion" />)</TD>
                    </TR>
                  </TABLE>
                </TD>
              </TR>
              </logic:present>
              
              <logic:present name="bugTrackerVersion" scope="application">
              <TR>
                <TD>
                  <TABLE width="232" border="0" cellspacing="0" cellpadding="0">
                    <TR>
                      <TD width="20"><IMG src="images/puce_bleue_2.gif" width="13" height="13"></TD>
                      <TD width="212" height="20" class="configTexte10"><bean:message key="pages.login.modules.bugTracker"/> (<bean:message key="pages.login.version"/>  <bean:write name="bugTrackerVersion" /> )</TD>
                    </TR>
                  </TABLE>
                </TD>
              </TR>
              </logic:present>
              
              <logic:present name="forumVersion" scope="application">
              <TR>
                <TD>
                  <TABLE width="232" border="0" cellspacing="0" cellpadding="0">
                    <TR>
                      <TD width="20"><IMG src="images/puce_bleue_2.gif" width="13" height="13"></TD>
                      <TD width="212" height="20" class="configTexte10"><bean:message key="pages.login.modules.forum"/> (<bean:message key="pages.login.version"/>  <bean:write name="forumVersion" />)</TD>
                    </TR>
                  </TABLE>
                </TD>
              </TR>
              </logic:present>
              
              <logic:present name="calendarVersion" scope="application">
              <TR>
                <TD>
                  <TABLE width="232" border="0" cellspacing="0" cellpadding="0">
                    <TR>
                      <TD width="20"><IMG src="images/puce_bleue_2.gif" width="13" height="13"></TD>
                      <TD width="212" height="20" class="configTexte10"><bean:message key="pages.login.modules.calendar"/> (<bean:message key="pages.login.version"/>  <bean:write name="calendarVersion" />)</TD>
                    </TR>
                  </TABLE>
                </TD>
              </TR>
              </logic:present>
              
               <logic:present name="evolutionManagerVersion" scope="application">
                <TR>
                <TD>
                  <TABLE width="232" border="0" cellspacing="0" cellpadding="0">
                    <TR>
                      <TD width="20"><IMG src="images/puce_bleue_2.gif" width="13" height="13"></TD>
                      <TD width="212" height="20" class="configTexte10"><bean:message key="pages.login.modules.evolutionManager"/> (<bean:message key="pages.login.version"/>  <bean:write name="evolutionManagerVersion" />)</TD>
                    </TR>
                  </TABLE>
                </TD>
              </TR>
              </logic:present>
              
              <logic:present name="coreVersion">
                <TR>
                <TD>
                  <TABLE width="232" border="0" cellspacing="0" cellpadding="0">
                    <TR>
                      <TD width="20"><IMG src="images/puce_bleue_2.gif" width="13" height="13"></TD>
                      <TD width="212" height="20" class="textForBodyText"><bean:message key="pages.login.modules.core"/> (<bean:message key="pages.login.version"/>  <bean:write name="coreVersion" />)</TD>
                    </TR>
                  </TABLE>
                </TD>
              </TR>
              </logic:present>
              
               <logic:present name="agilePlanningVersion">
                <TR>
                <TD>
                  <TABLE width="232" border="0" cellspacing="0" cellpadding="0">
                    <TR>
                      <TD width="20"><IMG src="images/puce_bleue_2.gif" width="13" height="13"></TD>
                      <TD width="212" height="20" class="textForBodyText"><bean:message key="pages.login.modules.agilePlanning"/> (<bean:message key="pages.login.version"/>  <bean:write name="agilePlanningVersion" />)</TD>
                    </TR>
                  </TABLE>
                </TD>
              </TR>
              </logic:present>
              
              <logic:present name="toDoVersion">
                <TR>
                <TD>
                  <TABLE width="232" border="0" cellspacing="0" cellpadding="0">
                    <TR>
                      <TD width="20"><IMG src="images/puce_bleue_2.gif" width="13" height="13"></TD>
                      <TD width="212" height="20" class="textForBodyText"><bean:message key="pages.login.modules.toDo"/> (<bean:message key="pages.login.version"/>  <bean:write name="toDoVersion" />)</TD>
                    </TR>
                  </TABLE>
                </TD>
              </TR>
              </logic:present>
              
              
              <TR>
                <TD class="configFond19"><IMG src="images/vide.gif" width="1" height="1"></TD>
              </TR>
            </TABLE>
          </TD>
          <TD width="4"><IMG src="images/vide.gif" width="4" height="1"></TD>
          <TD width="1" class="configFond04"><IMG src="images/vide.gif" width="1" height="1"></TD>
        </TR>
        <TR>
          <TD colspan="2" rowspan="2"><IMG src="images/coin3_b_g.gif" width="5" height="5"></TD>
          <TD><IMG src="images/vide.gif" width="1" height="4"></TD>
          <TD colspan="2" rowspan="2"><IMG src="images/coin3_b_d.gif" width="5" height="5"></TD>
        </TR>
        <TR>
          <TD class="configFond04"><IMG src="images/vide.gif" width="1" height="1"></TD>
        </TR>
      </TABLE>


</body>
</html>