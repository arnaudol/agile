// MockCreator v2.9.0 build 3065; HashCode:220691098; net.sf.pmr.core.domain.user.company.CompanyRepository
package net.sf.pmr.core.domain.user.company;

import de.abstrakt.mock.MockCore;

public class MockCompanyRepository implements net.sf.pmr.core.domain.user.company.CompanyRepository, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.core.domain.user.company.MockCompanyRepository.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.user.company.MockCompanyRepository",null);
        return this;
    }

    public net.sf.pmr.core.domain.user.company.MockCompanyRepository.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.user.company.MockCompanyRepository",th);
        return this;
    }

public void expectAddOrUpdate(net.sf.pmr.core.domain.user.company.Company p0_Company)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Company);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Company)"),params );
}
public void expectAddOrUpdate(net.sf.pmr.core.domain.user.company.Company p0_Company,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Company);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Company)"),params,toThrow );
}
public void acceptAddOrUpdate(Object p0_Company)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Company);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Company)"),params );
}
public void acceptAddOrUpdate(Object p0_Company,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Company);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Company)"),params,toThrow );
}
public void setAddOrUpdateDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Company)"),null,null);
}
public void setAddOrUpdateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Company)"),null,toThrow);
}
public void setAddOrUpdateDummy(net.sf.pmr.core.domain.user.company.Company p0_Company,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Company);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(Company)"),params,toThrow);
}


public void acceptAddOrUpdateDummy(Object p0_Company, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Company);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Company)"),params,valueToThrow);
}


public void expectFindById(int p0_int, net.sf.pmr.core.domain.user.company.Company valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findById(int)"),params, valueToReturn );
}
public void expectFindById(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findById(int)"),params,toThrow );
}
public void acceptFindById(Object p0_int, net.sf.pmr.core.domain.user.company.Company valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findById(int)"),params, valueToReturn );
}
public void acceptFindById(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findById(int)"),params,toThrow );
}
public void setFindByIdDummy(net.sf.pmr.core.domain.user.company.Company toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findById(int)"),null,toReturn);
}
public void setFindByIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findById(int)"),null,toThrow);
}
public void setFindByIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findById(int)"),params,toThrow);
}
public void setFindByIdDummy(int p0_int,net.sf.pmr.core.domain.user.company.Company toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findById(int)"),params,toReturn);
}
public void acceptFindByIdDummy(Object p0_int, net.sf.pmr.core.domain.user.company.Company valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findById(int)"),params, valueToReturn );
}
public void acceptFindByIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findById(int)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.user.company.MockCompanyRepository"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.user.company.CompanyRepository";
}
    public MockCompanyRepository()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.core.domain.user.company.MockCompanyRepository",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.core.domain.user.company.MockCompanyRepository.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.core.domain.user.company.MockCompanyRepository",params);
        return new net.sf.pmr.core.domain.user.company.MockCompanyRepository.PreMock(id);
    }

    public static net.sf.pmr.core.domain.user.company.MockCompanyRepository.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.user.company.MockCompanyRepository",null);
        return new net.sf.pmr.core.domain.user.company.MockCompanyRepository.PreMock(id);
    }

    public static net.sf.pmr.core.domain.user.company.MockCompanyRepository.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.user.company.MockCompanyRepository",th);
        return new net.sf.pmr.core.domain.user.company.MockCompanyRepository.PreMock(id);
    }

    public void addOrUpdate(net.sf.pmr.core.domain.user.company.Company p0_Company)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Company);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("addOrUpdate(Company)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectAddOrUpdate(net.sf.pmr.core.domain.user.company.Company p0_Company)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Company);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Company)"),params );
}
public void expectAddOrUpdate(net.sf.pmr.core.domain.user.company.Company p0_Company,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Company);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Company)"),params,toThrow );
}
public void acceptAddOrUpdate(Object p0_Company)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Company);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Company)"),params );
}
public void acceptAddOrUpdate(Object p0_Company,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Company);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Company)"),params,toThrow );
}
public void setAddOrUpdateDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Company)"),null,null);
}
public void setAddOrUpdateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Company)"),null,toThrow);
}
public void setAddOrUpdateDummy(net.sf.pmr.core.domain.user.company.Company p0_Company,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Company);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(Company)"),params,toThrow);
}


public void acceptAddOrUpdateDummy(Object p0_Company, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Company);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Company)"),params,valueToThrow);
}


    public net.sf.pmr.core.domain.user.company.Company findById(int p0_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("findById(int)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (net.sf.pmr.core.domain.user.company.Company)returnValue;
}
public void expectFindById(int p0_int, net.sf.pmr.core.domain.user.company.Company valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findById(int)"),params, valueToReturn );
}
public void expectFindById(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findById(int)"),params,toThrow );
}
public void acceptFindById(Object p0_int, net.sf.pmr.core.domain.user.company.Company valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findById(int)"),params, valueToReturn );
}
public void acceptFindById(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findById(int)"),params,toThrow );
}
public void setFindByIdDummy(net.sf.pmr.core.domain.user.company.Company toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findById(int)"),null,toReturn);
}
public void setFindByIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findById(int)"),null,toThrow);
}
public void setFindByIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findById(int)"),params,toThrow);
}
public void setFindByIdDummy(int p0_int,net.sf.pmr.core.domain.user.company.Company toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findById(int)"),params,toReturn);
}
public void acceptFindByIdDummy(Object p0_int, net.sf.pmr.core.domain.user.company.Company valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findById(int)"),params, valueToReturn );
}
public void acceptFindByIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findById(int)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.user.company.MockCompanyRepository"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.user.company.CompanyRepository";
}
