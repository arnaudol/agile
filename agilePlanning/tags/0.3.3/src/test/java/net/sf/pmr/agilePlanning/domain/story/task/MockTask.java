// MockCreator v2.9.0 build 3065; HashCode:-1908658932; net.sf.pmr.agilePlanning.domain.story.task.Task
package net.sf.pmr.agilePlanning.domain.story.task;

import de.abstrakt.mock.MockCore;

public class MockTask implements net.sf.pmr.agilePlanning.domain.story.task.Task, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public net.sf.pmr.agilePlanning.domain.story.task.MockTask.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.agilePlanning.domain.story.task.MockTask",null);
        return this;
    }

    public net.sf.pmr.agilePlanning.domain.story.task.MockTask.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"net.sf.pmr.agilePlanning.domain.story.task.MockTask",th);
        return this;
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


public void expectGetCharges(java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCharges()"),params, valueToReturn );
}
public void expectGetCharges(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCharges()"),params,toThrow );
}
public void acceptGetCharges(java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCharges()"),params, valueToReturn );
}
public void acceptGetCharges(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCharges()"),params,toThrow );
}
public void setGetChargesDummy(java.util.Set toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getCharges()"),null,toReturn);
}
public void setGetChargesDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getCharges()"),null,toThrow);
}



public void acceptGetChargesDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getCharges()"),params,valueToThrow);
}


public void expectSetCharges(java.util.Set p0_Set)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCharges(Set)"),params );
}
public void expectSetCharges(java.util.Set p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCharges(Set)"),params,toThrow );
}
public void acceptSetCharges(Object p0_Set)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCharges(Set)"),params );
}
public void acceptSetCharges(Object p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCharges(Set)"),params,toThrow );
}
public void setSetChargesDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setCharges(Set)"),null,null);
}
public void setSetChargesDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setCharges(Set)"),null,toThrow);
}
public void setSetChargesDummy(java.util.Set p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.setDummy( getClassObjectMethodSignature("setCharges(Set)"),params,toThrow);
}


public void acceptSetChargesDummy(Object p0_Set, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.setDummy(getClassObjectMethodSignature("setCharges(Set)"),params,valueToThrow);
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


public void expectDifferenceOfDaysBetweenEstimateAndCharge(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndCharge()"),params, new Double(valueToReturn) );
}
public void expectDifferenceOfDaysBetweenEstimateAndCharge(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndCharge()"),params,toThrow );
}
public void acceptDifferenceOfDaysBetweenEstimateAndCharge(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndCharge()"),params, new Double(valueToReturn) );
}
public void acceptDifferenceOfDaysBetweenEstimateAndCharge(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndCharge()"),params,toThrow );
}
public void setDifferenceOfDaysBetweenEstimateAndChargeDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndCharge()"),null,new Double(toReturn));
}
public void setDifferenceOfDaysBetweenEstimateAndChargeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndCharge()"),null,toThrow);
}



public void acceptDifferenceOfDaysBetweenEstimateAndChargeDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndCharge()"),params,valueToThrow);
}


public void expectDifferenceInPercentBetweenEstimateAndCharge(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndCharge()"),params, new Double(valueToReturn) );
}
public void expectDifferenceInPercentBetweenEstimateAndCharge(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndCharge()"),params,toThrow );
}
public void acceptDifferenceInPercentBetweenEstimateAndCharge(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndCharge()"),params, new Double(valueToReturn) );
}
public void acceptDifferenceInPercentBetweenEstimateAndCharge(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndCharge()"),params,toThrow );
}
public void setDifferenceInPercentBetweenEstimateAndChargeDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndCharge()"),null,new Double(toReturn));
}
public void setDifferenceInPercentBetweenEstimateAndChargeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndCharge()"),null,toThrow);
}



public void acceptDifferenceInPercentBetweenEstimateAndChargeDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndCharge()"),params,valueToThrow);
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


