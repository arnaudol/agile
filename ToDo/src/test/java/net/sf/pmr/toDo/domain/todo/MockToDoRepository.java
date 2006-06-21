// MockCreator v2.9.0 build 3065; HashCode:768232292; net.sf.pmr.toDo.domain.todo.ToDoRepository
package net.sf.pmr.toDo.domain.todo;

import de.abstrakt.mock.MockCore;

public class MockToDoRepository implements net.sf.pmr.toDo.domain.todo.ToDoRepository, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.toDo.domain.todo.MockToDoRepository.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.toDo.domain.todo.MockToDoRepository",null);
        return this;
    }

    public net.sf.pmr.toDo.domain.todo.MockToDoRepository.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.toDo.domain.todo.MockToDoRepository",th);
        return this;
    }

public void expectFindByPersistanceId(int p0_int, net.sf.pmr.toDo.domain.todo.ToDo valueToReturn)
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
public void acceptFindByPersistanceId(Object p0_int, net.sf.pmr.toDo.domain.todo.ToDo valueToReturn)
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
public void setFindByPersistanceIdDummy(net.sf.pmr.toDo.domain.todo.ToDo toReturn)
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
public void setFindByPersistanceIdDummy(int p0_int,net.sf.pmr.toDo.domain.todo.ToDo toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toReturn);
}
public void acceptFindByPersistanceIdDummy(Object p0_int, net.sf.pmr.toDo.domain.todo.ToDo valueToReturn)
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


public void expectAddOrUpdate(net.sf.pmr.toDo.domain.todo.ToDo p0_ToDo)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_ToDo);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(ToDo)"),params );
}
public void expectAddOrUpdate(net.sf.pmr.toDo.domain.todo.ToDo p0_ToDo,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_ToDo);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(ToDo)"),params,toThrow );
}
public void acceptAddOrUpdate(Object p0_ToDo)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_ToDo);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(ToDo)"),params );
}
public void acceptAddOrUpdate(Object p0_ToDo,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_ToDo);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(ToDo)"),params,toThrow );
}
public void setAddOrUpdateDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(ToDo)"),null,null);
}
public void setAddOrUpdateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(ToDo)"),null,toThrow);
}
public void setAddOrUpdateDummy(net.sf.pmr.toDo.domain.todo.ToDo p0_ToDo,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_ToDo);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(ToDo)"),params,toThrow);
}


public void acceptAddOrUpdateDummy(Object p0_ToDo, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_ToDo);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(ToDo)"),params,valueToThrow);
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


public void expectDelete(net.sf.pmr.toDo.domain.todo.ToDo p0_ToDo)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_ToDo);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(ToDo)"),params );
}
public void expectDelete(net.sf.pmr.toDo.domain.todo.ToDo p0_ToDo,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_ToDo);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(ToDo)"),params,toThrow );
}
public void acceptDelete(Object p0_ToDo)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_ToDo);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(ToDo)"),params );
}
public void acceptDelete(Object p0_ToDo,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_ToDo);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(ToDo)"),params,toThrow );
}
public void setDeleteDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("delete(ToDo)"),null,null);
}
public void setDeleteDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("delete(ToDo)"),null,toThrow);
}
public void setDeleteDummy(net.sf.pmr.toDo.domain.todo.ToDo p0_ToDo,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_ToDo);

    MockCore.setDummy( getClassObjectMethodSignature("delete(ToDo)"),params,toThrow);
}


