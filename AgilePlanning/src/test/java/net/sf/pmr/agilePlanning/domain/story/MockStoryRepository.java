// MockCreator v2.9.0 build 3065; HashCode:-820143186; net.sf.pmr.agilePlanning.domain.story.StoryRepository
package net.sf.pmr.agilePlanning.domain.story;

import de.abstrakt.mock.MockCore;

public class MockStoryRepository implements net.sf.pmr.agilePlanning.domain.story.StoryRepository, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.agilePlanning.domain.story.MockStoryRepository.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.agilePlanning.domain.story.MockStoryRepository",null);
        return this;
    }

    public net.sf.pmr.agilePlanning.domain.story.MockStoryRepository.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.agilePlanning.domain.story.MockStoryRepository",th);
        return this;
    }

public void expectFindByPersistanceId(int p0_int, net.sf.pmr.agilePlanning.domain.story.Story valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByPersistanceId(int)"),params, valueToReturn );
}
public void expectFindByPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toThrow );
}
public void acceptFindByPersistanceId(Object p0_int, net.sf.pmr.agilePlanning.domain.story.Story valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toThrow );
}
public void setFindByPersistanceIdDummy(net.sf.pmr.agilePlanning.domain.story.Story toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findByPersistanceId(int)"),null,toReturn);
}
public void setFindByPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findByPersistanceId(int)"),null,toThrow);
}
public void setFindByPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toThrow);
}
public void setFindByPersistanceIdDummy(int p0_int,net.sf.pmr.agilePlanning.domain.story.Story toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toReturn);
}
public void acceptFindByPersistanceIdDummy(Object p0_int, net.sf.pmr.agilePlanning.domain.story.Story valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findByPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findByPersistanceId(int)"),params,valueToThrow);
}


public void expectAddOrUpdate(net.sf.pmr.agilePlanning.domain.story.Story p0_Story)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Story);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Story)"),params );
}
public void expectAddOrUpdate(net.sf.pmr.agilePlanning.domain.story.Story p0_Story,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Story);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Story)"),params,toThrow );
}
public void acceptAddOrUpdate_Story(Object p0_Story)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Story);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Story)"),params );
}
public void acceptAddOrUpdate_Story(Object p0_Story,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Story);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Story)"),params,toThrow );
}
public void setAddOrUpdate_StoryDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Story)"),null,null);
}
public void setAddOrUpdate_StoryDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Story)"),null,toThrow);
}
public void setAddOrUpdateDummy(net.sf.pmr.agilePlanning.domain.story.Story p0_Story,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Story);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(Story)"),params,toThrow);
}


public void acceptAddOrUpdate_StoryDummy(Object p0_Story, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Story);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Story)"),params,valueToThrow);
}


public void expectAddOrUpdate(java.util.Set p0_Set)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Set)"),params );
}
public void expectAddOrUpdate(java.util.Set p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Set)"),params,toThrow );
}
public void acceptAddOrUpdate_Set(Object p0_Set)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Set)"),params );
}
public void acceptAddOrUpdate_Set(Object p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Set)"),params,toThrow );
}
public void setAddOrUpdate_SetDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Set)"),null,null);
}
public void setAddOrUpdate_SetDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Set)"),null,toThrow);
}
public void setAddOrUpdateDummy(java.util.Set p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(Set)"),params,toThrow);
}


public void acceptAddOrUpdate_SetDummy(Object p0_Set, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Set)"),params,valueToThrow);
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


