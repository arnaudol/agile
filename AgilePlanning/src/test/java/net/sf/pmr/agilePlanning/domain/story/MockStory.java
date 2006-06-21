// MockCreator v2.9.0 build 3065; HashCode:1179965240; net.sf.pmr.agilePlanning.domain.story.Story
package net.sf.pmr.agilePlanning.domain.story;

import de.abstrakt.mock.MockCore;

public class MockStory implements net.sf.pmr.agilePlanning.domain.story.Story, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.agilePlanning.domain.story.MockStory.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.agilePlanning.domain.story.MockStory",null);
        return this;
    }

    public net.sf.pmr.agilePlanning.domain.story.MockStory.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.agilePlanning.domain.story.MockStory",th);
        return this;
    }

public void expectWarning(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("warning()"),params, new Boolean(valueToReturn) );
}
public void expectWarning(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("warning()"),params,toThrow );
}
public void acceptWarning(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("warning()"),params, new Boolean(valueToReturn) );
}
public void acceptWarning(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("warning()"),params,toThrow );
}
public void setWarningDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("warning()"),null,new Boolean(toReturn));
}
public void setWarningDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("warning()"),null,toThrow);
}



public void acceptWarningDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("warning()"),params,valueToThrow);
}


public void expectGetDescription(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getDescription()"),params, valueToReturn );
}
public void expectGetDescription(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getDescription()"),params,toThrow );
}
public void acceptGetDescription(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getDescription()"),params, valueToReturn );
}
public void acceptGetDescription(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getDescription()"),params,toThrow );
}
public void setGetDescriptionDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getDescription()"),null,toReturn);
}
public void setGetDescriptionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getDescription()"),null,toThrow);
}



public void acceptGetDescriptionDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getDescription()"),params,valueToThrow);
}


public void expectSetDescription(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDescription(String)"),params );
}
public void expectSetDescription(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDescription(String)"),params,toThrow );
}
public void acceptSetDescription(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDescription(String)"),params );
}
public void acceptSetDescription(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDescription(String)"),params,toThrow );
}
public void setSetDescriptionDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setDescription(String)"),null,null);
}
public void setSetDescriptionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setDescription(String)"),null,toThrow);
}
public void setSetDescriptionDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("setDescription(String)"),params,toThrow);
}


public void acceptSetDescriptionDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("setDescription(String)"),params,valueToThrow);
}


public void expectIsLeft(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isLeft()"),params, new Boolean(valueToReturn) );
}
public void expectIsLeft(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isLeft()"),params,toThrow );
}
public void acceptIsLeft(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isLeft()"),params, new Boolean(valueToReturn) );
}
public void acceptIsLeft(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isLeft()"),params,toThrow );
}
public void setIsLeftDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("isLeft()"),null,new Boolean(toReturn));
}
public void setIsLeftDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("isLeft()"),null,toThrow);
}



public void acceptIsLeftDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("isLeft()"),params,valueToThrow);
}


public void expectSetShortDescription(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setShortDescription(String)"),params );
}
public void expectSetShortDescription(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setShortDescription(String)"),params,toThrow );
}
public void acceptSetShortDescription(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setShortDescription(String)"),params );
}
public void acceptSetShortDescription(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setShortDescription(String)"),params,toThrow );
}
public void setSetShortDescriptionDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setShortDescription(String)"),null,null);
}
public void setSetShortDescriptionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setShortDescription(String)"),null,toThrow);
}
public void setSetShortDescriptionDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("setShortDescription(String)"),params,toThrow);
}


public void acceptSetShortDescriptionDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("setShortDescription(String)"),params,valueToThrow);
}


public void expectGetShortDescription(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getShortDescription()"),params, valueToReturn );
}
public void expectGetShortDescription(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getShortDescription()"),params,toThrow );
}
public void acceptGetShortDescription(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getShortDescription()"),params, valueToReturn );
}
public void acceptGetShortDescription(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getShortDescription()"),params,toThrow );
}
public void setGetShortDescriptionDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getShortDescription()"),null,toReturn);
}
public void setGetShortDescriptionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getShortDescription()"),null,toThrow);
}



public void acceptGetShortDescriptionDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getShortDescription()"),params,valueToThrow);
}


public void expectGetTasks(java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTasks()"),params, valueToReturn );
}
public void expectGetTasks(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTasks()"),params,toThrow );
}
public void acceptGetTasks(java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTasks()"),params, valueToReturn );
}
public void acceptGetTasks(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTasks()"),params,toThrow );
}
public void setGetTasksDummy(java.util.Set toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getTasks()"),null,toReturn);
}
public void setGetTasksDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getTasks()"),null,toThrow);
}



public void acceptGetTasksDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getTasks()"),params,valueToThrow);
}


public void expectSetTasks(java.util.Set p0_Set)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setTasks(Set)"),params );
}
public void expectSetTasks(java.util.Set p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setTasks(Set)"),params,toThrow );
}
public void acceptSetTasks(Object p0_Set)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setTasks(Set)"),params );
}
public void acceptSetTasks(Object p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setTasks(Set)"),params,toThrow );
}
public void setSetTasksDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setTasks(Set)"),null,null);
}
public void setSetTasksDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setTasks(Set)"),null,toThrow);
}
public void setSetTasksDummy(java.util.Set p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.setDummy( getClassObjectMethodSignature("setTasks(Set)"),params,toThrow);
}


public void acceptSetTasksDummy(Object p0_Set, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.setDummy(getClassObjectMethodSignature("setTasks(Set)"),params,valueToThrow);
}


public void expectGetDaysEstimated(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getDaysEstimated()"),params, new Double(valueToReturn) );
}
public void expectGetDaysEstimated(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getDaysEstimated()"),params,toThrow );
}
public void acceptGetDaysEstimated(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getDaysEstimated()"),params, new Double(valueToReturn) );
}
public void acceptGetDaysEstimated(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getDaysEstimated()"),params,toThrow );
}
public void setGetDaysEstimatedDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getDaysEstimated()"),null,new Double(toReturn));
}
public void setGetDaysEstimatedDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getDaysEstimated()"),null,toThrow);
}



public void acceptGetDaysEstimatedDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getDaysEstimated()"),params,valueToThrow);
}


public void expectSetDaysEstimated(double p0_double)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Double(p0_double));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDaysEstimated(double)"),params );
}
public void expectSetDaysEstimated(double p0_double,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Double(p0_double));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDaysEstimated(double)"),params,toThrow );
}
public void acceptSetDaysEstimated(Object p0_double)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_double);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDaysEstimated(double)"),params );
}
public void acceptSetDaysEstimated(Object p0_double,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_double);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDaysEstimated(double)"),params,toThrow );
}
public void setSetDaysEstimatedDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setDaysEstimated(double)"),null,null);
}
public void setSetDaysEstimatedDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setDaysEstimated(double)"),null,toThrow);
}
public void setSetDaysEstimatedDummy(double p0_double,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Double(p0_double));

    MockCore.setDummy( getClassObjectMethodSignature("setDaysEstimated(double)"),params,toThrow);
}


public void acceptSetDaysEstimatedDummy(Object p0_double, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_double);

    MockCore.setDummy(getClassObjectMethodSignature("setDaysEstimated(double)"),params,valueToThrow);
}


