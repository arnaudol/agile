// MockCreator v2.9.0 build 3065; HashCode:1638024891; net.sf.pmr.messageBoards.domain.BoardRepository
package net.sf.pmr.messageBoards.domain;

import de.abstrakt.mock.MockCore;

public class MockBoardRepository implements net.sf.pmr.messageBoards.domain.BoardRepository, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.messageBoards.domain.MockBoardRepository.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.messageBoards.domain.MockBoardRepository",null);
        return this;
    }

    public net.sf.pmr.messageBoards.domain.MockBoardRepository.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.messageBoards.domain.MockBoardRepository",th);
        return this;
    }

public void expectAddOrUpdate(net.sf.pmr.messageBoards.domain.Board p0_Board)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Board);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Board)"),params );
}
public void expectAddOrUpdate(net.sf.pmr.messageBoards.domain.Board p0_Board,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Board);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Board)"),params,toThrow );
}
public void acceptAddOrUpdate(Object p0_Board)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Board);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Board)"),params );
}
public void acceptAddOrUpdate(Object p0_Board,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Board);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Board)"),params,toThrow );
}
public void setAddOrUpdateDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Board)"),null,null);
}
public void setAddOrUpdateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Board)"),null,toThrow);
}
public void setAddOrUpdateDummy(net.sf.pmr.messageBoards.domain.Board p0_Board,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Board);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(Board)"),params,toThrow);
}


public void acceptAddOrUpdateDummy(Object p0_Board, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Board);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Board)"),params,valueToThrow);
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


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.messageBoards.domain.MockBoardRepository"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.messageBoards.domain.BoardRepository";
}
    public MockBoardRepository()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.messageBoards.domain.MockBoardRepository",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.messageBoards.domain.MockBoardRepository.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.messageBoards.domain.MockBoardRepository",params);
        return new net.sf.pmr.messageBoards.domain.MockBoardRepository.PreMock(id);
    }

    public static net.sf.pmr.messageBoards.domain.MockBoardRepository.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.messageBoards.domain.MockBoardRepository",null);
        return new net.sf.pmr.messageBoards.domain.MockBoardRepository.PreMock(id);
    }

    public static net.sf.pmr.messageBoards.domain.MockBoardRepository.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.messageBoards.domain.MockBoardRepository",th);
        return new net.sf.pmr.messageBoards.domain.MockBoardRepository.PreMock(id);
    }

    public void addOrUpdate(net.sf.pmr.messageBoards.domain.Board p0_Board)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Board);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("addOrUpdate(Board)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectAddOrUpdate(net.sf.pmr.messageBoards.domain.Board p0_Board)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Board);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Board)"),params );
}
public void expectAddOrUpdate(net.sf.pmr.messageBoards.domain.Board p0_Board,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Board);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Board)"),params,toThrow );
}
public void acceptAddOrUpdate(Object p0_Board)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Board);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Board)"),params );
}
public void acceptAddOrUpdate(Object p0_Board,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Board);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Board)"),params,toThrow );
}
public void setAddOrUpdateDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Board)"),null,null);
}
public void setAddOrUpdateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Board)"),null,toThrow);
}
public void setAddOrUpdateDummy(net.sf.pmr.messageBoards.domain.Board p0_Board,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Board);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(Board)"),params,toThrow);
}


public void acceptAddOrUpdateDummy(Object p0_Board, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Board);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Board)"),params,valueToThrow);
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


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.messageBoards.domain.MockBoardRepository"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.messageBoards.domain.BoardRepository";
}
