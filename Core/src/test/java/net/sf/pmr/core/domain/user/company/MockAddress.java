// MockCreator v2.9.0 build 3065; HashCode:1471150952; net.sf.pmr.core.domain.Address
package net.sf.pmr.core.domain.user.company;

import de.abstrakt.mock.MockCore;

public class MockAddress implements net.sf.pmr.core.domain.user.company.Address, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.core.domain.user.company.MockAddress.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.MockAddress",null);
        return this;
    }

    public net.sf.pmr.core.domain.user.company.MockAddress.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.MockAddress",th);
        return this;
    }

public void expectSetCountry(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCountry(String)"),params );
}
public void expectSetCountry(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCountry(String)"),params,toThrow );
}
public void acceptSetCountry(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCountry(String)"),params );
}
public void acceptSetCountry(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCountry(String)"),params,toThrow );
}
public void setSetCountryDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setCountry(String)"),null,null);
}
public void setSetCountryDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setCountry(String)"),null,toThrow);
}
public void setSetCountryDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("setCountry(String)"),params,toThrow);
}


public void acceptSetCountryDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("setCountry(String)"),params,valueToThrow);
}


public void expectGetPostalCode(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPostalCode()"),params, valueToReturn );
}
public void expectGetPostalCode(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPostalCode()"),params,toThrow );
}
public void acceptGetPostalCode(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPostalCode()"),params, valueToReturn );
}
public void acceptGetPostalCode(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPostalCode()"),params,toThrow );
}
public void setGetPostalCodeDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getPostalCode()"),null,toReturn);
}
public void setGetPostalCodeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getPostalCode()"),null,toThrow);
}



public void acceptGetPostalCodeDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getPostalCode()"),params,valueToThrow);
}


public void expectSetPostalCode(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPostalCode(String)"),params );
}
public void expectSetPostalCode(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPostalCode(String)"),params,toThrow );
}
public void acceptSetPostalCode(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPostalCode(String)"),params );
}
public void acceptSetPostalCode(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPostalCode(String)"),params,toThrow );
}
public void setSetPostalCodeDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setPostalCode(String)"),null,null);
}
public void setSetPostalCodeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setPostalCode(String)"),null,toThrow);
}
public void setSetPostalCodeDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("setPostalCode(String)"),params,toThrow);
}


public void acceptSetPostalCodeDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("setPostalCode(String)"),params,valueToThrow);
}


public void expectGetStreetName(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getStreetName()"),params, valueToReturn );
}
public void expectGetStreetName(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getStreetName()"),params,toThrow );
}
public void acceptGetStreetName(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getStreetName()"),params, valueToReturn );
}
public void acceptGetStreetName(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getStreetName()"),params,toThrow );
}
public void setGetStreetNameDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getStreetName()"),null,toReturn);
}
public void setGetStreetNameDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getStreetName()"),null,toThrow);
}



public void acceptGetStreetNameDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getStreetName()"),params,valueToThrow);
}


public void expectSetStreetName(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setStreetName(String)"),params );
}
public void expectSetStreetName(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setStreetName(String)"),params,toThrow );
}
public void acceptSetStreetName(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setStreetName(String)"),params );
}
public void acceptSetStreetName(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setStreetName(String)"),params,toThrow );
}
public void setSetStreetNameDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setStreetName(String)"),null,null);
}
public void setSetStreetNameDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setStreetName(String)"),null,toThrow);
}
public void setSetStreetNameDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("setStreetName(String)"),params,toThrow);
}


public void acceptSetStreetNameDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("setStreetName(String)"),params,valueToThrow);
}


public void expectGetStreetNumber(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getStreetNumber()"),params, valueToReturn );
}
public void expectGetStreetNumber(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getStreetNumber()"),params,toThrow );
}
public void acceptGetStreetNumber(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getStreetNumber()"),params, valueToReturn );
}
public void acceptGetStreetNumber(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getStreetNumber()"),params,toThrow );
}
public void setGetStreetNumberDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getStreetNumber()"),null,toReturn);
}
public void setGetStreetNumberDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getStreetNumber()"),null,toThrow);
}



public void acceptGetStreetNumberDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getStreetNumber()"),params,valueToThrow);
}


public void expectSetStreetNumber(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setStreetNumber(String)"),params );
}
public void expectSetStreetNumber(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setStreetNumber(String)"),params,toThrow );
}
public void acceptSetStreetNumber(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setStreetNumber(String)"),params );
}
public void acceptSetStreetNumber(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setStreetNumber(String)"),params,toThrow );
}
public void setSetStreetNumberDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setStreetNumber(String)"),null,null);
}
public void setSetStreetNumberDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setStreetNumber(String)"),null,toThrow);
}
public void setSetStreetNumberDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("setStreetNumber(String)"),params,toThrow);
}