public void expectFindTaskByPersistanceId(int p0_int, net.sf.pmr.agilePlanning.domain.story.task.Task valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findTaskByPersistanceId(int)"),params, valueToReturn );
}
public void expectFindTaskByPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findTaskByPersistanceId(int)"),params,toThrow );
}
public void acceptFindTaskByPersistanceId(Object p0_int, net.sf.pmr.agilePlanning.domain.story.task.Task valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findTaskByPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindTaskByPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findTaskByPersistanceId(int)"),params,toThrow );
}
public void setFindTaskByPersistanceIdDummy(net.sf.pmr.agilePlanning.domain.story.task.Task toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findTaskByPersistanceId(int)"),null,toReturn);
}
public void setFindTaskByPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findTaskByPersistanceId(int)"),null,toThrow);
}
public void setFindTaskByPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findTaskByPersistanceId(int)"),params,toThrow);
}
public void setFindTaskByPersistanceIdDummy(int p0_int,net.sf.pmr.agilePlanning.domain.story.task.Task toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findTaskByPersistanceId(int)"),params,toReturn);
}
public void acceptFindTaskByPersistanceIdDummy(Object p0_int, net.sf.pmr.agilePlanning.domain.story.task.Task valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findTaskByPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindTaskByPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findTaskByPersistanceId(int)"),params,valueToThrow);
}


public void expectFindChargeByPersistanceId(int p0_int, net.sf.pmr.agilePlanning.domain.story.task.charge.Charge valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findChargeByPersistanceId(int)"),params, valueToReturn );
}
public void expectFindChargeByPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findChargeByPersistanceId(int)"),params,toThrow );
}
public void acceptFindChargeByPersistanceId(Object p0_int, net.sf.pmr.agilePlanning.domain.story.task.charge.Charge valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findChargeByPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindChargeByPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findChargeByPersistanceId(int)"),params,toThrow );
}
public void setFindChargeByPersistanceIdDummy(net.sf.pmr.agilePlanning.domain.story.task.charge.Charge toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findChargeByPersistanceId(int)"),null,toReturn);
}
public void setFindChargeByPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findChargeByPersistanceId(int)"),null,toThrow);
}
public void setFindChargeByPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findChargeByPersistanceId(int)"),params,toThrow);
}
public void setFindChargeByPersistanceIdDummy(int p0_int,net.sf.pmr.agilePlanning.domain.story.task.charge.Charge toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findChargeByPersistanceId(int)"),params,toReturn);
}
public void acceptFindChargeByPersistanceIdDummy(Object p0_int, net.sf.pmr.agilePlanning.domain.story.task.charge.Charge valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findChargeByPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindChargeByPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findChargeByPersistanceId(int)"),params,valueToThrow);
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


public void expectDelete(net.sf.pmr.agilePlanning.domain.story.Story p0_Story)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Story);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(Story)"),params );
}
public void expectDelete(net.sf.pmr.agilePlanning.domain.story.Story p0_Story,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Story);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(Story)"),params,toThrow );
}
public void acceptDelete(Object p0_Story)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Story);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(Story)"),params );
}
public void acceptDelete(Object p0_Story,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Story);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(Story)"),params,toThrow );
}
public void setDeleteDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("delete(Story)"),null,null);
}
public void setDeleteDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("delete(Story)"),null,toThrow);
}
public void setDeleteDummy(net.sf.pmr.agilePlanning.domain.story.Story p0_Story,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Story);

    MockCore.setDummy( getClassObjectMethodSignature("delete(Story)"),params,toThrow);
}


