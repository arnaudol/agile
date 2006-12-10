// MockCreator v2.9.0 build 3065; HashCode:-247166248; net.sf.pmr.core.service.ProjectService
package net.sf.pmr.core.service;

import de.abstrakt.mock.MockCore;

public class MockBasicProjectService implements net.sf.pmr.core.service.ProjectService, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.core.service.MockBasicProjectService.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.service.MockBasicProjectService",null);
        return this;
    }

    public net.sf.pmr.core.service.MockBasicProjectService.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.service.MockBasicProjectService",th);
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


public void expectAdd(java.lang.String p0_String, java.lang.String p1_String, int p2_int, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);
        params.add(new Integer(p2_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("add(String,String,int)"),params, valueToReturn );
}
public void expectAdd(java.lang.String p0_String, java.lang.String p1_String, int p2_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);
        params.add(new Integer(p2_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("add(String,String,int)"),params,toThrow );
}
public void acceptAdd(Object p0_String, Object p1_String, Object p2_int, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);
params.add(p2_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("add(String,String,int)"),params, valueToReturn );
}
public void acceptAdd(Object p0_String, Object p1_String, Object p2_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);
params.add(p2_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("add(String,String,int)"),params,toThrow );
}
public void setAddDummy(net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("add(String,String,int)"),null,toReturn);
}
public void setAddDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("add(String,String,int)"),null,toThrow);
}
public void setAddDummy(java.lang.String p0_String, java.lang.String p1_String, int p2_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);
        params.add(new Integer(p2_int));

    MockCore.setDummy( getClassObjectMethodSignature("add(String,String,int)"),params,toThrow);
}
public void setAddDummy(java.lang.String p0_String, java.lang.String p1_String, int p2_int,net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);
        params.add(new Integer(p2_int));

    MockCore.setDummy( getClassObjectMethodSignature("add(String,String,int)"),params,toReturn);
}
public void acceptAddDummy(Object p0_String, Object p1_String, Object p2_int, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);
params.add(p2_int);

    MockCore.setDummy( getClassObjectMethodSignature("add(String,String,int)"),params, valueToReturn );
}
public void acceptAddDummy(Object p0_String, Object p1_String, Object p2_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);
params.add(p2_int);

    MockCore.setDummy(getClassObjectMethodSignature("add(String,String,int)"),params,valueToThrow);
}


