// MockCreator v2.9.0 build 3065; HashCode:-236703160; net.sf.pmr.core.domain.project.ProjectRepository
package net.sf.pmr.core.domain.project;

import de.abstrakt.mock.MockCore;

public class MockProjectRepository implements net.sf.pmr.core.domain.project.ProjectRepository, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.core.domain.project.MockProjectRepository.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.project.MockBasicProjectRepository",null);
        return this;
    }

    public net.sf.pmr.core.domain.project.MockProjectRepository.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.project.MockBasicProjectRepository",th);
        return this;
    }

public void expectFindAll(java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findAll()"),params, valueToReturn );
}
public void expectFindAll(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findAll()"),params,toThrow );
}
public void acceptFindAll(java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findAll()"),params, valueToReturn );
}
public void acceptFindAll(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findAll()"),params,toThrow );
}
public void setFindAllDummy(java.util.List toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findAll()"),null,toReturn);
}
public void setFindAllDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findAll()"),null,toThrow);
}



public void acceptFindAllDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("findAll()"),params,valueToThrow);
}


public void expectCountAll(java.lang.Integer valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("countAll()"),params, valueToReturn );
}
public void expectCountAll(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("countAll()"),params,toThrow );
}
public void acceptCountAll(java.lang.Integer valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("countAll()"),params, valueToReturn );
}
public void acceptCountAll(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("countAll()"),params,toThrow );
}
public void setCountAllDummy(java.lang.Integer toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("countAll()"),null,toReturn);
}
public void setCountAllDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("countAll()"),null,toThrow);
}



public void acceptCountAllDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("countAll()"),params,valueToThrow);
}


public void expectAddOrUpdate(net.sf.pmr.core.domain.project.Project p0_BasicProject)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Project)"),params );
}
public void expectAddOrUpdate(net.sf.pmr.core.domain.project.Project p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Project)"),params,toThrow );
}
public void acceptAddOrUpdate(Object p0_BasicProject)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Project)"),params );
}
public void acceptAddOrUpdate(Object p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Project)"),params,toThrow );
}
public void setAddOrUpdateDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Project)"),null,null);
}
public void setAddOrUpdateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Project)"),null,toThrow);
}
public void setAddOrUpdateDummy(net.sf.pmr.core.domain.project.Project p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(Project)"),params,toThrow);
}


public void acceptAddOrUpdateDummy(Object p0_BasicProject, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Project)"),params,valueToThrow);
}


public void expectFindByPersistanceId(int p0_int, net.sf.pmr.core.domain.project.Project valueToReturn)
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
public void acceptFindByPersistanceId(Object p0_int, net.sf.pmr.core.domain.project.Project valueToReturn)
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
public void setFindByPersistanceIdDummy(net.sf.pmr.core.domain.project.Project toReturn)
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
public void setFindByPersistanceIdDummy(int p0_int,net.sf.pmr.core.domain.project.Project toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toReturn);
}
public void acceptFindByPersistanceIdDummy(Object p0_int, net.sf.pmr.core.domain.project.Project valueToReturn)
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


public void expectFindForAUser(int p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findForAUser(int)"),params, valueToReturn );
}
public void expectFindForAUser(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findForAUser(int)"),params,toThrow );
}
public void acceptFindForAUser(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findForAUser(int)"),params, valueToReturn );
}
public void acceptFindForAUser(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findForAUser(int)"),params,toThrow );
}
public void setFindForAUserDummy(java.util.Set toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findForAUser(int)"),null,toReturn);
}
public void setFindForAUserDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findForAUser(int)"),null,toThrow);
}
public void setFindForAUserDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findForAUser(int)"),params,toThrow);
}
public void setFindForAUserDummy(int p0_int,java.util.Set toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findForAUser(int)"),params,toReturn);
}
public void acceptFindForAUserDummy(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findForAUser(int)"),params, valueToReturn );
}
public void acceptFindForAUserDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findForAUser(int)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.project.MockBasicProjectRepository"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.project.ProjectRepository";
}
    public MockProjectRepository()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.core.domain.project.MockBasicProjectRepository",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.core.domain.project.MockProjectRepository.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.core.domain.project.MockBasicProjectRepository",params);
        return new net.sf.pmr.core.domain.project.MockProjectRepository.PreMock(id);
    }

    public static net.sf.pmr.core.domain.project.MockProjectRepository.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.project.MockBasicProjectRepository",null);
        return new net.sf.pmr.core.domain.project.MockProjectRepository.PreMock(id);
    }

    public static net.sf.pmr.core.domain.project.MockProjectRepository.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.project.MockBasicProjectRepository",th);
        return new net.sf.pmr.core.domain.project.MockProjectRepository.PreMock(id);
    }

    public java.util.List findAll()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("findAll()"),params,MockCore.OPT_DEFAULT);
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
public void expectFindAll(java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findAll()"),params, valueToReturn );
}
public void expectFindAll(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findAll()"),params,toThrow );
}
public void acceptFindAll(java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findAll()"),params, valueToReturn );
}
public void acceptFindAll(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findAll()"),params,toThrow );
}
public void setFindAllDummy(java.util.List toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findAll()"),null,toReturn);
}
public void setFindAllDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findAll()"),null,toThrow);
}



