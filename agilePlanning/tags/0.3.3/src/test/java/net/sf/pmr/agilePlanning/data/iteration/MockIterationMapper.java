// MockCreator v2.9.0 build 3065; HashCode:1628074048; net.sf.pmr.agilePlanning.data.iteration.IterationMapper
package net.sf.pmr.agilePlanning.data.iteration;

import de.abstrakt.mock.MockCore;

public class MockIterationMapper implements net.sf.pmr.agilePlanning.data.iteration.IterationMapper, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.agilePlanning.data.iteration.MockIterationMapper.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.agilePlanning.data.iteration.MockIterationMapper",null);
        return this;
    }

    public net.sf.pmr.agilePlanning.data.iteration.MockIterationMapper.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.agilePlanning.data.iteration.MockIterationMapper",th);
        return this;
    }

public void expectFindByProjectPersistanceId(int p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params, valueToReturn );
}
public void expectFindByProjectPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,toThrow );
}
public void acceptFindByProjectPersistanceId(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByProjectPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,toThrow );
}
public void setFindByProjectPersistanceIdDummy(java.util.Set toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceId(int)"),null,toReturn);
}
public void setFindByProjectPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceId(int)"),null,toThrow);
}
public void setFindByProjectPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,toThrow);
}
public void setFindByProjectPersistanceIdDummy(int p0_int,java.util.Set toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,toReturn);
}
public void acceptFindByProjectPersistanceIdDummy(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByProjectPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,valueToThrow);
}


public void expectFindByProjectPersistanceIdAndByDate(int p0_int, java.util.Date p1_Date, net.sf.pmr.agilePlanning.domain.iteration.Iteration valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(p1_Date);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceIdAndByDate(int,Date)"),params, valueToReturn );
}
public void expectFindByProjectPersistanceIdAndByDate(int p0_int, java.util.Date p1_Date,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(p1_Date);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceIdAndByDate(int,Date)"),params,toThrow );
}
public void acceptFindByProjectPersistanceIdAndByDate(Object p0_int, Object p1_Date, net.sf.pmr.agilePlanning.domain.iteration.Iteration valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_Date);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceIdAndByDate(int,Date)"),params, valueToReturn );
}
public void acceptFindByProjectPersistanceIdAndByDate(Object p0_int, Object p1_Date,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_Date);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceIdAndByDate(int,Date)"),params,toThrow );
}
public void setFindByProjectPersistanceIdAndByDateDummy(net.sf.pmr.agilePlanning.domain.iteration.Iteration toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceIdAndByDate(int,Date)"),null,toReturn);
}
public void setFindByProjectPersistanceIdAndByDateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceIdAndByDate(int,Date)"),null,toThrow);
}
public void setFindByProjectPersistanceIdAndByDateDummy(int p0_int, java.util.Date p1_Date,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(p1_Date);

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceIdAndByDate(int,Date)"),params,toThrow);
}
public void setFindByProjectPersistanceIdAndByDateDummy(int p0_int, java.util.Date p1_Date,net.sf.pmr.agilePlanning.domain.iteration.Iteration toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(p1_Date);

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceIdAndByDate(int,Date)"),params,toReturn);
}
public void acceptFindByProjectPersistanceIdAndByDateDummy(Object p0_int, Object p1_Date, net.sf.pmr.agilePlanning.domain.iteration.Iteration valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_Date);

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceIdAndByDate(int,Date)"),params, valueToReturn );
}
public void acceptFindByProjectPersistanceIdAndByDateDummy(Object p0_int, Object p1_Date, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_Date);

    MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceIdAndByDate(int,Date)"),params,valueToThrow);
}


public void expectAddOrUpdate(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params );
}
public void expectAddOrUpdate(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params,toThrow );
}
public void acceptAddOrUpdate(Object p0_DomainObject)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params );
}
public void acceptAddOrUpdate(Object p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params,toThrow );
}
public void setAddOrUpdateDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(DomainObject)"),null,null);
}
public void setAddOrUpdateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(DomainObject)"),null,toThrow);
}
public void setAddOrUpdateDummy(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params,toThrow);
}


