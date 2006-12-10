// MockCreator v2.9.0 build 3065; HashCode:1143349653; net.sf.pmr.core.domain.service.SecurityService
package net.sf.pmr.core.service;

import de.abstrakt.mock.MockCore;

public class MockSecurityService implements net.sf.pmr.core.service.SecurityService, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.core.service.MockSecurityService.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.service.MockSecurityService",null);
        return this;
    }

    public net.sf.pmr.core.service.MockSecurityService.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.service.MockSecurityService",th);
        return this;
    }

public void expectLogin(java.lang.String p0_String, java.lang.String p1_String, net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("login(String,String)"),params, valueToReturn );
}
public void expectLogin(java.lang.String p0_String, java.lang.String p1_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("login(String,String)"),params,toThrow );
}
public void acceptLogin(Object p0_String, Object p1_String, net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("login(String,String)"),params, valueToReturn );
}
public void acceptLogin(Object p0_String, Object p1_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("login(String,String)"),params,toThrow );
}
public void setLoginDummy(net.sf.pmr.core.domain.user.User toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("login(String,String)"),null,toReturn);
}
public void setLoginDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("login(String,String)"),null,toThrow);
}
public void setLoginDummy(java.lang.String p0_String, java.lang.String p1_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);

    MockCore.setDummy( getClassObjectMethodSignature("login(String,String)"),params,toThrow);
}
public void setLoginDummy(java.lang.String p0_String, java.lang.String p1_String,net.sf.pmr.core.domain.user.User toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);

    MockCore.setDummy( getClassObjectMethodSignature("login(String,String)"),params,toReturn);
}
public void acceptLoginDummy(Object p0_String, Object p1_String, net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);

    MockCore.setDummy( getClassObjectMethodSignature("login(String,String)"),params, valueToReturn );
}
public void acceptLoginDummy(Object p0_String, Object p1_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);

    MockCore.setDummy(getClassObjectMethodSignature("login(String,String)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.service.MockSecurityService"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.service.SecurityService";
}
    public MockSecurityService()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.core.domain.service.MockSecurityService",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.core.service.MockSecurityService.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.core.domain.service.MockSecurityService",params);
        return new net.sf.pmr.core.service.MockSecurityService.PreMock(id);
    }

    public static net.sf.pmr.core.service.MockSecurityService.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.service.MockSecurityService",null);
        return new net.sf.pmr.core.service.MockSecurityService.PreMock(id);
    }

    public static net.sf.pmr.core.service.MockSecurityService.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.service.MockSecurityService",th);
        return new net.sf.pmr.core.service.MockSecurityService.PreMock(id);
    }

    public net.sf.pmr.core.domain.user.User login(java.lang.String p0_String, java.lang.String p1_String)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("login(String,String)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (net.sf.pmr.core.domain.user.User)returnValue;
}
public void expectLogin(java.lang.String p0_String, java.lang.String p1_String, net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("login(String,String)"),params, valueToReturn );
}
public void expectLogin(java.lang.String p0_String, java.lang.String p1_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("login(String,String)"),params,toThrow );
}
public void acceptLogin(Object p0_String, Object p1_String, net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("login(String,String)"),params, valueToReturn );
}
public void acceptLogin(Object p0_String, Object p1_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("login(String,String)"),params,toThrow );
}
public void setLoginDummy(net.sf.pmr.core.domain.user.User toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("login(String,String)"),null,toReturn);
}
public void setLoginDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("login(String,String)"),null,toThrow);
}
public void setLoginDummy(java.lang.String p0_String, java.lang.String p1_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);

    MockCore.setDummy( getClassObjectMethodSignature("login(String,String)"),params,toThrow);
}
public void setLoginDummy(java.lang.String p0_String, java.lang.String p1_String,net.sf.pmr.core.domain.user.User toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);

    MockCore.setDummy( getClassObjectMethodSignature("login(String,String)"),params,toReturn);
}
public void acceptLoginDummy(Object p0_String, Object p1_String, net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);

    MockCore.setDummy( getClassObjectMethodSignature("login(String,String)"),params, valueToReturn );
}
public void acceptLoginDummy(Object p0_String, Object p1_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);

    MockCore.setDummy(getClassObjectMethodSignature("login(String,String)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.service.MockSecurityService"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.service.SecurityService";
}