public void expectGetIteration(net.sf.pmr.agilePlanning.domain.iteration.Iteration valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getIteration()"),params, valueToReturn );
}
public void expectGetIteration(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getIteration()"),params,toThrow );
}
public void acceptGetIteration(net.sf.pmr.agilePlanning.domain.iteration.Iteration valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getIteration()"),params, valueToReturn );
}
public void acceptGetIteration(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getIteration()"),params,toThrow );
}
public void setGetIterationDummy(net.sf.pmr.agilePlanning.domain.iteration.Iteration toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getIteration()"),null,toReturn);
}
public void setGetIterationDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getIteration()"),null,toThrow);
}



public void acceptGetIterationDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getIteration()"),params,valueToThrow);
}


public void expectSetIteration(net.sf.pmr.agilePlanning.domain.iteration.Iteration p0_Iteration)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Iteration);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setIteration(Iteration)"),params );
}
public void expectSetIteration(net.sf.pmr.agilePlanning.domain.iteration.Iteration p0_Iteration,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Iteration);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setIteration(Iteration)"),params,toThrow );
}
public void acceptSetIteration(Object p0_Iteration)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Iteration);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setIteration(Iteration)"),params );
}
public void acceptSetIteration(Object p0_Iteration,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Iteration);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setIteration(Iteration)"),params,toThrow );
}
public void setSetIterationDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setIteration(Iteration)"),null,null);
}
public void setSetIterationDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setIteration(Iteration)"),null,toThrow);
}
public void setSetIterationDummy(net.sf.pmr.agilePlanning.domain.iteration.Iteration p0_Iteration,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Iteration);

    MockCore.setDummy( getClassObjectMethodSignature("setIteration(Iteration)"),params,toThrow);
}


public void acceptSetIterationDummy(Object p0_Iteration, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Iteration);

    MockCore.setDummy(getClassObjectMethodSignature("setIteration(Iteration)"),params,valueToThrow);
}


public void expectGetRelease(net.sf.pmr.agilePlanning.domain.release.Release valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getRelease()"),params, valueToReturn );
}
public void expectGetRelease(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getRelease()"),params,toThrow );
}
public void acceptGetRelease(net.sf.pmr.agilePlanning.domain.release.Release valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getRelease()"),params, valueToReturn );
}
public void acceptGetRelease(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getRelease()"),params,toThrow );
}
public void setGetReleaseDummy(net.sf.pmr.agilePlanning.domain.release.Release toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getRelease()"),null,toReturn);
}
public void setGetReleaseDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getRelease()"),null,toThrow);
}



public void acceptGetReleaseDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getRelease()"),params,valueToThrow);
}


public void expectSetRelease(net.sf.pmr.agilePlanning.domain.release.Release p0_Release)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setRelease(Release)"),params );
}
public void expectSetRelease(net.sf.pmr.agilePlanning.domain.release.Release p0_Release,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setRelease(Release)"),params,toThrow );
}
public void acceptSetRelease(Object p0_Release)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setRelease(Release)"),params );
}
public void acceptSetRelease(Object p0_Release,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setRelease(Release)"),params,toThrow );
}
public void setSetReleaseDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setRelease(Release)"),null,null);
}
public void setSetReleaseDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setRelease(Release)"),null,toThrow);
}
public void setSetReleaseDummy(net.sf.pmr.agilePlanning.domain.release.Release p0_Release,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Release);

    MockCore.setDummy( getClassObjectMethodSignature("setRelease(Release)"),params,toThrow);
}


public void acceptSetReleaseDummy(Object p0_Release, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Release);

    MockCore.setDummy(getClassObjectMethodSignature("setRelease(Release)"),params,valueToThrow);
}


public void expectGetBasicProject(net.sf.pmr.core.domain.basicProject.BasicProject valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getBasicProject()"),params, valueToReturn );
}
public void expectGetBasicProject(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getBasicProject()"),params,toThrow );
}
public void acceptGetBasicProject(net.sf.pmr.core.domain.basicProject.BasicProject valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getBasicProject()"),params, valueToReturn );
}
public void acceptGetBasicProject(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getBasicProject()"),params,toThrow );
}
public void setGetBasicProjectDummy(net.sf.pmr.core.domain.basicProject.BasicProject toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getBasicProject()"),null,toReturn);
}
public void setGetBasicProjectDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getBasicProject()"),null,toThrow);
}



public void acceptGetBasicProjectDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getBasicProject()"),params,valueToThrow);
}


public void expectSetBasicProject(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasicProject(BasicProject)"),params );
}
public void expectSetBasicProject(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasicProject(BasicProject)"),params,toThrow );
}
public void acceptSetBasicProject(Object p0_BasicProject)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasicProject(BasicProject)"),params );
}
public void acceptSetBasicProject(Object p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasicProject(BasicProject)"),params,toThrow );
}
public void setSetBasicProjectDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setBasicProject(BasicProject)"),null,null);
}
public void setSetBasicProjectDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setBasicProject(BasicProject)"),null,toThrow);
}
public void setSetBasicProjectDummy(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("setBasicProject(BasicProject)"),params,toThrow);
}


public void acceptSetBasicProjectDummy(Object p0_BasicProject, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.setDummy(getClassObjectMethodSignature("setBasicProject(BasicProject)"),params,valueToThrow);
}


public void expectGetBusinessValue(net.sf.pmr.agilePlanning.domain.story.BusinessValue valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getBusinessValue()"),params, valueToReturn );
}
public void expectGetBusinessValue(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getBusinessValue()"),params,toThrow );
}
public void acceptGetBusinessValue(net.sf.pmr.agilePlanning.domain.story.BusinessValue valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getBusinessValue()"),params, valueToReturn );
}
public void acceptGetBusinessValue(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getBusinessValue()"),params,toThrow );
}
public void setGetBusinessValueDummy(net.sf.pmr.agilePlanning.domain.story.BusinessValue toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getBusinessValue()"),null,toReturn);
}
public void setGetBusinessValueDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getBusinessValue()"),null,toThrow);
}



public void acceptGetBusinessValueDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getBusinessValue()"),params,valueToThrow);
}


public void expectSetBusinessValue(net.sf.pmr.agilePlanning.domain.story.BusinessValue p0_BusinessValue)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BusinessValue);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBusinessValue(BusinessValue)"),params );
}
public void expectSetBusinessValue(net.sf.pmr.agilePlanning.domain.story.BusinessValue p0_BusinessValue,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BusinessValue);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBusinessValue(BusinessValue)"),params,toThrow );
}
public void acceptSetBusinessValue(Object p0_BusinessValue)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BusinessValue);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBusinessValue(BusinessValue)"),params );
}
public void acceptSetBusinessValue(Object p0_BusinessValue,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BusinessValue);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBusinessValue(BusinessValue)"),params,toThrow );
}
public void setSetBusinessValueDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setBusinessValue(BusinessValue)"),null,null);
}
public void setSetBusinessValueDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setBusinessValue(BusinessValue)"),null,toThrow);
}
public void setSetBusinessValueDummy(net.sf.pmr.agilePlanning.domain.story.BusinessValue p0_BusinessValue,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BusinessValue);

    MockCore.setDummy( getClassObjectMethodSignature("setBusinessValue(BusinessValue)"),params,toThrow);
}


public void acceptSetBusinessValueDummy(Object p0_BusinessValue, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BusinessValue);

    MockCore.setDummy(getClassObjectMethodSignature("setBusinessValue(BusinessValue)"),params,valueToThrow);
}


