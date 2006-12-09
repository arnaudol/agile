// MockCreator v2.9.0 build 3065; HashCode:390184265; com.keops.domain.collection.temporal.TemporalDomainMap
package net.sf.pmr.keopsframework.domain.collection.temporal;

import de.abstrakt.mock.MockCore;

public class MockTemporalDomainMap implements net.sf.pmr.keopsframework.domain.collection.temporal.TemporalDomainMap, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.keopsframework.domain.collection.temporal.MockTemporalDomainMap.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"com.keops.domain.collection.temporal.MockTemporalDomainMap",null);
        return this;
    }

    public net.sf.pmr.keopsframework.domain.collection.temporal.MockTemporalDomainMap.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"com.keops.domain.collection.temporal.MockTemporalDomainMap",th);
        return this;
    }

public void expectPutVersion(java.util.Date p0_Date, java.lang.Object p1_Object)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Date);
        params.add(p1_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("putVersion(Date,Object)"),params );
}
public void expectPutVersion(java.util.Date p0_Date, java.lang.Object p1_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Date);
        params.add(p1_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("putVersion(Date,Object)"),params,toThrow );
}
public void acceptPutVersion(Object p0_Date, Object p1_Object)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Date);
params.add(p1_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("putVersion(Date,Object)"),params );
}
public void acceptPutVersion(Object p0_Date, Object p1_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Date);
params.add(p1_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("putVersion(Date,Object)"),params,toThrow );
}
public void setPutVersionDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("putVersion(Date,Object)"),null,null);
}
public void setPutVersionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("putVersion(Date,Object)"),null,toThrow);
}
public void setPutVersionDummy(java.util.Date p0_Date, java.lang.Object p1_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Date);
        params.add(p1_Object);

    MockCore.setDummy( getClassObjectMethodSignature("putVersion(Date,Object)"),params,toThrow);
}


public void acceptPutVersionDummy(Object p0_Date, Object p1_Object, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Date);
params.add(p1_Object);

    MockCore.setDummy(getClassObjectMethodSignature("putVersion(Date,Object)"),params,valueToThrow);
}


public void expectGetLatest(java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getLatest()"),params, valueToReturn );
}
public void expectGetLatest(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getLatest()"),params,toThrow );
}
public void acceptGetLatest(java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getLatest()"),params, valueToReturn );
}
public void acceptGetLatest(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getLatest()"),params,toThrow );
}
public void setGetLatestDummy(java.lang.Object toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getLatest()"),null,toReturn);
}
public void setGetLatestDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getLatest()"),null,toThrow);
}



public void acceptGetLatestDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getLatest()"),params,valueToThrow);
}


public void expectGetMap(java.util.Map valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMap()"),params, valueToReturn );
}
public void expectGetMap(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMap()"),params,toThrow );
}
public void acceptGetMap(java.util.Map valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMap()"),params, valueToReturn );
}
public void acceptGetMap(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMap()"),params,toThrow );
}
public void setGetMapDummy(java.util.Map toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getMap()"),null,toReturn);
}
public void setGetMapDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getMap()"),null,toThrow);
}



public void acceptGetMapDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getMap()"),params,valueToThrow);
}


public void expectGetVersion(java.util.Date p0_Date, java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Date);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getVersion(Date)"),params, valueToReturn );
}
public void expectGetVersion(java.util.Date p0_Date,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Date);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getVersion(Date)"),params,toThrow );
}
public void acceptGetVersion(Object p0_Date, java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Date);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getVersion(Date)"),params, valueToReturn );
}
public void acceptGetVersion(Object p0_Date,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Date);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getVersion(Date)"),params,toThrow );
}
public void setGetVersionDummy(java.lang.Object toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getVersion(Date)"),null,toReturn);
}
public void setGetVersionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getVersion(Date)"),null,toThrow);
}
public void setGetVersionDummy(java.util.Date p0_Date,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Date);

    MockCore.setDummy( getClassObjectMethodSignature("getVersion(Date)"),params,toThrow);
}
public void setGetVersionDummy(java.util.Date p0_Date,java.lang.Object toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Date);

    MockCore.setDummy( getClassObjectMethodSignature("getVersion(Date)"),params,toReturn);
}
public void acceptGetVersionDummy(Object p0_Date, java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Date);

    MockCore.setDummy( getClassObjectMethodSignature("getVersion(Date)"),params, valueToReturn );
}
public void acceptGetVersionDummy(Object p0_Date, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Date);

    MockCore.setDummy(getClassObjectMethodSignature("getVersion(Date)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "com.keops.domain.collection.temporal.MockTemporalDomainMap"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "com.keops.domain.collection.temporal.TemporalDomainMap";
}
    public MockTemporalDomainMap()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("com.keops.domain.collection.temporal.MockTemporalDomainMap",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.keopsframework.domain.collection.temporal.MockTemporalDomainMap.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"com.keops.domain.collection.temporal.MockTemporalDomainMap",params);
        return new net.sf.pmr.keopsframework.domain.collection.temporal.MockTemporalDomainMap.PreMock(id);
    }

    public static net.sf.pmr.keopsframework.domain.collection.temporal.MockTemporalDomainMap.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"com.keops.domain.collection.temporal.MockTemporalDomainMap",null);
        return new net.sf.pmr.keopsframework.domain.collection.temporal.MockTemporalDomainMap.PreMock(id);
    }

    public static net.sf.pmr.keopsframework.domain.collection.temporal.MockTemporalDomainMap.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"com.keops.domain.collection.temporal.MockTemporalDomainMap",th);
        return new net.sf.pmr.keopsframework.domain.collection.temporal.MockTemporalDomainMap.PreMock(id);
    }

    public void putVersion(java.util.Date p0_Date, java.lang.Object p1_Object)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Date);
        params.add(p1_Object);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("putVersion(Date,Object)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectPutVersion(java.util.Date p0_Date, java.lang.Object p1_Object)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Date);
        params.add(p1_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("putVersion(Date,Object)"),params );
}
public void expectPutVersion(java.util.Date p0_Date, java.lang.Object p1_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Date);
        params.add(p1_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("putVersion(Date,Object)"),params,toThrow );
}
public void acceptPutVersion(Object p0_Date, Object p1_Object)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Date);
params.add(p1_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("putVersion(Date,Object)"),params );
}
public void acceptPutVersion(Object p0_Date, Object p1_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Date);
params.add(p1_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("putVersion(Date,Object)"),params,toThrow );
}
public void setPutVersionDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("putVersion(Date,Object)"),null,null);
}
public void setPutVersionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("putVersion(Date,Object)"),null,toThrow);
}
public void setPutVersionDummy(java.util.Date p0_Date, java.lang.Object p1_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Date);
        params.add(p1_Object);

    MockCore.setDummy( getClassObjectMethodSignature("putVersion(Date,Object)"),params,toThrow);
}