public void acceptAddOrUpdateDummy(Object p0_DomainObject, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params,valueToThrow);
}


public void expectDelete(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(DomainObject)"),params );
}
public void expectDelete(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(DomainObject)"),params,toThrow );
}
public void acceptDelete(Object p0_DomainObject)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(DomainObject)"),params );
}
public void acceptDelete(Object p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(DomainObject)"),params,toThrow );
}
public void setDeleteDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("delete(DomainObject)"),null,null);
}
public void setDeleteDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("delete(DomainObject)"),null,toThrow);
}
public void setDeleteDummy(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.setDummy( getClassObjectMethodSignature("delete(DomainObject)"),params,toThrow);
}


public void acceptDeleteDummy(Object p0_DomainObject, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.setDummy(getClassObjectMethodSignature("delete(DomainObject)"),params,valueToThrow);
}


public void expectFindById(int p0_int, java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findById(int)"),params, valueToReturn );
}
public void expectFindById(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findById(int)"),params,toThrow );
}
public void acceptFindById(Object p0_int, java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findById(int)"),params, valueToReturn );
}
public void acceptFindById(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findById(int)"),params,toThrow );
}
public void setFindByIdDummy(java.lang.Object toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findById(int)"),null,toReturn);
}
public void setFindByIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findById(int)"),null,toThrow);
}
public void setFindByIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findById(int)"),params,toThrow);
}
public void setFindByIdDummy(int p0_int,java.lang.Object toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findById(int)"),params,toReturn);
}
public void acceptFindByIdDummy(Object p0_int, java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findById(int)"),params, valueToReturn );
}
public void acceptFindByIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findById(int)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.agilePlanning.data.iteration.MockIterationMapper"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.agilePlanning.data.iteration.IterationMapper";
}
    public MockIterationMapper()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.agilePlanning.data.iteration.MockIterationMapper",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.agilePlanning.data.iteration.MockIterationMapper.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.agilePlanning.data.iteration.MockIterationMapper",params);
        return new net.sf.pmr.agilePlanning.data.iteration.MockIterationMapper.PreMock(id);
    }

    public static net.sf.pmr.agilePlanning.data.iteration.MockIterationMapper.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.agilePlanning.data.iteration.MockIterationMapper",null);
        return new net.sf.pmr.agilePlanning.data.iteration.MockIterationMapper.PreMock(id);
    }

    public static net.sf.pmr.agilePlanning.data.iteration.MockIterationMapper.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.agilePlanning.data.iteration.MockIterationMapper",th);
        return new net.sf.pmr.agilePlanning.data.iteration.MockIterationMapper.PreMock(id);
    }

    public java.util.Set findByProjectPersistanceId(int p0_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (java.util.Set)returnValue;
}
public void expectFindByProjectPersistanceId(int p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params, valueToReturn );
}
public void expectFindByProjectPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,toThrow );
}
public void acceptFindByProjectPersistanceId(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByProjectPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,toThrow );
}
public void setFindByProjectPersistanceIdDummy(java.util.Set toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceId(int)"),null,toReturn);
}
public void setFindByProjectPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceId(int)"),null,toThrow);
}
public void setFindByProjectPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,toThrow);
}
public void setFindByProjectPersistanceIdDummy(int p0_int,java.util.Set toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,toReturn);
}
public void acceptFindByProjectPersistanceIdDummy(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByProjectPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,valueToThrow);
}


    public net.sf.pmr.agilePlanning.domain.iteration.Iteration findByProjectPersistanceIdAndByDate(int p0_int, java.util.Date p1_Date)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(p1_Date);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("findByProjectPersistanceIdAndByDate(int,Date)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (net.sf.pmr.agilePlanning.domain.iteration.Iteration)returnValue;
}
public void expectFindByProjectPersistanceIdAndByDate(int p0_int, java.util.Date p1_Date, net.sf.pmr.agilePlanning.domain.iteration.Iteration valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(p1_Date);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceIdAndByDate(int,Date)"),params, valueToReturn );
}
public void expectFindByProjectPersistanceIdAndByDate(int p0_int, java.util.Date p1_Date,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(p1_Date);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceIdAndByDate(int,Date)"),params,toThrow );
}
public void acceptFindByProjectPersistanceIdAndByDate(Object p0_int, Object p1_Date, net.sf.pmr.agilePlanning.domain.iteration.Iteration valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_Date);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceIdAndByDate(int,Date)"),params, valueToReturn );
}
public void acceptFindByProjectPersistanceIdAndByDate(Object p0_int, Object p1_Date,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_Date);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceIdAndByDate(int,Date)"),params,toThrow );
}
public void setFindByProjectPersistanceIdAndByDateDummy(net.sf.pmr.agilePlanning.domain.iteration.Iteration toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceIdAndByDate(int,Date)"),null,toReturn);
}
public void setFindByProjectPersistanceIdAndByDateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceIdAndByDate(int,Date)"),null,toThrow);
}
public void setFindByProjectPersistanceIdAndByDateDummy(int p0_int, java.util.Date p1_Date,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(p1_Date);

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceIdAndByDate(int,Date)"),params,toThrow);
}
public void setFindByProjectPersistanceIdAndByDateDummy(int p0_int, java.util.Date p1_Date,net.sf.pmr.agilePlanning.domain.iteration.Iteration toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(p1_Date);

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceIdAndByDate(int,Date)"),params,toReturn);
}
public void acceptFindByProjectPersistanceIdAndByDateDummy(Object p0_int, Object p1_Date, net.sf.pmr.agilePlanning.domain.iteration.Iteration valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_Date);

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceIdAndByDate(int,Date)"),params, valueToReturn );
}
public void acceptFindByProjectPersistanceIdAndByDateDummy(Object p0_int, Object p1_Date, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_Date);

    MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceIdAndByDate(int,Date)"),params,valueToThrow);
}


    public void addOrUpdate(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectAddOrUpdate(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params );
}
public void expectAddOrUpdate(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params,toThrow );
}
public void acceptAddOrUpdate(Object p0_DomainObject)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params );
}
public void acceptAddOrUpdate(Object p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params,toThrow );
}
public void setAddOrUpdateDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(DomainObject)"),null,null);
}
public void setAddOrUpdateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(DomainObject)"),null,toThrow);
}
public void setAddOrUpdateDummy(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params,toThrow);
}


