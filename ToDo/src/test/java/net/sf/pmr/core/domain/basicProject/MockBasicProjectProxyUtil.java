// MockCreator v2.9.0 build 3065; HashCode:1652500937; net.sf.pmr.core.domain.basicProject.BasicProjectProxyUtil
package net.sf.pmr.core.domain.basicProject;

import de.abstrakt.mock.MockCore;

public class MockBasicProjectProxyUtil implements net.sf.pmr.core.domain.basicProject.BasicProjectProxyUtil, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil",null);
        return this;
    }

    public net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil",th);
        return this;
    }

public void expectInjectDependencies(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject, net.sf.pmr.core.domain.basicProject.BasicProject valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("injectDependencies(BasicProject)"),params, valueToReturn );
}
public void expectInjectDependencies(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("injectDependencies(BasicProject)"),params,toThrow );
}
public void acceptInjectDependencies(Object p0_BasicProject, net.sf.pmr.core.domain.basicProject.BasicProject valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("injectDependencies(BasicProject)"),params, valueToReturn );
}
public void acceptInjectDependencies(Object p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("injectDependencies(BasicProject)"),params,toThrow );
}
public void setInjectDependenciesDummy(net.sf.pmr.core.domain.basicProject.BasicProject toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("injectDependencies(BasicProject)"),null,toReturn);
}
public void setInjectDependenciesDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("injectDependencies(BasicProject)"),null,toThrow);
}
public void setInjectDependenciesDummy(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("injectDependencies(BasicProject)"),params,toThrow);
}
public void setInjectDependenciesDummy(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject,net.sf.pmr.core.domain.basicProject.BasicProject toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("injectDependencies(BasicProject)"),params,toReturn);
}
public void acceptInjectDependenciesDummy(Object p0_BasicProject, net.sf.pmr.core.domain.basicProject.BasicProject valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("injectDependencies(BasicProject)"),params, valueToReturn );
}
public void acceptInjectDependenciesDummy(Object p0_BasicProject, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.setDummy(getClassObjectMethodSignature("injectDependencies(BasicProject)"),params,valueToThrow);
}


public void expectGetTarget(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject, net.sf.pmr.core.domain.basicProject.BasicProject valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTarget(BasicProject)"),params, valueToReturn );
}
public void expectGetTarget(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTarget(BasicProject)"),params,toThrow );
}
public void acceptGetTarget(Object p0_BasicProject, net.sf.pmr.core.domain.basicProject.BasicProject valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTarget(BasicProject)"),params, valueToReturn );
}
public void acceptGetTarget(Object p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTarget(BasicProject)"),params,toThrow );
}
public void setGetTargetDummy(net.sf.pmr.core.domain.basicProject.BasicProject toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getTarget(BasicProject)"),null,toReturn);
}
public void setGetTargetDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getTarget(BasicProject)"),null,toThrow);
}
public void setGetTargetDummy(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("getTarget(BasicProject)"),params,toThrow);
}
public void setGetTargetDummy(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject,net.sf.pmr.core.domain.basicProject.BasicProject toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("getTarget(BasicProject)"),params,toReturn);
}
public void acceptGetTargetDummy(Object p0_BasicProject, net.sf.pmr.core.domain.basicProject.BasicProject valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("getTarget(BasicProject)"),params, valueToReturn );
}
public void acceptGetTargetDummy(Object p0_BasicProject, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.setDummy(getClassObjectMethodSignature("getTarget(BasicProject)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.basicProject.BasicProjectProxyUtil";
}
    public MockBasicProjectProxyUtil()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil",params);
        return new net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil.PreMock(id);
    }

    public static net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil",null);
        return new net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil.PreMock(id);
    }

    public static net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil",th);
        return new net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil.PreMock(id);
    }

    public net.sf.pmr.core.domain.basicProject.BasicProject injectDependencies(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("injectDependencies(BasicProject)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (net.sf.pmr.core.domain.basicProject.BasicProject)returnValue;
}
public void expectInjectDependencies(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject, net.sf.pmr.core.domain.basicProject.BasicProject valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("injectDependencies(BasicProject)"),params, valueToReturn );
}
public void expectInjectDependencies(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("injectDependencies(BasicProject)"),params,toThrow );
}
public void acceptInjectDependencies(Object p0_BasicProject, net.sf.pmr.core.domain.basicProject.BasicProject valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("injectDependencies(BasicProject)"),params, valueToReturn );
}
public void acceptInjectDependencies(Object p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("injectDependencies(BasicProject)"),params,toThrow );
}
public void setInjectDependenciesDummy(net.sf.pmr.core.domain.basicProject.BasicProject toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("injectDependencies(BasicProject)"),null,toReturn);
}
public void setInjectDependenciesDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("injectDependencies(BasicProject)"),null,toThrow);
}
public void setInjectDependenciesDummy(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("injectDependencies(BasicProject)"),params,toThrow);
}
public void setInjectDependenciesDummy(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject,net.sf.pmr.core.domain.basicProject.BasicProject toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("injectDependencies(BasicProject)"),params,toReturn);
}
public void acceptInjectDependenciesDummy(Object p0_BasicProject, net.sf.pmr.core.domain.basicProject.BasicProject valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("injectDependencies(BasicProject)"),params, valueToReturn );
}
public void acceptInjectDependenciesDummy(Object p0_BasicProject, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.setDummy(getClassObjectMethodSignature("injectDependencies(BasicProject)"),params,valueToThrow);
}


    public net.sf.pmr.core.domain.basicProject.BasicProject getTarget(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getTarget(BasicProject)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (net.sf.pmr.core.domain.basicProject.BasicProject)returnValue;
}
public void expectGetTarget(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject, net.sf.pmr.core.domain.basicProject.BasicProject valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTarget(BasicProject)"),params, valueToReturn );
}
public void expectGetTarget(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTarget(BasicProject)"),params,toThrow );
}
public void acceptGetTarget(Object p0_BasicProject, net.sf.pmr.core.domain.basicProject.BasicProject valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTarget(BasicProject)"),params, valueToReturn );
}
public void acceptGetTarget(Object p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTarget(BasicProject)"),params,toThrow );
}
public void setGetTargetDummy(net.sf.pmr.core.domain.basicProject.BasicProject toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getTarget(BasicProject)"),null,toReturn);
}
public void setGetTargetDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getTarget(BasicProject)"),null,toThrow);
}
public void setGetTargetDummy(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("getTarget(BasicProject)"),params,toThrow);
}
public void setGetTargetDummy(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject,net.sf.pmr.core.domain.basicProject.BasicProject toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("getTarget(BasicProject)"),params,toReturn);
}
public void acceptGetTargetDummy(Object p0_BasicProject, net.sf.pmr.core.domain.basicProject.BasicProject valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("getTarget(BasicProject)"),params, valueToReturn );
}
public void acceptGetTargetDummy(Object p0_BasicProject, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.setDummy(getClassObjectMethodSignature("getTarget(BasicProject)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.basicProject.BasicProjectProxyUtil";
}
