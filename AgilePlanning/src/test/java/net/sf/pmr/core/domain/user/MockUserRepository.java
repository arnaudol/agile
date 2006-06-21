// MockCreator v2.9.0 build 3065; HashCode:648614628; net.sf.pmr.core.domain.user.UserRepository
package net.sf.pmr.core.domain.user;

import de.abstrakt.mock.MockCore;

public class MockUserRepository implements net.sf.pmr.core.domain.user.UserRepository, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.core.domain.user.MockUserRepository.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.user.MockUserRepository",null);
        return this;
    }

    public net.sf.pmr.core.domain.user.MockUserRepository.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.user.MockUserRepository",th);
        return this;
    }

public void expectDelete(net.sf.pmr.core.domain.user.User p0_User)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(User)"),params );
}
public void expectDelete(net.sf.pmr.core.domain.user.User p0_User,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(User)"),params,toThrow );
}
public void acceptDelete(Object p0_User)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(User)"),params );
}
public void acceptDelete(Object p0_User,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(User)"),params,toThrow );
}
public void setDeleteDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("delete(User)"),null,null);
}
public void setDeleteDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("delete(User)"),null,toThrow);
}
public void setDeleteDummy(net.sf.pmr.core.domain.user.User p0_User,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_User);

    MockCore.setDummy( getClassObjectMethodSignature("delete(User)"),params,toThrow);
}


public void acceptDeleteDummy(Object p0_User, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_User);

    MockCore.setDummy(getClassObjectMethodSignature("delete(User)"),params,valueToThrow);
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


public void expectAddOrUpdate(net.sf.pmr.core.domain.user.User p0_User)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(User)"),params );
}
public void expectAddOrUpdate(net.sf.pmr.core.domain.user.User p0_User,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(User)"),params,toThrow );
}
public void acceptAddOrUpdate(Object p0_User)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(User)"),params );
}
public void acceptAddOrUpdate(Object p0_User,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(User)"),params,toThrow );
}
public void setAddOrUpdateDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(User)"),null,null);
}
public void setAddOrUpdateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(User)"),null,toThrow);
}
public void setAddOrUpdateDummy(net.sf.pmr.core.domain.user.User p0_User,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_User);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(User)"),params,toThrow);
}


public void acceptAddOrUpdateDummy(Object p0_User, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_User);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(User)"),params,valueToThrow);
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


public void expectFindUserById(int p0_int, net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findUserById(int)"),params, valueToReturn );
}
public void expectFindUserById(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findUserById(int)"),params,toThrow );
}
public void acceptFindUserById(Object p0_int, net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findUserById(int)"),params, valueToReturn );
}
public void acceptFindUserById(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findUserById(int)"),params,toThrow );
}
public void setFindUserByIdDummy(net.sf.pmr.core.domain.user.User toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findUserById(int)"),null,toReturn);
}
public void setFindUserByIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findUserById(int)"),null,toThrow);
}
public void setFindUserByIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findUserById(int)"),params,toThrow);
}
public void setFindUserByIdDummy(int p0_int,net.sf.pmr.core.domain.user.User toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findUserById(int)"),params,toReturn);
}
public void acceptFindUserByIdDummy(Object p0_int, net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findUserById(int)"),params, valueToReturn );
}
public void acceptFindUserByIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findUserById(int)"),params,valueToThrow);
}


public void expectFindUserByLogin(java.lang.String p0_String, net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findUserByLogin(String)"),params, valueToReturn );
}
public void expectFindUserByLogin(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findUserByLogin(String)"),params,toThrow );
}
public void acceptFindUserByLogin(Object p0_String, net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findUserByLogin(String)"),params, valueToReturn );
}
public void acceptFindUserByLogin(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findUserByLogin(String)"),params,toThrow );
}
public void setFindUserByLoginDummy(net.sf.pmr.core.domain.user.User toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findUserByLogin(String)"),null,toReturn);
}
public void setFindUserByLoginDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findUserByLogin(String)"),null,toThrow);
}
public void setFindUserByLoginDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("findUserByLogin(String)"),params,toThrow);
}
public void setFindUserByLoginDummy(java.lang.String p0_String,net.sf.pmr.core.domain.user.User toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("findUserByLogin(String)"),params,toReturn);
}
public void acceptFindUserByLoginDummy(Object p0_String, net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("findUserByLogin(String)"),params, valueToReturn );
}
public void acceptFindUserByLoginDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("findUserByLogin(String)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.user.MockUserRepository"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.user.UserRepository";
}
    public MockUserRepository()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.core.domain.user.MockUserRepository",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.core.domain.user.MockUserRepository.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.core.domain.user.MockUserRepository",params);
        return new net.sf.pmr.core.domain.user.MockUserRepository.PreMock(id);
    }

    public static net.sf.pmr.core.domain.user.MockUserRepository.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.user.MockUserRepository",null);
        return new net.sf.pmr.core.domain.user.MockUserRepository.PreMock(id);
    }

    public static net.sf.pmr.core.domain.user.MockUserRepository.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.user.MockUserRepository",th);
        return new net.sf.pmr.core.domain.user.MockUserRepository.PreMock(id);
    }

    public void delete(net.sf.pmr.core.domain.user.User p0_User)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_User);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("delete(User)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectDelete(net.sf.pmr.core.domain.user.User p0_User)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(User)"),params );
}
public void expectDelete(net.sf.pmr.core.domain.user.User p0_User,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(User)"),params,toThrow );
}
public void acceptDelete(Object p0_User)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(User)"),params );
}
public void acceptDelete(Object p0_User,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(User)"),params,toThrow );
}
public void setDeleteDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("delete(User)"),null,null);
}
public void setDeleteDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("delete(User)"),null,toThrow);
}
public void setDeleteDummy(net.sf.pmr.core.domain.user.User p0_User,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_User);

    MockCore.setDummy( getClassObjectMethodSignature("delete(User)"),params,toThrow);
}


