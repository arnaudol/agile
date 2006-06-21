// MockCreator v2.9.0 build 3065; HashCode:1190944654; org.springframework.context.support.ResourceBundleMessageSource
package org.springframework.context.support;

import de.abstrakt.mock.MockCore;

public class MockResourceBundleMessageSource extends org.springframework.context.support.ResourceBundleMessageSource implements de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public org.springframework.context.support.MockResourceBundleMessageSource.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        id = MockCore.addExpectedCtor(__id(),"org.springframework.context.support.MockResourceBundleMessageSource",params);
        return this;
    }

    public org.springframework.context.support.MockResourceBundleMessageSource.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"org.springframework.context.support.MockResourceBundleMessageSource",null);
        return this;
    }

    public org.springframework.context.support.MockResourceBundleMessageSource.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"org.springframework.context.support.MockResourceBundleMessageSource",th);
        return this;
    }

public void expectSetBasename(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasename(String)"),params );
}
public void expectSetBasename(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasename(String)"),params,toThrow );
}
public void acceptSetBasename(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasename(String)"),params );
}
public void acceptSetBasename(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasename(String)"),params,toThrow );
}
public void setSetBasenameDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setBasename(String)"),null,null);
}
public void setSetBasenameDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setBasename(String)"),null,toThrow);
}
public void setSetBasenameDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("setBasename(String)"),params,toThrow);
}


public void acceptSetBasenameDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("setBasename(String)"),params,valueToThrow);
}
public void delegateSetBasename()
{
    MockCore.setDelegate(getClassObjectMethodSignature("setBasename(String)"));
}

public void expectSetBasenames(java.lang.String[] p0_String1D)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasenames(String1D)"),params );
}
public void expectSetBasenames(java.lang.String[] p0_String1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasenames(String1D)"),params,toThrow );
}
public void acceptSetBasenames(Object p0_String1D)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasenames(String1D)"),params );
}
public void acceptSetBasenames(Object p0_String1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasenames(String1D)"),params,toThrow );
}
public void setSetBasenamesDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setBasenames(String1D)"),null,null);
}
public void setSetBasenamesDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setBasenames(String1D)"),null,toThrow);
}
public void setSetBasenamesDummy(java.lang.String[] p0_String1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String1D);

    MockCore.setDummy( getClassObjectMethodSignature("setBasenames(String1D)"),params,toThrow);
}


public void acceptSetBasenamesDummy(Object p0_String1D, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String1D);

    MockCore.setDummy(getClassObjectMethodSignature("setBasenames(String1D)"),params,valueToThrow);
}
public void delegateSetBasenames()
{
    MockCore.setDelegate(getClassObjectMethodSignature("setBasenames(String1D)"));
}

public void expectSetClassLoader(java.lang.ClassLoader p0_ClassLoader)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_ClassLoader);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setClassLoader(ClassLoader)"),params );
}
public void expectSetClassLoader(java.lang.ClassLoader p0_ClassLoader,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_ClassLoader);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setClassLoader(ClassLoader)"),params,toThrow );
}
public void acceptSetClassLoader(Object p0_ClassLoader)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_ClassLoader);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setClassLoader(ClassLoader)"),params );
}
public void acceptSetClassLoader(Object p0_ClassLoader,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_ClassLoader);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setClassLoader(ClassLoader)"),params,toThrow );
}
public void setSetClassLoaderDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setClassLoader(ClassLoader)"),null,null);
}
public void setSetClassLoaderDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setClassLoader(ClassLoader)"),null,toThrow);
}
public void setSetClassLoaderDummy(java.lang.ClassLoader p0_ClassLoader,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_ClassLoader);

    MockCore.setDummy( getClassObjectMethodSignature("setClassLoader(ClassLoader)"),params,toThrow);
}


public void acceptSetClassLoaderDummy(Object p0_ClassLoader, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_ClassLoader);

    MockCore.setDummy(getClassObjectMethodSignature("setClassLoader(ClassLoader)"),params,valueToThrow);
}
public void delegateSetClassLoader()
{
    MockCore.setDelegate(getClassObjectMethodSignature("setClassLoader(ClassLoader)"));
}

public void expectSetParentMessageSource(org.springframework.context.MessageSource p0_MessageSource)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MessageSource);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setParentMessageSource(MessageSource)"),params );
}
public void expectSetParentMessageSource(org.springframework.context.MessageSource p0_MessageSource,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MessageSource);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setParentMessageSource(MessageSource)"),params,toThrow );
}
public void acceptSetParentMessageSource(Object p0_MessageSource)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MessageSource);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setParentMessageSource(MessageSource)"),params );
}
public void acceptSetParentMessageSource(Object p0_MessageSource,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MessageSource);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setParentMessageSource(MessageSource)"),params,toThrow );
}
public void setSetParentMessageSourceDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setParentMessageSource(MessageSource)"),null,null);
}
public void setSetParentMessageSourceDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setParentMessageSource(MessageSource)"),null,toThrow);
}
public void setSetParentMessageSourceDummy(org.springframework.context.MessageSource p0_MessageSource,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MessageSource);

    MockCore.setDummy( getClassObjectMethodSignature("setParentMessageSource(MessageSource)"),params,toThrow);
}


