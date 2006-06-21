// MockCreator v2.9.0 build 3065; HashCode:-1716165682; net.sf.pmr.agilePlanning.domain.agileProject.iteration.IterationValidator
package net.sf.pmr.agilePlanning.domain.iteration;

import de.abstrakt.mock.MockCore;

public class MockIterationValidator implements net.sf.pmr.agilePlanning.domain.iteration.IterationValidator, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.agilePlanning.domain.iteration.MockIterationValidator.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.agilePlanning.domain.agileProject.iteration.MockIterationValidator",null);
        return this;
    }

    public net.sf.pmr.agilePlanning.domain.iteration.MockIterationValidator.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.agilePlanning.domain.agileProject.iteration.MockIterationValidator",th);
        return this;
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
public void setValidateDummy(net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("validate(Object)"),null,toReturn);
}
public void setValidateDummy(java.lang.Throwable toThrow)
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


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.agilePlanning.domain.agileProject.iteration.MockIterationValidator"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.agilePlanning.domain.agileProject.iteration.IterationValidator";
}
    public MockIterationValidator()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.agilePlanning.domain.agileProject.iteration.MockIterationValidator",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.agilePlanning.domain.iteration.MockIterationValidator.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.agilePlanning.domain.agileProject.iteration.MockIterationValidator",params);
        return new net.sf.pmr.agilePlanning.domain.iteration.MockIterationValidator.PreMock(id);
    }

    public static net.sf.pmr.agilePlanning.domain.iteration.MockIterationValidator.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.agilePlanning.domain.agileProject.iteration.MockIterationValidator",null);
        return new net.sf.pmr.agilePlanning.domain.iteration.MockIterationValidator.PreMock(id);
    }

    public static net.sf.pmr.agilePlanning.domain.iteration.MockIterationValidator.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.agilePlanning.domain.agileProject.iteration.MockIterationValidator",th);
        return new net.sf.pmr.agilePlanning.domain.iteration.MockIterationValidator.PreMock(id);
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
public void setValidateDummy(net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("validate(Object)"),null,toReturn);
}
public void setValidateDummy(java.lang.Throwable toThrow)
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


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.agilePlanning.domain.agileProject.iteration.MockIterationValidator"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.agilePlanning.domain.agileProject.iteration.IterationValidator";
}
