// MockCreator v2.9.0 build 3065; HashCode:-992790945; net.sf.pmr.core.domain.project.DomainCollectionLasyLoadingInterceptor
package net.sf.pmr.core.domain.basicProject;

import de.abstrakt.mock.MockCore;

public class MockDomainCollectionLasyLoadingInterceptor implements net.sf.pmr.core.domain.project.DomainCollectionLasyLoadingInterceptor, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.core.domain.basicProject.MockDomainCollectionLasyLoadingInterceptor.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.project.MockDomainCollectionLasyLoadingInterceptor",null);
        return this;
    }

    public net.sf.pmr.core.domain.basicProject.MockDomainCollectionLasyLoadingInterceptor.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.project.MockDomainCollectionLasyLoadingInterceptor",th);
        return this;
    }

public void expectSetDomainListMapper(net.sf.pmr.keopsframework.data.DomainListMapper p0_DomainListMapper)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainListMapper);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDomainListMapper(DomainListMapper)"),params );
}
public void expectSetDomainListMapper(net.sf.pmr.keopsframework.data.DomainListMapper p0_DomainListMapper,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainListMapper);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDomainListMapper(DomainListMapper)"),params,toThrow );
}
public void acceptSetDomainListMapper(Object p0_DomainListMapper)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainListMapper);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDomainListMapper(DomainListMapper)"),params );
}
public void acceptSetDomainListMapper(Object p0_DomainListMapper,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainListMapper);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDomainListMapper(DomainListMapper)"),params,toThrow );
}
public void setSetDomainListMapperDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setDomainListMapper(DomainListMapper)"),null,null);
}
public void setSetDomainListMapperDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setDomainListMapper(DomainListMapper)"),null,toThrow);
}
public void setSetDomainListMapperDummy(net.sf.pmr.keopsframework.data.DomainListMapper p0_DomainListMapper,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainListMapper);

    MockCore.setDummy( getClassObjectMethodSignature("setDomainListMapper(DomainListMapper)"),params,toThrow);
}


public void acceptSetDomainListMapperDummy(Object p0_DomainListMapper, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainListMapper);

    MockCore.setDummy(getClassObjectMethodSignature("setDomainListMapper(DomainListMapper)"),params,valueToThrow);
}


public void expectInvoke(org.aopalliance.intercept.MethodInvocation p0_MethodInvocation, java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MethodInvocation);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("invoke(MethodInvocation)"),params, valueToReturn );
}
public void expectInvoke(org.aopalliance.intercept.MethodInvocation p0_MethodInvocation,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MethodInvocation);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("invoke(MethodInvocation)"),params,toThrow );
}
public void acceptInvoke(Object p0_MethodInvocation, java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MethodInvocation);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("invoke(MethodInvocation)"),params, valueToReturn );
}
public void acceptInvoke(Object p0_MethodInvocation,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MethodInvocation);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("invoke(MethodInvocation)"),params,toThrow );
}
public void setInvokeDummy(java.lang.Object toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("invoke(MethodInvocation)"),null,toReturn);
}
public void setInvokeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("invoke(MethodInvocation)"),null,toThrow);
}
public void setInvokeDummy(org.aopalliance.intercept.MethodInvocation p0_MethodInvocation,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MethodInvocation);

    MockCore.setDummy( getClassObjectMethodSignature("invoke(MethodInvocation)"),params,toThrow);
}
public void setInvokeDummy(org.aopalliance.intercept.MethodInvocation p0_MethodInvocation,java.lang.Object toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MethodInvocation);

    MockCore.setDummy( getClassObjectMethodSignature("invoke(MethodInvocation)"),params,toReturn);
}
public void acceptInvokeDummy(Object p0_MethodInvocation, java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MethodInvocation);

    MockCore.setDummy( getClassObjectMethodSignature("invoke(MethodInvocation)"),params, valueToReturn );
}
public void acceptInvokeDummy(Object p0_MethodInvocation, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MethodInvocation);

    MockCore.setDummy(getClassObjectMethodSignature("invoke(MethodInvocation)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.project.MockDomainCollectionLasyLoadingInterceptor"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.project.DomainCollectionLasyLoadingInterceptor";
}
    public MockDomainCollectionLasyLoadingInterceptor()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.core.domain.project.MockDomainCollectionLasyLoadingInterceptor",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.core.domain.basicProject.MockDomainCollectionLasyLoadingInterceptor.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.core.domain.project.MockDomainCollectionLasyLoadingInterceptor",params);
        return new net.sf.pmr.core.domain.basicProject.MockDomainCollectionLasyLoadingInterceptor.PreMock(id);
    }

    public static net.sf.pmr.core.domain.basicProject.MockDomainCollectionLasyLoadingInterceptor.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.project.MockDomainCollectionLasyLoadingInterceptor",null);
        return new net.sf.pmr.core.domain.basicProject.MockDomainCollectionLasyLoadingInterceptor.PreMock(id);
    }

    public static net.sf.pmr.core.domain.basicProject.MockDomainCollectionLasyLoadingInterceptor.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.project.MockDomainCollectionLasyLoadingInterceptor",th);
        return new net.sf.pmr.core.domain.basicProject.MockDomainCollectionLasyLoadingInterceptor.PreMock(id);
    }

    public void setDomainListMapper(net.sf.pmr.keopsframework.data.DomainListMapper p0_DomainListMapper)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainListMapper);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setDomainListMapper(DomainListMapper)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetDomainListMapper(net.sf.pmr.keopsframework.data.DomainListMapper p0_DomainListMapper)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainListMapper);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDomainListMapper(DomainListMapper)"),params );
}
public void expectSetDomainListMapper(net.sf.pmr.keopsframework.data.DomainListMapper p0_DomainListMapper,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainListMapper);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDomainListMapper(DomainListMapper)"),params,toThrow );
}
public void acceptSetDomainListMapper(Object p0_DomainListMapper)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainListMapper);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDomainListMapper(DomainListMapper)"),params );
}
public void acceptSetDomainListMapper(Object p0_DomainListMapper,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainListMapper);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDomainListMapper(DomainListMapper)"),params,toThrow );
}
public void setSetDomainListMapperDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setDomainListMapper(DomainListMapper)"),null,null);
}
public void setSetDomainListMapperDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setDomainListMapper(DomainListMapper)"),null,toThrow);
}
public void setSetDomainListMapperDummy(net.sf.pmr.keopsframework.data.DomainListMapper p0_DomainListMapper,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainListMapper);

    MockCore.setDummy( getClassObjectMethodSignature("setDomainListMapper(DomainListMapper)"),params,toThrow);
}


