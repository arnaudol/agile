// MockCreator v2.9.0 build 3065; HashCode:563317526; net.sf.pmr.agilePlanning.data.story.StoryMapper
package net.sf.pmr.agilePlanning.data.story;

import net.sf.pmr.agilePlanning.data.story.StoryMapper;
import de.abstrakt.mock.MockCore;

public class MockStoryMapper implements net.sf.pmr.agilePlanning.data.story.StoryMapper, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.agilePlanning.data.story.MockStoryMapper.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.agilePlanning.data.story.MockStoryMapper",null);
        return this;
    }

    public net.sf.pmr.agilePlanning.data.story.MockStoryMapper.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.agilePlanning.data.story.MockStoryMapper",th);
        return this;
    }

public void expectFindByProjectPersistanceId(int p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params, valueToReturn );
}
public void expectFindByProjectPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,toThrow );
}
public void acceptFindByProjectPersistanceId(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByProjectPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,toThrow );
}
public void setFindByProjectPersistanceIdDummy(java.util.Set toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceId(int)"),null,toReturn);
}
public void setFindByProjectPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceId(int)"),null,toThrow);
}
public void setFindByProjectPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,toThrow);
}
public void setFindByProjectPersistanceIdDummy(int p0_int,java.util.Set toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,toReturn);
}
public void acceptFindByProjectPersistanceIdDummy(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByProjectPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,valueToThrow);
}


public void expectFindByReleasePersistanceId(int p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByReleasePersistanceId(int)"),params, valueToReturn );
}
public void expectFindByReleasePersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByReleasePersistanceId(int)"),params,toThrow );
}
public void acceptFindByReleasePersistanceId(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByReleasePersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByReleasePersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByReleasePersistanceId(int)"),params,toThrow );
}
public void setFindByReleasePersistanceIdDummy(java.util.Set toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findByReleasePersistanceId(int)"),null,toReturn);
}
public void setFindByReleasePersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findByReleasePersistanceId(int)"),null,toThrow);
}
public void setFindByReleasePersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByReleasePersistanceId(int)"),params,toThrow);
}
public void setFindByReleasePersistanceIdDummy(int p0_int,java.util.Set toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByReleasePersistanceId(int)"),params,toReturn);
}
public void acceptFindByReleasePersistanceIdDummy(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findByReleasePersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByReleasePersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findByReleasePersistanceId(int)"),params,valueToThrow);
}


public void expectFindByIterationPersistanceId(int p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByIterationPersistanceId(int)"),params, valueToReturn );
}
public void expectFindByIterationPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByIterationPersistanceId(int)"),params,toThrow );
}
public void acceptFindByIterationPersistanceId(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByIterationPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByIterationPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByIterationPersistanceId(int)"),params,toThrow );
}
public void setFindByIterationPersistanceIdDummy(java.util.Set toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findByIterationPersistanceId(int)"),null,toReturn);
}
public void setFindByIterationPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findByIterationPersistanceId(int)"),null,toThrow);
}
public void setFindByIterationPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByIterationPersistanceId(int)"),params,toThrow);
}
public void setFindByIterationPersistanceIdDummy(int p0_int,java.util.Set toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByIterationPersistanceId(int)"),params,toReturn);
}
public void acceptFindByIterationPersistanceIdDummy(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findByIterationPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByIterationPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findByIterationPersistanceId(int)"),params,valueToThrow);
}


public void expectFindStoriesWhichAreNotInARelease(int p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findStoriesWhichAreNotInARelease(int)"),params, valueToReturn );
}
public void expectFindStoriesWhichAreNotInARelease(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findStoriesWhichAreNotInARelease(int)"),params,toThrow );
}
public void acceptFindStoriesWhichAreNotInARelease(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findStoriesWhichAreNotInARelease(int)"),params, valueToReturn );
}
public void acceptFindStoriesWhichAreNotInARelease(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findStoriesWhichAreNotInARelease(int)"),params,toThrow );
}
public void setFindStoriesWhichAreNotInAReleaseDummy(java.util.Set toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findStoriesWhichAreNotInARelease(int)"),null,toReturn);
}
public void setFindStoriesWhichAreNotInAReleaseDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findStoriesWhichAreNotInARelease(int)"),null,toThrow);
}
public void setFindStoriesWhichAreNotInAReleaseDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findStoriesWhichAreNotInARelease(int)"),params,toThrow);
}
public void setFindStoriesWhichAreNotInAReleaseDummy(int p0_int,java.util.Set toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findStoriesWhichAreNotInARelease(int)"),params,toReturn);
}
public void acceptFindStoriesWhichAreNotInAReleaseDummy(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findStoriesWhichAreNotInARelease(int)"),params, valueToReturn );
}
public void acceptFindStoriesWhichAreNotInAReleaseDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findStoriesWhichAreNotInARelease(int)"),params,valueToThrow);
}