public void acceptPutVersionDummy(Object p0_Date, Object p1_Object, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Date);
params.add(p1_Object);

    MockCore.setDummy(getClassObjectMethodSignature("putVersion(Date,Object)"),params,valueToThrow);
}


    public java.lang.Object getLatest()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getLatest()"),params,MockCore.OPT_DEFAULT);
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
public void expectGetLatest(java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getLatest()"),params, valueToReturn );
}
public void expectGetLatest(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getLatest()"),params,toThrow );
}
public void acceptGetLatest(java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getLatest()"),params, valueToReturn );
}
public void acceptGetLatest(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getLatest()"),params,toThrow );
}
public void setGetLatestDummy(java.lang.Object toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getLatest()"),null,toReturn);
}
public void setGetLatestDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getLatest()"),null,toThrow);
}



public void acceptGetLatestDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getLatest()"),params,valueToThrow);
}


    public java.util.Map getMap()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getMap()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (java.util.Map)returnValue;
}
public void expectGetMap(java.util.Map valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMap()"),params, valueToReturn );
}
public void expectGetMap(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMap()"),params,toThrow );
}
public void acceptGetMap(java.util.Map valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMap()"),params, valueToReturn );
}
public void acceptGetMap(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMap()"),params,toThrow );
}
public void setGetMapDummy(java.util.Map toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getMap()"),null,toReturn);
}
public void setGetMapDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getMap()"),null,toThrow);
}



public void acceptGetMapDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getMap()"),params,valueToThrow);
}


    public java.lang.Object getVersion(java.util.Date p0_Date)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Date);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getVersion(Date)"),params,MockCore.OPT_DEFAULT);
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
public void expectGetVersion(java.util.Date p0_Date, java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Date);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getVersion(Date)"),params, valueToReturn );
}
public void expectGetVersion(java.util.Date p0_Date,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Date);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getVersion(Date)"),params,toThrow );
}
public void acceptGetVersion(Object p0_Date, java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Date);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getVersion(Date)"),params, valueToReturn );
}
public void acceptGetVersion(Object p0_Date,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Date);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getVersion(Date)"),params,toThrow );
}
public void setGetVersionDummy(java.lang.Object toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getVersion(Date)"),null,toReturn);
}
public void setGetVersionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getVersion(Date)"),null,toThrow);
}
public void setGetVersionDummy(java.util.Date p0_Date,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Date);

    MockCore.setDummy( getClassObjectMethodSignature("getVersion(Date)"),params,toThrow);
}
public void setGetVersionDummy(java.util.Date p0_Date,java.lang.Object toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Date);

    MockCore.setDummy( getClassObjectMethodSignature("getVersion(Date)"),params,toReturn);
}
public void acceptGetVersionDummy(Object p0_Date, java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Date);

    MockCore.setDummy( getClassObjectMethodSignature("getVersion(Date)"),params, valueToReturn );
}
public void acceptGetVersionDummy(Object p0_Date, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Date);

    MockCore.setDummy(getClassObjectMethodSignature("getVersion(Date)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "com.keops.domain.collection.temporal.MockTemporalDomainMap"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "com.keops.domain.collection.temporal.TemporalDomainMap";
}
