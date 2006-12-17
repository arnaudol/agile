// MockCreator v2.9.0 build 3065; HashCode:1305762853; com.keops.data.DomainListMapper
package net.sf.pmr.keopsframework.data;

import de.abstrakt.mock.MockCore;

public class MockDomainListMapper implements net.sf.pmr.keopsframework.data.DomainListMapper, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.keopsframework.data.MockDomainListMapper.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"com.keops.data.MockDomainListMapper",null);
        return this;
    }

    public net.sf.pmr.keopsframework.data.MockDomainListMapper.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"com.keops.data.MockDomainListMapper",th);
        return this;
    }

public void expectFindCollectionForObject(java.lang.Object p0_Object, java.util.Collection valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findCollectionForObject(Object)"),params, valueToReturn );
}
public void expectFindCollectionForObject(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findCollectionForObject(Object)"),params,toThrow );
}
public void acceptFindCollectionForObject(Object p0_Object, java.util.Collection valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findCollectionForObject(Object)"),params, valueToReturn );
}
public void acceptFindCollectionForObject(Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findCollectionForObject(Object)"),params,toThrow );
}
public void setFindCollectionForObjectDummy(java.util.Collection toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findCollectionForObject(Object)"),null,toReturn);
}
public void setFindCollectionForObjectDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findCollectionForObject(Object)"),null,toThrow);
}
public void setFindCollectionForObjectDummy(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("findCollectionForObject(Object)"),params,toThrow);
}
public void setFindCollectionForObjectDummy(java.lang.Object p0_Object,java.util.Collection toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("findCollectionForObject(Object)"),params,toReturn);
}
public void acceptFindCollectionForObjectDummy(Object p0_Object, java.util.Collection valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("findCollectionForObject(Object)"),params, valueToReturn );
}
public void acceptFindCollectionForObjectDummy(Object p0_Object, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy(getClassObjectMethodSignature("findCollectionForObject(Object)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "com.keops.data.MockDomainListMapper"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "com.keops.data.DomainListMapper";
}
    public MockDomainListMapper()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("com.keops.data.MockDomainListMapper",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.keopsframework.data.MockDomainListMapper.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"com.keops.data.MockDomainListMapper",params);
        return new net.sf.pmr.keopsframework.data.MockDomainListMapper.PreMock(id);
    }

    public static net.sf.pmr.keopsframework.data.MockDomainListMapper.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"com.keops.data.MockDomainListMapper",null);
        return new net.sf.pmr.keopsframework.data.MockDomainListMapper.PreMock(id);
    }

    public static net.sf.pmr.keopsframework.data.MockDomainListMapper.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"com.keops.data.MockDomainListMapper",th);
        return new net.sf.pmr.keopsframework.data.MockDomainListMapper.PreMock(id);
    }

    public java.util.Collection findCollectionForObject(java.lang.Object p0_Object)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("findCollectionForObject(Object)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (java.util.Collection)returnValue;
}
public void expectFindCollectionForObject(java.lang.Object p0_Object, java.util.Collection valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findCollectionForObject(Object)"),params, valueToReturn );
}
public void expectFindCollectionForObject(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findCollectionForObject(Object)"),params,toThrow );
}
public void acceptFindCollectionForObject(Object p0_Object, java.util.Collection valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findCollectionForObject(Object)"),params, valueToReturn );
}
public void acceptFindCollectionForObject(Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findCollectionForObject(Object)"),params,toThrow );
}
public void setFindCollectionForObjectDummy(java.util.Collection toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findCollectionForObject(Object)"),null,toReturn);
}
public void setFindCollectionForObjectDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findCollectionForObject(Object)"),null,toThrow);
}
public void setFindCollectionForObjectDummy(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("findCollectionForObject(Object)"),params,toThrow);
}
public void setFindCollectionForObjectDummy(java.lang.Object p0_Object,java.util.Collection toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("findCollectionForObject(Object)"),params,toReturn);
}
public void acceptFindCollectionForObjectDummy(Object p0_Object, java.util.Collection valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("findCollectionForObject(Object)"),params, valueToReturn );
}
public void acceptFindCollectionForObjectDummy(Object p0_Object, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy(getClassObjectMethodSignature("findCollectionForObject(Object)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "com.keops.data.MockDomainListMapper"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "com.keops.data.DomainListMapper";
}