public void acceptDeleteDummy(Object p0_User, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_User);

    MockCore.setDummy(getClassObjectMethodSignature("delete(User)"),params,valueToThrow);
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


    public void addOrUpdate(net.sf.pmr.core.domain.user.User p0_User)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_User);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("addOrUpdate(User)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectAddOrUpdate(net.sf.pmr.core.domain.user.User p0_User)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(User)"),params );
}
public void expectAddOrUpdate(net.sf.pmr.core.domain.user.User p0_User,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(User)"),params,toThrow );
}
public void acceptAddOrUpdate(Object p0_User)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(User)"),params );
}
public void acceptAddOrUpdate(Object p0_User,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(User)"),params,toThrow );
}
public void setAddOrUpdateDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(User)"),null,null);
}
public void setAddOrUpdateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(User)"),null,toThrow);
}
public void setAddOrUpdateDummy(net.sf.pmr.core.domain.user.User p0_User,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_User);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(User)"),params,toThrow);
}


public void acceptAddOrUpdateDummy(Object p0_User, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_User);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(User)"),params,valueToThrow);
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


    public net.sf.pmr.core.domain.user.User findUserByPersistanceId(int p0_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("findUserById(int)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (net.sf.pmr.core.domain.user.User)returnValue;
}
public void expectFindUserById(int p0_int, net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findUserById(int)"),params, valueToReturn );
}
public void expectFindUserById(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findUserById(int)"),params,toThrow );
}
public void acceptFindUserById(Object p0_int, net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findUserById(int)"),params, valueToReturn );
}
public void acceptFindUserById(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findUserById(int)"),params,toThrow );
}
public void setFindUserByIdDummy(net.sf.pmr.core.domain.user.User toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findUserById(int)"),null,toReturn);
}
public void setFindUserByIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findUserById(int)"),null,toThrow);
}
public void setFindUserByIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findUserById(int)"),params,toThrow);
}
public void setFindUserByIdDummy(int p0_int,net.sf.pmr.core.domain.user.User toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findUserById(int)"),params,toReturn);
}
public void acceptFindUserByIdDummy(Object p0_int, net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findUserById(int)"),params, valueToReturn );
}
public void acceptFindUserByIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findUserById(int)"),params,valueToThrow);
}


    public net.sf.pmr.core.domain.user.User findUserByLogin(java.lang.String p0_String)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("findUserByLogin(String)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (net.sf.pmr.core.domain.user.User)returnValue;
}
public void expectFindUserByLogin(java.lang.String p0_String, net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findUserByLogin(String)"),params, valueToReturn );
}
public void expectFindUserByLogin(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findUserByLogin(String)"),params,toThrow );
}
public void acceptFindUserByLogin(Object p0_String, net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findUserByLogin(String)"),params, valueToReturn );
}
public void acceptFindUserByLogin(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findUserByLogin(String)"),params,toThrow );
}
public void setFindUserByLoginDummy(net.sf.pmr.core.domain.user.User toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findUserByLogin(String)"),null,toReturn);
}
public void setFindUserByLoginDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findUserByLogin(String)"),null,toThrow);
}
public void setFindUserByLoginDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("findUserByLogin(String)"),params,toThrow);
}
public void setFindUserByLoginDummy(java.lang.String p0_String,net.sf.pmr.core.domain.user.User toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("findUserByLogin(String)"),params,toReturn);
}
public void acceptFindUserByLoginDummy(Object p0_String, net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("findUserByLogin(String)"),params, valueToReturn );
}
public void acceptFindUserByLoginDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("findUserByLogin(String)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.user.MockUserRepository"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.user.UserRepository";
}