public void acceptDeleteDummy(Object p0_Story, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Story);

    MockCore.setDummy(getClassObjectMethodSignature("delete(Story)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.agilePlanning.domain.story.MockStoryRepository"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.agilePlanning.domain.story.StoryRepository";
}
    public MockStoryRepository()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.agilePlanning.domain.story.MockStoryRepository",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.agilePlanning.domain.story.MockStoryRepository.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.agilePlanning.domain.story.MockStoryRepository",params);
        return new net.sf.pmr.agilePlanning.domain.story.MockStoryRepository.PreMock(id);
    }

    public static net.sf.pmr.agilePlanning.domain.story.MockStoryRepository.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.agilePlanning.domain.story.MockStoryRepository",null);
        return new net.sf.pmr.agilePlanning.domain.story.MockStoryRepository.PreMock(id);
    }

    public static net.sf.pmr.agilePlanning.domain.story.MockStoryRepository.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.agilePlanning.domain.story.MockStoryRepository",th);
        return new net.sf.pmr.agilePlanning.domain.story.MockStoryRepository.PreMock(id);
    }

    public net.sf.pmr.agilePlanning.domain.story.Story findByPersistanceId(int p0_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("findByPersistanceId(int)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (net.sf.pmr.agilePlanning.domain.story.Story)returnValue;
}
public void expectFindByPersistanceId(int p0_int, net.sf.pmr.agilePlanning.domain.story.Story valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByPersistanceId(int)"),params, valueToReturn );
}
public void expectFindByPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toThrow );
}
public void acceptFindByPersistanceId(Object p0_int, net.sf.pmr.agilePlanning.domain.story.Story valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toThrow );
}
public void setFindByPersistanceIdDummy(net.sf.pmr.agilePlanning.domain.story.Story toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findByPersistanceId(int)"),null,toReturn);
}
public void setFindByPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findByPersistanceId(int)"),null,toThrow);
}
public void setFindByPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toThrow);
}
public void setFindByPersistanceIdDummy(int p0_int,net.sf.pmr.agilePlanning.domain.story.Story toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findByPersistanceId(int)"),params,toReturn);
}
public void acceptFindByPersistanceIdDummy(Object p0_int, net.sf.pmr.agilePlanning.domain.story.Story valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findByPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindByPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findByPersistanceId(int)"),params,valueToThrow);
}


    public void addOrUpdate(net.sf.pmr.agilePlanning.domain.story.Story p0_Story)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Story);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("addOrUpdate(Story)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectAddOrUpdate(net.sf.pmr.agilePlanning.domain.story.Story p0_Story)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Story);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Story)"),params );
}
public void expectAddOrUpdate(net.sf.pmr.agilePlanning.domain.story.Story p0_Story,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Story);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Story)"),params,toThrow );
}
public void acceptAddOrUpdate_Story(Object p0_Story)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Story);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Story)"),params );
}
public void acceptAddOrUpdate_Story(Object p0_Story,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Story);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Story)"),params,toThrow );
}
public void setAddOrUpdate_StoryDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Story)"),null,null);
}
public void setAddOrUpdate_StoryDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Story)"),null,toThrow);
}
public void setAddOrUpdateDummy(net.sf.pmr.agilePlanning.domain.story.Story p0_Story,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Story);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(Story)"),params,toThrow);
}


public void acceptAddOrUpdate_StoryDummy(Object p0_Story, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Story);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Story)"),params,valueToThrow);
}


    public void addOrUpdate(java.util.Set p0_Set)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("addOrUpdate(Set)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectAddOrUpdate(java.util.Set p0_Set)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Set)"),params );
}
public void expectAddOrUpdate(java.util.Set p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Set)"),params,toThrow );
}
public void acceptAddOrUpdate_Set(Object p0_Set)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Set)"),params );
}
public void acceptAddOrUpdate_Set(Object p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addOrUpdate(Set)"),params,toThrow );
}
public void setAddOrUpdate_SetDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Set)"),null,null);
}
public void setAddOrUpdate_SetDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Set)"),null,toThrow);
}
public void setAddOrUpdateDummy(java.util.Set p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.setDummy( getClassObjectMethodSignature("addOrUpdate(Set)"),params,toThrow);
}