public void acceptSetStreetNumberDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("setStreetNumber(String)"),params,valueToThrow);
}


public void expectSetCity(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCity(String)"),params );
}
public void expectSetCity(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCity(String)"),params,toThrow );
}
public void acceptSetCity(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCity(String)"),params );
}
public void acceptSetCity(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCity(String)"),params,toThrow );
}
public void setSetCityDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setCity(String)"),null,null);
}
public void setSetCityDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setCity(String)"),null,toThrow);
}
public void setSetCityDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("setCity(String)"),params,toThrow);
}


public void acceptSetCityDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("setCity(String)"),params,valueToThrow);
}


public void expectGetCity(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCity()"),params, valueToReturn );
}
public void expectGetCity(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCity()"),params,toThrow );
}
public void acceptGetCity(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCity()"),params, valueToReturn );
}
public void acceptGetCity(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCity()"),params,toThrow );
}
public void setGetCityDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getCity()"),null,toReturn);
}
public void setGetCityDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getCity()"),null,toThrow);
}



public void acceptGetCityDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getCity()"),params,valueToThrow);
}


public void expectGetCountry(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCountry()"),params, valueToReturn );
}
public void expectGetCountry(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCountry()"),params,toThrow );
}
public void acceptGetCountry(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCountry()"),params, valueToReturn );
}
public void acceptGetCountry(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCountry()"),params,toThrow );
}
public void setGetCountryDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getCountry()"),null,toReturn);
}
public void setGetCountryDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getCountry()"),null,toThrow);
}



public void acceptGetCountryDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getCountry()"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.MockAddress"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.Address";
}
    public MockAddress()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.core.domain.MockAddress",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.core.domain.user.company.MockAddress.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.core.domain.MockAddress",params);
        return new net.sf.pmr.core.domain.user.company.MockAddress.PreMock(id);
    }

    public static net.sf.pmr.core.domain.user.company.MockAddress.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.MockAddress",null);
        return new net.sf.pmr.core.domain.user.company.MockAddress.PreMock(id);
    }

    public static net.sf.pmr.core.domain.user.company.MockAddress.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.MockAddress",th);
        return new net.sf.pmr.core.domain.user.company.MockAddress.PreMock(id);
    }

    public void setCountry(java.lang.String p0_String)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setCountry(String)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetCountry(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCountry(String)"),params );
}
public void expectSetCountry(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCountry(String)"),params,toThrow );
}
public void acceptSetCountry(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCountry(String)"),params );
}
public void acceptSetCountry(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCountry(String)"),params,toThrow );
}
public void setSetCountryDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setCountry(String)"),null,null);
}
public void setSetCountryDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setCountry(String)"),null,toThrow);
}
public void setSetCountryDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("setCountry(String)"),params,toThrow);
}


public void acceptSetCountryDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("setCountry(String)"),params,valueToThrow);
}


    public java.lang.String getPostalCode()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getPostalCode()"),params,MockCore.OPT_DEFAULT);
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
public void expectGetPostalCode(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPostalCode()"),params, valueToReturn );
}
public void expectGetPostalCode(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPostalCode()"),params,toThrow );
}
public void acceptGetPostalCode(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPostalCode()"),params, valueToReturn );
}
public void acceptGetPostalCode(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPostalCode()"),params,toThrow );
}
public void setGetPostalCodeDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getPostalCode()"),null,toReturn);
}
public void setGetPostalCodeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getPostalCode()"),null,toThrow);
}



public void acceptGetPostalCodeDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getPostalCode()"),params,valueToThrow);
}


    public void setPostalCode(java.lang.String p0_String)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setPostalCode(String)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetPostalCode(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPostalCode(String)"),params );
}
public void expectSetPostalCode(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPostalCode(String)"),params,toThrow );
}
public void acceptSetPostalCode(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPostalCode(String)"),params );
}
public void acceptSetPostalCode(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPostalCode(String)"),params,toThrow );
}
public void setSetPostalCodeDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setPostalCode(String)"),null,null);
}
public void setSetPostalCodeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setPostalCode(String)"),null,toThrow);
}
public void setSetPostalCodeDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("setPostalCode(String)"),params,toThrow);
}