public void expectGetRiskLevel(net.sf.pmr.agilePlanning.domain.story.RiskLevel valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getRiskLevel()"),params, valueToReturn );
}
public void expectGetRiskLevel(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getRiskLevel()"),params,toThrow );
}
public void acceptGetRiskLevel(net.sf.pmr.agilePlanning.domain.story.RiskLevel valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getRiskLevel()"),params, valueToReturn );
}
public void acceptGetRiskLevel(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getRiskLevel()"),params,toThrow );
}
public void setGetRiskLevelDummy(net.sf.pmr.agilePlanning.domain.story.RiskLevel toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getRiskLevel()"),null,toReturn);
}
public void setGetRiskLevelDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getRiskLevel()"),null,toThrow);
}



public void acceptGetRiskLevelDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getRiskLevel()"),params,valueToThrow);
}


public void expectSetRiskLevel(net.sf.pmr.agilePlanning.domain.story.RiskLevel p0_RiskLevel)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_RiskLevel);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setRiskLevel(RiskLevel)"),params );
}
public void expectSetRiskLevel(net.sf.pmr.agilePlanning.domain.story.RiskLevel p0_RiskLevel,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_RiskLevel);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setRiskLevel(RiskLevel)"),params,toThrow );
}
public void acceptSetRiskLevel(Object p0_RiskLevel)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_RiskLevel);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setRiskLevel(RiskLevel)"),params );
}
public void acceptSetRiskLevel(Object p0_RiskLevel,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_RiskLevel);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setRiskLevel(RiskLevel)"),params,toThrow );
}
public void setSetRiskLevelDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setRiskLevel(RiskLevel)"),null,null);
}
public void setSetRiskLevelDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setRiskLevel(RiskLevel)"),null,toThrow);
}
public void setSetRiskLevelDummy(net.sf.pmr.agilePlanning.domain.story.RiskLevel p0_RiskLevel,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_RiskLevel);

    MockCore.setDummy( getClassObjectMethodSignature("setRiskLevel(RiskLevel)"),params,toThrow);
}


public void acceptSetRiskLevelDummy(Object p0_RiskLevel, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_RiskLevel);

    MockCore.setDummy(getClassObjectMethodSignature("setRiskLevel(RiskLevel)"),params,valueToThrow);
}


public void expectDaysCompleted(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("daysCompleted()"),params, new Double(valueToReturn) );
}
public void expectDaysCompleted(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("daysCompleted()"),params,toThrow );
}
public void acceptDaysCompleted(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("daysCompleted()"),params, new Double(valueToReturn) );
}
public void acceptDaysCompleted(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("daysCompleted()"),params,toThrow );
}
public void setDaysCompletedDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("daysCompleted()"),null,new Double(toReturn));
}
public void setDaysCompletedDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("daysCompleted()"),null,toThrow);
}



public void acceptDaysCompletedDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("daysCompleted()"),params,valueToThrow);
}


public void expectDaysRemaining(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("daysRemaining()"),params, new Double(valueToReturn) );
}
public void expectDaysRemaining(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("daysRemaining()"),params,toThrow );
}
public void acceptDaysRemaining(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("daysRemaining()"),params, new Double(valueToReturn) );
}
public void acceptDaysRemaining(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("daysRemaining()"),params,toThrow );
}
public void setDaysRemainingDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("daysRemaining()"),null,new Double(toReturn));
}
public void setDaysRemainingDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("daysRemaining()"),null,toThrow);
}



public void acceptDaysRemainingDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("daysRemaining()"),params,valueToThrow);
}


public void expectPercentCompleted(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("percentCompleted()"),params, new Double(valueToReturn) );
}
public void expectPercentCompleted(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("percentCompleted()"),params,toThrow );
}
public void acceptPercentCompleted(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("percentCompleted()"),params, new Double(valueToReturn) );
}
public void acceptPercentCompleted(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("percentCompleted()"),params,toThrow );
}
public void setPercentCompletedDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("percentCompleted()"),null,new Double(toReturn));
}
public void setPercentCompletedDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("percentCompleted()"),null,toThrow);
}



public void acceptPercentCompletedDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("percentCompleted()"),params,valueToThrow);
}


public void expectPercentRemaining(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("percentRemaining()"),params, new Double(valueToReturn) );
}
public void expectPercentRemaining(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("percentRemaining()"),params,toThrow );
}
public void acceptPercentRemaining(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("percentRemaining()"),params, new Double(valueToReturn) );
}
public void acceptPercentRemaining(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("percentRemaining()"),params,toThrow );
}
public void setPercentRemainingDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("percentRemaining()"),null,new Double(toReturn));
}
public void setPercentRemainingDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("percentRemaining()"),null,toThrow);
}



public void acceptPercentRemainingDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("percentRemaining()"),params,valueToThrow);
}


public void expectDifferenceOfDaysBetweenEstimateAndTaskEstimate(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskEstimate()"),params, new Double(valueToReturn) );
}
public void expectDifferenceOfDaysBetweenEstimateAndTaskEstimate(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskEstimate()"),params,toThrow );
}
public void acceptDifferenceOfDaysBetweenEstimateAndTaskEstimate(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskEstimate()"),params, new Double(valueToReturn) );
}
public void acceptDifferenceOfDaysBetweenEstimateAndTaskEstimate(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskEstimate()"),params,toThrow );
}
public void setDifferenceOfDaysBetweenEstimateAndTaskEstimateDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskEstimate()"),null,new Double(toReturn));
}
public void setDifferenceOfDaysBetweenEstimateAndTaskEstimateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskEstimate()"),null,toThrow);
}



public void acceptDifferenceOfDaysBetweenEstimateAndTaskEstimateDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskEstimate()"),params,valueToThrow);
}


public void expectDifferenceInPercentBetweenEstimateAndTaskEstimate(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskEstimate()"),params, new Double(valueToReturn) );
}
public void expectDifferenceInPercentBetweenEstimateAndTaskEstimate(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskEstimate()"),params,toThrow );
}
public void acceptDifferenceInPercentBetweenEstimateAndTaskEstimate(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskEstimate()"),params, new Double(valueToReturn) );
}
public void acceptDifferenceInPercentBetweenEstimateAndTaskEstimate(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskEstimate()"),params,toThrow );
}
public void setDifferenceInPercentBetweenEstimateAndTaskEstimateDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskEstimate()"),null,new Double(toReturn));
}
public void setDifferenceInPercentBetweenEstimateAndTaskEstimateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskEstimate()"),null,toThrow);
}



public void acceptDifferenceInPercentBetweenEstimateAndTaskEstimateDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskEstimate()"),params,valueToThrow);
}


public void expectDifferenceOfDaysBetweenEstimateAndTaskCharge(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskCharge()"),params, new Double(valueToReturn) );
}
public void expectDifferenceOfDaysBetweenEstimateAndTaskCharge(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskCharge()"),params,toThrow );
}
public void acceptDifferenceOfDaysBetweenEstimateAndTaskCharge(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskCharge()"),params, new Double(valueToReturn) );
}
public void acceptDifferenceOfDaysBetweenEstimateAndTaskCharge(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskCharge()"),params,toThrow );
}
public void setDifferenceOfDaysBetweenEstimateAndTaskChargeDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskCharge()"),null,new Double(toReturn));
}
public void setDifferenceOfDaysBetweenEstimateAndTaskChargeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskCharge()"),null,toThrow);
}



public void acceptDifferenceOfDaysBetweenEstimateAndTaskChargeDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskCharge()"),params,valueToThrow);
}


