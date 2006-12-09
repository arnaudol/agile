// MockCreator v2.9.0 build 3065; HashCode:454281401; net.sf.pmr.keopsframework.domain.validation.Errors
package net.sf.pmr.keopsframework.domain.validation;

import de.abstrakt.mock.MockCore;

public class MockErrors implements net.sf.pmr.keopsframework.domain.validation.Errors, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.keopsframework.domain.validation.MockErrors.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.keopsframework.domain.validation.MockErrors",null);
        return this;
    }

    public net.sf.pmr.keopsframework.domain.validation.MockErrors.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.keopsframework.domain.validation.MockErrors",th);
        return this;
    }

public void expectHasErrors(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasErrors()"),params, new Boolean(valueToReturn) );
}
public void expectHasErrors(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasErrors()"),params,toThrow );
}
public void acceptHasErrors(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasErrors()"),params, new Boolean(valueToReturn) );
}
public void acceptHasErrors(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasErrors()"),params,toThrow );
}
public void setHasErrorsDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("hasErrors()"),null,new Boolean(toReturn));
}
public void setHasErrorsDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("hasErrors()"),null,toThrow);
}



public void acceptHasErrorsDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("hasErrors()"),params,valueToThrow);
}


public void expectReject(java.lang.String p0_String, java.lang.Object[] p1_Object1D)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("reject(String,Object1D)"),params );
}
public void expectReject(java.lang.String p0_String, java.lang.Object[] p1_Object1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("reject(String,Object1D)"),params,toThrow );
}
public void acceptReject(Object p0_String, Object p1_Object1D)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("reject(String,Object1D)"),params );
}
public void acceptReject(Object p0_String, Object p1_Object1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("reject(String,Object1D)"),params,toThrow );
}
public void setReject_String_Object1DDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("reject(String,Object1D)"),null,null);
}
public void setReject_String_Object1DDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("reject(String,Object1D)"),null,toThrow);
}
public void setRejectDummy(java.lang.String p0_String, java.lang.Object[] p1_Object1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);

    MockCore.setDummy( getClassObjectMethodSignature("reject(String,Object1D)"),params,toThrow);
}


public void acceptRejectDummy(Object p0_String, Object p1_Object1D, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);

    MockCore.setDummy(getClassObjectMethodSignature("reject(String,Object1D)"),params,valueToThrow);
}


public void expectReject(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("reject(String)"),params );
}
public void expectReject(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("reject(String)"),params,toThrow );
}
public void acceptReject(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("reject(String)"),params );
}
public void acceptReject(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("reject(String)"),params,toThrow );
}
public void setReject_StringDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("reject(String)"),null,null);
}
public void setReject_StringDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("reject(String)"),null,toThrow);
}
public void setRejectDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("reject(String)"),params,toThrow);
}


public void acceptRejectDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("reject(String)"),params,valueToThrow);
}


public void expectRejectValue(java.lang.String p0_String, java.lang.String p1_String, java.lang.Object[] p2_Object1D)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);
        params.add(p2_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("rejectValue(String,String,Object1D)"),params );
}
public void expectRejectValue(java.lang.String p0_String, java.lang.String p1_String, java.lang.Object[] p2_Object1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);
        params.add(p2_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("rejectValue(String,String,Object1D)"),params,toThrow );
}
public void acceptRejectValue(Object p0_String, Object p1_String, Object p2_Object1D)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);
params.add(p2_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("rejectValue(String,String,Object1D)"),params );
}
public void acceptRejectValue(Object p0_String, Object p1_String, Object p2_Object1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);
params.add(p2_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("rejectValue(String,String,Object1D)"),params,toThrow );
}
public void setRejectValue_String_String_Object1DDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("rejectValue(String,String,Object1D)"),null,null);
}
public void setRejectValue_String_String_Object1DDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("rejectValue(String,String,Object1D)"),null,toThrow);
}
public void setRejectValueDummy(java.lang.String p0_String, java.lang.String p1_String, java.lang.Object[] p2_Object1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);
        params.add(p2_Object1D);

    MockCore.setDummy( getClassObjectMethodSignature("rejectValue(String,String,Object1D)"),params,toThrow);
}


public void acceptRejectValueDummy(Object p0_String, Object p1_String, Object p2_Object1D, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);
params.add(p2_Object1D);

    MockCore.setDummy(getClassObjectMethodSignature("rejectValue(String,String,Object1D)"),params,valueToThrow);
}


