// MockCreator v2.9.0 build 3065; HashCode:380087154; net.sf.pmr.core.domain.user.company.CompanyRepositoryImpl
package net.sf.pmr.core.domain.user.company;

import de.abstrakt.mock.MockCore;

public class MockCompanyRepositoryImpl extends net.sf.pmr.core.domain.user.company.CompanyRepositoryImpl implements de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl.PreMock expectCtor(net.sf.pmr.core.data.user.company.CompanyMapper p0_CompanyMapper)
    {
        java.util.List params = new java.util.ArrayList();
        params.add(p0_CompanyMapper);
        id = MockCore.addExpectedCtor(__id(),"net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl",params);
        return this;
    }

    public net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl",null);
        return this;
    }

    public net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl",th);
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
public void delegateAddOrUpdate()
{
    MockCore.setDelegate(getClassObjectMethodSignature("addOrUpdate(Company)"));
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
public void delegateFindById()
{
    MockCore.setDelegate(getClassObjectMethodSignature("findById(int)"));
}

    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.user.company.CompanyRepositoryImpl";
}
    public MockCompanyRepositoryImpl(net.sf.pmr.core.data.user.company.CompanyMapper p0_CompanyMapper)
    {
        super(p0_CompanyMapper);
        java.util.List params = new java.util.ArrayList();
        params.add(p0_CompanyMapper);
        Object idex = MockCore.generateId("net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl",params);
        if( idex instanceof Throwable )
        {
        if( idex instanceof RuntimeException ) throw (RuntimeException)idex;
        throw new RuntimeException(((Throwable)idex).getMessage());
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public MockCompanyRepositoryImpl()
    {
        super((net.sf.pmr.core.data.user.company.CompanyMapper)null);
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl",params);
        if( idex instanceof Throwable )
        {
        if( idex instanceof RuntimeException ) throw (RuntimeException)idex;
        throw new RuntimeException(((Throwable)idex).getMessage());
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl",params);
        return new net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl.PreMock(id);
    }

    public static net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl.PreMock expectCtor(net.sf.pmr.core.data.user.company.CompanyMapper p0_CompanyMapper)
    {
        java.util.List params = new java.util.ArrayList();
        params.add(p0_CompanyMapper);
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl",params);
        return new net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl.PreMock(id);
    }

    public static net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl",null);
        return new net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl.PreMock(id);
    }

    public static net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl",th);
        return new net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl.PreMock(id);
    }

    public void addOrUpdate(net.sf.pmr.core.domain.user.company.Company p0_Company)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        if( MockCore.isDelegate(getClassObjectMethodSignature("addOrUpdate(Company)")) )
        {
                        super.addOrUpdate(p0_Company);
            return;
        }
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
public void delegateAddOrUpdate()
{
    MockCore.setDelegate(getClassObjectMethodSignature("addOrUpdate(Company)"));
}

    public net.sf.pmr.core.domain.user.company.Company findById(int p0_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        if( MockCore.isDelegate(getClassObjectMethodSignature("findById(int)")) )
        {
            return             super.findById(p0_int);
            
        }
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
public void delegateFindById()
{
    MockCore.setDelegate(getClassObjectMethodSignature("findById(int)"));
}

    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.core.domain.user.company.MockCompanyRepositoryImpl"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.core.domain.user.company.CompanyRepositoryImpl";
}
