// MockCreator v2.9.0 build 3065; HashCode:1632539127; com.keops.domain.DomainList
package net.sf.pmr.keopsframework.domain;

import java.util.Collection;

import de.abstrakt.mock.MockCore;

public class MockDomainList implements net.sf.pmr.keopsframework.domain.collection.GhostDomainCollection, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.keopsframework.domain.MockDomainList.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"com.keops.domain.MockDomainList",null);
        return this;
    }

    public net.sf.pmr.keopsframework.domain.MockDomainList.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"com.keops.domain.MockDomainList",th);
        return this;
    }

public void expectSetList(java.util.List p0_List)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_List);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setList(List)"),params );
}
public void expectSetList(java.util.List p0_List,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_List);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setList(List)"),params,toThrow );
}
public void acceptSetList(Object p0_List)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_List);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setList(List)"),params );
}
public void acceptSetList(Object p0_List,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_List);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setList(List)"),params,toThrow );
}
public void setSetListDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setList(List)"),null,null);
}
public void setSetListDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setList(List)"),null,toThrow);
}
public void setSetListDummy(java.util.List p0_List,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_List);

    MockCore.setDummy( getClassObjectMethodSignature("setList(List)"),params,toThrow);
}


public void acceptSetListDummy(Object p0_List, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_List);

    MockCore.setDummy(getClassObjectMethodSignature("setList(List)"),params,valueToThrow);
}


public void expectPrepareListForObject(java.lang.Object p0_Object)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("prepareListForObject(Object)"),params );
}
public void expectPrepareListForObject(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("prepareListForObject(Object)"),params,toThrow );
}
public void acceptPrepareListForObject(Object p0_Object)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("prepareListForObject(Object)"),params );
}
public void acceptPrepareListForObject(Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("prepareListForObject(Object)"),params,toThrow );
}
public void setPrepareListForObjectDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("prepareListForObject(Object)"),null,null);
}
public void setPrepareListForObjectDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("prepareListForObject(Object)"),null,toThrow);
}
public void setPrepareListForObjectDummy(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("prepareListForObject(Object)"),params,toThrow);
}


public void acceptPrepareListForObjectDummy(Object p0_Object, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy(getClassObjectMethodSignature("prepareListForObject(Object)"),params,valueToThrow);
}


public void expectGetSize(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getSize()"),params, new Integer(valueToReturn) );
}
public void expectGetSize(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getSize()"),params,toThrow );
}
public void acceptGetSize(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getSize()"),params, new Integer(valueToReturn) );
}
public void acceptGetSize(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getSize()"),params,toThrow );
}
public void setGetSizeDummy(int toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getSize()"),null,new Integer(toReturn));
}
public void setGetSizeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getSize()"),null,toThrow);
}



public void acceptGetSizeDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getSize()"),params,valueToThrow);
}


public void expectGetList(java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getList()"),params, valueToReturn );
}
public void expectGetList(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getList()"),params,toThrow );
}
public void acceptGetList(java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getList()"),params, valueToReturn );
}
public void acceptGetList(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getList()"),params,toThrow );
}
public void setGetListDummy(java.util.List toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getList()"),null,toReturn);
}
public void setGetListDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getList()"),null,toThrow);
}



public void acceptGetListDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getList()"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "com.keops.domain.MockDomainList"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "com.keops.domain.DomainList";
}
    public MockDomainList()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("com.keops.domain.MockDomainList",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.keopsframework.domain.MockDomainList.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"com.keops.domain.MockDomainList",params);
        return new net.sf.pmr.keopsframework.domain.MockDomainList.PreMock(id);
    }

    public static net.sf.pmr.keopsframework.domain.MockDomainList.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"com.keops.domain.MockDomainList",null);
        return new net.sf.pmr.keopsframework.domain.MockDomainList.PreMock(id);
    }

    public static net.sf.pmr.keopsframework.domain.MockDomainList.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"com.keops.domain.MockDomainList",th);
        return new net.sf.pmr.keopsframework.domain.MockDomainList.PreMock(id);
    }

    public void setCollection(Collection p0_List)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_List);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setList(List)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetList(java.util.List p0_List)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_List);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setList(List)"),params );
}
public void expectSetList(java.util.List p0_List,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_List);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setList(List)"),params,toThrow );
}
public void acceptSetList(Object p0_List)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_List);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setList(List)"),params );
}
public void acceptSetList(Object p0_List,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_List);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setList(List)"),params,toThrow );
}
public void setSetListDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setList(List)"),null,null);
}
public void setSetListDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setList(List)"),null,toThrow);
}
public void setSetListDummy(java.util.List p0_List,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_List);

    MockCore.setDummy( getClassObjectMethodSignature("setList(List)"),params,toThrow);
}


public void acceptSetListDummy(Object p0_List, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_List);

    MockCore.setDummy(getClassObjectMethodSignature("setList(List)"),params,valueToThrow);
}


    public void prepareListForObject(java.lang.Object p0_Object)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("prepareListForObject(Object)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectPrepareListForObject(java.lang.Object p0_Object)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("prepareListForObject(Object)"),params );
}
public void expectPrepareListForObject(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("prepareListForObject(Object)"),params,toThrow );
}
public void acceptPrepareListForObject(Object p0_Object)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("prepareListForObject(Object)"),params );
}
public void acceptPrepareListForObject(Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("prepareListForObject(Object)"),params,toThrow );
}
public void setPrepareListForObjectDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("prepareListForObject(Object)"),null,null);
}
public void setPrepareListForObjectDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("prepareListForObject(Object)"),null,toThrow);
}
public void setPrepareListForObjectDummy(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("prepareListForObject(Object)"),params,toThrow);
}


public void acceptPrepareListForObjectDummy(Object p0_Object, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy(getClassObjectMethodSignature("prepareListForObject(Object)"),params,valueToThrow);
}


    public int getSize()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getSize()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("getSize: called but not prepared");
    return ((Integer)returnValue).intValue();
}
public void expectGetSize(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getSize()"),params, new Integer(valueToReturn) );
}
public void expectGetSize(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getSize()"),params,toThrow );
}
public void acceptGetSize(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getSize()"),params, new Integer(valueToReturn) );
}
public void acceptGetSize(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getSize()"),params,toThrow );
}
public void setGetSizeDummy(int toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getSize()"),null,new Integer(toReturn));
}
public void setGetSizeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getSize()"),null,toThrow);
}



public void acceptGetSizeDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getSize()"),params,valueToThrow);
}


    public Collection loadForObject(Object objectToLoadFor)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getList()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (java.util.List)returnValue;
}
public void expectGetList(java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getList()"),params, valueToReturn );
}
public void expectGetList(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getList()"),params,toThrow );
}
public void acceptGetList(java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getList()"),params, valueToReturn );
}
public void acceptGetList(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getList()"),params,toThrow );
}
public void setGetListDummy(java.util.List toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getList()"),null,toReturn);
}
public void setGetListDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getList()"),null,toThrow);
}



public void acceptGetListDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getList()"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "com.keops.domain.MockDomainList"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "com.keops.domain.DomainList";
}
