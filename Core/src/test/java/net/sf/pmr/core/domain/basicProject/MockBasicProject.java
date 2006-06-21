// MockCreator v2.9.0 build 3065; HashCode:-1897869963; net.sf.pmr.core.domain.project.Project
package net.sf.pmr.core.domain.basicProject;

import de.abstrakt.mock.MockCore;

public class MockBasicProject implements net.sf.pmr.core.domain.project.Project, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.core.domain.basicProject.MockBasicProject.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.project.MockBasicProject",null);
        return this;
    }

    public net.sf.pmr.core.domain.basicProject.MockBasicProject.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.project.MockBasicProject",th);
        return this;
    }

public void expectGetName(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getName()"),params, valueToReturn );
}
public void expectGetName(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getName()"),params,toThrow );
}
public void acceptGetName(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getName()"),params, valueToReturn );
}
public void acceptGetName(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getName()"),params,toThrow );
}
public void setGetNameDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getName()"),null,toReturn);
}
public void setGetNameDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getName()"),null,toThrow);
}



public void acceptGetNameDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getName()"),params,valueToThrow);
}


public void expectSetName(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setName(String)"),params );
}
public void expectSetName(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setName(String)"),params,toThrow );
}
public void acceptSetName(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setName(String)"),params );
}
public void acceptSetName(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setName(String)"),params,toThrow );
}
public void setSetNameDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setName(String)"),null,null);
}
public void setSetNameDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setName(String)"),null,toThrow);
}
public void setSetNameDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("setName(String)"),params,toThrow);
}


public void acceptSetNameDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("setName(String)"),params,valueToThrow);
}


public void expectGetCode(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCode()"),params, valueToReturn );
}
public void expectGetCode(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCode()"),params,toThrow );
}
public void acceptGetCode(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCode()"),params, valueToReturn );
}
public void acceptGetCode(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCode()"),params,toThrow );
}
public void setGetCodeDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getCode()"),null,toReturn);
}
public void setGetCodeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getCode()"),null,toThrow);
}



public void acceptGetCodeDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getCode()"),params,valueToThrow);
}


public void expectSetCode(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCode(String)"),params );
}
public void expectSetCode(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCode(String)"),params,toThrow );
}
public void acceptSetCode(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCode(String)"),params );
}
public void acceptSetCode(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCode(String)"),params,toThrow );
}
public void setSetCodeDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setCode(String)"),null,null);
}
public void setSetCodeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setCode(String)"),null,toThrow);
}
public void setSetCodeDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("setCode(String)"),params,toThrow);
}


public void acceptSetCodeDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("setCode(String)"),params,valueToThrow);
}


public void expectSetMembers(java.util.Set p0_Set)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setMembers(Set)"),params );
}
public void expectSetMembers(java.util.Set p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setMembers(Set)"),params,toThrow );
}
public void acceptSetMembers(Object p0_Set)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setMembers(Set)"),params );
}
public void acceptSetMembers(Object p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setMembers(Set)"),params,toThrow );
}
public void setSetMembersDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setMembers(Set)"),null,null);
}
public void setSetMembersDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setMembers(Set)"),null,toThrow);
}
public void setSetMembersDummy(java.util.Set p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.setDummy( getClassObjectMethodSignature("setMembers(Set)"),params,toThrow);
}


public void acceptSetMembersDummy(Object p0_Set, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.setDummy(getClassObjectMethodSignature("setMembers(Set)"),params,valueToThrow);
}


public void expectGetMembers(java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMembers()"),params, valueToReturn );
}
public void expectGetMembers(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMembers()"),params,toThrow );
}
public void acceptGetMembers(java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMembers()"),params, valueToReturn );
}
public void acceptGetMembers(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMembers()"),params,toThrow );
}
public void setGetMembersDummy(java.util.Set toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getMembers()"),null,toReturn);
}
public void setGetMembersDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getMembers()"),null,toThrow);
}



public void acceptGetMembersDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getMembers()"),params,valueToThrow);
}


public void expectGetPersistanceId(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params, new Integer(valueToReturn) );
}
public void expectGetPersistanceId(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params,toThrow );
}
public void acceptGetPersistanceId(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params, new Integer(valueToReturn) );
}
public void acceptGetPersistanceId(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params,toThrow );
}
public void setGetPersistanceIdDummy(int toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getPersistanceId()"),null,new Integer(toReturn));
}
public void setGetPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceId()"),null,toThrow);
}



public void acceptGetPersistanceIdDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceId()"),params,valueToThrow);
}