public void expectRejectValue(java.lang.String p0_String, java.lang.String p1_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("rejectValue(String,String)"),params );
}
public void expectRejectValue(java.lang.String p0_String, java.lang.String p1_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("rejectValue(String,String)"),params,toThrow );
}
public void acceptRejectValue(Object p0_String, Object p1_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("rejectValue(String,String)"),params );
}
public void acceptRejectValue(Object p0_String, Object p1_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("rejectValue(String,String)"),params,toThrow );
}
public void setRejectValue_String_StringDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("rejectValue(String,String)"),null,null);
}
public void setRejectValue_String_StringDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("rejectValue(String,String)"),null,toThrow);
}
public void setRejectValueDummy(java.lang.String p0_String, java.lang.String p1_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);

    MockCore.setDummy( getClassObjectMethodSignature("rejectValue(String,String)"),params,toThrow);
}


public void acceptRejectValueDummy(Object p0_String, Object p1_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);

    MockCore.setDummy(getClassObjectMethodSignature("rejectValue(String,String)"),params,valueToThrow);
}


public void expectGetErrorCount(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getErrorCount()"),params, new Integer(valueToReturn) );
}
public void expectGetErrorCount(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getErrorCount()"),params,toThrow );
}
public void acceptGetErrorCount(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getErrorCount()"),params, new Integer(valueToReturn) );
}
public void acceptGetErrorCount(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getErrorCount()"),params,toThrow );
}
public void setGetErrorCountDummy(int toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getErrorCount()"),null,new Integer(toReturn));
}
public void setGetErrorCountDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getErrorCount()"),null,toThrow);
}



public void acceptGetErrorCountDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getErrorCount()"),params,valueToThrow);
}


public void expectGetAllErrors(java.util.Locale p0_Locale, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getAllErrors(Locale)"),params, valueToReturn );
}
public void expectGetAllErrors(java.util.Locale p0_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getAllErrors(Locale)"),params,toThrow );
}
public void acceptGetAllErrors(Object p0_Locale, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getAllErrors(Locale)"),params, valueToReturn );
}
public void acceptGetAllErrors(Object p0_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getAllErrors(Locale)"),params,toThrow );
}
public void setGetAllErrorsDummy(java.util.List toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getAllErrors(Locale)"),null,toReturn);
}
public void setGetAllErrorsDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getAllErrors(Locale)"),null,toThrow);
}
public void setGetAllErrorsDummy(java.util.Locale p0_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getAllErrors(Locale)"),params,toThrow);
}
public void setGetAllErrorsDummy(java.util.Locale p0_Locale,java.util.List toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getAllErrors(Locale)"),params,toReturn);
}
public void acceptGetAllErrorsDummy(Object p0_Locale, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getAllErrors(Locale)"),params, valueToReturn );
}
public void acceptGetAllErrorsDummy(Object p0_Locale, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.setDummy(getClassObjectMethodSignature("getAllErrors(Locale)"),params,valueToThrow);
}


public void expectGetAllErrorsMessageParameters(java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getAllErrorsMessageParameters()"),params, valueToReturn );
}
public void expectGetAllErrorsMessageParameters(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getAllErrorsMessageParameters()"),params,toThrow );
}
public void acceptGetAllErrorsMessageParameters(java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getAllErrorsMessageParameters()"),params, valueToReturn );
}
public void acceptGetAllErrorsMessageParameters(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getAllErrorsMessageParameters()"),params,toThrow );
}
public void setGetAllErrorsMessageParametersDummy(java.util.List toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getAllErrorsMessageParameters()"),null,toReturn);
}
public void setGetAllErrorsMessageParametersDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getAllErrorsMessageParameters()"),null,toThrow);
}



public void acceptGetAllErrorsMessageParametersDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getAllErrorsMessageParameters()"),params,valueToThrow);
}


public void expectHasGlobalErrors(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasGlobalErrors()"),params, new Boolean(valueToReturn) );
}
public void expectHasGlobalErrors(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasGlobalErrors()"),params,toThrow );
}
public void acceptHasGlobalErrors(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasGlobalErrors()"),params, new Boolean(valueToReturn) );
}
public void acceptHasGlobalErrors(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasGlobalErrors()"),params,toThrow );
}
public void setHasGlobalErrorsDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("hasGlobalErrors()"),null,new Boolean(toReturn));
}
public void setHasGlobalErrorsDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("hasGlobalErrors()"),null,toThrow);
}



public void acceptHasGlobalErrorsDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("hasGlobalErrors()"),params,valueToThrow);
}