public void expectDifferenceInPercentBetweenEstimateAndTaskCharge(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskCharge()"),params, new Double(valueToReturn) );
}
public void expectDifferenceInPercentBetweenEstimateAndTaskCharge(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskCharge()"),params,toThrow );
}
public void acceptDifferenceInPercentBetweenEstimateAndTaskCharge(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskCharge()"),params, new Double(valueToReturn) );
}
public void acceptDifferenceInPercentBetweenEstimateAndTaskCharge(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskCharge()"),params,toThrow );
}
public void setDifferenceInPercentBetweenEstimateAndTaskChargeDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskCharge()"),null,new Double(toReturn));
}
public void setDifferenceInPercentBetweenEstimateAndTaskChargeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskCharge()"),null,toThrow);
}



public void acceptDifferenceInPercentBetweenEstimateAndTaskChargeDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskCharge()"),params,valueToThrow);
}


public void expectIsInProgress(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isInProgress()"),params, new Boolean(valueToReturn) );
}
public void expectIsInProgress(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isInProgress()"),params,toThrow );
}
public void acceptIsInProgress(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isInProgress()"),params, new Boolean(valueToReturn) );
}
public void acceptIsInProgress(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isInProgress()"),params,toThrow );
}
public void setIsInProgressDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("isInProgress()"),null,new Boolean(toReturn));
}
public void setIsInProgressDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("isInProgress()"),null,toThrow);
}



public void acceptIsInProgressDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("isInProgress()"),params,valueToThrow);
}


public void expectIsCompleted(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isCompleted()"),params, new Boolean(valueToReturn) );
}
public void expectIsCompleted(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isCompleted()"),params,toThrow );
}
public void acceptIsCompleted(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isCompleted()"),params, new Boolean(valueToReturn) );
}
public void acceptIsCompleted(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isCompleted()"),params,toThrow );
}
public void setIsCompletedDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("isCompleted()"),null,new Boolean(toReturn));
}
public void setIsCompletedDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("isCompleted()"),null,toThrow);
}



public void acceptIsCompletedDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("isCompleted()"),params,valueToThrow);
}


public void expectGetPersistanceId(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params, new Integer(valueToReturn) );
}
public void expectGetPersistanceId(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params,toThrow );
}
public void acceptGetPersistanceId(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params, new Integer(valueToReturn) );
}
public void acceptGetPersistanceId(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params,toThrow );
}
public void setGetPersistanceIdDummy(int toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getPersistanceId()"),null,new Integer(toReturn));
}
public void setGetPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceId()"),null,toThrow);
}



public void acceptGetPersistanceIdDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceId()"),params,valueToThrow);
}


public void expectSetPersistanceId(int p0_int)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params );
}
public void expectSetPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params,toThrow );
}
public void acceptSetPersistanceId(Object p0_int)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params );
}
public void acceptSetPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params,toThrow );
}
public void setSetPersistanceIdDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setPersistanceId(int)"),null,null);
}
public void setSetPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceId(int)"),null,toThrow);
}
public void setSetPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("setPersistanceId(int)"),params,toThrow);
}


public void acceptSetPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceId(int)"),params,valueToThrow);
}


public void expectGetPersistanceVersion(long valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params, new Long(valueToReturn) );
}
public void expectGetPersistanceVersion(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params,toThrow );
}
public void acceptGetPersistanceVersion(long valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params, new Long(valueToReturn) );
}
public void acceptGetPersistanceVersion(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params,toThrow );
}
public void setGetPersistanceVersionDummy(long toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getPersistanceVersion()"),null,new Long(toReturn));
}
public void setGetPersistanceVersionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceVersion()"),null,toThrow);
}



public void acceptGetPersistanceVersionDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceVersion()"),params,valueToThrow);
}


public void expectSetPersistanceVersion(long p0_long)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Long(p0_long));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params );
}
public void expectSetPersistanceVersion(long p0_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Long(p0_long));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params,toThrow );
}
public void acceptSetPersistanceVersion(Object p0_long)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_long);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params );
}
public void acceptSetPersistanceVersion(Object p0_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_long);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params,toThrow );
}
public void setSetPersistanceVersionDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setPersistanceVersion(long)"),null,null);
}
public void setSetPersistanceVersionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceVersion(long)"),null,toThrow);
}
public void setSetPersistanceVersionDummy(long p0_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Long(p0_long));

    MockCore.setDummy( getClassObjectMethodSignature("setPersistanceVersion(long)"),params,toThrow);
}


public void acceptSetPersistanceVersionDummy(Object p0_long, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_long);

    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceVersion(long)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.agilePlanning.domain.story.MockStory"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.agilePlanning.domain.story.Story";
}
    public MockStory()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.agilePlanning.domain.story.MockStory",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.agilePlanning.domain.story.MockStory.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.agilePlanning.domain.story.MockStory",params);
        return new net.sf.pmr.agilePlanning.domain.story.MockStory.PreMock(id);
    }

    public static net.sf.pmr.agilePlanning.domain.story.MockStory.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.agilePlanning.domain.story.MockStory",null);
        return new net.sf.pmr.agilePlanning.domain.story.MockStory.PreMock(id);
    }

    public static net.sf.pmr.agilePlanning.domain.story.MockStory.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.agilePlanning.domain.story.MockStory",th);
        return new net.sf.pmr.agilePlanning.domain.story.MockStory.PreMock(id);
    }

    public boolean warning()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("warning()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("warning: called but not prepared");
    return ((Boolean)returnValue).booleanValue();
}
public void expectWarning(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("warning()"),params, new Boolean(valueToReturn) );
}
public void expectWarning(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("warning()"),params,toThrow );
}
public void acceptWarning(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("warning()"),params, new Boolean(valueToReturn) );
}
public void acceptWarning(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("warning()"),params,toThrow );
}
public void setWarningDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("warning()"),null,new Boolean(toReturn));
}
public void setWarningDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("warning()"),null,toThrow);
}



public void acceptWarningDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("warning()"),params,valueToThrow);
}


    public java.lang.String getDescription()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getDescription()"),params,MockCore.OPT_DEFAULT);
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
public void expectGetDescription(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getDescription()"),params, valueToReturn );
}
public void expectGetDescription(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getDescription()"),params,toThrow );
}
public void acceptGetDescription(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getDescription()"),params, valueToReturn );
}
public void acceptGetDescription(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getDescription()"),params,toThrow );
}
public void setGetDescriptionDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getDescription()"),null,toReturn);
}
public void setGetDescriptionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getDescription()"),null,toThrow);
}



public void acceptGetDescriptionDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getDescription()"),params,valueToThrow);
}


    public void setDescription(java.lang.String p0_String)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setDescription(String)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetDescription(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDescription(String)"),params );
}
public void expectSetDescription(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDescription(String)"),params,toThrow );
}
public void acceptSetDescription(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDescription(String)"),params );
}
public void acceptSetDescription(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDescription(String)"),params,toThrow );
}
public void setSetDescriptionDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setDescription(String)"),null,null);
}
public void setSetDescriptionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setDescription(String)"),null,toThrow);
}
public void setSetDescriptionDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("setDescription(String)"),params,toThrow);
}


public void acceptSetDescriptionDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("setDescription(String)"),params,valueToThrow);
}


    public boolean isLeft()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("isLeft()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("isLeft: called but not prepared");
    return ((Boolean)returnValue).booleanValue();
}
public void expectIsLeft(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isLeft()"),params, new Boolean(valueToReturn) );
}
public void expectIsLeft(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isLeft()"),params,toThrow );
}
public void acceptIsLeft(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isLeft()"),params, new Boolean(valueToReturn) );
}
public void acceptIsLeft(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isLeft()"),params,toThrow );
}
public void setIsLeftDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("isLeft()"),null,new Boolean(toReturn));
}
public void setIsLeftDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("isLeft()"),null,toThrow);
}