public void expectSetPersistanceId(int p0_int)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params );
}
public void expectSetPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params,toThrow );
}
public void acceptSetPersistanceId(Object p0_int)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params );
}
public void acceptSetPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params,toThrow );
}
public void setSetPersistanceIdDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setPersistanceId(int)"),null,null);
}
public void setSetPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceId(int)"),null,toThrow);
}
public void setSetPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("setPersistanceId(int)"),params,toThrow);
}


public void acceptSetPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceId(int)"),params,valueToThrow);
}


public void expectGetPersistanceVersion(long valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params, new Long(valueToReturn) );
}
public void expectGetPersistanceVersion(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params,toThrow );
}
public void acceptGetPersistanceVersion(long valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params, new Long(valueToReturn) );
}
public void acceptGetPersistanceVersion(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params,toThrow );
}
public void setGetPersistanceVersionDummy(long toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getPersistanceVersion()"),null,new Long(toReturn));
}
public void setGetPersistanceVersionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceVersion()"),null,toThrow);
}



public void acceptGetPersistanceVersionDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceVersion()"),params,valueToThrow);
}


public void expectSetPersistanceVersion(long p0_long)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Long(p0_long));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params );
}
public void expectSetPersistanceVersion(long p0_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Long(p0_long));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params,toThrow );
}
public void acceptSetPersistanceVersion(Object p0_long)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_long);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params );
}
public void acceptSetPersistanceVersion(Object p0_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_long);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params,toThrow );
}
public void setSetPersistanceVersionDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setPersistanceVersion(long)"),null,null);
}
public void setSetPersistanceVersionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceVersion(long)"),null,toThrow);
}
public void setSetPersistanceVersionDummy(long p0_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Long(p0_long));

    MockCore.setDummy( getClassObjectMethodSignature("setPersistanceVersion(long)"),params,toThrow);
}


public void acceptSetPersistanceVersionDummy(Object p0_long, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_long);

    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceVersion(long)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.project.MockBasicProject"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.project.Project";
}
    public MockBasicProject()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.core.domain.project.MockBasicProject",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.core.domain.basicProject.MockBasicProject.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.core.domain.project.MockBasicProject",params);
        return new net.sf.pmr.core.domain.basicProject.MockBasicProject.PreMock(id);
    }

    public static net.sf.pmr.core.domain.basicProject.MockBasicProject.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.project.MockBasicProject",null);
        return new net.sf.pmr.core.domain.basicProject.MockBasicProject.PreMock(id);
    }

    public static net.sf.pmr.core.domain.basicProject.MockBasicProject.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.project.MockBasicProject",th);
        return new net.sf.pmr.core.domain.basicProject.MockBasicProject.PreMock(id);
    }

    public java.lang.String getName()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getName()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (java.lang.String)returnValue;
}
public void expectGetName(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getName()"),params, valueToReturn );
}
public void expectGetName(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getName()"),params,toThrow );
}
public void acceptGetName(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getName()"),params, valueToReturn );
}
public void acceptGetName(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getName()"),params,toThrow );
}
public void setGetNameDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getName()"),null,toReturn);
}
public void setGetNameDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getName()"),null,toThrow);
}



public void acceptGetNameDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getName()"),params,valueToThrow);
}


    public void setName(java.lang.String p0_String)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setName(String)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetName(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setName(String)"),params );
}
public void expectSetName(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setName(String)"),params,toThrow );
}
public void acceptSetName(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setName(String)"),params );
}
public void acceptSetName(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setName(String)"),params,toThrow );
}
public void setSetNameDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setName(String)"),null,null);
}
public void setSetNameDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setName(String)"),null,toThrow);
}
public void setSetNameDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("setName(String)"),params,toThrow);
}


public void acceptSetNameDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("setName(String)"),params,valueToThrow);
}


    public java.lang.String getCode()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getCode()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (java.lang.String)returnValue;
}
public void expectGetCode(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCode()"),params, valueToReturn );
}
public void expectGetCode(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCode()"),params,toThrow );
}
public void acceptGetCode(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCode()"),params, valueToReturn );
}
public void acceptGetCode(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCode()"),params,toThrow );
}
public void setGetCodeDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getCode()"),null,toReturn);
}
public void setGetCodeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getCode()"),null,toThrow);
}



public void acceptGetCodeDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getCode()"),params,valueToThrow);
}


    public void setCode(java.lang.String p0_String)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setCode(String)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetCode(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCode(String)"),params );
}
public void expectSetCode(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCode(String)"),params,toThrow );
}
public void acceptSetCode(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCode(String)"),params );
}
public void acceptSetCode(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCode(String)"),params,toThrow );
}
public void setSetCodeDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setCode(String)"),null,null);
}
public void setSetCodeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setCode(String)"),null,toThrow);
}
public void setSetCodeDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("setCode(String)"),params,toThrow);
}