public void expectHasFieldErrors(java.lang.String p0_String, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasFieldErrors(String)"),params, new Boolean(valueToReturn) );
}
public void expectHasFieldErrors(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasFieldErrors(String)"),params,toThrow );
}
public void acceptHasFieldErrors(Object p0_String, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasFieldErrors(String)"),params, new Boolean(valueToReturn) );
}
public void acceptHasFieldErrors(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasFieldErrors(String)"),params,toThrow );
}
public void setHasFieldErrorsDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("hasFieldErrors(String)"),null,new Boolean(toReturn));
}
public void setHasFieldErrorsDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("hasFieldErrors(String)"),null,toThrow);
}
public void setHasFieldErrorsDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("hasFieldErrors(String)"),params,toThrow);
}
public void setHasFieldErrorsDummy(java.lang.String p0_String,boolean toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("hasFieldErrors(String)"),params,new Boolean(toReturn));
}
public void acceptHasFieldErrorsDummy(Object p0_String, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("hasFieldErrors(String)"),params, new Boolean(valueToReturn) );
}
public void acceptHasFieldErrorsDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("hasFieldErrors(String)"),params,valueToThrow);
}


public void expectGetGlobalErrorCount(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalErrorCount()"),params, new Integer(valueToReturn) );
}
public void expectGetGlobalErrorCount(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalErrorCount()"),params,toThrow );
}
public void acceptGetGlobalErrorCount(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalErrorCount()"),params, new Integer(valueToReturn) );
}
public void acceptGetGlobalErrorCount(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalErrorCount()"),params,toThrow );
}
public void setGetGlobalErrorCountDummy(int toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getGlobalErrorCount()"),null,new Integer(toReturn));
}
public void setGetGlobalErrorCountDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getGlobalErrorCount()"),null,toThrow);
}



public void acceptGetGlobalErrorCountDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getGlobalErrorCount()"),params,valueToThrow);
}


public void expectGetGlobalError(java.util.Locale p0_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalError(Locale)"),params, valueToReturn );
}
public void expectGetGlobalError(java.util.Locale p0_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalError(Locale)"),params,toThrow );
}
public void acceptGetGlobalError(Object p0_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalError(Locale)"),params, valueToReturn );
}
public void acceptGetGlobalError(Object p0_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalError(Locale)"),params,toThrow );
}
public void setGetGlobalErrorDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getGlobalError(Locale)"),null,toReturn);
}
public void setGetGlobalErrorDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getGlobalError(Locale)"),null,toThrow);
}
public void setGetGlobalErrorDummy(java.util.Locale p0_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getGlobalError(Locale)"),params,toThrow);
}
public void setGetGlobalErrorDummy(java.util.Locale p0_Locale,java.lang.String toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getGlobalError(Locale)"),params,toReturn);
}
public void acceptGetGlobalErrorDummy(Object p0_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getGlobalError(Locale)"),params, valueToReturn );
}
public void acceptGetGlobalErrorDummy(Object p0_Locale, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.setDummy(getClassObjectMethodSignature("getGlobalError(Locale)"),params,valueToThrow);
}


public void expectGetGlobalErrors(java.util.Locale p0_Locale, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalErrors(Locale)"),params, valueToReturn );
}
public void expectGetGlobalErrors(java.util.Locale p0_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalErrors(Locale)"),params,toThrow );
}
public void acceptGetGlobalErrors(Object p0_Locale, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalErrors(Locale)"),params, valueToReturn );
}
public void acceptGetGlobalErrors(Object p0_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalErrors(Locale)"),params,toThrow );
}
public void setGetGlobalErrorsDummy(java.util.List toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getGlobalErrors(Locale)"),null,toReturn);
}
public void setGetGlobalErrorsDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getGlobalErrors(Locale)"),null,toThrow);
}
public void setGetGlobalErrorsDummy(java.util.Locale p0_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getGlobalErrors(Locale)"),params,toThrow);
}
public void setGetGlobalErrorsDummy(java.util.Locale p0_Locale,java.util.List toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getGlobalErrors(Locale)"),params,toReturn);
}
public void acceptGetGlobalErrorsDummy(Object p0_Locale, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getGlobalErrors(Locale)"),params, valueToReturn );
}
public void acceptGetGlobalErrorsDummy(Object p0_Locale, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.setDummy(getClassObjectMethodSignature("getGlobalErrors(Locale)"),params,valueToThrow);
}


public void expectGetFieldErrorCount(java.lang.String p0_String, int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldErrorCount(String)"),params, new Integer(valueToReturn) );
}
public void expectGetFieldErrorCount(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldErrorCount(String)"),params,toThrow );
}
public void acceptGetFieldErrorCount(Object p0_String, int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldErrorCount(String)"),params, new Integer(valueToReturn) );
}
public void acceptGetFieldErrorCount(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldErrorCount(String)"),params,toThrow );
}
public void setGetFieldErrorCountDummy(int toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getFieldErrorCount(String)"),null,new Integer(toReturn));
}
public void setGetFieldErrorCountDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getFieldErrorCount(String)"),null,toThrow);
}
public void setGetFieldErrorCountDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("getFieldErrorCount(String)"),params,toThrow);
}
public void setGetFieldErrorCountDummy(java.lang.String p0_String,int toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("getFieldErrorCount(String)"),params,new Integer(toReturn));
}
public void acceptGetFieldErrorCountDummy(Object p0_String, int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("getFieldErrorCount(String)"),params, new Integer(valueToReturn) );
}
public void acceptGetFieldErrorCountDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("getFieldErrorCount(String)"),params,valueToThrow);
}