public void expectGetOwner(net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getOwner()"),params, valueToReturn );
}
public void expectGetOwner(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getOwner()"),params,toThrow );
}
public void acceptGetOwner(net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getOwner()"),params, valueToReturn );
}
public void acceptGetOwner(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getOwner()"),params,toThrow );
}
public void setGetOwnerDummy(net.sf.pmr.core.domain.user.User toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getOwner()"),null,toReturn);
}
public void setGetOwnerDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getOwner()"),null,toThrow);
}



public void acceptGetOwnerDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getOwner()"),params,valueToThrow);
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


public void expectSetOwner(net.sf.pmr.core.domain.user.User p0_User)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setOwner(User)"),params );
}
public void expectSetOwner(net.sf.pmr.core.domain.user.User p0_User,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setOwner(User)"),params,toThrow );
}
public void acceptSetOwner(Object p0_User)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setOwner(User)"),params );
}
public void acceptSetOwner(Object p0_User,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setOwner(User)"),params,toThrow );
}
public void setSetOwnerDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setOwner(User)"),null,null);
}
public void setSetOwnerDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setOwner(User)"),null,toThrow);
}
public void setSetOwnerDummy(net.sf.pmr.core.domain.user.User p0_User,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_User);

    MockCore.setDummy( getClassObjectMethodSignature("setOwner(User)"),params,toThrow);
}


public void acceptSetOwnerDummy(Object p0_User, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_User);

    MockCore.setDummy(getClassObjectMethodSignature("setOwner(User)"),params,valueToThrow);
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


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.agilePlanning.domain.story.task.MockTask"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.agilePlanning.domain.story.task.Task";
}
    public MockTask()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("net.sf.pmr.agilePlanning.domain.story.task.MockTask",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static net.sf.pmr.agilePlanning.domain.story.task.MockTask.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"net.sf.pmr.agilePlanning.domain.story.task.MockTask",params);
        return new net.sf.pmr.agilePlanning.domain.story.task.MockTask.PreMock(id);
    }

    public static net.sf.pmr.agilePlanning.domain.story.task.MockTask.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.agilePlanning.domain.story.task.MockTask",null);
        return new net.sf.pmr.agilePlanning.domain.story.task.MockTask.PreMock(id);
    }

    public static net.sf.pmr.agilePlanning.domain.story.task.MockTask.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"net.sf.pmr.agilePlanning.domain.story.task.MockTask",th);
        return new net.sf.pmr.agilePlanning.domain.story.task.MockTask.PreMock(id);
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


    public java.util.Set getCharges()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getCharges()"),params,MockCore.OPT_DEFAULT);
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
public void expectGetCharges(java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCharges()"),params, valueToReturn );
}
public void expectGetCharges(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCharges()"),params,toThrow );
}
public void acceptGetCharges(java.util.Set valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCharges()"),params, valueToReturn );
}
public void acceptGetCharges(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getCharges()"),params,toThrow );
}
public void setGetChargesDummy(java.util.Set toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getCharges()"),null,toReturn);
}
public void setGetChargesDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getCharges()"),null,toThrow);
}



public void acceptGetChargesDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getCharges()"),params,valueToThrow);
}


    public void setCharges(java.util.Set p0_Set)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setCharges(Set)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetCharges(java.util.Set p0_Set)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCharges(Set)"),params );
}
public void expectSetCharges(java.util.Set p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCharges(Set)"),params,toThrow );
}
public void acceptSetCharges(Object p0_Set)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCharges(Set)"),params );
}
public void acceptSetCharges(Object p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setCharges(Set)"),params,toThrow );
}
public void setSetChargesDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setCharges(Set)"),null,null);
}
public void setSetChargesDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setCharges(Set)"),null,toThrow);
}
public void setSetChargesDummy(java.util.Set p0_Set,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Set);

    MockCore.setDummy( getClassObjectMethodSignature("setCharges(Set)"),params,toThrow);
}