public void acceptSetCodeDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("setCode(String)"),params,valueToThrow);
}


    public void setMembers(java.util.Set p0_Set)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setMembers(Set)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetMembers(java.util.Set p0_Set)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setMembers(Set)"),params );
}
public void expectSetMembers(java.util.Set p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setMembers(Set)"),params,toThrow );
}
public void acceptSetMembers(Object p0_Set)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setMembers(Set)"),params );
}
public void acceptSetMembers(Object p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setMembers(Set)"),params,toThrow );
}
public void setSetMembersDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setMembers(Set)"),null,null);
}
public void setSetMembersDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setMembers(Set)"),null,toThrow);
}
public void setSetMembersDummy(java.util.Set p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.setDummy( getClassObjectMethodSignature("setMembers(Set)"),params,toThrow);
}


public void acceptSetMembersDummy(Object p0_Set, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.setDummy(getClassObjectMethodSignature("setMembers(Set)"),params,valueToThrow);
}


    public java.util.Set getMembers()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getMembers()"),params,MockCore.OPT_DEFAULT);
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
public void expectGetMembers(java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMembers()"),params, valueToReturn );
}
public void expectGetMembers(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMembers()"),params,toThrow );
}
public void acceptGetMembers(java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMembers()"),params, valueToReturn );
}
public void acceptGetMembers(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMembers()"),params,toThrow );
}
public void setGetMembersDummy(java.util.Set toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getMembers()"),null,toReturn);
}
public void setGetMembersDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getMembers()"),null,toThrow);
}



public void acceptGetMembersDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getMembers()"),params,valueToThrow);
}


    public int getPersistanceId()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getPersistanceId()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("getPersistanceId: called but not prepared");
    return ((Integer)returnValue).intValue();
}
public void expectGetPersistanceId(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params, new Integer(valueToReturn) );
}
public void expectGetPersistanceId(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params,toThrow );
}
public void acceptGetPersistanceId(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params, new Integer(valueToReturn) );
}
public void acceptGetPersistanceId(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params,toThrow );
}
public void setGetPersistanceIdDummy(int toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getPersistanceId()"),null,new Integer(toReturn));
}
public void setGetPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceId()"),null,toThrow);
}



public void acceptGetPersistanceIdDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceId()"),params,valueToThrow);
}


    public void setPersistanceId(int p0_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setPersistanceId(int)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetPersistanceId(int p0_int)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params );
}
public void expectSetPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params,toThrow );
}
public void acceptSetPersistanceId(Object p0_int)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params );
}
public void acceptSetPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params,toThrow );
}
public void setSetPersistanceIdDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setPersistanceId(int)"),null,null);
}
public void setSetPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceId(int)"),null,toThrow);
}
public void setSetPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("setPersistanceId(int)"),params,toThrow);
}


public void acceptSetPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceId(int)"),params,valueToThrow);
}


    public long getPersistanceVersion()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getPersistanceVersion()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("getPersistanceVersion: called but not prepared");
    return ((Long)returnValue).longValue();
}
public void expectGetPersistanceVersion(long valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params, new Long(valueToReturn) );
}
public void expectGetPersistanceVersion(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params,toThrow );
}
public void acceptGetPersistanceVersion(long valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params, new Long(valueToReturn) );
}
public void acceptGetPersistanceVersion(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params,toThrow );
}
public void setGetPersistanceVersionDummy(long toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getPersistanceVersion()"),null,new Long(toReturn));
}
public void setGetPersistanceVersionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceVersion()"),null,toThrow);
}



public void acceptGetPersistanceVersionDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceVersion()"),params,valueToThrow);
}


    public void setPersistanceVersion(long p0_long)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Long(p0_long));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setPersistanceVersion(long)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetPersistanceVersion(long p0_long)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Long(p0_long));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params );
}
public void expectSetPersistanceVersion(long p0_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Long(p0_long));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params,toThrow );
}
public void acceptSetPersistanceVersion(Object p0_long)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_long);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params );
}
public void acceptSetPersistanceVersion(Object p0_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_long);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params,toThrow );
}
public void setSetPersistanceVersionDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setPersistanceVersion(long)"),null,null);
}
public void setSetPersistanceVersionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceVersion(long)"),null,toThrow);
}
public void setSetPersistanceVersionDummy(long p0_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Long(p0_long));

    MockCore.setDummy( getClassObjectMethodSignature("setPersistanceVersion(long)"),params,toThrow);
}


public void acceptSetPersistanceVersionDummy(Object p0_long, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_long);

    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceVersion(long)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.project.MockBasicProject"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.project.Project";
}