public void acceptDeleteDummy(Object p0_ToDo, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_ToDo);

    MockCore.setDummy(getClassObjectMethodSignature("delete(ToDo)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.toDo.domain.todo.MockToDoRepository"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.toDo.domain.todo.ToDoRepository";
}
    public MockToDoRepository()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.toDo.domain.todo.MockToDoRepository",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.toDo.domain.todo.MockToDoRepository.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.toDo.domain.todo.MockToDoRepository",params);
        return new net.sf.pmr.toDo.domain.todo.MockToDoRepository.PreMock(id);
    }

    public static net.sf.pmr.toDo.domain.todo.MockToDoRepository.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.toDo.domain.todo.MockToDoRepository",null);
        return new net.sf.pmr.toDo.domain.todo.MockToDoRepository.PreMock(id);
    }

    public static net.sf.pmr.toDo.domain.todo.MockToDoRepository.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.toDo.domain.todo.MockToDoRepository",th);
        return new net.sf.pmr.toDo.domain.todo.MockToDoRepository.PreMock(id);
    }

    public net.sf.pmr.toDo.domain.todo.ToDo findByPersistanceId(int p0_int)
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
    return (net.sf.pmr.toDo.domain.todo.ToDo)returnValue;
}
public void expectFindByPersistanceId(int p0_int, net.sf.pmr.toDo.domain.todo.ToDo valueToReturn)
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
public void acceptFindByPersistanceId(Object p0_int, net.sf.pmr.toDo.domain.todo.ToDo valueToReturn)
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
public void setFindByPersistanceIdDummy(net.sf.pmr.toDo.domain.todo.ToDo toReturn)
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
public void setFindByPersistanceIdDummy(int p0_int,net.sf.pmr.toDo.domain.todo.ToDo toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toReturn);
}
public void acceptFindByPersistanceIdDummy(Object p0_int, net.sf.pmr.toDo.domain.todo.ToDo valueToReturn)
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


    public void addOrUpdate(net.sf.pmr.toDo.domain.todo.ToDo p0_ToDo)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_ToDo);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("addOrUpdate(ToDo)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectAddOrUpdate(net.sf.pmr.toDo.domain.todo.ToDo p0_ToDo)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_ToDo);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(ToDo)"),params );
}
public void expectAddOrUpdate(net.sf.pmr.toDo.domain.todo.ToDo p0_ToDo,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_ToDo);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(ToDo)"),params,toThrow );
}
public void acceptAddOrUpdate(Object p0_ToDo)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_ToDo);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(ToDo)"),params );
}
public void acceptAddOrUpdate(Object p0_ToDo,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_ToDo);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(ToDo)"),params,toThrow );
}
public void setAddOrUpdateDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(ToDo)"),null,null);
}
public void setAddOrUpdateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(ToDo)"),null,toThrow);
}
public void setAddOrUpdateDummy(net.sf.pmr.toDo.domain.todo.ToDo p0_ToDo,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_ToDo);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(ToDo)"),params,toThrow);
}


public void acceptAddOrUpdateDummy(Object p0_ToDo, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_ToDo);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(ToDo)"),params,valueToThrow);
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


    public void delete(net.sf.pmr.toDo.domain.todo.ToDo p0_ToDo)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_ToDo);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("delete(ToDo)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectDelete(net.sf.pmr.toDo.domain.todo.ToDo p0_ToDo)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_ToDo);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(ToDo)"),params );
}
public void expectDelete(net.sf.pmr.toDo.domain.todo.ToDo p0_ToDo,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_ToDo);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(ToDo)"),params,toThrow );
}
public void acceptDelete(Object p0_ToDo)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_ToDo);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(ToDo)"),params );
}
public void acceptDelete(Object p0_ToDo,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_ToDo);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(ToDo)"),params,toThrow );
}
public void setDeleteDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("delete(ToDo)"),null,null);
}
public void setDeleteDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("delete(ToDo)"),null,toThrow);
}
public void setDeleteDummy(net.sf.pmr.toDo.domain.todo.ToDo p0_ToDo,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_ToDo);

    MockCore.setDummy( getClassObjectMethodSignature("delete(ToDo)"),params,toThrow);
}


public void acceptDeleteDummy(Object p0_ToDo, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_ToDo);

    MockCore.setDummy(getClassObjectMethodSignature("delete(ToDo)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.toDo.domain.todo.MockToDoRepository"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.toDo.domain.todo.ToDoRepository";
}
