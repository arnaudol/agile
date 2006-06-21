// MockCreator v2.9.0 build 3065; HashCode:437941691; net.sf.pmr.core.data.project.ProjectMapper
package net.sf.pmr.core.data.basicProject;

import de.abstrakt.mock.MockCore;

public class MockBasicProjectMapper implements net.sf.pmr.core.data.project.ProjectMapper, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.core.data.basicProject.MockBasicProjectMapper.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.data.project.MockBasicProjectMapper",null);
        return this;
    }

    public net.sf.pmr.core.data.basicProject.MockBasicProjectMapper.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.data.project.MockBasicProjectMapper",th);
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


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.data.project.MockBasicProjectMapper"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.data.project.ProjectMapper";
}
    public MockBasicProjectMapper()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.core.data.project.MockBasicProjectMapper",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.core.data.basicProject.MockBasicProjectMapper.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.core.data.project.MockBasicProjectMapper",params);
        return new net.sf.pmr.core.data.basicProject.MockBasicProjectMapper.PreMock(id);
    }

    public static net.sf.pmr.core.data.basicProject.MockBasicProjectMapper.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.data.project.MockBasicProjectMapper",null);
        return new net.sf.pmr.core.data.basicProject.MockBasicProjectMapper.PreMock(id);
    }

    public static net.sf.pmr.core.data.basicProject.MockBasicProjectMapper.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.data.project.MockBasicProjectMapper",th);
        return new net.sf.pmr.core.data.basicProject.MockBasicProjectMapper.PreMock(id);
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


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.data.project.MockBasicProjectMapper"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.data.project.ProjectMapper";
}