public void acceptAddOrUpdate_SetDummy(Object p0_Set, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.setDummy(getClassObjectMethodSignature("addOrUpdate(Set)"),params,valueToThrow);
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


    public net.sf.pmr.agilePlanning.domain.story.task.Task findTaskByPersistanceId(int p0_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("findTaskByPersistanceId(int)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (net.sf.pmr.agilePlanning.domain.story.task.Task)returnValue;
}
public void expectFindTaskByPersistanceId(int p0_int, net.sf.pmr.agilePlanning.domain.story.task.Task valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findTaskByPersistanceId(int)"),params, valueToReturn );
}
public void expectFindTaskByPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findTaskByPersistanceId(int)"),params,toThrow );
}
public void acceptFindTaskByPersistanceId(Object p0_int, net.sf.pmr.agilePlanning.domain.story.task.Task valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findTaskByPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindTaskByPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findTaskByPersistanceId(int)"),params,toThrow );
}
public void setFindTaskByPersistanceIdDummy(net.sf.pmr.agilePlanning.domain.story.task.Task toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findTaskByPersistanceId(int)"),null,toReturn);
}
public void setFindTaskByPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findTaskByPersistanceId(int)"),null,toThrow);
}
public void setFindTaskByPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findTaskByPersistanceId(int)"),params,toThrow);
}
public void setFindTaskByPersistanceIdDummy(int p0_int,net.sf.pmr.agilePlanning.domain.story.task.Task toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findTaskByPersistanceId(int)"),params,toReturn);
}
public void acceptFindTaskByPersistanceIdDummy(Object p0_int, net.sf.pmr.agilePlanning.domain.story.task.Task valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findTaskByPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindTaskByPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findTaskByPersistanceId(int)"),params,valueToThrow);
}


    public net.sf.pmr.agilePlanning.domain.story.task.charge.Charge findChargeByPersistanceId(int p0_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("findChargeByPersistanceId(int)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (net.sf.pmr.agilePlanning.domain.story.task.charge.Charge)returnValue;
}
public void expectFindChargeByPersistanceId(int p0_int, net.sf.pmr.agilePlanning.domain.story.task.charge.Charge valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findChargeByPersistanceId(int)"),params, valueToReturn );
}
public void expectFindChargeByPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findChargeByPersistanceId(int)"),params,toThrow );
}
public void acceptFindChargeByPersistanceId(Object p0_int, net.sf.pmr.agilePlanning.domain.story.task.charge.Charge valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findChargeByPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindChargeByPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("findChargeByPersistanceId(int)"),params,toThrow );
}
public void setFindChargeByPersistanceIdDummy(net.sf.pmr.agilePlanning.domain.story.task.charge.Charge toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("findChargeByPersistanceId(int)"),null,toReturn);
}
public void setFindChargeByPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("findChargeByPersistanceId(int)"),null,toThrow);
}
public void setFindChargeByPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findChargeByPersistanceId(int)"),params,toThrow);
}
public void setFindChargeByPersistanceIdDummy(int p0_int,net.sf.pmr.agilePlanning.domain.story.task.charge.Charge toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("findChargeByPersistanceId(int)"),params,toReturn);
}
public void acceptFindChargeByPersistanceIdDummy(Object p0_int, net.sf.pmr.agilePlanning.domain.story.task.charge.Charge valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy( getClassObjectMethodSignature("findChargeByPersistanceId(int)"),params, valueToReturn );
}
public void acceptFindChargeByPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("findChargeByPersistanceId(int)"),params,valueToThrow);
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


    public void delete(net.sf.pmr.agilePlanning.domain.story.Story p0_Story)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Story);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("delete(Story)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectDelete(net.sf.pmr.agilePlanning.domain.story.Story p0_Story)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Story);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(Story)"),params );
}
public void expectDelete(net.sf.pmr.agilePlanning.domain.story.Story p0_Story,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Story);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(Story)"),params,toThrow );
}
public void acceptDelete(Object p0_Story)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Story);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(Story)"),params );
}
public void acceptDelete(Object p0_Story,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Story);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("delete(Story)"),params,toThrow );
}
public void setDeleteDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("delete(Story)"),null,null);
}
public void setDeleteDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("delete(Story)"),null,toThrow);
}
public void setDeleteDummy(net.sf.pmr.agilePlanning.domain.story.Story p0_Story,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Story);

    MockCore.setDummy( getClassObjectMethodSignature("delete(Story)"),params,toThrow);
}


public void acceptDeleteDummy(Object p0_Story, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Story);

    MockCore.setDummy(getClassObjectMethodSignature("delete(Story)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.agilePlanning.domain.story.MockStoryRepository"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.agilePlanning.domain.story.StoryRepository";
}