public void expectFindAvailableStoriesToAddForAnIteration(int p0_int, int p1_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findAvailableStoriesToAddForAnIteration(int,int)"),params, valueToReturn );
}
public void expectFindAvailableStoriesToAddForAnIteration(int p0_int, int p1_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findAvailableStoriesToAddForAnIteration(int,int)"),params,toThrow );
}
public void acceptFindAvailableStoriesToAddForAnIteration(Object p0_int, Object p1_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findAvailableStoriesToAddForAnIteration(int,int)"),params, valueToReturn );
}
public void acceptFindAvailableStoriesToAddForAnIteration(Object p0_int, Object p1_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findAvailableStoriesToAddForAnIteration(int,int)"),params,toThrow );
}
public void setFindAvailableStoriesToAddForAnIterationDummy(java.util.Set toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findAvailableStoriesToAddForAnIteration(int,int)"),null,toReturn);
}
public void setFindAvailableStoriesToAddForAnIterationDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findAvailableStoriesToAddForAnIteration(int,int)"),null,toThrow);
}
public void setFindAvailableStoriesToAddForAnIterationDummy(int p0_int, int p1_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.setDummy( getClassObjectMethodSignature("findAvailableStoriesToAddForAnIteration(int,int)"),params,toThrow);
}
public void setFindAvailableStoriesToAddForAnIterationDummy(int p0_int, int p1_int,java.util.Set toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.setDummy( getClassObjectMethodSignature("findAvailableStoriesToAddForAnIteration(int,int)"),params,toReturn);
}
public void acceptFindAvailableStoriesToAddForAnIterationDummy(Object p0_int, Object p1_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.setDummy( getClassObjectMethodSignature("findAvailableStoriesToAddForAnIteration(int,int)"),params, valueToReturn );
}
public void acceptFindAvailableStoriesToAddForAnIterationDummy(Object p0_int, Object p1_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.setDummy(getClassObjectMethodSignature("findAvailableStoriesToAddForAnIteration(int,int)"),params,valueToThrow);
}


public void expectAddOrUpdate(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params );
}
public void expectAddOrUpdate(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params,toThrow );
}
public void acceptAddOrUpdate(Object p0_DomainObject)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params );
}
public void acceptAddOrUpdate(Object p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params,toThrow );
}
public void setAddOrUpdateDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(DomainObject)"),null,null);
}
public void setAddOrUpdateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(DomainObject)"),null,toThrow);
}
public void setAddOrUpdateDummy(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params,toThrow);
}


public void acceptAddOrUpdateDummy(Object p0_DomainObject, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params,valueToThrow);
}


public void expectDelete(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(DomainObject)"),params );
}
public void expectDelete(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(DomainObject)"),params,toThrow );
}
public void acceptDelete(Object p0_DomainObject)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(DomainObject)"),params );
}
public void acceptDelete(Object p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(DomainObject)"),params,toThrow );
}
public void setDeleteDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("delete(DomainObject)"),null,null);
}
public void setDeleteDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("delete(DomainObject)"),null,toThrow);
}
public void setDeleteDummy(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.setDummy( getClassObjectMethodSignature("delete(DomainObject)"),params,toThrow);
}


public void acceptDeleteDummy(Object p0_DomainObject, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.setDummy(getClassObjectMethodSignature("delete(DomainObject)"),params,valueToThrow);
}


