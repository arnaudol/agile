// MockCreator v2.9.0 build 3065; HashCode:-2065567781; net.sf.pmr.keopsframework.domain.validation.Validator
package net.sf.pmr.keopsframework.domain.validation;

import de.abstrakt.mock.MockCore;

public class MockValidator implements net.sf.pmr.keopsframework.domain.validation.Validator, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.keopsframework.domain.validation.MockValidator.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.keopsframework.domain.validation.MockValidator",null);
        return this;
    }

    public net.sf.pmr.keopsframework.domain.validation.MockValidator.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.keopsframework.domain.validation.MockValidator",th);
        return this;
    }

public void expectValidate(java.lang.Object p0_Object, java.util.Locale p1_Locale, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);
        params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validate(Object,Locale)"),params, valueToReturn );
}
public void expectValidate(java.lang.Object p0_Object, java.util.Locale p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);
        params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validate(Object,Locale)"),params,toThrow );
}
public void acceptValidate(Object p0_Object, Object p1_Locale, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);
params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validate(Object,Locale)"),params, valueToReturn );
}
public void acceptValidate(Object p0_Object, Object p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);
params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validate(Object,Locale)"),params,toThrow );
}
public void setValidate_Object_LocaleDummy(net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("validate(Object,Locale)"),null,toReturn);
}
public void setValidate_Object_LocaleDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("validate(Object,Locale)"),null,toThrow);
}
public void setValidateDummy(java.lang.Object p0_Object, java.util.Locale p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);
        params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("validate(Object,Locale)"),params,toThrow);
}
public void setValidateDummy(java.lang.Object p0_Object, java.util.Locale p1_Locale,net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);
        params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("validate(Object,Locale)"),params,toReturn);
}
public void acceptValidateDummy(Object p0_Object, Object p1_Locale, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);
params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("validate(Object,Locale)"),params, valueToReturn );
}
public void acceptValidateDummy(Object p0_Object, Object p1_Locale, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);
params.add(p1_Locale);

    MockCore.setDummy(getClassObjectMethodSignature("validate(Object,Locale)"),params,valueToThrow);
}


public void expectValidate(java.lang.Object p0_Object, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validate(Object)"),params, valueToReturn );
}
public void expectValidate(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validate(Object)"),params,toThrow );
}
public void acceptValidate(Object p0_Object, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validate(Object)"),params, valueToReturn );
}
public void acceptValidate(Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validate(Object)"),params,toThrow );
}
public void setValidate_ObjectDummy(net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("validate(Object)"),null,toReturn);
}
public void setValidate_ObjectDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("validate(Object)"),null,toThrow);
}
public void setValidateDummy(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("validate(Object)"),params,toThrow);
}
public void setValidateDummy(java.lang.Object p0_Object,net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("validate(Object)"),params,toReturn);
}
public void acceptValidateDummy(Object p0_Object, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("validate(Object)"),params, valueToReturn );
}
public void acceptValidateDummy(Object p0_Object, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy(getClassObjectMethodSignature("validate(Object)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.keopsframework.domain.validation.MockValidator"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.keopsframework.domain.validation.Validator";
}
    public MockValidator()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.keopsframework.domain.validation.MockValidator",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.keopsframework.domain.validation.MockValidator.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.keopsframework.domain.validation.MockValidator",params);
        return new net.sf.pmr.keopsframework.domain.validation.MockValidator.PreMock(id);
    }

    public static net.sf.pmr.keopsframework.domain.validation.MockValidator.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.keopsframework.domain.validation.MockValidator",null);
        return new net.sf.pmr.keopsframework.domain.validation.MockValidator.PreMock(id);
    }

    public static net.sf.pmr.keopsframework.domain.validation.MockValidator.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.keopsframework.domain.validation.MockValidator",th);
        return new net.sf.pmr.keopsframework.domain.validation.MockValidator.PreMock(id);
    }

    public net.sf.pmr.keopsframework.domain.validation.Errors validate(java.lang.Object p0_Object, java.util.Locale p1_Locale)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);
        params.add(p1_Locale);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("validate(Object,Locale)"),params,MockCore.OPT_DEFAULT);
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
public void expectValidate(java.lang.Object p0_Object, java.util.Locale p1_Locale, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);
        params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validate(Object,Locale)"),params, valueToReturn );
}
public void expectValidate(java.lang.Object p0_Object, java.util.Locale p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);
        params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validate(Object,Locale)"),params,toThrow );
}
public void acceptValidate(Object p0_Object, Object p1_Locale, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);
params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validate(Object,Locale)"),params, valueToReturn );
}
public void acceptValidate(Object p0_Object, Object p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);
params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validate(Object,Locale)"),params,toThrow );
}
public void setValidate_Object_LocaleDummy(net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("validate(Object,Locale)"),null,toReturn);
}
public void setValidate_Object_LocaleDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("validate(Object,Locale)"),null,toThrow);
}
public void setValidateDummy(java.lang.Object p0_Object, java.util.Locale p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);
        params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("validate(Object,Locale)"),params,toThrow);
}
public void setValidateDummy(java.lang.Object p0_Object, java.util.Locale p1_Locale,net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);
        params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("validate(Object,Locale)"),params,toReturn);
}
public void acceptValidateDummy(Object p0_Object, Object p1_Locale, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);
params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("validate(Object,Locale)"),params, valueToReturn );
}
public void acceptValidateDummy(Object p0_Object, Object p1_Locale, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);
params.add(p1_Locale);

    MockCore.setDummy(getClassObjectMethodSignature("validate(Object,Locale)"),params,valueToThrow);
}


    public net.sf.pmr.keopsframework.domain.validation.Errors validate(java.lang.Object p0_Object)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("validate(Object)"),params,MockCore.OPT_DEFAULT);
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
public void expectValidate(java.lang.Object p0_Object, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validate(Object)"),params, valueToReturn );
}
public void expectValidate(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validate(Object)"),params,toThrow );
}
public void acceptValidate(Object p0_Object, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validate(Object)"),params, valueToReturn );
}
public void acceptValidate(Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validate(Object)"),params,toThrow );
}
public void setValidate_ObjectDummy(net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("validate(Object)"),null,toReturn);
}
public void setValidate_ObjectDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("validate(Object)"),null,toThrow);
}
public void setValidateDummy(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("validate(Object)"),params,toThrow);
}
public void setValidateDummy(java.lang.Object p0_Object,net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("validate(Object)"),params,toReturn);
}
public void acceptValidateDummy(Object p0_Object, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("validate(Object)"),params, valueToReturn );
}
public void acceptValidateDummy(Object p0_Object, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy(getClassObjectMethodSignature("validate(Object)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.keopsframework.domain.validation.MockValidator"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.keopsframework.domain.validation.Validator";
}