public void expectGetFieldError(java.lang.String p0_String, java.util.Locale p1_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldError(String,Locale)"),params, valueToReturn );
}
public void expectGetFieldError(java.lang.String p0_String, java.util.Locale p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldError(String,Locale)"),params,toThrow );
}
public void acceptGetFieldError(Object p0_String, Object p1_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldError(String,Locale)"),params, valueToReturn );
}
public void acceptGetFieldError(Object p0_String, Object p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldError(String,Locale)"),params,toThrow );
}
public void setGetFieldErrorDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getFieldError(String,Locale)"),null,toReturn);
}
public void setGetFieldErrorDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getFieldError(String,Locale)"),null,toThrow);
}
public void setGetFieldErrorDummy(java.lang.String p0_String, java.util.Locale p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getFieldError(String,Locale)"),params,toThrow);
}
public void setGetFieldErrorDummy(java.lang.String p0_String, java.util.Locale p1_Locale,java.lang.String toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getFieldError(String,Locale)"),params,toReturn);
}
public void acceptGetFieldErrorDummy(Object p0_String, Object p1_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getFieldError(String,Locale)"),params, valueToReturn );
}
public void acceptGetFieldErrorDummy(Object p0_String, Object p1_Locale, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Locale);

    MockCore.setDummy(getClassObjectMethodSignature("getFieldError(String,Locale)"),params,valueToThrow);
}


public void expectGetFieldErrors(java.lang.String p0_String, java.util.Locale p1_Locale, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldErrors(String,Locale)"),params, valueToReturn );
}
public void expectGetFieldErrors(java.lang.String p0_String, java.util.Locale p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldErrors(String,Locale)"),params,toThrow );
}
public void acceptGetFieldErrors(Object p0_String, Object p1_Locale, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldErrors(String,Locale)"),params, valueToReturn );
}
public void acceptGetFieldErrors(Object p0_String, Object p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldErrors(String,Locale)"),params,toThrow );
}
public void setGetFieldErrorsDummy(java.util.List toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getFieldErrors(String,Locale)"),null,toReturn);
}
public void setGetFieldErrorsDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getFieldErrors(String,Locale)"),null,toThrow);
}
public void setGetFieldErrorsDummy(java.lang.String p0_String, java.util.Locale p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getFieldErrors(String,Locale)"),params,toThrow);
}
public void setGetFieldErrorsDummy(java.lang.String p0_String, java.util.Locale p1_Locale,java.util.List toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getFieldErrors(String,Locale)"),params,toReturn);
}
public void acceptGetFieldErrorsDummy(Object p0_String, Object p1_Locale, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getFieldErrors(String,Locale)"),params, valueToReturn );
}
public void acceptGetFieldErrorsDummy(Object p0_String, Object p1_Locale, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Locale);

    MockCore.setDummy(getClassObjectMethodSignature("getFieldErrors(String,Locale)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.keopsframework.domain.validation.MockErrors"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.keopsframework.domain.validation.Errors";
}
    public MockErrors()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.keopsframework.domain.validation.MockErrors",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.keopsframework.domain.validation.MockErrors.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.keopsframework.domain.validation.MockErrors",params);
        return new net.sf.pmr.keopsframework.domain.validation.MockErrors.PreMock(id);
    }

    public static net.sf.pmr.keopsframework.domain.validation.MockErrors.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.keopsframework.domain.validation.MockErrors",null);
        return new net.sf.pmr.keopsframework.domain.validation.MockErrors.PreMock(id);
    }

    public static net.sf.pmr.keopsframework.domain.validation.MockErrors.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.keopsframework.domain.validation.MockErrors",th);
        return new net.sf.pmr.keopsframework.domain.validation.MockErrors.PreMock(id);
    }

    public boolean hasErrors()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("hasErrors()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("hasErrors: called but not prepared");
    return ((Boolean)returnValue).booleanValue();
}
public void expectHasErrors(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasErrors()"),params, new Boolean(valueToReturn) );
}
public void expectHasErrors(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasErrors()"),params,toThrow );
}
public void acceptHasErrors(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasErrors()"),params, new Boolean(valueToReturn) );
}
public void acceptHasErrors(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasErrors()"),params,toThrow );
}
public void setHasErrorsDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("hasErrors()"),null,new Boolean(toReturn));
}
public void setHasErrorsDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("hasErrors()"),null,toThrow);
}



