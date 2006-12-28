// MockCreator v2.9.0 build 3065; HashCode:456693092; net.sf.pmr.agilePlanning.domain.story.task.TaskValidator
package net.sf.pmr.agilePlanning.domain.story.task;

import de.abstrakt.mock.MockCore;

public class MockTaskValidator implements net.sf.pmr.agilePlanning.domain.story.task.TaskValidator, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.agilePlanning.domain.story.task.MockTaskValidator.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.agilePlanning.domain.story.task.MockTaskValidator",null);
        return this;
    }

    public net.sf.pmr.agilePlanning.domain.story.task.MockTaskValidator.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.agilePlanning.domain.story.task.MockTaskValidator",th);
        return this;
    }

public void expectValidateForDelete(net.sf.pmr.agilePlanning.domain.story.task.Task p0_Task, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Task);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validateForDelete(Task)"),params, valueToReturn );
}
public void expectValidateForDelete(net.sf.pmr.agilePlanning.domain.story.task.Task p0_Task,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Task);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validateForDelete(Task)"),params,toThrow );
}
public void acceptValidateForDelete(Object p0_Task, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Task);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validateForDelete(Task)"),params, valueToReturn );
}
public void acceptValidateForDelete(Object p0_Task,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Task);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validateForDelete(Task)"),params,toThrow );
}
public void setValidateForDeleteDummy(net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("validateForDelete(Task)"),null,toReturn);
}
public void setValidateForDeleteDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("validateForDelete(Task)"),null,toThrow);
}
public void setValidateForDeleteDummy(net.sf.pmr.agilePlanning.domain.story.task.Task p0_Task,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Task);

    MockCore.setDummy( getClassObjectMethodSignature("validateForDelete(Task)"),params,toThrow);
}
public void setValidateForDeleteDummy(net.sf.pmr.agilePlanning.domain.story.task.Task p0_Task,net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Task);

    MockCore.setDummy( getClassObjectMethodSignature("validateForDelete(Task)"),params,toReturn);
}
public void acceptValidateForDeleteDummy(Object p0_Task, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Task);

    MockCore.setDummy( getClassObjectMethodSignature("validateForDelete(Task)"),params, valueToReturn );
}
public void acceptValidateForDeleteDummy(Object p0_Task, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Task);

    MockCore.setDummy(getClassObjectMethodSignature("validateForDelete(Task)"),params,valueToThrow);
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


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.agilePlanning.domain.story.task.MockTaskValidator"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.agilePlanning.domain.story.task.TaskValidator";
}
    public MockTaskValidator()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.agilePlanning.domain.story.task.MockTaskValidator",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.agilePlanning.domain.story.task.MockTaskValidator.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.agilePlanning.domain.story.task.MockTaskValidator",params);
        return new net.sf.pmr.agilePlanning.domain.story.task.MockTaskValidator.PreMock(id);
    }

    public static net.sf.pmr.agilePlanning.domain.story.task.MockTaskValidator.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.agilePlanning.domain.story.task.MockTaskValidator",null);
        return new net.sf.pmr.agilePlanning.domain.story.task.MockTaskValidator.PreMock(id);
    }

    public static net.sf.pmr.agilePlanning.domain.story.task.MockTaskValidator.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.agilePlanning.domain.story.task.MockTaskValidator",th);
        return new net.sf.pmr.agilePlanning.domain.story.task.MockTaskValidator.PreMock(id);
    }

    public net.sf.pmr.keopsframework.domain.validation.Errors validateForDelete(net.sf.pmr.agilePlanning.domain.story.task.Task p0_Task)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Task);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("validateForDelete(Task)"),params,MockCore.OPT_DEFAULT);
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
public void expectValidateForDelete(net.sf.pmr.agilePlanning.domain.story.task.Task p0_Task, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Task);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validateForDelete(Task)"),params, valueToReturn );
}
public void expectValidateForDelete(net.sf.pmr.agilePlanning.domain.story.task.Task p0_Task,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Task);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validateForDelete(Task)"),params,toThrow );
}
public void acceptValidateForDelete(Object p0_Task, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Task);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validateForDelete(Task)"),params, valueToReturn );
}
public void acceptValidateForDelete(Object p0_Task,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Task);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("validateForDelete(Task)"),params,toThrow );
}
public void setValidateForDeleteDummy(net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("validateForDelete(Task)"),null,toReturn);
}
public void setValidateForDeleteDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("validateForDelete(Task)"),null,toThrow);
}
public void setValidateForDeleteDummy(net.sf.pmr.agilePlanning.domain.story.task.Task p0_Task,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Task);

    MockCore.setDummy( getClassObjectMethodSignature("validateForDelete(Task)"),params,toThrow);
}
public void setValidateForDeleteDummy(net.sf.pmr.agilePlanning.domain.story.task.Task p0_Task,net.sf.pmr.keopsframework.domain.validation.Errors toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Task);

    MockCore.setDummy( getClassObjectMethodSignature("validateForDelete(Task)"),params,toReturn);
}
public void acceptValidateForDeleteDummy(Object p0_Task, net.sf.pmr.keopsframework.domain.validation.Errors valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Task);

    MockCore.setDummy( getClassObjectMethodSignature("validateForDelete(Task)"),params, valueToReturn );
}
public void acceptValidateForDeleteDummy(Object p0_Task, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Task);

    MockCore.setDummy(getClassObjectMethodSignature("validateForDelete(Task)"),params,valueToThrow);
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


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.agilePlanning.domain.story.task.MockTaskValidator"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.agilePlanning.domain.story.task.TaskValidator";
}