public void acceptSetDomainListMapperDummy(Object p0_DomainListMapper, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainListMapper);

    MockCore.setDummy(getClassObjectMethodSignature("setDomainListMapper(DomainListMapper)"),params,valueToThrow);
}


    public java.lang.Object invoke(org.aopalliance.intercept.MethodInvocation p0_MethodInvocation) throws java.lang.Throwable
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_MethodInvocation);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("invoke(MethodInvocation)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof java.lang.Throwable )
    {
        throw (java.lang.Throwable)returnValue;
    }
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (java.lang.Object)returnValue;
}
public void expectInvoke(org.aopalliance.intercept.MethodInvocation p0_MethodInvocation, java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MethodInvocation);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("invoke(MethodInvocation)"),params, valueToReturn );
}
public void expectInvoke(org.aopalliance.intercept.MethodInvocation p0_MethodInvocation,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MethodInvocation);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("invoke(MethodInvocation)"),params,toThrow );
}
public void acceptInvoke(Object p0_MethodInvocation, java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MethodInvocation);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("invoke(MethodInvocation)"),params, valueToReturn );
}
public void acceptInvoke(Object p0_MethodInvocation,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MethodInvocation);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("invoke(MethodInvocation)"),params,toThrow );
}
public void setInvokeDummy(java.lang.Object toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("invoke(MethodInvocation)"),null,toReturn);
}
public void setInvokeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("invoke(MethodInvocation)"),null,toThrow);
}
public void setInvokeDummy(org.aopalliance.intercept.MethodInvocation p0_MethodInvocation,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MethodInvocation);

    MockCore.setDummy( getClassObjectMethodSignature("invoke(MethodInvocation)"),params,toThrow);
}
public void setInvokeDummy(org.aopalliance.intercept.MethodInvocation p0_MethodInvocation,java.lang.Object toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MethodInvocation);

    MockCore.setDummy( getClassObjectMethodSignature("invoke(MethodInvocation)"),params,toReturn);
}
public void acceptInvokeDummy(Object p0_MethodInvocation, java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MethodInvocation);

    MockCore.setDummy( getClassObjectMethodSignature("invoke(MethodInvocation)"),params, valueToReturn );
}
public void acceptInvokeDummy(Object p0_MethodInvocation, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MethodInvocation);

    MockCore.setDummy(getClassObjectMethodSignature("invoke(MethodInvocation)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.project.MockDomainCollectionLasyLoadingInterceptor"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.project.DomainCollectionLasyLoadingInterceptor";
}