public void acceptSetChargesDummy(Object p0_Set, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Set);

    MockCore.setDummy(getClassObjectMethodSignature("setCharges(Set)"),params,valueToThrow);
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


    public double differenceOfDaysBetweenEstimateAndCharge()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndCharge()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("differenceOfDaysBetweenEstimateAndCharge: called but not prepared");
    return ((Double)returnValue).doubleValue();
}
public void expectDifferenceOfDaysBetweenEstimateAndCharge(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndCharge()"),params, new Double(valueToReturn) );
}
public void expectDifferenceOfDaysBetweenEstimateAndCharge(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndCharge()"),params,toThrow );
}
public void acceptDifferenceOfDaysBetweenEstimateAndCharge(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndCharge()"),params, new Double(valueToReturn) );
}
public void acceptDifferenceOfDaysBetweenEstimateAndCharge(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndCharge()"),params,toThrow );
}
public void setDifferenceOfDaysBetweenEstimateAndChargeDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndCharge()"),null,new Double(toReturn));
}
public void setDifferenceOfDaysBetweenEstimateAndChargeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndCharge()"),null,toThrow);
}



public void acceptDifferenceOfDaysBetweenEstimateAndChargeDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("differenceOfDaysBetweenEstimateAndCharge()"),params,valueToThrow);
}


    public double differenceInPercentBetweenEstimateAndCharge()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndCharge()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("differenceInPercentBetweenEstimateAndCharge: called but not prepared");
    return ((Double)returnValue).doubleValue();
}
public void expectDifferenceInPercentBetweenEstimateAndCharge(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndCharge()"),params, new Double(valueToReturn) );
}
public void expectDifferenceInPercentBetweenEstimateAndCharge(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndCharge()"),params,toThrow );
}
public void acceptDifferenceInPercentBetweenEstimateAndCharge(double valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndCharge()"),params, new Double(valueToReturn) );
}
public void acceptDifferenceInPercentBetweenEstimateAndCharge(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndCharge()"),params,toThrow );
}
public void setDifferenceInPercentBetweenEstimateAndChargeDummy(double toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndCharge()"),null,new Double(toReturn));
}
public void setDifferenceInPercentBetweenEstimateAndChargeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndCharge()"),null,toThrow);
}



public void acceptDifferenceInPercentBetweenEstimateAndChargeDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("differenceInPercentBetweenEstimateAndCharge()"),params,valueToThrow);
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


    public net.sf.pmr.core.domain.user.User getOwner()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("getOwner()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (net.sf.pmr.core.domain.user.User)returnValue;
}
public void expectGetOwner(net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getOwner()"),params, valueToReturn );
}
public void expectGetOwner(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getOwner()"),params,toThrow );
}
public void acceptGetOwner(net.sf.pmr.core.domain.user.User valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getOwner()"),params, valueToReturn );
}
public void acceptGetOwner(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("getOwner()"),params,toThrow );
}
public void setGetOwnerDummy(net.sf.pmr.core.domain.user.User toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("getOwner()"),null,toReturn);
}
public void setGetOwnerDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("getOwner()"),null,toThrow);
}



public void acceptGetOwnerDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("getOwner()"),params,valueToThrow);
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


    public void setOwner(net.sf.pmr.core.domain.user.User p0_User)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_User);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("setOwner(User)"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectSetOwner(net.sf.pmr.core.domain.user.User p0_User)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setOwner(User)"),params );
}
public void expectSetOwner(net.sf.pmr.core.domain.user.User p0_User,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setOwner(User)"),params,toThrow );
}
public void acceptSetOwner(Object p0_User)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setOwner(User)"),params );
}
public void acceptSetOwner(Object p0_User,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_User);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("setOwner(User)"),params,toThrow );
}
public void setSetOwnerDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("setOwner(User)"),null,null);
}
public void setSetOwnerDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("setOwner(User)"),null,toThrow);
}
public void setSetOwnerDummy(net.sf.pmr.core.domain.user.User p0_User,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_User);

    MockCore.setDummy( getClassObjectMethodSignature("setOwner(User)"),params,toThrow);
}


public void acceptSetOwnerDummy(Object p0_User, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_User);

    MockCore.setDummy(getClassObjectMethodSignature("setOwner(User)"),params,valueToThrow);
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


    private String getClassObjectMethodSignature(String method){ return "net.sf.pmr.agilePlanning.domain.story.task.MockTask"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "net.sf.pmr.agilePlanning.domain.story.task.Task";
}