public void acceptSetParentMessageSourceDummy(Object p0_MessageSource, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MessageSource);

    MockCore.setDummy(getClassObjectMethodSignature("setParentMessageSource(MessageSource)"),params,valueToThrow);
}
public void delegateSetParentMessageSource()
{
    MockCore.setDelegate(getClassObjectMethodSignature("setParentMessageSource(MessageSource)"));
}

public void expectGetParentMessageSource(org.springframework.context.MessageSource valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getParentMessageSource()"),params, valueToReturn );
}
public void expectGetParentMessageSource(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getParentMessageSource()"),params,toThrow );
}
public void acceptGetParentMessageSource(org.springframework.context.MessageSource valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getParentMessageSource()"),params, valueToReturn );
}
public void acceptGetParentMessageSource(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getParentMessageSource()"),params,toThrow );
}
public void setGetParentMessageSourceDummy(org.springframework.context.MessageSource toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getParentMessageSource()"),null,toReturn);
}
public void setGetParentMessageSourceDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getParentMessageSource()"),null,toThrow);
}



public void acceptGetParentMessageSourceDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getParentMessageSource()"),params,valueToThrow);
}
public void delegateGetParentMessageSource()
{
    MockCore.setDelegate(getClassObjectMethodSignature("getParentMessageSource()"));
}

public void expectSetUseCodeAsDefaultMessage(boolean p0_boolean)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Boolean(p0_boolean));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setUseCodeAsDefaultMessage(boolean)"),params );
}
public void expectSetUseCodeAsDefaultMessage(boolean p0_boolean,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Boolean(p0_boolean));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setUseCodeAsDefaultMessage(boolean)"),params,toThrow );
}
public void acceptSetUseCodeAsDefaultMessage(Object p0_boolean)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_boolean);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setUseCodeAsDefaultMessage(boolean)"),params );
}
public void acceptSetUseCodeAsDefaultMessage(Object p0_boolean,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_boolean);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setUseCodeAsDefaultMessage(boolean)"),params,toThrow );
}
public void setSetUseCodeAsDefaultMessageDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setUseCodeAsDefaultMessage(boolean)"),null,null);
}
public void setSetUseCodeAsDefaultMessageDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setUseCodeAsDefaultMessage(boolean)"),null,toThrow);
}
public void setSetUseCodeAsDefaultMessageDummy(boolean p0_boolean,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Boolean(p0_boolean));

    MockCore.setDummy( getClassObjectMethodSignature("setUseCodeAsDefaultMessage(boolean)"),params,toThrow);
}


public void acceptSetUseCodeAsDefaultMessageDummy(Object p0_boolean, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_boolean);

    MockCore.setDummy(getClassObjectMethodSignature("setUseCodeAsDefaultMessage(boolean)"),params,valueToThrow);
}
public void delegateSetUseCodeAsDefaultMessage()
{
    MockCore.setDelegate(getClassObjectMethodSignature("setUseCodeAsDefaultMessage(boolean)"));
}

    private String getClassObjectMethodSignature(String method){ return "org.springframework.context.support.MockResourceBundleMessageSource"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "org.springframework.context.support.ResourceBundleMessageSource";
}
    public MockResourceBundleMessageSource()
    {
        super();
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("org.springframework.context.support.MockResourceBundleMessageSource",params);
        if( idex instanceof Throwable )
        {
        if( idex instanceof RuntimeException ) throw (RuntimeException)idex;
        throw new RuntimeException(((Throwable)idex).getMessage());
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static org.springframework.context.support.MockResourceBundleMessageSource.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"org.springframework.context.support.MockResourceBundleMessageSource",params);
        return new org.springframework.context.support.MockResourceBundleMessageSource.PreMock(id);
    }

    public static org.springframework.context.support.MockResourceBundleMessageSource.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"org.springframework.context.support.MockResourceBundleMessageSource",null);
        return new org.springframework.context.support.MockResourceBundleMessageSource.PreMock(id);
    }

    public static org.springframework.context.support.MockResourceBundleMessageSource.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"org.springframework.context.support.MockResourceBundleMessageSource",th);
        return new org.springframework.context.support.MockResourceBundleMessageSource.PreMock(id);
    }

    public void setBasename(java.lang.String p0_String)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        if( MockCore.isDelegate(getClassObjectMethodSignature("setBasename(String)")) )
        {
                        super.setBasename(p0_String);
            return;
        }
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setBasename(String)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetBasename(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasename(String)"),params );
}
public void expectSetBasename(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasename(String)"),params,toThrow );
}
public void acceptSetBasename(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasename(String)"),params );
}
public void acceptSetBasename(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasename(String)"),params,toThrow );
}
public void setSetBasenameDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setBasename(String)"),null,null);
}
public void setSetBasenameDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setBasename(String)"),null,toThrow);
}
public void setSetBasenameDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("setBasename(String)"),params,toThrow);
}