public void acceptIsLeftDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("isLeft()"),params,valueToThrow);
}


    public void setShortDescription(java.lang.String p0_String)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setShortDescription(String)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetShortDescription(java.lang.String p0_String)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setShortDescription(String)"),params );
}
public void expectSetShortDescription(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setShortDescription(String)"),params,toThrow );
}
public void acceptSetShortDescription(Object p0_String)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setShortDescription(String)"),params );
}
public void acceptSetShortDescription(Object p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setShortDescription(String)"),params,toThrow );
}
public void setSetShortDescriptionDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setShortDescription(String)"),null,null);
}
public void setSetShortDescriptionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setShortDescription(String)"),null,toThrow);
}
public void setSetShortDescriptionDummy(java.lang.String p0_String,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_String);

    MockCore.setDummy( getClassObjectMethodSignature("setShortDescription(String)"),params,toThrow);
}


public void acceptSetShortDescriptionDummy(Object p0_String, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_String);

    MockCore.setDummy(getClassObjectMethodSignature("setShortDescription(String)"),params,valueToThrow);
}


    public java.lang.String getShortDescription()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getShortDescription()"),params,MockCore.OPT_DEFAULT);
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
public void expectGetShortDescription(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getShortDescription()"),params, valueToReturn );
}
public void expectGetShortDescription(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getShortDescription()"),params,toThrow );
}
public void acceptGetShortDescription(java.lang.String valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getShortDescription()"),params, valueToReturn );
}
public void acceptGetShortDescription(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getShortDescription()"),params,toThrow );
}
public void setGetShortDescriptionDummy(java.lang.String toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getShortDescription()"),null,toReturn);
}
public void setGetShortDescriptionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getShortDescription()"),null,toThrow);
}



public void acceptGetShortDescriptionDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getShortDescription()"),params,valueToThrow);
}


    public java.util.Set getTasks()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getTasks()"),params,MockCore.OPT_DEFAULT);
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
public void expectGetTasks(java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTasks()"),params, valueToReturn );
}
public void expectGetTasks(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTasks()"),params,toThrow );
}
public void acceptGetTasks(java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTasks()"),params, valueToReturn );
}
public void acceptGetTasks(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getTasks()"),params,toThrow );
}
public void setGetTasksDummy(java.util.Set toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getTasks()"),null,toReturn);
}
public void setGetTasksDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getTasks()"),null,toThrow);
}



public void acceptGetTasksDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getTasks()"),params,valueToThrow);
}


    public void setTasks(java.util.Set p0_Set)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setTasks(Set)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetTasks(java.util.Set p0_Set)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setTasks(Set)"),params );
}
public void expectSetTasks(java.util.Set p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setTasks(Set)"),params,toThrow );
}
public void acceptSetTasks(Object p0_Set)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setTasks(Set)"),params );
}
public void acceptSetTasks(Object p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setTasks(Set)"),params,toThrow );
}
public void setSetTasksDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setTasks(Set)"),null,null);
}
public void setSetTasksDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setTasks(Set)"),null,toThrow);
}
public void setSetTasksDummy(java.util.Set p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.setDummy( getClassObjectMethodSignature("setTasks(Set)"),params,toThrow);
}


public void acceptSetTasksDummy(Object p0_Set, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.setDummy(getClassObjectMethodSignature("setTasks(Set)"),params,valueToThrow);
}


    public double getDaysEstimated()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getDaysEstimated()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("getDaysEstimated: called but not prepared");
    return ((Double)returnValue).doubleValue();
}
public void expectGetDaysEstimated(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getDaysEstimated()"),params, new Double(valueToReturn) );
}
public void expectGetDaysEstimated(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getDaysEstimated()"),params,toThrow );
}
public void acceptGetDaysEstimated(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getDaysEstimated()"),params, new Double(valueToReturn) );
}
public void acceptGetDaysEstimated(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getDaysEstimated()"),params,toThrow );
}
public void setGetDaysEstimatedDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getDaysEstimated()"),null,new Double(toReturn));
}
public void setGetDaysEstimatedDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getDaysEstimated()"),null,toThrow);
}



public void acceptGetDaysEstimatedDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getDaysEstimated()"),params,valueToThrow);
}


    public void setDaysEstimated(double p0_double)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Double(p0_double));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setDaysEstimated(double)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetDaysEstimated(double p0_double)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Double(p0_double));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDaysEstimated(double)"),params );
}
public void expectSetDaysEstimated(double p0_double,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Double(p0_double));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDaysEstimated(double)"),params,toThrow );
}
public void acceptSetDaysEstimated(Object p0_double)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_double);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDaysEstimated(double)"),params );
}
public void acceptSetDaysEstimated(Object p0_double,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_double);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setDaysEstimated(double)"),params,toThrow );
}
public void setSetDaysEstimatedDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setDaysEstimated(double)"),null,null);
}
public void setSetDaysEstimatedDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setDaysEstimated(double)"),null,toThrow);
}
public void setSetDaysEstimatedDummy(double p0_double,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Double(p0_double));

    MockCore.setDummy( getClassObjectMethodSignature("setDaysEstimated(double)"),params,toThrow);
}


public void acceptSetDaysEstimatedDummy(Object p0_double, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_double);

    MockCore.setDummy(getClassObjectMethodSignature("setDaysEstimated(double)"),params,valueToThrow);
}


    public net.sf.pmr.agilePlanning.domain.iteration.Iteration getIteration()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getIteration()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (net.sf.pmr.agilePlanning.domain.iteration.Iteration)returnValue;
}
public void expectGetIteration(net.sf.pmr.agilePlanning.domain.iteration.Iteration valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getIteration()"),params, valueToReturn );
}
public void expectGetIteration(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getIteration()"),params,toThrow );
}
public void acceptGetIteration(net.sf.pmr.agilePlanning.domain.iteration.Iteration valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getIteration()"),params, valueToReturn );
}
public void acceptGetIteration(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getIteration()"),params,toThrow );
}
public void setGetIterationDummy(net.sf.pmr.agilePlanning.domain.iteration.Iteration toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getIteration()"),null,toReturn);
}
public void setGetIterationDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getIteration()"),null,toThrow);
}



public void acceptGetIterationDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getIteration()"),params,valueToThrow);
}


    public void setIteration(net.sf.pmr.agilePlanning.domain.iteration.Iteration p0_Iteration)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Iteration);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setIteration(Iteration)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetIteration(net.sf.pmr.agilePlanning.domain.iteration.Iteration p0_Iteration)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Iteration);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setIteration(Iteration)"),params );
}
public void expectSetIteration(net.sf.pmr.agilePlanning.domain.iteration.Iteration p0_Iteration,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Iteration);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setIteration(Iteration)"),params,toThrow );
}
public void acceptSetIteration(Object p0_Iteration)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Iteration);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setIteration(Iteration)"),params );
}
public void acceptSetIteration(Object p0_Iteration,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Iteration);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setIteration(Iteration)"),params,toThrow );
}
public void setSetIterationDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setIteration(Iteration)"),null,null);
}
public void setSetIterationDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setIteration(Iteration)"),null,toThrow);
}
public void setSetIterationDummy(net.sf.pmr.agilePlanning.domain.iteration.Iteration p0_Iteration,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Iteration);

    MockCore.setDummy( getClassObjectMethodSignature("setIteration(Iteration)"),params,toThrow);
}


