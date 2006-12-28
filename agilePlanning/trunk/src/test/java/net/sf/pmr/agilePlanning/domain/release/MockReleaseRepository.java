// MockCreator v2.9.0 build 3065; HashCode:-606097402; net.sf.pmr.agilePlanning.domain.release.ReleaseRepository
package net.sf.pmr.agilePlanning.domain.release;

import de.abstrakt.mock.MockCore;

public class MockReleaseRepository implements net.sf.pmr.agilePlanning.domain.release.ReleaseRepository, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.agilePlanning.domain.release.MockReleaseRepository.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.agilePlanning.domain.release.MockReleaseRepository",null);
        return this;
    }

    public net.sf.pmr.agilePlanning.domain.release.MockReleaseRepository.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.agilePlanning.domain.release.MockReleaseRepository",th);
        return this;
    }

public void expectFindByPersistanceId(int p0_int, net.sf.pmr.agilePlanning.domain.release.Release valueToReturn)
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
public void acceptFindByPersistanceId(Object p0_int, net.sf.pmr.agilePlanning.domain.release.Release valueToReturn)
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
public void setFindByPersistanceIdDummy(net.sf.pmr.agilePlanning.domain.release.Release toReturn)
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
public void setFindByPersistanceIdDummy(int p0_int,net.sf.pmr.agilePlanning.domain.release.Release toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toReturn);
}
public void acceptFindByPersistanceIdDummy(Object p0_int, net.sf.pmr.agilePlanning.domain.release.Release valueToReturn)
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


public void expectAddOrUpdate(net.sf.pmr.agilePlanning.domain.release.Release p0_Release)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Release)"),params );
}
public void expectAddOrUpdate(net.sf.pmr.agilePlanning.domain.release.Release p0_Release,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Release)"),params,toThrow );
}
public void acceptAddOrUpdate(Object p0_Release)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Release)"),params );
}
public void acceptAddOrUpdate(Object p0_Release,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Release)"),params,toThrow );
}
public void setAddOrUpdateDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Release)"),null,null);
}
public void setAddOrUpdateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Release)"),null,toThrow);
}
public void setAddOrUpdateDummy(net.sf.pmr.agilePlanning.domain.release.Release p0_Release,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Release);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(Release)"),params,toThrow);
}


public void acceptAddOrUpdateDummy(Object p0_Release, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Release);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Release)"),params,valueToThrow);
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


public void expectFindByIterationPersistanceId(int p0_int, int p1_int, net.sf.pmr.agilePlanning.domain.release.Release valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByIterationPersistanceId(int,int)"),params, valueToReturn );
}
public void expectFindByIterationPersistanceId(int p0_int, int p1_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByIterationPersistanceId(int,int)"),params,toThrow );
}
public void acceptFindByIterationPersistanceId(Object p0_int, Object p1_int, net.sf.pmr.agilePlanning.domain.release.Release valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByIterationPersistanceId(int,int)"),params, valueToReturn );
}
public void acceptFindByIterationPersistanceId(Object p0_int, Object p1_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByIterationPersistanceId(int,int)"),params,toThrow );
}
public void setFindByIterationPersistanceIdDummy(net.sf.pmr.agilePlanning.domain.release.Release toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findByIterationPersistanceId(int,int)"),null,toReturn);
}
public void setFindByIterationPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findByIterationPersistanceId(int,int)"),null,toThrow);
}
public void setFindByIterationPersistanceIdDummy(int p0_int, int p1_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByIterationPersistanceId(int,int)"),params,toThrow);
}
public void setFindByIterationPersistanceIdDummy(int p0_int, int p1_int,net.sf.pmr.agilePlanning.domain.release.Release toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByIterationPersistanceId(int,int)"),params,toReturn);
}
public void acceptFindByIterationPersistanceIdDummy(Object p0_int, Object p1_int, net.sf.pmr.agilePlanning.domain.release.Release valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.setDummy( getClassObjectMethodSignature("findByIterationPersistanceId(int,int)"),params, valueToReturn );
}
public void acceptFindByIterationPersistanceIdDummy(Object p0_int, Object p1_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.setDummy(getClassObjectMethodSignature("findByIterationPersistanceId(int,int)"),params,valueToThrow);
}


public void expectDelete(net.sf.pmr.agilePlanning.domain.release.Release p0_Release)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(Release)"),params );
}
public void expectDelete(net.sf.pmr.agilePlanning.domain.release.Release p0_Release,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(Release)"),params,toThrow );
}
public void acceptDelete(Object p0_Release)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(Release)"),params );
}
public void acceptDelete(Object p0_Release,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(Release)"),params,toThrow );
}
public void setDeleteDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("delete(Release)"),null,null);
}
public void setDeleteDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("delete(Release)"),null,toThrow);
}
public void setDeleteDummy(net.sf.pmr.agilePlanning.domain.release.Release p0_Release,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Release);

    MockCore.setDummy( getClassObjectMethodSignature("delete(Release)"),params,toThrow);
}