public void acceptHasErrorsDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("hasErrors()"),params,valueToThrow);
}


    public void reject(java.lang.String p0_String, java.lang.Object[] p1_Object1D)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("reject(String,Object1D)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectReject(java.lang.String p0_String, java.lang.Object[] p1_Object1D)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("reject(String,Object1D)"),params );
}
public void expectReject(java.lang.String p0_String, java.lang.Object[] p1_Object1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("reject(String,Object1D)"),params,toThrow );
}
public void acceptReject(Object p0_String, Object p1_Object1D)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("reject(String,Object1D)"),params );
}
public void acceptReject(Object p0_String, Object p1_Object1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("reject(String,Object1D)"),params,toThrow );
}
public void setReject_String_Object1DDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("reject(String,Object1D)"),null,null);
}
public void setReject_String_Object1DDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("reject(String,Object1D)"),null,toThrow);
}
public void setRejectDummy(java.lang.String p0_String, java.lang.Object[] p1_Object1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Object1D);

    MockCore.setDummy( getClassObjectMethodSignature("reject(String,Object1D)"),params,toThrow);
}


public void acceptRejectDummy(Object p0_String, Object p1_Object1D, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Object1D);

    MockCore.setDummy(getClassObjectMethodSignature("reject(String,Object1D)"),params,valueToThrow);
}


    public void reject(java.lang.String p0_String)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("reject(String)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectReject(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("reject(String)"),params );
}
public void expectReject(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("reject(String)"),params,toThrow );
}
public void acceptReject(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("reject(String)"),params );
}
public void acceptReject(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("reject(String)"),params,toThrow );
}
public void setReject_StringDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("reject(String)"),null,null);
}
public void setReject_StringDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("reject(String)"),null,toThrow);
}
public void setRejectDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("reject(String)"),params,toThrow);
}


public void acceptRejectDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("reject(String)"),params,valueToThrow);
}


    public void rejectValue(java.lang.String p0_String, java.lang.String p1_String, java.lang.Object[] p2_Object1D)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);
        params.add(p2_Object1D);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("rejectValue(String,String,Object1D)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectRejectValue(java.lang.String p0_String, java.lang.String p1_String, java.lang.Object[] p2_Object1D)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);
        params.add(p2_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("rejectValue(String,String,Object1D)"),params );
}
public void expectRejectValue(java.lang.String p0_String, java.lang.String p1_String, java.lang.Object[] p2_Object1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);
        params.add(p2_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("rejectValue(String,String,Object1D)"),params,toThrow );
}
public void acceptRejectValue(Object p0_String, Object p1_String, Object p2_Object1D)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);
params.add(p2_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("rejectValue(String,String,Object1D)"),params );
}
public void acceptRejectValue(Object p0_String, Object p1_String, Object p2_Object1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);
params.add(p2_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("rejectValue(String,String,Object1D)"),params,toThrow );
}
public void setRejectValue_String_String_Object1DDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("rejectValue(String,String,Object1D)"),null,null);
}
public void setRejectValue_String_String_Object1DDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("rejectValue(String,String,Object1D)"),null,toThrow);
}
public void setRejectValueDummy(java.lang.String p0_String, java.lang.String p1_String, java.lang.Object[] p2_Object1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);
        params.add(p2_Object1D);

    MockCore.setDummy( getClassObjectMethodSignature("rejectValue(String,String,Object1D)"),params,toThrow);
}


public void acceptRejectValueDummy(Object p0_String, Object p1_String, Object p2_Object1D, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);
params.add(p2_Object1D);

    MockCore.setDummy(getClassObjectMethodSignature("rejectValue(String,String,Object1D)"),params,valueToThrow);
}


    public void rejectValue(java.lang.String p0_String, java.lang.String p1_String)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("rejectValue(String,String)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectRejectValue(java.lang.String p0_String, java.lang.String p1_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("rejectValue(String,String)"),params );
}
public void expectRejectValue(java.lang.String p0_String, java.lang.String p1_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("rejectValue(String,String)"),params,toThrow );
}
public void acceptRejectValue(Object p0_String, Object p1_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("rejectValue(String,String)"),params );
}
public void acceptRejectValue(Object p0_String, Object p1_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("rejectValue(String,String)"),params,toThrow );
}
public void setRejectValue_String_StringDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("rejectValue(String,String)"),null,null);
}
public void setRejectValue_String_StringDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("rejectValue(String,String)"),null,toThrow);
}
public void setRejectValueDummy(java.lang.String p0_String, java.lang.String p1_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_String);

    MockCore.setDummy( getClassObjectMethodSignature("rejectValue(String,String)"),params,toThrow);
}