public void acceptSetIterationDummy(Object p0_Iteration, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Iteration);

    MockCore.setDummy(getClassObjectMethodSignature("setIteration(Iteration)"),params,valueToThrow);
}


    public net.sf.pmr.agilePlanning.domain.release.Release getRelease()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getRelease()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (net.sf.pmr.agilePlanning.domain.release.Release)returnValue;
}
public void expectGetRelease(net.sf.pmr.agilePlanning.domain.release.Release valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getRelease()"),params, valueToReturn );
}
public void expectGetRelease(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getRelease()"),params,toThrow );
}
public void acceptGetRelease(net.sf.pmr.agilePlanning.domain.release.Release valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getRelease()"),params, valueToReturn );
}
public void acceptGetRelease(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getRelease()"),params,toThrow );
}
public void setGetReleaseDummy(net.sf.pmr.agilePlanning.domain.release.Release toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getRelease()"),null,toReturn);
}
public void setGetReleaseDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getRelease()"),null,toThrow);
}



public void acceptGetReleaseDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getRelease()"),params,valueToThrow);
}


    public void setRelease(net.sf.pmr.agilePlanning.domain.release.Release p0_Release)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Release);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setRelease(Release)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetRelease(net.sf.pmr.agilePlanning.domain.release.Release p0_Release)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setRelease(Release)"),params );
}
public void expectSetRelease(net.sf.pmr.agilePlanning.domain.release.Release p0_Release,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setRelease(Release)"),params,toThrow );
}
public void acceptSetRelease(Object p0_Release)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setRelease(Release)"),params );
}
public void acceptSetRelease(Object p0_Release,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Release);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setRelease(Release)"),params,toThrow );
}
public void setSetReleaseDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setRelease(Release)"),null,null);
}
public void setSetReleaseDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setRelease(Release)"),null,toThrow);
}
public void setSetReleaseDummy(net.sf.pmr.agilePlanning.domain.release.Release p0_Release,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Release);

    MockCore.setDummy( getClassObjectMethodSignature("setRelease(Release)"),params,toThrow);
}


public void acceptSetReleaseDummy(Object p0_Release, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Release);

    MockCore.setDummy(getClassObjectMethodSignature("setRelease(Release)"),params,valueToThrow);
}


    public net.sf.pmr.core.domain.basicProject.BasicProject getBasicProject()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getBasicProject()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (net.sf.pmr.core.domain.basicProject.BasicProject)returnValue;
}
public void expectGetBasicProject(net.sf.pmr.core.domain.basicProject.BasicProject valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getBasicProject()"),params, valueToReturn );
}
public void expectGetBasicProject(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getBasicProject()"),params,toThrow );
}
public void acceptGetBasicProject(net.sf.pmr.core.domain.basicProject.BasicProject valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getBasicProject()"),params, valueToReturn );
}
public void acceptGetBasicProject(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getBasicProject()"),params,toThrow );
}
public void setGetBasicProjectDummy(net.sf.pmr.core.domain.basicProject.BasicProject toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getBasicProject()"),null,toReturn);
}
public void setGetBasicProjectDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getBasicProject()"),null,toThrow);
}



public void acceptGetBasicProjectDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getBasicProject()"),params,valueToThrow);
}


    public void setBasicProject(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setBasicProject(BasicProject)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetBasicProject(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasicProject(BasicProject)"),params );
}
public void expectSetBasicProject(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasicProject(BasicProject)"),params,toThrow );
}
public void acceptSetBasicProject(Object p0_BasicProject)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasicProject(BasicProject)"),params );
}
public void acceptSetBasicProject(Object p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBasicProject(BasicProject)"),params,toThrow );
}
public void setSetBasicProjectDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setBasicProject(BasicProject)"),null,null);
}
public void setSetBasicProjectDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setBasicProject(BasicProject)"),null,toThrow);
}
public void setSetBasicProjectDummy(net.sf.pmr.core.domain.basicProject.BasicProject p0_BasicProject,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BasicProject);

    MockCore.setDummy( getClassObjectMethodSignature("setBasicProject(BasicProject)"),params,toThrow);
}


public void acceptSetBasicProjectDummy(Object p0_BasicProject, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BasicProject);

    MockCore.setDummy(getClassObjectMethodSignature("setBasicProject(BasicProject)"),params,valueToThrow);
}


    public net.sf.pmr.agilePlanning.domain.story.BusinessValue getBusinessValue()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getBusinessValue()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (net.sf.pmr.agilePlanning.domain.story.BusinessValue)returnValue;
}
public void expectGetBusinessValue(net.sf.pmr.agilePlanning.domain.story.BusinessValue valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getBusinessValue()"),params, valueToReturn );
}
public void expectGetBusinessValue(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getBusinessValue()"),params,toThrow );
}
public void acceptGetBusinessValue(net.sf.pmr.agilePlanning.domain.story.BusinessValue valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getBusinessValue()"),params, valueToReturn );
}
public void acceptGetBusinessValue(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getBusinessValue()"),params,toThrow );
}
public void setGetBusinessValueDummy(net.sf.pmr.agilePlanning.domain.story.BusinessValue toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getBusinessValue()"),null,toReturn);
}
public void setGetBusinessValueDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getBusinessValue()"),null,toThrow);
}



public void acceptGetBusinessValueDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getBusinessValue()"),params,valueToThrow);
}


    public void setBusinessValue(net.sf.pmr.agilePlanning.domain.story.BusinessValue p0_BusinessValue)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_BusinessValue);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setBusinessValue(BusinessValue)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetBusinessValue(net.sf.pmr.agilePlanning.domain.story.BusinessValue p0_BusinessValue)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BusinessValue);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBusinessValue(BusinessValue)"),params );
}
public void expectSetBusinessValue(net.sf.pmr.agilePlanning.domain.story.BusinessValue p0_BusinessValue,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BusinessValue);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBusinessValue(BusinessValue)"),params,toThrow );
}
public void acceptSetBusinessValue(Object p0_BusinessValue)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BusinessValue);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBusinessValue(BusinessValue)"),params );
}
public void acceptSetBusinessValue(Object p0_BusinessValue,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BusinessValue);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setBusinessValue(BusinessValue)"),params,toThrow );
}
public void setSetBusinessValueDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setBusinessValue(BusinessValue)"),null,null);
}
public void setSetBusinessValueDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setBusinessValue(BusinessValue)"),null,toThrow);
}
public void setSetBusinessValueDummy(net.sf.pmr.agilePlanning.domain.story.BusinessValue p0_BusinessValue,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_BusinessValue);

    MockCore.setDummy( getClassObjectMethodSignature("setBusinessValue(BusinessValue)"),params,toThrow);
}