public void expectFindById(int p0_int, java.lang.Object valueToReturn)
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
public void acceptFindById(Object p0_int, java.lang.Object valueToReturn)
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
public void setFindByIdDummy(java.lang.Object toReturn)
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
public void setFindByIdDummy(int p0_int,java.lang.Object toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findById(int)"),params,toReturn);
}
public void acceptFindByIdDummy(Object p0_int, java.lang.Object valueToReturn)
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


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.agilePlanning.data.story.MockStoryMapper"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.agilePlanning.data.story.StoryMapper";
}
    public MockStoryMapper()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.agilePlanning.data.story.MockStoryMapper",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.agilePlanning.data.story.MockStoryMapper.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.agilePlanning.data.story.MockStoryMapper",params);
        return new net.sf.pmr.agilePlanning.data.story.MockStoryMapper.PreMock(id);
    }

    public static net.sf.pmr.agilePlanning.data.story.MockStoryMapper.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.agilePlanning.data.story.MockStoryMapper",null);
        return new net.sf.pmr.agilePlanning.data.story.MockStoryMapper.PreMock(id);
    }

    public static net.sf.pmr.agilePlanning.data.story.MockStoryMapper.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.agilePlanning.data.story.MockStoryMapper",th);
        return new net.sf.pmr.agilePlanning.data.story.MockStoryMapper.PreMock(id);
    }

    public java.util.Set findByProjectPersistanceId(int p0_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (java.util.Set)returnValue;
}
public void expectFindByProjectPersistanceId(int p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params, valueToReturn );
}
public void expectFindByProjectPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,toThrow );
}
public void acceptFindByProjectPersistanceId(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByProjectPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,toThrow );
}
public void setFindByProjectPersistanceIdDummy(java.util.Set toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceId(int)"),null,toReturn);
}
public void setFindByProjectPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceId(int)"),null,toThrow);
}
public void setFindByProjectPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,toThrow);
}
public void setFindByProjectPersistanceIdDummy(int p0_int,java.util.Set toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,toReturn);
}
public void acceptFindByProjectPersistanceIdDummy(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByProjectPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findByProjectPersistanceId(int)"),params,valueToThrow);
}


    public java.util.Set findByReleasePersistanceId(int p0_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("findByReleasePersistanceId(int)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (java.util.Set)returnValue;
}
public void expectFindByReleasePersistanceId(int p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByReleasePersistanceId(int)"),params, valueToReturn );
}
public void expectFindByReleasePersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByReleasePersistanceId(int)"),params,toThrow );
}
public void acceptFindByReleasePersistanceId(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByReleasePersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByReleasePersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByReleasePersistanceId(int)"),params,toThrow );
}
public void setFindByReleasePersistanceIdDummy(java.util.Set toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findByReleasePersistanceId(int)"),null,toReturn);
}
public void setFindByReleasePersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findByReleasePersistanceId(int)"),null,toThrow);
}
public void setFindByReleasePersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByReleasePersistanceId(int)"),params,toThrow);
}
public void setFindByReleasePersistanceIdDummy(int p0_int,java.util.Set toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByReleasePersistanceId(int)"),params,toReturn);
}
public void acceptFindByReleasePersistanceIdDummy(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findByReleasePersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByReleasePersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findByReleasePersistanceId(int)"),params,valueToThrow);
}


    public java.util.Set findByIterationPersistanceId(int p0_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("findByIterationPersistanceId(int)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (java.util.Set)returnValue;
}
public void expectFindByIterationPersistanceId(int p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByIterationPersistanceId(int)"),params, valueToReturn );
}
public void expectFindByIterationPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByIterationPersistanceId(int)"),params,toThrow );
}
public void acceptFindByIterationPersistanceId(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByIterationPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByIterationPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByIterationPersistanceId(int)"),params,toThrow );
}
public void setFindByIterationPersistanceIdDummy(java.util.Set toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findByIterationPersistanceId(int)"),null,toReturn);
}
public void setFindByIterationPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findByIterationPersistanceId(int)"),null,toThrow);
}
public void setFindByIterationPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByIterationPersistanceId(int)"),params,toThrow);
}
public void setFindByIterationPersistanceIdDummy(int p0_int,java.util.Set toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByIterationPersistanceId(int)"),params,toReturn);
}
public void acceptFindByIterationPersistanceIdDummy(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findByIterationPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByIterationPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findByIterationPersistanceId(int)"),params,valueToThrow);
}


    public java.util.Set findStoriesWhichAreNotInARelease(int p0_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("findStoriesWhichAreNotInARelease(int)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (java.util.Set)returnValue;
}
public void expectFindStoriesWhichAreNotInARelease(int p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findStoriesWhichAreNotInARelease(int)"),params, valueToReturn );
}
public void expectFindStoriesWhichAreNotInARelease(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findStoriesWhichAreNotInARelease(int)"),params,toThrow );
}
public void acceptFindStoriesWhichAreNotInARelease(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findStoriesWhichAreNotInARelease(int)"),params, valueToReturn );
}
public void acceptFindStoriesWhichAreNotInARelease(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findStoriesWhichAreNotInARelease(int)"),params,toThrow );
}
public void setFindStoriesWhichAreNotInAReleaseDummy(java.util.Set toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findStoriesWhichAreNotInARelease(int)"),null,toReturn);
}
public void setFindStoriesWhichAreNotInAReleaseDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findStoriesWhichAreNotInARelease(int)"),null,toThrow);
}
public void setFindStoriesWhichAreNotInAReleaseDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findStoriesWhichAreNotInARelease(int)"),params,toThrow);
}
public void setFindStoriesWhichAreNotInAReleaseDummy(int p0_int,java.util.Set toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findStoriesWhichAreNotInARelease(int)"),params,toReturn);
}
public void acceptFindStoriesWhichAreNotInAReleaseDummy(Object p0_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findStoriesWhichAreNotInARelease(int)"),params, valueToReturn );
}
public void acceptFindStoriesWhichAreNotInAReleaseDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findStoriesWhichAreNotInARelease(int)"),params,valueToThrow);
}


    public java.util.Set findAvailableStoriesToAddForAnIteration(int p0_int, int p1_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("findAvailableStoriesToAddForAnIteration(int,int)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (java.util.Set)returnValue;
}
public void expectFindAvailableStoriesToAddForAnIteration(int p0_int, int p1_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findAvailableStoriesToAddForAnIteration(int,int)"),params, valueToReturn );
}
public void expectFindAvailableStoriesToAddForAnIteration(int p0_int, int p1_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findAvailableStoriesToAddForAnIteration(int,int)"),params,toThrow );
}
public void acceptFindAvailableStoriesToAddForAnIteration(Object p0_int, Object p1_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findAvailableStoriesToAddForAnIteration(int,int)"),params, valueToReturn );
}
public void acceptFindAvailableStoriesToAddForAnIteration(Object p0_int, Object p1_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findAvailableStoriesToAddForAnIteration(int,int)"),params,toThrow );
}
public void setFindAvailableStoriesToAddForAnIterationDummy(java.util.Set toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findAvailableStoriesToAddForAnIteration(int,int)"),null,toReturn);
}
public void setFindAvailableStoriesToAddForAnIterationDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findAvailableStoriesToAddForAnIteration(int,int)"),null,toThrow);
}
public void setFindAvailableStoriesToAddForAnIterationDummy(int p0_int, int p1_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.setDummy( getClassObjectMethodSignature("findAvailableStoriesToAddForAnIteration(int,int)"),params,toThrow);
}
public void setFindAvailableStoriesToAddForAnIterationDummy(int p0_int, int p1_int,java.util.Set toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));
        params.add(new Integer(p1_int));

    MockCore.setDummy( getClassObjectMethodSignature("findAvailableStoriesToAddForAnIteration(int,int)"),params,toReturn);
}
public void acceptFindAvailableStoriesToAddForAnIterationDummy(Object p0_int, Object p1_int, java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.setDummy( getClassObjectMethodSignature("findAvailableStoriesToAddForAnIteration(int,int)"),params, valueToReturn );
}
public void acceptFindAvailableStoriesToAddForAnIterationDummy(Object p0_int, Object p1_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);
params.add(p1_int);

    MockCore.setDummy(getClassObjectMethodSignature("findAvailableStoriesToAddForAnIteration(int,int)"),params,valueToThrow);
}


    public void addOrUpdate(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectAddOrUpdate(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params );
}
public void expectAddOrUpdate(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params,toThrow );
}
public void acceptAddOrUpdate(Object p0_DomainObject)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params );
}
public void acceptAddOrUpdate(Object p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params,toThrow );
}
public void setAddOrUpdateDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(DomainObject)"),null,null);
}
public void setAddOrUpdateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(DomainObject)"),null,toThrow);
}
public void setAddOrUpdateDummy(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params,toThrow);
}


