// MockCreator v2.9.0 build 3065; HashCode:1652500937; net.sf.pmr.core.domain.project.ProjectProxyUtil
package net.sf.pmr.core.domain.basicProject;

import de.abstrakt.mock.MockCore;

public class MockBasicProjectProxyUtil implements net.sf.pmr.core.domain.project.ProjectProxyUtil, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.project.MockBasicProjectProxyUtil",null);
        return this;
    }

    public net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.project.MockBasicProjectProxyUtil",th);
        return this;
    }

public void expectInjectDependencies(net.sf.pmr.core.domain.project.Project p0_BasicProject, net.sf.pmr.core.domain.project.Project valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("injectDependencies(Project)"),params, valueToReturn );
}
public void expectInjectDependencies(net.sf.pmr.core.domain.project.Project p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("injectDependencies(Project)"),params,toThrow );
}
public void acceptInjectDependencies(Object p0_BasicProject, net.sf.pmr.core.domain.project.Project valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("injectDependencies(Project)"),params, valueToReturn );
}
public void acceptInjectDependencies(Object p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("injectDependencies(Project)"),params,toThrow );
}
public void setInjectDependenciesDummy(net.sf.pmr.core.domain.project.Project toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("injectDependencies(Project)"),null,toReturn);
}
public void setInjectDependenciesDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("injectDependencies(Project)"),null,toThrow);
}
public void setInjectDependenciesDummy(net.sf.pmr.core.domain.project.Project p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("injectDependencies(Project)"),params,toThrow);
}
public void setInjectDependenciesDummy(net.sf.pmr.core.domain.project.Project p0_BasicProject,net.sf.pmr.core.domain.project.Project toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("injectDependencies(Project)"),params,toReturn);
}
public void acceptInjectDependenciesDummy(Object p0_BasicProject, net.sf.pmr.core.domain.project.Project valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("injectDependencies(Project)"),params, valueToReturn );
}
public void acceptInjectDependenciesDummy(Object p0_BasicProject, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.setDummy(getClassObjectMethodSignature("injectDependencies(Project)"),params,valueToThrow);
}


public void expectGetTarget(net.sf.pmr.core.domain.project.Project p0_BasicProject, net.sf.pmr.core.domain.project.Project valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTarget(Project)"),params, valueToReturn );
}
public void expectGetTarget(net.sf.pmr.core.domain.project.Project p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTarget(Project)"),params,toThrow );
}
public void acceptGetTarget(Object p0_BasicProject, net.sf.pmr.core.domain.project.Project valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTarget(Project)"),params, valueToReturn );
}
public void acceptGetTarget(Object p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTarget(Project)"),params,toThrow );
}
public void setGetTargetDummy(net.sf.pmr.core.domain.project.Project toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getTarget(Project)"),null,toReturn);
}
public void setGetTargetDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getTarget(Project)"),null,toThrow);
}
public void setGetTargetDummy(net.sf.pmr.core.domain.project.Project p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("getTarget(Project)"),params,toThrow);
}
public void setGetTargetDummy(net.sf.pmr.core.domain.project.Project p0_BasicProject,net.sf.pmr.core.domain.project.Project toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("getTarget(Project)"),params,toReturn);
}
public void acceptGetTargetDummy(Object p0_BasicProject, net.sf.pmr.core.domain.project.Project valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("getTarget(Project)"),params, valueToReturn );
}
public void acceptGetTargetDummy(Object p0_BasicProject, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.setDummy(getClassObjectMethodSignature("getTarget(Project)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.project.MockBasicProjectProxyUtil"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.project.ProjectProxyUtil";
}
    public MockBasicProjectProxyUtil()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.core.domain.project.MockBasicProjectProxyUtil",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.core.domain.project.MockBasicProjectProxyUtil",params);
        return new net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil.PreMock(id);
    }

    public static net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.project.MockBasicProjectProxyUtil",null);
        return new net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil.PreMock(id);
    }

    public static net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.project.MockBasicProjectProxyUtil",th);
        return new net.sf.pmr.core.domain.basicProject.MockBasicProjectProxyUtil.PreMock(id);
    }

    public net.sf.pmr.core.domain.project.Project injectDependencies(net.sf.pmr.core.domain.project.Project p0_BasicProject)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("injectDependencies(Project)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (net.sf.pmr.core.domain.project.Project)returnValue;
}
public void expectInjectDependencies(net.sf.pmr.core.domain.project.Project p0_BasicProject, net.sf.pmr.core.domain.project.Project valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("injectDependencies(Project)"),params, valueToReturn );
}
public void expectInjectDependencies(net.sf.pmr.core.domain.project.Project p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("injectDependencies(Project)"),params,toThrow );
}
public void acceptInjectDependencies(Object p0_BasicProject, net.sf.pmr.core.domain.project.Project valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("injectDependencies(Project)"),params, valueToReturn );
}
public void acceptInjectDependencies(Object p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("injectDependencies(Project)"),params,toThrow );
}
public void setInjectDependenciesDummy(net.sf.pmr.core.domain.project.Project toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("injectDependencies(Project)"),null,toReturn);
}
public void setInjectDependenciesDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("injectDependencies(Project)"),null,toThrow);
}
public void setInjectDependenciesDummy(net.sf.pmr.core.domain.project.Project p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("injectDependencies(Project)"),params,toThrow);
}
public void setInjectDependenciesDummy(net.sf.pmr.core.domain.project.Project p0_BasicProject,net.sf.pmr.core.domain.project.Project toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("injectDependencies(Project)"),params,toReturn);
}
public void acceptInjectDependenciesDummy(Object p0_BasicProject, net.sf.pmr.core.domain.project.Project valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("injectDependencies(Project)"),params, valueToReturn );
}
public void acceptInjectDependenciesDummy(Object p0_BasicProject, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.setDummy(getClassObjectMethodSignature("injectDependencies(Project)"),params,valueToThrow);
}


    public net.sf.pmr.core.domain.project.Project getTarget(net.sf.pmr.core.domain.project.Project p0_BasicProject)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getTarget(Project)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (net.sf.pmr.core.domain.project.Project)returnValue;
}
public void expectGetTarget(net.sf.pmr.core.domain.project.Project p0_BasicProject, net.sf.pmr.core.domain.project.Project valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTarget(Project)"),params, valueToReturn );
}
public void expectGetTarget(net.sf.pmr.core.domain.project.Project p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTarget(Project)"),params,toThrow );
}
public void acceptGetTarget(Object p0_BasicProject, net.sf.pmr.core.domain.project.Project valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTarget(Project)"),params, valueToReturn );
}
public void acceptGetTarget(Object p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTarget(Project)"),params,toThrow );
}
public void setGetTargetDummy(net.sf.pmr.core.domain.project.Project toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getTarget(Project)"),null,toReturn);
}
public void setGetTargetDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getTarget(Project)"),null,toThrow);
}
public void setGetTargetDummy(net.sf.pmr.core.domain.project.Project p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("getTarget(Project)"),params,toThrow);
}
public void setGetTargetDummy(net.sf.pmr.core.domain.project.Project p0_BasicProject,net.sf.pmr.core.domain.project.Project toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("getTarget(Project)"),params,toReturn);
}
public void acceptGetTargetDummy(Object p0_BasicProject, net.sf.pmr.core.domain.project.Project valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("getTarget(Project)"),params, valueToReturn );
}
public void acceptGetTargetDummy(Object p0_BasicProject, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.setDummy(getClassObjectMethodSignature("getTarget(Project)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.project.MockBasicProjectProxyUtil"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.project.ProjectProxyUtil";
}