public void acceptSetPostalCodeDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("setPostalCode(String)"),params,valueToThrow);
}


    public java.lang.String getStreetName()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getStreetName()"),params,MockCore.OPT_DEFAULT);
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
public void expectGetStreetName(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getStreetName()"),params, valueToReturn );
}
public void expectGetStreetName(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getStreetName()"),params,toThrow );
}
public void acceptGetStreetName(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getStreetName()"),params, valueToReturn );
}
public void acceptGetStreetName(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getStreetName()"),params,toThrow );
}
public void setGetStreetNameDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getStreetName()"),null,toReturn);
}
public void setGetStreetNameDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getStreetName()"),null,toThrow);
}



public void acceptGetStreetNameDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getStreetName()"),params,valueToThrow);
}


    public void setStreetName(java.lang.String p0_String)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setStreetName(String)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetStreetName(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setStreetName(String)"),params );
}
public void expectSetStreetName(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setStreetName(String)"),params,toThrow );
}
public void acceptSetStreetName(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setStreetName(String)"),params );
}
public void acceptSetStreetName(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setStreetName(String)"),params,toThrow );
}
public void setSetStreetNameDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setStreetName(String)"),null,null);
}
public void setSetStreetNameDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setStreetName(String)"),null,toThrow);
}
public void setSetStreetNameDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("setStreetName(String)"),params,toThrow);
}


public void acceptSetStreetNameDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("setStreetName(String)"),params,valueToThrow);
}


    public java.lang.String getStreetNumber()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getStreetNumber()"),params,MockCore.OPT_DEFAULT);
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
public void expectGetStreetNumber(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getStreetNumber()"),params, valueToReturn );
}
public void expectGetStreetNumber(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getStreetNumber()"),params,toThrow );
}
public void acceptGetStreetNumber(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getStreetNumber()"),params, valueToReturn );
}
public void acceptGetStreetNumber(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getStreetNumber()"),params,toThrow );
}
public void setGetStreetNumberDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getStreetNumber()"),null,toReturn);
}
public void setGetStreetNumberDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getStreetNumber()"),null,toThrow);
}



public void acceptGetStreetNumberDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getStreetNumber()"),params,valueToThrow);
}


    public void setStreetNumber(java.lang.String p0_String)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setStreetNumber(String)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetStreetNumber(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setStreetNumber(String)"),params );
}
public void expectSetStreetNumber(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setStreetNumber(String)"),params,toThrow );
}
public void acceptSetStreetNumber(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setStreetNumber(String)"),params );
}
public void acceptSetStreetNumber(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setStreetNumber(String)"),params,toThrow );
}
public void setSetStreetNumberDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setStreetNumber(String)"),null,null);
}
public void setSetStreetNumberDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setStreetNumber(String)"),null,toThrow);
}
public void setSetStreetNumberDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("setStreetNumber(String)"),params,toThrow);
}


public void acceptSetStreetNumberDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("setStreetNumber(String)"),params,valueToThrow);
}


    public void setCity(java.lang.String p0_String)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setCity(String)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetCity(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCity(String)"),params );
}
public void expectSetCity(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCity(String)"),params,toThrow );
}
public void acceptSetCity(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCity(String)"),params );
}
public void acceptSetCity(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCity(String)"),params,toThrow );
}
public void setSetCityDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setCity(String)"),null,null);
}
public void setSetCityDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setCity(String)"),null,toThrow);
}
public void setSetCityDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("setCity(String)"),params,toThrow);
}


public void acceptSetCityDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("setCity(String)"),params,valueToThrow);
}


    public java.lang.String getCity()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getCity()"),params,MockCore.OPT_DEFAULT);
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
public void expectGetCity(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCity()"),params, valueToReturn );
}
public void expectGetCity(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCity()"),params,toThrow );
}
public void acceptGetCity(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCity()"),params, valueToReturn );
}
public void acceptGetCity(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCity()"),params,toThrow );
}
public void setGetCityDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getCity()"),null,toReturn);
}
public void setGetCityDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getCity()"),null,toThrow);
}



public void acceptGetCityDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getCity()"),params,valueToThrow);
}


    public java.lang.String getCountry()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getCountry()"),params,MockCore.OPT_DEFAULT);
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
public void expectGetCountry(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCountry()"),params, valueToReturn );
}
public void expectGetCountry(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCountry()"),params,toThrow );
}
public void acceptGetCountry(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCountry()"),params, valueToReturn );
}
public void acceptGetCountry(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCountry()"),params,toThrow );
}
public void setGetCountryDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getCountry()"),null,toReturn);
}
public void setGetCountryDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getCountry()"),null,toThrow);
}



public void acceptGetCountryDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getCountry()"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.MockAddress"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.Address";
}
