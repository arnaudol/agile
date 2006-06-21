// MockCreator v2.9.0 build 3065; HashCode:-1640600400; net.sf.pmr.core.domain.reference.CountryRepository
package net.sf.pmr.core.domain.reference;

import de.abstrakt.mock.MockCore;

public class MockCountryRepository implements net.sf.pmr.core.domain.reference.CountryRepository, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.core.domain.reference.MockCountryRepository.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.reference.MockCountryRepository",null);
        return this;
    }

    public net.sf.pmr.core.domain.reference.MockCountryRepository.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.reference.MockCountryRepository",th);
        return this;
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


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.reference.MockCountryRepository"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.reference.CountryRepository";
}
    public MockCountryRepository()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.core.domain.reference.MockCountryRepository",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.core.domain.reference.MockCountryRepository.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.core.domain.reference.MockCountryRepository",params);
        return new net.sf.pmr.core.domain.reference.MockCountryRepository.PreMock(id);
    }

    public static net.sf.pmr.core.domain.reference.MockCountryRepository.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.reference.MockCountryRepository",null);
        return new net.sf.pmr.core.domain.reference.MockCountryRepository.PreMock(id);
    }

    public static net.sf.pmr.core.domain.reference.MockCountryRepository.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.reference.MockCountryRepository",th);
        return new net.sf.pmr.core.domain.reference.MockCountryRepository.PreMock(id);
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


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.reference.MockCountryRepository"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.reference.CountryRepository";
}