public void acceptSetBusinessValueDummy(Object p0_BusinessValue, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_BusinessValue);

    MockCore.setDummy(getClassObjectMethodSignature("setBusinessValue(BusinessValue)"),params,valueToThrow);
}


    public net.sf.pmr.agilePlanning.domain.story.RiskLevel getRiskLevel()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getRiskLevel()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (net.sf.pmr.agilePlanning.domain.story.RiskLevel)returnValue;
}
public void expectGetRiskLevel(net.sf.pmr.agilePlanning.domain.story.RiskLevel valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getRiskLevel()"),params, valueToReturn );
}
public void expectGetRiskLevel(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getRiskLevel()"),params,toThrow );
}
public void acceptGetRiskLevel(net.sf.pmr.agilePlanning.domain.story.RiskLevel valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getRiskLevel()"),params, valueToReturn );
}
public void acceptGetRiskLevel(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getRiskLevel()"),params,toThrow );
}
public void setGetRiskLevelDummy(net.sf.pmr.agilePlanning.domain.story.RiskLevel toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getRiskLevel()"),null,toReturn);
}
public void setGetRiskLevelDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getRiskLevel()"),null,toThrow);
}



public void acceptGetRiskLevelDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getRiskLevel()"),params,valueToThrow);
}


    public void setRiskLevel(net.sf.pmr.agilePlanning.domain.story.RiskLevel p0_RiskLevel)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_RiskLevel);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setRiskLevel(RiskLevel)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetRiskLevel(net.sf.pmr.agilePlanning.domain.story.RiskLevel p0_RiskLevel)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_RiskLevel);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setRiskLevel(RiskLevel)"),params );
}
public void expectSetRiskLevel(net.sf.pmr.agilePlanning.domain.story.RiskLevel p0_RiskLevel,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_RiskLevel);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setRiskLevel(RiskLevel)"),params,toThrow );
}
public void acceptSetRiskLevel(Object p0_RiskLevel)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_RiskLevel);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setRiskLevel(RiskLevel)"),params );
}
public void acceptSetRiskLevel(Object p0_RiskLevel,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_RiskLevel);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setRiskLevel(RiskLevel)"),params,toThrow );
}
public void setSetRiskLevelDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setRiskLevel(RiskLevel)"),null,null);
}
public void setSetRiskLevelDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setRiskLevel(RiskLevel)"),null,toThrow);
}
public void setSetRiskLevelDummy(net.sf.pmr.agilePlanning.domain.story.RiskLevel p0_RiskLevel,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_RiskLevel);

    MockCore.setDummy( getClassObjectMethodSignature("setRiskLevel(RiskLevel)"),params,toThrow);
}


public void acceptSetRiskLevelDummy(Object p0_RiskLevel, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_RiskLevel);

    MockCore.setDummy(getClassObjectMethodSignature("setRiskLevel(RiskLevel)"),params,valueToThrow);
}


    public double daysCompleted()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("daysCompleted()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("daysCompleted: called but not prepared");
    return ((Double)returnValue).doubleValue();
}
public void expectDaysCompleted(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("daysCompleted()"),params, new Double(valueToReturn) );
}
public void expectDaysCompleted(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("daysCompleted()"),params,toThrow );
}
public void acceptDaysCompleted(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("daysCompleted()"),params, new Double(valueToReturn) );
}
public void acceptDaysCompleted(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("daysCompleted()"),params,toThrow );
}
public void setDaysCompletedDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("daysCompleted()"),null,new Double(toReturn));
}
public void setDaysCompletedDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("daysCompleted()"),null,toThrow);
}



public void acceptDaysCompletedDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("daysCompleted()"),params,valueToThrow);
}


    public double daysRemaining()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("daysRemaining()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("daysRemaining: called but not prepared");
    return ((Double)returnValue).doubleValue();
}
public void expectDaysRemaining(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("daysRemaining()"),params, new Double(valueToReturn) );
}
public void expectDaysRemaining(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("daysRemaining()"),params,toThrow );
}
public void acceptDaysRemaining(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("daysRemaining()"),params, new Double(valueToReturn) );
}
public void acceptDaysRemaining(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("daysRemaining()"),params,toThrow );
}
public void setDaysRemainingDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("daysRemaining()"),null,new Double(toReturn));
}
public void setDaysRemainingDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("daysRemaining()"),null,toThrow);
}



public void acceptDaysRemainingDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("daysRemaining()"),params,valueToThrow);
}


    public double percentCompleted()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("percentCompleted()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("percentCompleted: called but not prepared");
    return ((Double)returnValue).doubleValue();
}
public void expectPercentCompleted(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("percentCompleted()"),params, new Double(valueToReturn) );
}
public void expectPercentCompleted(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("percentCompleted()"),params,toThrow );
}
public void acceptPercentCompleted(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("percentCompleted()"),params, new Double(valueToReturn) );
}
public void acceptPercentCompleted(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("percentCompleted()"),params,toThrow );
}
public void setPercentCompletedDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("percentCompleted()"),null,new Double(toReturn));
}
public void setPercentCompletedDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("percentCompleted()"),null,toThrow);
}



public void acceptPercentCompletedDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("percentCompleted()"),params,valueToThrow);
}


    public double percentRemaining()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("percentRemaining()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("percentRemaining: called but not prepared");
    return ((Double)returnValue).doubleValue();
}
public void expectPercentRemaining(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("percentRemaining()"),params, new Double(valueToReturn) );
}
public void expectPercentRemaining(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("percentRemaining()"),params,toThrow );
}
public void acceptPercentRemaining(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("percentRemaining()"),params, new Double(valueToReturn) );
}
public void acceptPercentRemaining(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("percentRemaining()"),params,toThrow );
}
public void setPercentRemainingDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("percentRemaining()"),null,new Double(toReturn));
}
public void setPercentRemainingDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("percentRemaining()"),null,toThrow);
}



public void acceptPercentRemainingDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("percentRemaining()"),params,valueToThrow);
}


    public double differenceOfDaysBetweenEstimateAndTaskEstimate()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskEstimate()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("differenceOfDaysBetweenEstimateAndTaskEstimate: called but not prepared");
    return ((Double)returnValue).doubleValue();
}
public void expectDifferenceOfDaysBetweenEstimateAndTaskEstimate(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskEstimate()"),params, new Double(valueToReturn) );
}
public void expectDifferenceOfDaysBetweenEstimateAndTaskEstimate(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskEstimate()"),params,toThrow );
}
public void acceptDifferenceOfDaysBetweenEstimateAndTaskEstimate(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskEstimate()"),params, new Double(valueToReturn) );
}
public void acceptDifferenceOfDaysBetweenEstimateAndTaskEstimate(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskEstimate()"),params,toThrow );
}
public void setDifferenceOfDaysBetweenEstimateAndTaskEstimateDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskEstimate()"),null,new Double(toReturn));
}
public void setDifferenceOfDaysBetweenEstimateAndTaskEstimateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskEstimate()"),null,toThrow);
}



public void acceptDifferenceOfDaysBetweenEstimateAndTaskEstimateDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskEstimate()"),params,valueToThrow);
}


    public double differenceInPercentBetweenEstimateAndTaskEstimate()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskEstimate()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("differenceInPercentBetweenEstimateAndTaskEstimate: called but not prepared");
    return ((Double)returnValue).doubleValue();
}
public void expectDifferenceInPercentBetweenEstimateAndTaskEstimate(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskEstimate()"),params, new Double(valueToReturn) );
}
public void expectDifferenceInPercentBetweenEstimateAndTaskEstimate(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskEstimate()"),params,toThrow );
}
public void acceptDifferenceInPercentBetweenEstimateAndTaskEstimate(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskEstimate()"),params, new Double(valueToReturn) );
}
public void acceptDifferenceInPercentBetweenEstimateAndTaskEstimate(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskEstimate()"),params,toThrow );
}
public void setDifferenceInPercentBetweenEstimateAndTaskEstimateDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskEstimate()"),null,new Double(toReturn));
}
public void setDifferenceInPercentBetweenEstimateAndTaskEstimateDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskEstimate()"),null,toThrow);
}



