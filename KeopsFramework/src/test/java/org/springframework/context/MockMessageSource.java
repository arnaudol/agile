// MockCreator v2.9.0 build 3065; HashCode:-1085047153; org.springframework.context.MessageSource
package org.springframework.context;

import de.abstrakt.mock.MockCore;

public class MockMessageSource implements org.springframework.context.MessageSource, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public org.springframework.context.MockMessageSource.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"org.springframework.context.MockMessageSource",null);
        return this;
    }

    public org.springframework.context.MockMessageSource.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"org.springframework.context.MockMessageSource",th);
        return this;
    }

public void expectGetMessage(java.lang.String p0_String, java.lang.Object[] p1_Object1D, java.util.Locale p2_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);
        params.add(p2_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(String,Object1D,Locale)"),params, valueToReturn );
}
public void expectGetMessage(java.lang.String p0_String, java.lang.Object[] p1_Object1D, java.util.Locale p2_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);
        params.add(p2_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(String,Object1D,Locale)"),params,toThrow );
}
public void acceptGetMessage(Object p0_String, Object p1_Object1D, Object p2_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);
params.add(p2_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(String,Object1D,Locale)"),params, valueToReturn );
}
public void acceptGetMessage(Object p0_String, Object p1_Object1D, Object p2_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);
params.add(p2_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(String,Object1D,Locale)"),params,toThrow );
}
public void setGetMessage_String_Object1D_LocaleDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getMessage(String,Object1D,Locale)"),null,toReturn);
}
public void setGetMessage_String_Object1D_LocaleDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getMessage(String,Object1D,Locale)"),null,toThrow);
}
public void setGetMessageDummy(java.lang.String p0_String, java.lang.Object[] p1_Object1D, java.util.Locale p2_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);
        params.add(p2_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getMessage(String,Object1D,Locale)"),params,toThrow);
}
public void setGetMessageDummy(java.lang.String p0_String, java.lang.Object[] p1_Object1D, java.util.Locale p2_Locale,java.lang.String toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);
        params.add(p2_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getMessage(String,Object1D,Locale)"),params,toReturn);
}
public void acceptGetMessageDummy(Object p0_String, Object p1_Object1D, Object p2_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);
params.add(p2_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getMessage(String,Object1D,Locale)"),params, valueToReturn );
}
public void acceptGetMessageDummy(Object p0_String, Object p1_Object1D, Object p2_Locale, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);
params.add(p2_Locale);

    MockCore.setDummy(getClassObjectMethodSignature("getMessage(String,Object1D,Locale)"),params,valueToThrow);
}


public void expectGetMessage(org.springframework.context.MessageSourceResolvable p0_MessageSourceResolvable, java.util.Locale p1_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MessageSourceResolvable);
        params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(MessageSourceResolvable,Locale)"),params, valueToReturn );
}
public void expectGetMessage(org.springframework.context.MessageSourceResolvable p0_MessageSourceResolvable, java.util.Locale p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MessageSourceResolvable);
        params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(MessageSourceResolvable,Locale)"),params,toThrow );
}
public void acceptGetMessage(Object p0_MessageSourceResolvable, Object p1_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MessageSourceResolvable);
params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(MessageSourceResolvable,Locale)"),params, valueToReturn );
}
public void acceptGetMessage(Object p0_MessageSourceResolvable, Object p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MessageSourceResolvable);
params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(MessageSourceResolvable,Locale)"),params,toThrow );
}
public void setGetMessage_MessageSourceResolvable_LocaleDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getMessage(MessageSourceResolvable,Locale)"),null,toReturn);
}
public void setGetMessage_MessageSourceResolvable_LocaleDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getMessage(MessageSourceResolvable,Locale)"),null,toThrow);
}
public void setGetMessageDummy(org.springframework.context.MessageSourceResolvable p0_MessageSourceResolvable, java.util.Locale p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MessageSourceResolvable);
        params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getMessage(MessageSourceResolvable,Locale)"),params,toThrow);
}
public void setGetMessageDummy(org.springframework.context.MessageSourceResolvable p0_MessageSourceResolvable, java.util.Locale p1_Locale,java.lang.String toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MessageSourceResolvable);
        params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getMessage(MessageSourceResolvable,Locale)"),params,toReturn);
}
public void acceptGetMessageDummy(Object p0_MessageSourceResolvable, Object p1_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MessageSourceResolvable);
params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getMessage(MessageSourceResolvable,Locale)"),params, valueToReturn );
}
public void acceptGetMessageDummy(Object p0_MessageSourceResolvable, Object p1_Locale, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MessageSourceResolvable);
params.add(p1_Locale);

    MockCore.setDummy(getClassObjectMethodSignature("getMessage(MessageSourceResolvable,Locale)"),params,valueToThrow);
}