public void acceptSetBasenameDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("setBasename(String)"),params,valueToThrow);
}
public void delegateSetBasename()
{
    MockCore.setDelegate(getClassObjectMethodSignature("setBasename(String)"));
}

    public void setBasenames(java.lang.String[] p0_String1D)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        if( MockCore.isDelegate(getClassObjectMethodSignature("setBasenames(String1D)")) )
        {
                        super.setBasenames(p0_String1D);
            return;
        }
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String1D);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setBasenames(String1D)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetBasenames(java.lang.String[] p0_String1D)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasenames(String1D)"),params );
}
public void expectSetBasenames(java.lang.String[] p0_String1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasenames(String1D)"),params,toThrow );
}
public void acceptSetBasenames(Object p0_String1D)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasenames(String1D)"),params );
}
public void acceptSetBasenames(Object p0_String1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasenames(String1D)"),params,toThrow );
}
public void setSetBasenamesDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setBasenames(String1D)"),null,null);
}
public void setSetBasenamesDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setBasenames(String1D)"),null,toThrow);
}
public void setSetBasenamesDummy(java.lang.String[] p0_String1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String1D);

    MockCore.setDummy( getClassObjectMethodSignature("setBasenames(String1D)"),params,toThrow);
}


public void acceptSetBasenamesDummy(Object p0_String1D, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String1D);

    MockCore.setDummy(getClassObjectMethodSignature("setBasenames(String1D)"),params,valueToThrow);
}
public void delegateSetBasenames()
{
    MockCore.setDelegate(getClassObjectMethodSignature("setBasenames(String1D)"));
}

    public void setClassLoader(java.lang.ClassLoader p0_ClassLoader)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        if( MockCore.isDelegate(getClassObjectMethodSignature("setClassLoader(ClassLoader)")) )
        {
                        super.setClassLoader(p0_ClassLoader);
            return;
        }
        java.util.List params = new java.util.ArrayList();
        params.add(p0_ClassLoader);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setClassLoader(ClassLoader)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetClassLoader(java.lang.ClassLoader p0_ClassLoader)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_ClassLoader);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setClassLoader(ClassLoader)"),params );
}
public void expectSetClassLoader(java.lang.ClassLoader p0_ClassLoader,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_ClassLoader);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setClassLoader(ClassLoader)"),params,toThrow );
}
public void acceptSetClassLoader(Object p0_ClassLoader)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_ClassLoader);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setClassLoader(ClassLoader)"),params );
}
public void acceptSetClassLoader(Object p0_ClassLoader,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_ClassLoader);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setClassLoader(ClassLoader)"),params,toThrow );
}
public void setSetClassLoaderDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setClassLoader(ClassLoader)"),null,null);
}
public void setSetClassLoaderDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setClassLoader(ClassLoader)"),null,toThrow);
}
public void setSetClassLoaderDummy(java.lang.ClassLoader p0_ClassLoader,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_ClassLoader);

    MockCore.setDummy( getClassObjectMethodSignature("setClassLoader(ClassLoader)"),params,toThrow);
}


public void acceptSetClassLoaderDummy(Object p0_ClassLoader, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_ClassLoader);

    MockCore.setDummy(getClassObjectMethodSignature("setClassLoader(ClassLoader)"),params,valueToThrow);
}
public void delegateSetClassLoader()
{
    MockCore.setDelegate(getClassObjectMethodSignature("setClassLoader(ClassLoader)"));
}

    public void setParentMessageSource(org.springframework.context.MessageSource p0_MessageSource)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        if( MockCore.isDelegate(getClassObjectMethodSignature("setParentMessageSource(MessageSource)")) )
        {
                        super.setParentMessageSource(p0_MessageSource);
            return;
        }
        java.util.List params = new java.util.ArrayList();
        params.add(p0_MessageSource);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setParentMessageSource(MessageSource)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetParentMessageSource(org.springframework.context.MessageSource p0_MessageSource)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MessageSource);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setParentMessageSource(MessageSource)"),params );
}
public void expectSetParentMessageSource(org.springframework.context.MessageSource p0_MessageSource,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MessageSource);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setParentMessageSource(MessageSource)"),params,toThrow );
}
public void acceptSetParentMessageSource(Object p0_MessageSource)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MessageSource);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setParentMessageSource(MessageSource)"),params );
}
public void acceptSetParentMessageSource(Object p0_MessageSource,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MessageSource);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setParentMessageSource(MessageSource)"),params,toThrow );
}
public void setSetParentMessageSourceDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setParentMessageSource(MessageSource)"),null,null);
}
public void setSetParentMessageSourceDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setParentMessageSource(MessageSource)"),null,toThrow);
}
public void setSetParentMessageSourceDummy(org.springframework.context.MessageSource p0_MessageSource,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_MessageSource);

    MockCore.setDummy( getClassObjectMethodSignature("setParentMessageSource(MessageSource)"),params,toThrow);
}