public void acceptDifferenceInPercentBetweenEstimateAndTaskEstimateDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskEstimate()"),params,valueToThrow);
}


    public double differenceOfDaysBetweenEstimateAndTaskCharge()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskCharge()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("differenceOfDaysBetweenEstimateAndTaskCharge: called but not prepared");
    return ((Double)returnValue).doubleValue();
}
public void expectDifferenceOfDaysBetweenEstimateAndTaskCharge(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskCharge()"),params, new Double(valueToReturn) );
}
public void expectDifferenceOfDaysBetweenEstimateAndTaskCharge(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskCharge()"),params,toThrow );
}
public void acceptDifferenceOfDaysBetweenEstimateAndTaskCharge(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskCharge()"),params, new Double(valueToReturn) );
}
public void acceptDifferenceOfDaysBetweenEstimateAndTaskCharge(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskCharge()"),params,toThrow );
}
public void setDifferenceOfDaysBetweenEstimateAndTaskChargeDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskCharge()"),null,new Double(toReturn));
}
public void setDifferenceOfDaysBetweenEstimateAndTaskChargeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskCharge()"),null,toThrow);
}



public void acceptDifferenceOfDaysBetweenEstimateAndTaskChargeDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndTaskCharge()"),params,valueToThrow);
}


    public double differenceInPercentBetweenEstimateAndTaskCharge()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskCharge()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("differenceInPercentBetweenEstimateAndTaskCharge: called but not prepared");
    return ((Double)returnValue).doubleValue();
}
public void expectDifferenceInPercentBetweenEstimateAndTaskCharge(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskCharge()"),params, new Double(valueToReturn) );
}
public void expectDifferenceInPercentBetweenEstimateAndTaskCharge(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskCharge()"),params,toThrow );
}
public void acceptDifferenceInPercentBetweenEstimateAndTaskCharge(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskCharge()"),params, new Double(valueToReturn) );
}
public void acceptDifferenceInPercentBetweenEstimateAndTaskCharge(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskCharge()"),params,toThrow );
}
public void setDifferenceInPercentBetweenEstimateAndTaskChargeDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskCharge()"),null,new Double(toReturn));
}
public void setDifferenceInPercentBetweenEstimateAndTaskChargeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskCharge()"),null,toThrow);
}



public void acceptDifferenceInPercentBetweenEstimateAndTaskChargeDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndTaskCharge()"),params,valueToThrow);
}


    public boolean isInProgress()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("isInProgress()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("isInProgress: called but not prepared");
    return ((Boolean)returnValue).booleanValue();
}
public void expectIsInProgress(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isInProgress()"),params, new Boolean(valueToReturn) );
}
public void expectIsInProgress(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isInProgress()"),params,toThrow );
}
public void acceptIsInProgress(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isInProgress()"),params, new Boolean(valueToReturn) );
}
public void acceptIsInProgress(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isInProgress()"),params,toThrow );
}
public void setIsInProgressDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("isInProgress()"),null,new Boolean(toReturn));
}
public void setIsInProgressDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("isInProgress()"),null,toThrow);
}



public void acceptIsInProgressDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("isInProgress()"),params,valueToThrow);
}


    public boolean isCompleted()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("isCompleted()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("isCompleted: called but not prepared");
    return ((Boolean)returnValue).booleanValue();
}
public void expectIsCompleted(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isCompleted()"),params, new Boolean(valueToReturn) );
}
public void expectIsCompleted(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isCompleted()"),params,toThrow );
}
public void acceptIsCompleted(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isCompleted()"),params, new Boolean(valueToReturn) );
}
public void acceptIsCompleted(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isCompleted()"),params,toThrow );
}
public void setIsCompletedDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("isCompleted()"),null,new Boolean(toReturn));
}
public void setIsCompletedDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("isCompleted()"),null,toThrow);
}



public void acceptIsCompletedDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("isCompleted()"),params,valueToThrow);
}


    public int getPersistanceId()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getPersistanceId()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("getPersistanceId: called but not prepared");
    return ((Integer)returnValue).intValue();
}
public void expectGetPersistanceId(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params, new Integer(valueToReturn) );
}
public void expectGetPersistanceId(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params,toThrow );
}
public void acceptGetPersistanceId(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params, new Integer(valueToReturn) );
}
public void acceptGetPersistanceId(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceId()"),params,toThrow );
}
public void setGetPersistanceIdDummy(int toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getPersistanceId()"),null,new Integer(toReturn));
}
public void setGetPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceId()"),null,toThrow);
}



public void acceptGetPersistanceIdDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceId()"),params,valueToThrow);
}


    public void setPersistanceId(int p0_int)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setPersistanceId(int)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetPersistanceId(int p0_int)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params );
}
public void expectSetPersistanceId(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params,toThrow );
}
public void acceptSetPersistanceId(Object p0_int)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params );
}
public void acceptSetPersistanceId(Object p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceId(int)"),params,toThrow );
}
public void setSetPersistanceIdDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setPersistanceId(int)"),null,null);
}
public void setSetPersistanceIdDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceId(int)"),null,toThrow);
}
public void setSetPersistanceIdDummy(int p0_int,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Integer(p0_int));

    MockCore.setDummy( getClassObjectMethodSignature("setPersistanceId(int)"),params,toThrow);
}


public void acceptSetPersistanceIdDummy(Object p0_int, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_int);

    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceId(int)"),params,valueToThrow);
}


    public long getPersistanceVersion()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getPersistanceVersion()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("getPersistanceVersion: called but not prepared");
    return ((Long)returnValue).longValue();
}
public void expectGetPersistanceVersion(long valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params, new Long(valueToReturn) );
}
public void expectGetPersistanceVersion(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params,toThrow );
}
public void acceptGetPersistanceVersion(long valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params, new Long(valueToReturn) );
}
public void acceptGetPersistanceVersion(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getPersistanceVersion()"),params,toThrow );
}
public void setGetPersistanceVersionDummy(long toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getPersistanceVersion()"),null,new Long(toReturn));
}
public void setGetPersistanceVersionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceVersion()"),null,toThrow);
}



public void acceptGetPersistanceVersionDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getPersistanceVersion()"),params,valueToThrow);
}


    public void setPersistanceVersion(long p0_long)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(new Long(p0_long));

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setPersistanceVersion(long)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetPersistanceVersion(long p0_long)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Long(p0_long));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params );
}
public void expectSetPersistanceVersion(long p0_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Long(p0_long));

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params,toThrow );
}
public void acceptSetPersistanceVersion(Object p0_long)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_long);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params );
}
public void acceptSetPersistanceVersion(Object p0_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_long);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setPersistanceVersion(long)"),params,toThrow );
}
public void setSetPersistanceVersionDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setPersistanceVersion(long)"),null,null);
}
public void setSetPersistanceVersionDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceVersion(long)"),null,toThrow);
}
public void setSetPersistanceVersionDummy(long p0_long,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(new Long(p0_long));

    MockCore.setDummy( getClassObjectMethodSignature("setPersistanceVersion(long)"),params,toThrow);
}


public void acceptSetPersistanceVersionDummy(Object p0_long, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_long);

    MockCore.setDummy(getClassObjectMethodSignature("setPersistanceVersion(long)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.agilePlanning.domain.story.MockStory"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.agilePlanning.domain.story.Story";
}