public void expectGetMessage(java.lang.String p0_String, java.lang.Object[] p1_Object1D, java.lang.String p2_String, java.util.Locale p3_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);
        params.add(p2_String);
        params.add(p3_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(String,Object1D,String,Locale)"),params, valueToReturn );
}
public void expectGetMessage(java.lang.String p0_String, java.lang.Object[] p1_Object1D, java.lang.String p2_String, java.util.Locale p3_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);
        params.add(p2_String);
        params.add(p3_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(String,Object1D,String,Locale)"),params,toThrow );
}
public void acceptGetMessage(Object p0_String, Object p1_Object1D, Object p2_String, Object p3_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);
params.add(p2_String);
params.add(p3_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(String,Object1D,String,Locale)"),params, valueToReturn );
}
public void acceptGetMessage(Object p0_String, Object p1_Object1D, Object p2_String, Object p3_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);
params.add(p2_String);
params.add(p3_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(String,Object1D,String,Locale)"),params,toThrow );
}
public void setGetMessage_String_Object1D_String_LocaleDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getMessage(String,Object1D,String,Locale)"),null,toReturn);
}
public void setGetMessage_String_Object1D_String_LocaleDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getMessage(String,Object1D,String,Locale)"),null,toThrow);
}
public void setGetMessageDummy(java.lang.String p0_String, java.lang.Object[] p1_Object1D, java.lang.String p2_String, java.util.Locale p3_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);
        params.add(p2_String);
        params.add(p3_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getMessage(String,Object1D,String,Locale)"),params,toThrow);
}
public void setGetMessageDummy(java.lang.String p0_String, java.lang.Object[] p1_Object1D, java.lang.String p2_String, java.util.Locale p3_Locale,java.lang.String toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);
        params.add(p2_String);
        params.add(p3_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getMessage(String,Object1D,String,Locale)"),params,toReturn);
}
public void acceptGetMessageDummy(Object p0_String, Object p1_Object1D, Object p2_String, Object p3_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);
params.add(p2_String);
params.add(p3_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getMessage(String,Object1D,String,Locale)"),params, valueToReturn );
}
public void acceptGetMessageDummy(Object p0_String, Object p1_Object1D, Object p2_String, Object p3_Locale, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);
params.add(p2_String);
params.add(p3_Locale);

    MockCore.setDummy(getClassObjectMethodSignature("getMessage(String,Object1D,String,Locale)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "org.springframework.context.MockMessageSource"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "org.springframework.context.MessageSource";
}
    public MockMessageSource()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("org.springframework.context.MockMessageSource",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static org.springframework.context.MockMessageSource.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"org.springframework.context.MockMessageSource",params);
        return new org.springframework.context.MockMessageSource.PreMock(id);
    }

    public static org.springframework.context.MockMessageSource.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"org.springframework.context.MockMessageSource",null);
        return new org.springframework.context.MockMessageSource.PreMock(id);
    }

    public static org.springframework.context.MockMessageSource.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"org.springframework.context.MockMessageSource",th);
        return new org.springframework.context.MockMessageSource.PreMock(id);
    }

    public java.lang.String getMessage(java.lang.String p0_String, java.lang.Object[] p1_Object1D, java.util.Locale p2_Locale) throws org.springframework.context.NoSuchMessageException
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);
        params.add(p2_Locale);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getMessage(String,Object1D,Locale)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof org.springframework.context.NoSuchMessageException )
    {
        throw (org.springframework.context.NoSuchMessageException)returnValue;
    }
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
public void expectGetMessage(java.lang.String p0_String, java.lang.Object[] p1_Object1D, java.util.Locale p2_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);
        params.add(p2_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(String,Object1D,Locale)"),params, valueToReturn );
}
public void expectGetMessage(java.lang.String p0_String, java.lang.Object[] p1_Object1D, java.util.Locale p2_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);
        params.add(p2_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(String,Object1D,Locale)"),params,toThrow );
}
public void acceptGetMessage(Object p0_String, Object p1_Object1D, Object p2_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);
params.add(p2_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(String,Object1D,Locale)"),params, valueToReturn );
}
public void acceptGetMessage(Object p0_String, Object p1_Object1D, Object p2_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);
params.add(p2_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(String,Object1D,Locale)"),params,toThrow );
}
public void setGetMessage_String_Object1D_LocaleDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getMessage(String,Object1D,Locale)"),null,toReturn);
}
public void setGetMessage_String_Object1D_LocaleDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getMessage(String,Object1D,Locale)"),null,toThrow);
}
public void setGetMessageDummy(java.lang.String p0_String, java.lang.Object[] p1_Object1D, java.util.Locale p2_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);
        params.add(p2_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getMessage(String,Object1D,Locale)"),params,toThrow);
}
public void setGetMessageDummy(java.lang.String p0_String, java.lang.Object[] p1_Object1D, java.util.Locale p2_Locale,java.lang.String toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);
        params.add(p2_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getMessage(String,Object1D,Locale)"),params,toReturn);
}
public void acceptGetMessageDummy(Object p0_String, Object p1_Object1D, Object p2_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);
params.add(p2_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getMessage(String,Object1D,Locale)"),params, valueToReturn );
}
public void acceptGetMessageDummy(Object p0_String, Object p1_Object1D, Object p2_Locale, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);
params.add(p2_Locale);

    MockCore.setDummy(getClassObjectMethodSignature("getMessage(String,Object1D,Locale)"),params,valueToThrow);
}


    public java.lang.String getMessage(org.springframework.context.MessageSourceResolvable p0_MessageSourceResolvable, java.util.Locale p1_Locale) throws org.springframework.context.NoSuchMessageException
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_MessageSourceResolvable);
        params.add(p1_Locale);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getMessage(MessageSourceResolvable,Locale)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof org.springframework.context.NoSuchMessageException )
    {
        throw (org.springframework.context.NoSuchMessageException)returnValue;
    }
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
public void expectGetMessage(org.springframework.context.MessageSourceResolvable p0_MessageSourceResolvable, java.util.Locale p1_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MessageSourceResolvable);
        params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(MessageSourceResolvable,Locale)"),params, valueToReturn );
}
public void expectGetMessage(org.springframework.context.MessageSourceResolvable p0_MessageSourceResolvable, java.util.Locale p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MessageSourceResolvable);
        params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(MessageSourceResolvable,Locale)"),params,toThrow );
}
public void acceptGetMessage(Object p0_MessageSourceResolvable, Object p1_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MessageSourceResolvable);
params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(MessageSourceResolvable,Locale)"),params, valueToReturn );
}
public void acceptGetMessage(Object p0_MessageSourceResolvable, Object p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MessageSourceResolvable);
params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(MessageSourceResolvable,Locale)"),params,toThrow );
}
public void setGetMessage_MessageSourceResolvable_LocaleDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getMessage(MessageSourceResolvable,Locale)"),null,toReturn);
}
public void setGetMessage_MessageSourceResolvable_LocaleDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getMessage(MessageSourceResolvable,Locale)"),null,toThrow);
}
public void setGetMessageDummy(org.springframework.context.MessageSourceResolvable p0_MessageSourceResolvable, java.util.Locale p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MessageSourceResolvable);
        params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getMessage(MessageSourceResolvable,Locale)"),params,toThrow);
}
public void setGetMessageDummy(org.springframework.context.MessageSourceResolvable p0_MessageSourceResolvable, java.util.Locale p1_Locale,java.lang.String toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MessageSourceResolvable);
        params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getMessage(MessageSourceResolvable,Locale)"),params,toReturn);
}
public void acceptGetMessageDummy(Object p0_MessageSourceResolvable, Object p1_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MessageSourceResolvable);
params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getMessage(MessageSourceResolvable,Locale)"),params, valueToReturn );
}
public void acceptGetMessageDummy(Object p0_MessageSourceResolvable, Object p1_Locale, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MessageSourceResolvable);
params.add(p1_Locale);

    MockCore.setDummy(getClassObjectMethodSignature("getMessage(MessageSourceResolvable,Locale)"),params,valueToThrow);
}


    public java.lang.String getMessage(java.lang.String p0_String, java.lang.Object[] p1_Object1D, java.lang.String p2_String, java.util.Locale p3_Locale)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);
        params.add(p2_String);
        params.add(p3_Locale);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getMessage(String,Object1D,String,Locale)"),params,MockCore.OPT_DEFAULT);
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
public void expectGetMessage(java.lang.String p0_String, java.lang.Object[] p1_Object1D, java.lang.String p2_String, java.util.Locale p3_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);
        params.add(p2_String);
        params.add(p3_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(String,Object1D,String,Locale)"),params, valueToReturn );
}
public void expectGetMessage(java.lang.String p0_String, java.lang.Object[] p1_Object1D, java.lang.String p2_String, java.util.Locale p3_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);
        params.add(p2_String);
        params.add(p3_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(String,Object1D,String,Locale)"),params,toThrow );
}
public void acceptGetMessage(Object p0_String, Object p1_Object1D, Object p2_String, Object p3_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);
params.add(p2_String);
params.add(p3_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(String,Object1D,String,Locale)"),params, valueToReturn );
}
public void acceptGetMessage(Object p0_String, Object p1_Object1D, Object p2_String, Object p3_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);
params.add(p2_String);
params.add(p3_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getMessage(String,Object1D,String,Locale)"),params,toThrow );
}
public void setGetMessage_String_Object1D_String_LocaleDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getMessage(String,Object1D,String,Locale)"),null,toReturn);
}
public void setGetMessage_String_Object1D_String_LocaleDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getMessage(String,Object1D,String,Locale)"),null,toThrow);
}
public void setGetMessageDummy(java.lang.String p0_String, java.lang.Object[] p1_Object1D, java.lang.String p2_String, java.util.Locale p3_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);
        params.add(p2_String);
        params.add(p3_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getMessage(String,Object1D,String,Locale)"),params,toThrow);
}
public void setGetMessageDummy(java.lang.String p0_String, java.lang.Object[] p1_Object1D, java.lang.String p2_String, java.util.Locale p3_Locale,java.lang.String toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);
        params.add(p2_String);
        params.add(p3_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getMessage(String,Object1D,String,Locale)"),params,toReturn);
}
public void acceptGetMessageDummy(Object p0_String, Object p1_Object1D, Object p2_String, Object p3_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);
params.add(p2_String);
params.add(p3_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getMessage(String,Object1D,String,Locale)"),params, valueToReturn );
}
public void acceptGetMessageDummy(Object p0_String, Object p1_Object1D, Object p2_String, Object p3_Locale, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);
params.add(p2_String);
params.add(p3_Locale);

    MockCore.setDummy(getClassObjectMethodSignature("getMessage(String,Object1D,String,Locale)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "org.springframework.context.MockMessageSource"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "org.springframework.context.MessageSource";
}
