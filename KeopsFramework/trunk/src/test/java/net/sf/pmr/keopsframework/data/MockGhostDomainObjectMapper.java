// MockCreator v2.9.0 build 3065; HashCode:-1299517951; com.keops.data.GhostDomainObjectMapper
package net.sf.pmr.keopsframework.data;

import de.abstrakt.mock.MockCore;

public class MockGhostDomainObjectMapper implements net.sf.pmr.keopsframework.data.GhostDomainObjectMapper, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.keopsframework.data.MockGhostDomainObjectMapper.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"com.keops.data.MockGhostDomainObjectMapper",null);
        return this;
    }

    public net.sf.pmr.keopsframework.data.MockGhostDomainObjectMapper.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"com.keops.data.MockGhostDomainObjectMapper",th);
        return this;
    }

public void expectLoadForObject(java.lang.Object p0_Object, java.lang.Object p1_Object)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);
        params.add(p1_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForObject(Object,Object)"),params );
}
public void expectLoadForObject(java.lang.Object p0_Object, java.lang.Object p1_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);
        params.add(p1_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForObject(Object,Object)"),params,toThrow );
}
public void acceptLoadForObject(Object p0_Object, Object p1_Object)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);
params.add(p1_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForObject(Object,Object)"),params );
}
public void acceptLoadForObject(Object p0_Object, Object p1_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);
params.add(p1_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForObject(Object,Object)"),params,toThrow );
}
public void setLoadForObjectDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("loadForObject(Object,Object)"),null,null);
}
public void setLoadForObjectDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("loadForObject(Object,Object)"),null,toThrow);
}
public void setLoadForObjectDummy(java.lang.Object p0_Object, java.lang.Object p1_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);
        params.add(p1_Object);

    MockCore.setDummy( getClassObjectMethodSignature("loadForObject(Object,Object)"),params,toThrow);
}


public void acceptLoadForObjectDummy(Object p0_Object, Object p1_Object, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);
params.add(p1_Object);

    MockCore.setDummy(getClassObjectMethodSignature("loadForObject(Object,Object)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "com.keops.data.MockGhostDomainObjectMapper"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "com.keops.data.GhostDomainObjectMapper";
}
    public MockGhostDomainObjectMapper()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("com.keops.data.MockGhostDomainObjectMapper",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.keopsframework.data.MockGhostDomainObjectMapper.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"com.keops.data.MockGhostDomainObjectMapper",params);
        return new net.sf.pmr.keopsframework.data.MockGhostDomainObjectMapper.PreMock(id);
    }

    public static net.sf.pmr.keopsframework.data.MockGhostDomainObjectMapper.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"com.keops.data.MockGhostDomainObjectMapper",null);
        return new net.sf.pmr.keopsframework.data.MockGhostDomainObjectMapper.PreMock(id);
    }

    public static net.sf.pmr.keopsframework.data.MockGhostDomainObjectMapper.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"com.keops.data.MockGhostDomainObjectMapper",th);
        return new net.sf.pmr.keopsframework.data.MockGhostDomainObjectMapper.PreMock(id);
    }

    public void loadForObject(java.lang.Object p0_Object, java.lang.Object p1_Object)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);
        params.add(p1_Object);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("loadForObject(Object,Object)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectLoadForObject(java.lang.Object p0_Object, java.lang.Object p1_Object)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);
        params.add(p1_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForObject(Object,Object)"),params );
}
public void expectLoadForObject(java.lang.Object p0_Object, java.lang.Object p1_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);
        params.add(p1_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForObject(Object,Object)"),params,toThrow );
}
public void acceptLoadForObject(Object p0_Object, Object p1_Object)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);
params.add(p1_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForObject(Object,Object)"),params );
}
public void acceptLoadForObject(Object p0_Object, Object p1_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);
params.add(p1_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForObject(Object,Object)"),params,toThrow );
}
public void setLoadForObjectDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("loadForObject(Object,Object)"),null,null);
}
public void setLoadForObjectDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("loadForObject(Object,Object)"),null,toThrow);
}
public void setLoadForObjectDummy(java.lang.Object p0_Object, java.lang.Object p1_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);
        params.add(p1_Object);

    MockCore.setDummy( getClassObjectMethodSignature("loadForObject(Object,Object)"),params,toThrow);
}


public void acceptLoadForObjectDummy(Object p0_Object, Object p1_Object, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);
params.add(p1_Object);

    MockCore.setDummy(getClassObjectMethodSignature("loadForObject(Object,Object)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "com.keops.data.MockGhostDomainObjectMapper"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "com.keops.data.GhostDomainObjectMapper";
}