public void acceptRejectValueDummy(Object p0_String, Object p1_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_String);

    MockCore.setDummy(getClassObjectMethodSignature("rejectValue(String,String)"),params,valueToThrow);
}


    public int getErrorCount()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getErrorCount()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("getErrorCount: called but not prepared");
    return ((Integer)returnValue).intValue();
}
public void expectGetErrorCount(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getErrorCount()"),params, new Integer(valueToReturn) );
}
public void expectGetErrorCount(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getErrorCount()"),params,toThrow );
}
public void acceptGetErrorCount(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getErrorCount()"),params, new Integer(valueToReturn) );
}
public void acceptGetErrorCount(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getErrorCount()"),params,toThrow );
}
public void setGetErrorCountDummy(int toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getErrorCount()"),null,new Integer(toReturn));
}
public void setGetErrorCountDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getErrorCount()"),null,toThrow);
}



public void acceptGetErrorCountDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getErrorCount()"),params,valueToThrow);
}


    public java.util.List getAllErrors(java.util.Locale p0_Locale)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getAllErrors(Locale)"),params,MockCore.OPT_DEFAULT);
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
public void expectGetAllErrors(java.util.Locale p0_Locale, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getAllErrors(Locale)"),params, valueToReturn );
}
public void expectGetAllErrors(java.util.Locale p0_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getAllErrors(Locale)"),params,toThrow );
}
public void acceptGetAllErrors(Object p0_Locale, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getAllErrors(Locale)"),params, valueToReturn );
}
public void acceptGetAllErrors(Object p0_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getAllErrors(Locale)"),params,toThrow );
}
public void setGetAllErrorsDummy(java.util.List toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getAllErrors(Locale)"),null,toReturn);
}
public void setGetAllErrorsDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getAllErrors(Locale)"),null,toThrow);
}
public void setGetAllErrorsDummy(java.util.Locale p0_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getAllErrors(Locale)"),params,toThrow);
}
public void setGetAllErrorsDummy(java.util.Locale p0_Locale,java.util.List toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getAllErrors(Locale)"),params,toReturn);
}
public void acceptGetAllErrorsDummy(Object p0_Locale, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getAllErrors(Locale)"),params, valueToReturn );
}
public void acceptGetAllErrorsDummy(Object p0_Locale, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.setDummy(getClassObjectMethodSignature("getAllErrors(Locale)"),params,valueToThrow);
}


    public java.util.List getAllErrorsMessageParameters()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getAllErrorsMessageParameters()"),params,MockCore.OPT_DEFAULT);
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
public void expectGetAllErrorsMessageParameters(java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getAllErrorsMessageParameters()"),params, valueToReturn );
}
public void expectGetAllErrorsMessageParameters(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getAllErrorsMessageParameters()"),params,toThrow );
}
public void acceptGetAllErrorsMessageParameters(java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getAllErrorsMessageParameters()"),params, valueToReturn );
}
public void acceptGetAllErrorsMessageParameters(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getAllErrorsMessageParameters()"),params,toThrow );
}
public void setGetAllErrorsMessageParametersDummy(java.util.List toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getAllErrorsMessageParameters()"),null,toReturn);
}
public void setGetAllErrorsMessageParametersDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getAllErrorsMessageParameters()"),null,toThrow);
}



public void acceptGetAllErrorsMessageParametersDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getAllErrorsMessageParameters()"),params,valueToThrow);
}


    public boolean hasGlobalErrors()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("hasGlobalErrors()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("hasGlobalErrors: called but not prepared");
    return ((Boolean)returnValue).booleanValue();
}
public void expectHasGlobalErrors(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasGlobalErrors()"),params, new Boolean(valueToReturn) );
}
public void expectHasGlobalErrors(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasGlobalErrors()"),params,toThrow );
}
public void acceptHasGlobalErrors(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasGlobalErrors()"),params, new Boolean(valueToReturn) );
}
public void acceptHasGlobalErrors(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasGlobalErrors()"),params,toThrow );
}
public void setHasGlobalErrorsDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("hasGlobalErrors()"),null,new Boolean(toReturn));
}
public void setHasGlobalErrorsDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("hasGlobalErrors()"),null,toThrow);
}



public void acceptHasGlobalErrorsDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("hasGlobalErrors()"),params,valueToThrow);
}


    public boolean hasFieldErrors(java.lang.String p0_String)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("hasFieldErrors(String)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("hasFieldErrors: called but not prepared");
    return ((Boolean)returnValue).booleanValue();
}
public void expectHasFieldErrors(java.lang.String p0_String, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasFieldErrors(String)"),params, new Boolean(valueToReturn) );
}
public void expectHasFieldErrors(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasFieldErrors(String)"),params,toThrow );
}
public void acceptHasFieldErrors(Object p0_String, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasFieldErrors(String)"),params, new Boolean(valueToReturn) );
}
public void acceptHasFieldErrors(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("hasFieldErrors(String)"),params,toThrow );
}
public void setHasFieldErrorsDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("hasFieldErrors(String)"),null,new Boolean(toReturn));
}
public void setHasFieldErrorsDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("hasFieldErrors(String)"),null,toThrow);
}
public void setHasFieldErrorsDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("hasFieldErrors(String)"),params,toThrow);
}
public void setHasFieldErrorsDummy(java.lang.String p0_String,boolean toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("hasFieldErrors(String)"),params,new Boolean(toReturn));
}
public void acceptHasFieldErrorsDummy(Object p0_String, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("hasFieldErrors(String)"),params, new Boolean(valueToReturn) );
}
public void acceptHasFieldErrorsDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("hasFieldErrors(String)"),params,valueToThrow);
}


    public int getGlobalErrorCount()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getGlobalErrorCount()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("getGlobalErrorCount: called but not prepared");
    return ((Integer)returnValue).intValue();
}
public void expectGetGlobalErrorCount(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalErrorCount()"),params, new Integer(valueToReturn) );
}
public void expectGetGlobalErrorCount(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalErrorCount()"),params,toThrow );
}
public void acceptGetGlobalErrorCount(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalErrorCount()"),params, new Integer(valueToReturn) );
}
public void acceptGetGlobalErrorCount(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalErrorCount()"),params,toThrow );
}
public void setGetGlobalErrorCountDummy(int toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getGlobalErrorCount()"),null,new Integer(toReturn));
}
public void setGetGlobalErrorCountDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getGlobalErrorCount()"),null,toThrow);
}



public void acceptGetGlobalErrorCountDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getGlobalErrorCount()"),params,valueToThrow);
}


    public java.lang.String getGlobalError(java.util.Locale p0_Locale)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getGlobalError(Locale)"),params,MockCore.OPT_DEFAULT);
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
public void expectGetGlobalError(java.util.Locale p0_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalError(Locale)"),params, valueToReturn );
}
public void expectGetGlobalError(java.util.Locale p0_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalError(Locale)"),params,toThrow );
}
public void acceptGetGlobalError(Object p0_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalError(Locale)"),params, valueToReturn );
}
public void acceptGetGlobalError(Object p0_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalError(Locale)"),params,toThrow );
}
public void setGetGlobalErrorDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getGlobalError(Locale)"),null,toReturn);
}
public void setGetGlobalErrorDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getGlobalError(Locale)"),null,toThrow);
}
public void setGetGlobalErrorDummy(java.util.Locale p0_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getGlobalError(Locale)"),params,toThrow);
}
public void setGetGlobalErrorDummy(java.util.Locale p0_Locale,java.lang.String toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getGlobalError(Locale)"),params,toReturn);
}
public void acceptGetGlobalErrorDummy(Object p0_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getGlobalError(Locale)"),params, valueToReturn );
}
public void acceptGetGlobalErrorDummy(Object p0_Locale, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.setDummy(getClassObjectMethodSignature("getGlobalError(Locale)"),params,valueToThrow);
}


    public java.util.List getGlobalErrors(java.util.Locale p0_Locale)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getGlobalErrors(Locale)"),params,MockCore.OPT_DEFAULT);
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
public void expectGetGlobalErrors(java.util.Locale p0_Locale, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalErrors(Locale)"),params, valueToReturn );
}
public void expectGetGlobalErrors(java.util.Locale p0_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalErrors(Locale)"),params,toThrow );
}
public void acceptGetGlobalErrors(Object p0_Locale, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalErrors(Locale)"),params, valueToReturn );
}
public void acceptGetGlobalErrors(Object p0_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getGlobalErrors(Locale)"),params,toThrow );
}
public void setGetGlobalErrorsDummy(java.util.List toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getGlobalErrors(Locale)"),null,toReturn);
}
public void setGetGlobalErrorsDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getGlobalErrors(Locale)"),null,toThrow);
}
public void setGetGlobalErrorsDummy(java.util.Locale p0_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getGlobalErrors(Locale)"),params,toThrow);
}
public void setGetGlobalErrorsDummy(java.util.Locale p0_Locale,java.util.List toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getGlobalErrors(Locale)"),params,toReturn);
}
public void acceptGetGlobalErrorsDummy(Object p0_Locale, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getGlobalErrors(Locale)"),params, valueToReturn );
}
public void acceptGetGlobalErrorsDummy(Object p0_Locale, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Locale);

    MockCore.setDummy(getClassObjectMethodSignature("getGlobalErrors(Locale)"),params,valueToThrow);
}


    public int getFieldErrorCount(java.lang.String p0_String)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getFieldErrorCount(String)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("getFieldErrorCount: called but not prepared");
    return ((Integer)returnValue).intValue();
}
public void expectGetFieldErrorCount(java.lang.String p0_String, int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldErrorCount(String)"),params, new Integer(valueToReturn) );
}
public void expectGetFieldErrorCount(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldErrorCount(String)"),params,toThrow );
}
public void acceptGetFieldErrorCount(Object p0_String, int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldErrorCount(String)"),params, new Integer(valueToReturn) );
}
public void acceptGetFieldErrorCount(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldErrorCount(String)"),params,toThrow );
}
public void setGetFieldErrorCountDummy(int toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getFieldErrorCount(String)"),null,new Integer(toReturn));
}
public void setGetFieldErrorCountDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getFieldErrorCount(String)"),null,toThrow);
}
public void setGetFieldErrorCountDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("getFieldErrorCount(String)"),params,toThrow);
}
public void setGetFieldErrorCountDummy(java.lang.String p0_String,int toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("getFieldErrorCount(String)"),params,new Integer(toReturn));
}
public void acceptGetFieldErrorCountDummy(Object p0_String, int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("getFieldErrorCount(String)"),params, new Integer(valueToReturn) );
}
public void acceptGetFieldErrorCountDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("getFieldErrorCount(String)"),params,valueToThrow);
}


    public java.lang.String getFieldError(java.lang.String p0_String, java.util.Locale p1_Locale)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Locale);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getFieldError(String,Locale)"),params,MockCore.OPT_DEFAULT);
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
public void expectGetFieldError(java.lang.String p0_String, java.util.Locale p1_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldError(String,Locale)"),params, valueToReturn );
}
public void expectGetFieldError(java.lang.String p0_String, java.util.Locale p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldError(String,Locale)"),params,toThrow );
}
public void acceptGetFieldError(Object p0_String, Object p1_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldError(String,Locale)"),params, valueToReturn );
}
public void acceptGetFieldError(Object p0_String, Object p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldError(String,Locale)"),params,toThrow );
}
public void setGetFieldErrorDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getFieldError(String,Locale)"),null,toReturn);
}
public void setGetFieldErrorDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getFieldError(String,Locale)"),null,toThrow);
}
public void setGetFieldErrorDummy(java.lang.String p0_String, java.util.Locale p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getFieldError(String,Locale)"),params,toThrow);
}
public void setGetFieldErrorDummy(java.lang.String p0_String, java.util.Locale p1_Locale,java.lang.String toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getFieldError(String,Locale)"),params,toReturn);
}
public void acceptGetFieldErrorDummy(Object p0_String, Object p1_Locale, java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getFieldError(String,Locale)"),params, valueToReturn );
}
public void acceptGetFieldErrorDummy(Object p0_String, Object p1_Locale, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Locale);

    MockCore.setDummy(getClassObjectMethodSignature("getFieldError(String,Locale)"),params,valueToThrow);
}


    public java.util.List getFieldErrors(java.lang.String p0_String, java.util.Locale p1_Locale)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Locale);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getFieldErrors(String,Locale)"),params,MockCore.OPT_DEFAULT);
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
public void expectGetFieldErrors(java.lang.String p0_String, java.util.Locale p1_Locale, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldErrors(String,Locale)"),params, valueToReturn );
}
public void expectGetFieldErrors(java.lang.String p0_String, java.util.Locale p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldErrors(String,Locale)"),params,toThrow );
}
public void acceptGetFieldErrors(Object p0_String, Object p1_Locale, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldErrors(String,Locale)"),params, valueToReturn );
}
public void acceptGetFieldErrors(Object p0_String, Object p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Locale);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getFieldErrors(String,Locale)"),params,toThrow );
}
public void setGetFieldErrorsDummy(java.util.List toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getFieldErrors(String,Locale)"),null,toReturn);
}
public void setGetFieldErrorsDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getFieldErrors(String,Locale)"),null,toThrow);
}
public void setGetFieldErrorsDummy(java.lang.String p0_String, java.util.Locale p1_Locale,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getFieldErrors(String,Locale)"),params,toThrow);
}
public void setGetFieldErrorsDummy(java.lang.String p0_String, java.util.Locale p1_Locale,java.util.List toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);
        params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getFieldErrors(String,Locale)"),params,toReturn);
}
public void acceptGetFieldErrorsDummy(Object p0_String, Object p1_Locale, java.util.List valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Locale);

    MockCore.setDummy( getClassObjectMethodSignature("getFieldErrors(String,Locale)"),params, valueToReturn );
}
public void acceptGetFieldErrorsDummy(Object p0_String, Object p1_Locale, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);
params.add(p1_Locale);

    MockCore.setDummy(getClassObjectMethodSignature("getFieldErrors(String,Locale)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.keopsframework.domain.validation.MockErrors"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.keopsframework.domain.validation.Errors";
}
