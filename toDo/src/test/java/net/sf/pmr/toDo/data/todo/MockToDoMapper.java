// MockCreator v2.9.0 build 3065; HashCode:-516270313; net.sf.pmr.todo.data.todo.ToDoMapper
package net.sf.pmr.toDo.data.todo;

import de.abstrakt.mock.MockCore;

public class MockToDoMapper implements net.sf.pmr.toDo.data.todo.ToDoMapper, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.toDo.data.todo.MockToDoMapper.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.todo.data.todo.MockToDoMapper",null);
        return this;
    }

    public net.sf.pmr.toDo.data.todo.MockToDoMapper.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.todo.data.todo.MockToDoMapper",th);
        return this;
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


public void expectFindByProjectPersistanceIdAndUserPersistanceId(int p0_int, int p1_int, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceIdAndUserPersistanceId(int,int)"),params, valueToReturn );
}
public void expectFindByProjectPersistanceIdAndUserPersistanceId(int p0_int, int p1_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceIdAndUserPersistanceId(int,int)"),params,toThrow );
}
public void acceptFindByProjectPersistanceIdAndUserPersistanceId(Object p0_int, Object p1_int, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceIdAndUserPersistanceId(int,int)"),params, valueToReturn );
}
public void acceptFindByProjectPersistanceIdAndUserPersistanceId(Object p0_int, Object p1_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceIdAndUserPersistanceId(int,int)"),params,toThrow );
}
public void setFindByProjectPersistanceIdAndUserPersistanceIdDummy(java.util.List toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceIdAndUserPersistanceId(int,int)"),null,toReturn);
}
public void setFindByProjectPersistanceIdAndUserPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceIdAndUserPersistanceId(int,int)"),null,toThrow);
}
public void setFindByProjectPersistanceIdAndUserPersistanceIdDummy(int p0_int, int p1_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceIdAndUserPersistanceId(int,int)"),params,toThrow);
}
public void setFindByProjectPersistanceIdAndUserPersistanceIdDummy(int p0_int, int p1_int,java.util.List toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceIdAndUserPersistanceId(int,int)"),params,toReturn);
}
public void acceptFindByProjectPersistanceIdAndUserPersistanceIdDummy(Object p0_int, Object p1_int, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceIdAndUserPersistanceId(int,int)"),params, valueToReturn );
}
public void acceptFindByProjectPersistanceIdAndUserPersistanceIdDummy(Object p0_int, Object p1_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceIdAndUserPersistanceId(int,int)"),params,valueToThrow);
}


public void expectFindByUserPersistanceId(int p0_int, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByUserPersistanceId(int)"),params, valueToReturn );
}
public void expectFindByUserPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByUserPersistanceId(int)"),params,toThrow );
}
public void acceptFindByUserPersistanceId(Object p0_int, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByUserPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByUserPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByUserPersistanceId(int)"),params,toThrow );
}
public void setFindByUserPersistanceIdDummy(java.util.List toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findByUserPersistanceId(int)"),null,toReturn);
}
public void setFindByUserPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findByUserPersistanceId(int)"),null,toThrow);
}
public void setFindByUserPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByUserPersistanceId(int)"),params,toThrow);
}
public void setFindByUserPersistanceIdDummy(int p0_int,java.util.List toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByUserPersistanceId(int)"),params,toReturn);
}
public void acceptFindByUserPersistanceIdDummy(Object p0_int, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findByUserPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByUserPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findByUserPersistanceId(int)"),params,valueToThrow);
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


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.todo.data.todo.MockToDoMapper"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.todo.data.todo.ToDoMapper";
}
    public MockToDoMapper()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.todo.data.todo.MockToDoMapper",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.toDo.data.todo.MockToDoMapper.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.todo.data.todo.MockToDoMapper",params);
        return new net.sf.pmr.toDo.data.todo.MockToDoMapper.PreMock(id);
    }

    public static net.sf.pmr.toDo.data.todo.MockToDoMapper.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.todo.data.todo.MockToDoMapper",null);
        return new net.sf.pmr.toDo.data.todo.MockToDoMapper.PreMock(id);
    }

    public static net.sf.pmr.toDo.data.todo.MockToDoMapper.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.todo.data.todo.MockToDoMapper",th);
        return new net.sf.pmr.toDo.data.todo.MockToDoMapper.PreMock(id);
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


    public java.util.List findByProjectPersistanceIdAndUserPersistanceId(int p0_int, int p1_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("findByProjectPersistanceIdAndUserPersistanceId(int,int)"),params,MockCore.OPT_DEFAULT);
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
public void expectFindByProjectPersistanceIdAndUserPersistanceId(int p0_int, int p1_int, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceIdAndUserPersistanceId(int,int)"),params, valueToReturn );
}
public void expectFindByProjectPersistanceIdAndUserPersistanceId(int p0_int, int p1_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceIdAndUserPersistanceId(int,int)"),params,toThrow );
}
public void acceptFindByProjectPersistanceIdAndUserPersistanceId(Object p0_int, Object p1_int, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceIdAndUserPersistanceId(int,int)"),params, valueToReturn );
}
public void acceptFindByProjectPersistanceIdAndUserPersistanceId(Object p0_int, Object p1_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceIdAndUserPersistanceId(int,int)"),params,toThrow );
}
public void setFindByProjectPersistanceIdAndUserPersistanceIdDummy(java.util.List toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceIdAndUserPersistanceId(int,int)"),null,toReturn);
}
public void setFindByProjectPersistanceIdAndUserPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceIdAndUserPersistanceId(int,int)"),null,toThrow);
}
public void setFindByProjectPersistanceIdAndUserPersistanceIdDummy(int p0_int, int p1_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceIdAndUserPersistanceId(int,int)"),params,toThrow);
}
public void setFindByProjectPersistanceIdAndUserPersistanceIdDummy(int p0_int, int p1_int,java.util.List toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceIdAndUserPersistanceId(int,int)"),params,toReturn);
}
public void acceptFindByProjectPersistanceIdAndUserPersistanceIdDummy(Object p0_int, Object p1_int, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceIdAndUserPersistanceId(int,int)"),params, valueToReturn );
}
public void acceptFindByProjectPersistanceIdAndUserPersistanceIdDummy(Object p0_int, Object p1_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceIdAndUserPersistanceId(int,int)"),params,valueToThrow);
}


    public java.util.List findByUserPersistanceId(int p0_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("findByUserPersistanceId(int)"),params,MockCore.OPT_DEFAULT);
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
public void expectFindByUserPersistanceId(int p0_int, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByUserPersistanceId(int)"),params, valueToReturn );
}
public void expectFindByUserPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByUserPersistanceId(int)"),params,toThrow );
}
public void acceptFindByUserPersistanceId(Object p0_int, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByUserPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByUserPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByUserPersistanceId(int)"),params,toThrow );
}
public void setFindByUserPersistanceIdDummy(java.util.List toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findByUserPersistanceId(int)"),null,toReturn);
}
public void setFindByUserPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findByUserPersistanceId(int)"),null,toThrow);
}
public void setFindByUserPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByUserPersistanceId(int)"),params,toThrow);
}
public void setFindByUserPersistanceIdDummy(int p0_int,java.util.List toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByUserPersistanceId(int)"),params,toReturn);
}
public void acceptFindByUserPersistanceIdDummy(Object p0_int, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findByUserPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByUserPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findByUserPersistanceId(int)"),params,valueToThrow);
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


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.todo.data.todo.MockToDoMapper"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.todo.data.todo.ToDoMapper";
}