public void acceptFindAllDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("findAll()"),params,valueToThrow);
}


    public java.lang.Integer countAll()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("countAll()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (java.lang.Integer)returnValue;
}
public void expectCountAll(java.lang.Integer valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("countAll()"),params, valueToReturn );
}
public void expectCountAll(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("countAll()"),params,toThrow );
}
public void acceptCountAll(java.lang.Integer valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("countAll()"),params, valueToReturn );
}
public void acceptCountAll(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("countAll()"),params,toThrow );
}
public void setCountAllDummy(java.lang.Integer toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("countAll()"),null,toReturn);
}
public void setCountAllDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("countAll()"),null,toThrow);
}



public void acceptCountAllDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("countAll()"),params,valueToThrow);
}


    public void addOrUpdate(net.sf.pmr.core.domain.project.Project p0_BasicProject)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("addOrUpdate(Project)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectAddOrUpdate(net.sf.pmr.core.domain.project.Project p0_BasicProject)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Project)"),params );
}
public void expectAddOrUpdate(net.sf.pmr.core.domain.project.Project p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Project)"),params,toThrow );
}
public void acceptAddOrUpdate(Object p0_BasicProject)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Project)"),params );
}
public void acceptAddOrUpdate(Object p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Project)"),params,toThrow );
}
public void setAddOrUpdateDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Project)"),null,null);
}
public void setAddOrUpdateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Project)"),null,toThrow);
}
public void setAddOrUpdateDummy(net.sf.pmr.core.domain.project.Project p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(Project)"),params,toThrow);
}


public void acceptAddOrUpdateDummy(Object p0_BasicProject, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Project)"),params,valueToThrow);
}


    public net.sf.pmr.core.domain.project.Project findByPersistanceId(int p0_int)
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
    return (net.sf.pmr.core.domain.project.Project)returnValue;
}
public void expectFindByPersistanceId(int p0_int, net.sf.pmr.core.domain.project.Project valueToReturn)
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
public void acceptFindByPersistanceId(Object p0_int, net.sf.pmr.core.domain.project.Project valueToReturn)
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
public void setFindByPersistanceIdDummy(net.sf.pmr.core.domain.project.Project toReturn)
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
public void setFindByPersistanceIdDummy(int p0_int,net.sf.pmr.core.domain.project.Project toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toReturn);
}
public void acceptFindByPersistanceIdDummy(Object p0_int, net.sf.pmr.core.domain.project.Project valueToReturn)
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


    public java.util.Set findForAUser(int p0_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("findForAUser(int)"),params,MockCore.OPT_DEFAULT);
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
public void expectFindForAUser(int p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findForAUser(int)"),params, valueToReturn );
}
public void expectFindForAUser(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findForAUser(int)"),params,toThrow );
}
public void acceptFindForAUser(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findForAUser(int)"),params, valueToReturn );
}
public void acceptFindForAUser(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findForAUser(int)"),params,toThrow );
}
public void setFindForAUserDummy(java.util.Set toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findForAUser(int)"),null,toReturn);
}
public void setFindForAUserDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findForAUser(int)"),null,toThrow);
}
public void setFindForAUserDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findForAUser(int)"),params,toThrow);
}
public void setFindForAUserDummy(int p0_int,java.util.Set toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findForAUser(int)"),params,toReturn);
}
public void acceptFindForAUserDummy(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findForAUser(int)"),params, valueToReturn );
}
public void acceptFindForAUserDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findForAUser(int)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.project.MockBasicProjectRepository"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.project.ProjectRepository";
}
