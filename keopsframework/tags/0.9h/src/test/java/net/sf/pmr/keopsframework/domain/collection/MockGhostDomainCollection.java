// MockCreator v2.9.0 build 3065; HashCode:1498532129; com.keops.domain.collection.GhostDomainCollection
package net.sf.pmr.keopsframework.domain.collection;

import de.abstrakt.mock.MockCore;

public class MockGhostDomainCollection implements net.sf.pmr.keopsframework.domain.collection.GhostDomainCollection, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.keopsframework.domain.collection.MockGhostDomainCollection.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"com.keops.domain.collection.MockGhostDomainCollection",null);
        return this;
    }

    public net.sf.pmr.keopsframework.domain.collection.MockGhostDomainCollection.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"com.keops.domain.collection.MockGhostDomainCollection",th);
        return this;
    }

public void expectSetCollection(java.util.Collection p0_Collection)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCollection(Collection)"),params );
}
public void expectSetCollection(java.util.Collection p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCollection(Collection)"),params,toThrow );
}
public void acceptSetCollection(Object p0_Collection)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCollection(Collection)"),params );
}
public void acceptSetCollection(Object p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCollection(Collection)"),params,toThrow );
}
public void setSetCollectionDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setCollection(Collection)"),null,null);
}
public void setSetCollectionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setCollection(Collection)"),null,toThrow);
}
public void setSetCollectionDummy(java.util.Collection p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("setCollection(Collection)"),params,toThrow);
}


public void acceptSetCollectionDummy(Object p0_Collection, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.setDummy(getClassObjectMethodSignature("setCollection(Collection)"),params,valueToThrow);
}


public void expectLoadForObject(java.lang.Object p0_Object, java.util.Collection valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForObject(Object)"),params, valueToReturn );
}
public void expectLoadForObject(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForObject(Object)"),params,toThrow );
}
public void acceptLoadForObject(Object p0_Object, java.util.Collection valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForObject(Object)"),params, valueToReturn );
}
public void acceptLoadForObject(Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForObject(Object)"),params,toThrow );
}
public void setLoadForObjectDummy(java.util.Collection toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("loadForObject(Object)"),null,toReturn);
}
public void setLoadForObjectDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("loadForObject(Object)"),null,toThrow);
}
public void setLoadForObjectDummy(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("loadForObject(Object)"),params,toThrow);
}
public void setLoadForObjectDummy(java.lang.Object p0_Object,java.util.Collection toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("loadForObject(Object)"),params,toReturn);
}
public void acceptLoadForObjectDummy(Object p0_Object, java.util.Collection valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("loadForObject(Object)"),params, valueToReturn );
}
public void acceptLoadForObjectDummy(Object p0_Object, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy(getClassObjectMethodSignature("loadForObject(Object)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "com.keops.domain.collection.MockGhostDomainCollection"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "com.keops.domain.collection.GhostDomainCollection";
}
    public MockGhostDomainCollection()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("com.keops.domain.collection.MockGhostDomainCollection",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.keopsframework.domain.collection.MockGhostDomainCollection.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"com.keops.domain.collection.MockGhostDomainCollection",params);
        return new net.sf.pmr.keopsframework.domain.collection.MockGhostDomainCollection.PreMock(id);
    }

    public static net.sf.pmr.keopsframework.domain.collection.MockGhostDomainCollection.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"com.keops.domain.collection.MockGhostDomainCollection",null);
        return new net.sf.pmr.keopsframework.domain.collection.MockGhostDomainCollection.PreMock(id);
    }

    public static net.sf.pmr.keopsframework.domain.collection.MockGhostDomainCollection.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"com.keops.domain.collection.MockGhostDomainCollection",th);
        return new net.sf.pmr.keopsframework.domain.collection.MockGhostDomainCollection.PreMock(id);
    }

    public void setCollection(java.util.Collection p0_Collection)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setCollection(Collection)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetCollection(java.util.Collection p0_Collection)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCollection(Collection)"),params );
}
public void expectSetCollection(java.util.Collection p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCollection(Collection)"),params,toThrow );
}
public void acceptSetCollection(Object p0_Collection)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCollection(Collection)"),params );
}
public void acceptSetCollection(Object p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCollection(Collection)"),params,toThrow );
}
public void setSetCollectionDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setCollection(Collection)"),null,null);
}
public void setSetCollectionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setCollection(Collection)"),null,toThrow);
}
public void setSetCollectionDummy(java.util.Collection p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("setCollection(Collection)"),params,toThrow);
}


public void acceptSetCollectionDummy(Object p0_Collection, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.setDummy(getClassObjectMethodSignature("setCollection(Collection)"),params,valueToThrow);
}


    public java.util.Collection loadForObject(java.lang.Object p0_Object)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("loadForObject(Object)"),params,MockCore.OPT_DEFAULT);
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
public void expectLoadForObject(java.lang.Object p0_Object, java.util.Collection valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForObject(Object)"),params, valueToReturn );
}
public void expectLoadForObject(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForObject(Object)"),params,toThrow );
}
public void acceptLoadForObject(Object p0_Object, java.util.Collection valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForObject(Object)"),params, valueToReturn );
}
public void acceptLoadForObject(Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("loadForObject(Object)"),params,toThrow );
}
public void setLoadForObjectDummy(java.util.Collection toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("loadForObject(Object)"),null,toReturn);
}
public void setLoadForObjectDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("loadForObject(Object)"),null,toThrow);
}
public void setLoadForObjectDummy(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("loadForObject(Object)"),params,toThrow);
}
public void setLoadForObjectDummy(java.lang.Object p0_Object,java.util.Collection toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("loadForObject(Object)"),params,toReturn);
}
public void acceptLoadForObjectDummy(Object p0_Object, java.util.Collection valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("loadForObject(Object)"),params, valueToReturn );
}
public void acceptLoadForObjectDummy(Object p0_Object, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy(getClassObjectMethodSignature("loadForObject(Object)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "com.keops.domain.collection.MockGhostDomainCollection"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "com.keops.domain.collection.GhostDomainCollection";
}