public void acceptSetParentMessageSourceDummy(Object p0_MessageSource, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_MessageSource);

    MockCore.setDummy(getClassObjectMethodSignature("setParentMessageSource(MessageSource)"),params,valueToThrow);
}
public void delegateSetParentMessageSource()
{
    MockCore.setDelegate(getClassObjectMethodSignature("setParentMessageSource(MessageSource)"));
}

    public org.springframework.context.MessageSource getParentMessageSource()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        if( MockCore.isDelegate(getClassObjectMethodSignature("getParentMessageSource()")) )
        {
            return             super.getParentMessageSource();
            
        }
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getParentMessageSource()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (org.springframework.context.MessageSource)returnValue;
}
public void expectGetParentMessageSource(org.springframework.context.MessageSource valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getParentMessageSource()"),params, valueToReturn );
}
public void expectGetParentMessageSource(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getParentMessageSource()"),params,toThrow );
}
public void acceptGetParentMessageSource(org.springframework.context.MessageSource valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getParentMessageSource()"),params, valueToReturn );
}
public void acceptGetParentMessageSource(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getParentMessageSource()"),params,toThrow );
}
public void setGetParentMessageSourceDummy(org.springframework.context.MessageSource toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getParentMessageSource()"),null,toReturn);
}
public void setGetParentMessageSourceDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getParentMessageSource()"),null,toThrow);
}



public void acceptGetParentMessageSourceDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getParentMessageSource()"),params,valueToThrow);
}
public void delegateGetParentMessageSource()
{
    MockCore.setDelegate(getClassObjectMethodSignature("getParentMessageSource()"));
}

    public void setUseCodeAsDefaultMessage(boolean p0_boolean)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        if( MockCore.isDelegate(getClassObjectMethodSignature("setUseCodeAsDefaultMessage(boolean)")) )
        {
                        super.setUseCodeAsDefaultMessage(p0_boolean);
            return;
        }
        java.util.List params = new java.util.ArrayList();
        params.add(new Boolean(p0_boolean));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setUseCodeAsDefaultMessage(boolean)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetUseCodeAsDefaultMessage(boolean p0_boolean)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Boolean(p0_boolean));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setUseCodeAsDefaultMessage(boolean)"),params );
}
public void expectSetUseCodeAsDefaultMessage(boolean p0_boolean,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Boolean(p0_boolean));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setUseCodeAsDefaultMessage(boolean)"),params,toThrow );
}
public void acceptSetUseCodeAsDefaultMessage(Object p0_boolean)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_boolean);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setUseCodeAsDefaultMessage(boolean)"),params );
}
public void acceptSetUseCodeAsDefaultMessage(Object p0_boolean,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_boolean);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setUseCodeAsDefaultMessage(boolean)"),params,toThrow );
}
public void setSetUseCodeAsDefaultMessageDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setUseCodeAsDefaultMessage(boolean)"),null,null);
}
public void setSetUseCodeAsDefaultMessageDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setUseCodeAsDefaultMessage(boolean)"),null,toThrow);
}
public void setSetUseCodeAsDefaultMessageDummy(boolean p0_boolean,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Boolean(p0_boolean));

    MockCore.setDummy( getClassObjectMethodSignature("setUseCodeAsDefaultMessage(boolean)"),params,toThrow);
}


public void acceptSetUseCodeAsDefaultMessageDummy(Object p0_boolean, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_boolean);

    MockCore.setDummy(getClassObjectMethodSignature("setUseCodeAsDefaultMessage(boolean)"),params,valueToThrow);
}
public void delegateSetUseCodeAsDefaultMessage()
{
    MockCore.setDelegate(getClassObjectMethodSignature("setUseCodeAsDefaultMessage(boolean)"));
}

    private String getClassObjectMethodSignature(String method){ return "org.springframework.context.support.MockResourceBundleMessageSource"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "org.springframework.context.support.ResourceBundleMessageSource";
}