public void acceptAddOrUpdateDummy(Object p0_DomainObject, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(DomainObject)"),params,valueToThrow);
}


    public void delete(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("delete(DomainObject)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectDelete(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(DomainObject)"),params );
}
public void expectDelete(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(DomainObject)"),params,toThrow );
}
public void acceptDelete(Object p0_DomainObject)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(DomainObject)"),params );
}
public void acceptDelete(Object p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(DomainObject)"),params,toThrow );
}
public void setDeleteDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("delete(DomainObject)"),null,null);
}
public void setDeleteDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("delete(DomainObject)"),null,toThrow);
}
public void setDeleteDummy(net.sf.pmr.keopsframework.domain.object.DomainObject p0_DomainObject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_DomainObject);

    MockCore.setDummy( getClassObjectMethodSignature("delete(DomainObject)"),params,toThrow);
}


public void acceptDeleteDummy(Object p0_DomainObject, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_DomainObject);

    MockCore.setDummy(getClassObjectMethodSignature("delete(DomainObject)"),params,valueToThrow);
}


    public java.lang.Object findById(int p0_int)
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
    return (java.lang.Object)returnValue;
}
public void expectFindById(int p0_int, java.lang.Object valueToReturn)
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
public void acceptFindById(Object p0_int, java.lang.Object valueToReturn)
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
public void setFindByIdDummy(java.lang.Object toReturn)
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
public void setFindByIdDummy(int p0_int,java.lang.Object toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findById(int)"),params,toReturn);
}
public void acceptFindByIdDummy(Object p0_int, java.lang.Object valueToReturn)
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


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.agilePlanning.data.story.MockStoryMapper"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.agilePlanning.data.story.StoryMapper";
}
