// MockCreator v2.9.0 build 3065; HashCode:1958736875; net.sf.pmr.agilePlanning.domain.iteration.IterationRepository
package net.sf.pmr.agilePlanning.domain.iteration;

import de.abstrakt.mock.MockCore;

public class MockIterationRepository implements net.sf.pmr.agilePlanning.domain.iteration.IterationRepository, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.agilePlanning.domain.iteration.MockIterationRepository.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.agilePlanning.domain.iteration.MockIterationRepository",null);
        return this;
    }

    public net.sf.pmr.agilePlanning.domain.iteration.MockIterationRepository.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.agilePlanning.domain.iteration.MockIterationRepository",th);
        return this;
    }

public void expectFindByPersistanceId(int p0_int, net.sf.pmr.agilePlanning.domain.iteration.Iteration valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByPersistanceId(int)"),params, valueToReturn );
}
public void expectFindByPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toThrow );
}
public void acceptFindByPersistanceId(Object p0_int, net.sf.pmr.agilePlanning.domain.iteration.Iteration valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toThrow );
}
public void setFindByPersistanceIdDummy(net.sf.pmr.agilePlanning.domain.iteration.Iteration toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findByPersistanceId(int)"),null,toReturn);
}
public void setFindByPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findByPersistanceId(int)"),null,toThrow);
}
public void setFindByPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toThrow);
}
public void setFindByPersistanceIdDummy(int p0_int,net.sf.pmr.agilePlanning.domain.iteration.Iteration toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toReturn);
}
public void acceptFindByPersistanceIdDummy(Object p0_int, net.sf.pmr.agilePlanning.domain.iteration.Iteration valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findByPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findByPersistanceId(int)"),params,valueToThrow);
}


public void expectAddOrUpdate(net.sf.pmr.agilePlanning.domain.iteration.Iteration p0_Iteration)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Iteration);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Iteration)"),params );
}
public void expectAddOrUpdate(net.sf.pmr.agilePlanning.domain.iteration.Iteration p0_Iteration,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Iteration);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Iteration)"),params,toThrow );
}
public void acceptAddOrUpdate(Object p0_Iteration)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Iteration);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Iteration)"),params );
}
public void acceptAddOrUpdate(Object p0_Iteration,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Iteration);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Iteration)"),params,toThrow );
}
public void setAddOrUpdateDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Iteration)"),null,null);
}
public void setAddOrUpdateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Iteration)"),null,toThrow);
}
public void setAddOrUpdateDummy(net.sf.pmr.agilePlanning.domain.iteration.Iteration p0_Iteration,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Iteration);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(Iteration)"),params,toThrow);
}


public void acceptAddOrUpdateDummy(Object p0_Iteration, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Iteration);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Iteration)"),params,valueToThrow);
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


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.agilePlanning.domain.iteration.MockIterationRepository"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.agilePlanning.domain.iteration.IterationRepository";
}
    public MockIterationRepository()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.agilePlanning.domain.iteration.MockIterationRepository",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.agilePlanning.domain.iteration.MockIterationRepository.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.agilePlanning.domain.iteration.MockIterationRepository",params);
        return new net.sf.pmr.agilePlanning.domain.iteration.MockIterationRepository.PreMock(id);
    }

    public static net.sf.pmr.agilePlanning.domain.iteration.MockIterationRepository.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.agilePlanning.domain.iteration.MockIterationRepository",null);
        return new net.sf.pmr.agilePlanning.domain.iteration.MockIterationRepository.PreMock(id);
    }

    public static net.sf.pmr.agilePlanning.domain.iteration.MockIterationRepository.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.agilePlanning.domain.iteration.MockIterationRepository",th);
        return new net.sf.pmr.agilePlanning.domain.iteration.MockIterationRepository.PreMock(id);
    }

    public net.sf.pmr.agilePlanning.domain.iteration.Iteration findByPersistanceId(int p0_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("findByPersistanceId(int)"),params,MockCore.OPT_DEFAULT);
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
public void expectFindByPersistanceId(int p0_int, net.sf.pmr.agilePlanning.domain.iteration.Iteration valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByPersistanceId(int)"),params, valueToReturn );
}
public void expectFindByPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toThrow );
}
public void acceptFindByPersistanceId(Object p0_int, net.sf.pmr.agilePlanning.domain.iteration.Iteration valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toThrow );
}
public void setFindByPersistanceIdDummy(net.sf.pmr.agilePlanning.domain.iteration.Iteration toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findByPersistanceId(int)"),null,toReturn);
}
public void setFindByPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findByPersistanceId(int)"),null,toThrow);
}
public void setFindByPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toThrow);
}
public void setFindByPersistanceIdDummy(int p0_int,net.sf.pmr.agilePlanning.domain.iteration.Iteration toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toReturn);
}
public void acceptFindByPersistanceIdDummy(Object p0_int, net.sf.pmr.agilePlanning.domain.iteration.Iteration valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findByPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findByPersistanceId(int)"),params,valueToThrow);
}


    public void addOrUpdate(net.sf.pmr.agilePlanning.domain.iteration.Iteration p0_Iteration)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Iteration);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("addOrUpdate(Iteration)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectAddOrUpdate(net.sf.pmr.agilePlanning.domain.iteration.Iteration p0_Iteration)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Iteration);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Iteration)"),params );
}
public void expectAddOrUpdate(net.sf.pmr.agilePlanning.domain.iteration.Iteration p0_Iteration,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Iteration);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Iteration)"),params,toThrow );
}
public void acceptAddOrUpdate(Object p0_Iteration)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Iteration);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Iteration)"),params );
}
public void acceptAddOrUpdate(Object p0_Iteration,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Iteration);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Iteration)"),params,toThrow );
}
public void setAddOrUpdateDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Iteration)"),null,null);
}
public void setAddOrUpdateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Iteration)"),null,toThrow);
}
public void setAddOrUpdateDummy(net.sf.pmr.agilePlanning.domain.iteration.Iteration p0_Iteration,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Iteration);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(Iteration)"),params,toThrow);
}


public void acceptAddOrUpdateDummy(Object p0_Iteration, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Iteration);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Iteration)"),params,valueToThrow);
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


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.agilePlanning.domain.iteration.MockIterationRepository"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.agilePlanning.domain.iteration.IterationRepository";
}