public void expectUpdate(int p0_int, java.lang.String p1_String, java.lang.String p2_String, long p3_long, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(p1_String);
        params.add(p2_String);
        params.add(new Long(p3_long));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("update(int,String,String,long)"),params, valueToReturn );
}
public void expectUpdate(int p0_int, java.lang.String p1_String, java.lang.String p2_String, long p3_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(p1_String);
        params.add(p2_String);
        params.add(new Long(p3_long));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("update(int,String,String,long)"),params,toThrow );
}
public void acceptUpdate(Object p0_int, Object p1_String, Object p2_String, Object p3_long, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_String);
params.add(p2_String);
params.add(p3_long);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("update(int,String,String,long)"),params, valueToReturn );
}
public void acceptUpdate(Object p0_int, Object p1_String, Object p2_String, Object p3_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_String);
params.add(p2_String);
params.add(p3_long);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("update(int,String,String,long)"),params,toThrow );
}
public void setUpdateDummy(net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("update(int,String,String,long)"),null,toReturn);
}
public void setUpdateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("update(int,String,String,long)"),null,toThrow);
}
public void setUpdateDummy(int p0_int, java.lang.String p1_String, java.lang.String p2_String, long p3_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(p1_String);
        params.add(p2_String);
        params.add(new Long(p3_long));

    MockCore.setDummy( getClassObjectMethodSignature("update(int,String,String,long)"),params,toThrow);
}
public void setUpdateDummy(int p0_int, java.lang.String p1_String, java.lang.String p2_String, long p3_long,net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(p1_String);
        params.add(p2_String);
        params.add(new Long(p3_long));

    MockCore.setDummy( getClassObjectMethodSignature("update(int,String,String,long)"),params,toReturn);
}
public void acceptUpdateDummy(Object p0_int, Object p1_String, Object p2_String, Object p3_long, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_String);
params.add(p2_String);
params.add(p3_long);

    MockCore.setDummy( getClassObjectMethodSignature("update(int,String,String,long)"),params, valueToReturn );
}
public void acceptUpdateDummy(Object p0_int, Object p1_String, Object p2_String, Object p3_long, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_String);
params.add(p2_String);
params.add(p3_long);

    MockCore.setDummy(getClassObjectMethodSignature("update(int,String,String,long)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.service.MockBasicProjectService"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.service.ProjectService";
}
    public MockBasicProjectService()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.core.service.MockBasicProjectService",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.core.service.MockBasicProjectService.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.core.service.MockBasicProjectService",params);
        return new net.sf.pmr.core.service.MockBasicProjectService.PreMock(id);
    }

    public static net.sf.pmr.core.service.MockBasicProjectService.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.service.MockBasicProjectService",null);
        return new net.sf.pmr.core.service.MockBasicProjectService.PreMock(id);
    }

    public static net.sf.pmr.core.service.MockBasicProjectService.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.service.MockBasicProjectService",th);
        return new net.sf.pmr.core.service.MockBasicProjectService.PreMock(id);
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


    public net.sf.pmr.keopsframework.domain.validation.Errors add(java.lang.String p0_String, java.lang.String p1_String, int p2_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);
        params.add(new Integer(p2_int));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("add(String,String,int)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (net.sf.pmr.keopsframework.domain.validation.Errors)returnValue;
}
public void expectAdd(java.lang.String p0_String, java.lang.String p1_String, int p2_int, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);
        params.add(new Integer(p2_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("add(String,String,int)"),params, valueToReturn );
}
public void expectAdd(java.lang.String p0_String, java.lang.String p1_String, int p2_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);
        params.add(new Integer(p2_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("add(String,String,int)"),params,toThrow );
}
public void acceptAdd(Object p0_String, Object p1_String, Object p2_int, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);
params.add(p2_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("add(String,String,int)"),params, valueToReturn );
}
public void acceptAdd(Object p0_String, Object p1_String, Object p2_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);
params.add(p2_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("add(String,String,int)"),params,toThrow );
}
public void setAddDummy(net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("add(String,String,int)"),null,toReturn);
}
public void setAddDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("add(String,String,int)"),null,toThrow);
}
public void setAddDummy(java.lang.String p0_String, java.lang.String p1_String, int p2_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);
        params.add(new Integer(p2_int));

    MockCore.setDummy( getClassObjectMethodSignature("add(String,String,int)"),params,toThrow);
}
public void setAddDummy(java.lang.String p0_String, java.lang.String p1_String, int p2_int,net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);
        params.add(new Integer(p2_int));

    MockCore.setDummy( getClassObjectMethodSignature("add(String,String,int)"),params,toReturn);
}
public void acceptAddDummy(Object p0_String, Object p1_String, Object p2_int, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);
params.add(p2_int);

    MockCore.setDummy( getClassObjectMethodSignature("add(String,String,int)"),params, valueToReturn );
}
public void acceptAddDummy(Object p0_String, Object p1_String, Object p2_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);
params.add(p2_int);

    MockCore.setDummy(getClassObjectMethodSignature("add(String,String,int)"),params,valueToThrow);
}


    public net.sf.pmr.keopsframework.domain.validation.Errors update(int p0_int, java.lang.String p1_String, java.lang.String p2_String, long p3_long)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(p1_String);
        params.add(p2_String);
        params.add(new Long(p3_long));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("update(int,String,String,long)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (net.sf.pmr.keopsframework.domain.validation.Errors)returnValue;
}
public void expectUpdate(int p0_int, java.lang.String p1_String, java.lang.String p2_String, long p3_long, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(p1_String);
        params.add(p2_String);
        params.add(new Long(p3_long));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("update(int,String,String,long)"),params, valueToReturn );
}
public void expectUpdate(int p0_int, java.lang.String p1_String, java.lang.String p2_String, long p3_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(p1_String);
        params.add(p2_String);
        params.add(new Long(p3_long));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("update(int,String,String,long)"),params,toThrow );
}
public void acceptUpdate(Object p0_int, Object p1_String, Object p2_String, Object p3_long, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_String);
params.add(p2_String);
params.add(p3_long);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("update(int,String,String,long)"),params, valueToReturn );
}
public void acceptUpdate(Object p0_int, Object p1_String, Object p2_String, Object p3_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_String);
params.add(p2_String);
params.add(p3_long);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("update(int,String,String,long)"),params,toThrow );
}
public void setUpdateDummy(net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("update(int,String,String,long)"),null,toReturn);
}
public void setUpdateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("update(int,String,String,long)"),null,toThrow);
}
public void setUpdateDummy(int p0_int, java.lang.String p1_String, java.lang.String p2_String, long p3_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(p1_String);
        params.add(p2_String);
        params.add(new Long(p3_long));

    MockCore.setDummy( getClassObjectMethodSignature("update(int,String,String,long)"),params,toThrow);
}
public void setUpdateDummy(int p0_int, java.lang.String p1_String, java.lang.String p2_String, long p3_long,net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(p1_String);
        params.add(p2_String);
        params.add(new Long(p3_long));

    MockCore.setDummy( getClassObjectMethodSignature("update(int,String,String,long)"),params,toReturn);
}
public void acceptUpdateDummy(Object p0_int, Object p1_String, Object p2_String, Object p3_long, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_String);
params.add(p2_String);
params.add(p3_long);

    MockCore.setDummy( getClassObjectMethodSignature("update(int,String,String,long)"),params, valueToReturn );
}
public void acceptUpdateDummy(Object p0_int, Object p1_String, Object p2_String, Object p3_long, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_String);
params.add(p2_String);
params.add(p3_long);

    MockCore.setDummy(getClassObjectMethodSignature("update(int,String,String,long)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.service.MockBasicProjectService"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.service.ProjectService";
}