public void acceptDeleteDummy(Object p0_Release, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Release);

    MockCore.setDummy(getClassObjectMethodSignature("delete(Release)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.agilePlanning.domain.release.MockReleaseRepository"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.agilePlanning.domain.release.ReleaseRepository";
}
    public MockReleaseRepository()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.agilePlanning.domain.release.MockReleaseRepository",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.agilePlanning.domain.release.MockReleaseRepository.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.agilePlanning.domain.release.MockReleaseRepository",params);
        return new net.sf.pmr.agilePlanning.domain.release.MockReleaseRepository.PreMock(id);
    }

    public static net.sf.pmr.agilePlanning.domain.release.MockReleaseRepository.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.agilePlanning.domain.release.MockReleaseRepository",null);
        return new net.sf.pmr.agilePlanning.domain.release.MockReleaseRepository.PreMock(id);
    }

    public static net.sf.pmr.agilePlanning.domain.release.MockReleaseRepository.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.agilePlanning.domain.release.MockReleaseRepository",th);
        return new net.sf.pmr.agilePlanning.domain.release.MockReleaseRepository.PreMock(id);
    }

    public net.sf.pmr.agilePlanning.domain.release.Release findByPersistanceId(int p0_int)
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
    return (net.sf.pmr.agilePlanning.domain.release.Release)returnValue;
}
public void expectFindByPersistanceId(int p0_int, net.sf.pmr.agilePlanning.domain.release.Release valueToReturn)
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
public void acceptFindByPersistanceId(Object p0_int, net.sf.pmr.agilePlanning.domain.release.Release valueToReturn)
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
public void setFindByPersistanceIdDummy(net.sf.pmr.agilePlanning.domain.release.Release toReturn)
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
public void setFindByPersistanceIdDummy(int p0_int,net.sf.pmr.agilePlanning.domain.release.Release toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toReturn);
}
public void acceptFindByPersistanceIdDummy(Object p0_int, net.sf.pmr.agilePlanning.domain.release.Release valueToReturn)
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


    public void addOrUpdate(net.sf.pmr.agilePlanning.domain.release.Release p0_Release)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Release);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("addOrUpdate(Release)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectAddOrUpdate(net.sf.pmr.agilePlanning.domain.release.Release p0_Release)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Release)"),params );
}
public void expectAddOrUpdate(net.sf.pmr.agilePlanning.domain.release.Release p0_Release,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Release)"),params,toThrow );
}
public void acceptAddOrUpdate(Object p0_Release)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Release)"),params );
}
public void acceptAddOrUpdate(Object p0_Release,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Release)"),params,toThrow );
}
public void setAddOrUpdateDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Release)"),null,null);
}
public void setAddOrUpdateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Release)"),null,toThrow);
}
public void setAddOrUpdateDummy(net.sf.pmr.agilePlanning.domain.release.Release p0_Release,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Release);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(Release)"),params,toThrow);
}


public void acceptAddOrUpdateDummy(Object p0_Release, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Release);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Release)"),params,valueToThrow);
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


    public net.sf.pmr.agilePlanning.domain.release.Release findByIterationPersistanceId(int p0_int, int p1_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("findByIterationPersistanceId(int,int)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (net.sf.pmr.agilePlanning.domain.release.Release)returnValue;
}
public void expectFindByIterationPersistanceId(int p0_int, int p1_int, net.sf.pmr.agilePlanning.domain.release.Release valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByIterationPersistanceId(int,int)"),params, valueToReturn );
}
public void expectFindByIterationPersistanceId(int p0_int, int p1_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByIterationPersistanceId(int,int)"),params,toThrow );
}
public void acceptFindByIterationPersistanceId(Object p0_int, Object p1_int, net.sf.pmr.agilePlanning.domain.release.Release valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByIterationPersistanceId(int,int)"),params, valueToReturn );
}
public void acceptFindByIterationPersistanceId(Object p0_int, Object p1_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByIterationPersistanceId(int,int)"),params,toThrow );
}
public void setFindByIterationPersistanceIdDummy(net.sf.pmr.agilePlanning.domain.release.Release toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findByIterationPersistanceId(int,int)"),null,toReturn);
}
public void setFindByIterationPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findByIterationPersistanceId(int,int)"),null,toThrow);
}
public void setFindByIterationPersistanceIdDummy(int p0_int, int p1_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByIterationPersistanceId(int,int)"),params,toThrow);
}
public void setFindByIterationPersistanceIdDummy(int p0_int, int p1_int,net.sf.pmr.agilePlanning.domain.release.Release toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByIterationPersistanceId(int,int)"),params,toReturn);
}
public void acceptFindByIterationPersistanceIdDummy(Object p0_int, Object p1_int, net.sf.pmr.agilePlanning.domain.release.Release valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.setDummy( getClassObjectMethodSignature("findByIterationPersistanceId(int,int)"),params, valueToReturn );
}
public void acceptFindByIterationPersistanceIdDummy(Object p0_int, Object p1_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.setDummy(getClassObjectMethodSignature("findByIterationPersistanceId(int,int)"),params,valueToThrow);
}


    public void delete(net.sf.pmr.agilePlanning.domain.release.Release p0_Release)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Release);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("delete(Release)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectDelete(net.sf.pmr.agilePlanning.domain.release.Release p0_Release)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(Release)"),params );
}
public void expectDelete(net.sf.pmr.agilePlanning.domain.release.Release p0_Release,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(Release)"),params,toThrow );
}
public void acceptDelete(Object p0_Release)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(Release)"),params );
}
public void acceptDelete(Object p0_Release,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(Release)"),params,toThrow );
}
public void setDeleteDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("delete(Release)"),null,null);
}
public void setDeleteDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("delete(Release)"),null,toThrow);
}
public void setDeleteDummy(net.sf.pmr.agilePlanning.domain.release.Release p0_Release,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Release);

    MockCore.setDummy( getClassObjectMethodSignature("delete(Release)"),params,toThrow);
}


public void acceptDeleteDummy(Object p0_Release, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Release);

    MockCore.setDummy(getClassObjectMethodSignature("delete(Release)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.agilePlanning.domain.release.MockReleaseRepository"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.agilePlanning.domain.release.ReleaseRepository";
}