public void acceptAddOrUpdateDummy(Object p0_DomainObject, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params,valueToThrow);
}


    public void delete(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("delete(DomainObject)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectDelete(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(DomainObject)"),params );
}
public void expectDelete(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(DomainObject)"),params,toThrow );
}
public void acceptDelete(Object p0_DomainObject)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(DomainObject)"),params );
}
public void acceptDelete(Object p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(DomainObject)"),params,toThrow );
}
public void setDeleteDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("delete(DomainObject)"),null,null);
}
public void setDeleteDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("delete(DomainObject)"),null,toThrow);
}
public void setDeleteDummy(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.setDummy( getClassObjectMethodSignature("delete(DomainObject)"),params,toThrow);
}


public void acceptDeleteDummy(Object p0_DomainObject, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.setDummy(getClassObjectMethodSignature("delete(DomainObject)"),params,valueToThrow);
}


    public java.lang.Object findById(int p0_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("findById(int)"),params,MockCore.OPT_DEFAULT);
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
public void expectFindById(int p0_int, java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findById(int)"),params, valueToReturn );
}
public void expectFindById(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findById(int)"),params,toThrow );
}
public void acceptFindById(Object p0_int, java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findById(int)"),params, valueToReturn );
}
public void acceptFindById(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findById(int)"),params,toThrow );
}
public void setFindByIdDummy(java.lang.Object toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findById(int)"),null,toReturn);
}
public void setFindByIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findById(int)"),null,toThrow);
}
public void setFindByIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findById(int)"),params,toThrow);
}
public void setFindByIdDummy(int p0_int,java.lang.Object toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findById(int)"),params,toReturn);
}
public void acceptFindByIdDummy(Object p0_int, java.lang.Object valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findById(int)"),params, valueToReturn );
}
public void acceptFindByIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findById(int)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.agilePlanning.data.iteration.MockIterationMapper"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.agilePlanning.data.iteration.IterationMapper";
}
