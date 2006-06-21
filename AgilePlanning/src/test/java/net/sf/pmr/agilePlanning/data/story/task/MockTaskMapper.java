// MockCreator v2.9.0 build 3065; HashCode:88693401; net.sf.pmr.agilePlanning.data.story.task.TaskMapper
package net.sf.pmr.agilePlanning.data.story.task;

import de.abstrakt.mock.MockCore;

public class MockTaskMapper implements net.sf.pmr.agilePlanning.data.story.task.TaskMapper, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.agilePlanning.data.story.task.MockTaskMapper.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.agilePlanning.data.story.task.MockTaskMapper",null);
        return this;
    }

    public net.sf.pmr.agilePlanning.data.story.task.MockTaskMapper.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.agilePlanning.data.story.task.MockTaskMapper",th);
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


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.agilePlanning.data.story.task.MockTaskMapper"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.agilePlanning.data.story.task.TaskMapper";
}
    public MockTaskMapper()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.agilePlanning.data.story.task.MockTaskMapper",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.agilePlanning.data.story.task.MockTaskMapper.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.agilePlanning.data.story.task.MockTaskMapper",params);
        return new net.sf.pmr.agilePlanning.data.story.task.MockTaskMapper.PreMock(id);
    }

    public static net.sf.pmr.agilePlanning.data.story.task.MockTaskMapper.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.agilePlanning.data.story.task.MockTaskMapper",null);
        return new net.sf.pmr.agilePlanning.data.story.task.MockTaskMapper.PreMock(id);
    }

    public static net.sf.pmr.agilePlanning.data.story.task.MockTaskMapper.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.agilePlanning.data.story.task.MockTaskMapper",th);
        return new net.sf.pmr.agilePlanning.data.story.task.MockTaskMapper.PreMock(id);
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


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.agilePlanning.data.story.task.MockTaskMapper"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.agilePlanning.data.story.task.TaskMapper";
}
