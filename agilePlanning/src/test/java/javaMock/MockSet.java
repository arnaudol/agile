// MockCreator v2.9.0 build 3065; HashCode:607414761; java.util.Set
package javaMock;

import de.abstrakt.mock.MockCore;

public class MockSet implements java.util.Set, de.abstrakt.mock.MockBase 
{
public static class PreMock implements de.abstrakt.mock.MockBase 
{
     public PreMock(String id){ this.id = id; }
     public PreMock(){ this.id = (String)MockCore.generateId(null,null); }
    public javaMock.MockSet.PreMock expectAnyCtor()
    {
        id = MockCore.addExpectedAnyCtor(__id(),"java.util.MockSet",null);
        return this;
    }

    public javaMock.MockSet.PreMock expectAnyCtor(Throwable th)
    {
        id = MockCore.addExpectedAnyCtor(__id(),"java.util.MockSet",th);
        return this;
    }

public void expectAdd(java.lang.Object p0_Object, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("add(Object)"),params, new Boolean(valueToReturn) );
}
public void expectAdd(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("add(Object)"),params,toThrow );
}
public void acceptAdd(Object p0_Object, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("add(Object)"),params, new Boolean(valueToReturn) );
}
public void acceptAdd(Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("add(Object)"),params,toThrow );
}
public void setAddDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("add(Object)"),null,new Boolean(toReturn));
}
public void setAddDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("add(Object)"),null,toThrow);
}
public void setAddDummy(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("add(Object)"),params,toThrow);
}
public void setAddDummy(java.lang.Object p0_Object,boolean toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("add(Object)"),params,new Boolean(toReturn));
}
public void acceptAddDummy(Object p0_Object, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("add(Object)"),params, new Boolean(valueToReturn) );
}
public void acceptAddDummy(Object p0_Object, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy(getClassObjectMethodSignature("add(Object)"),params,valueToThrow);
}


public void expectClear()
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("clear()"),params );
}
public void expectClear(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("clear()"),params,toThrow );
}
public void acceptClear()
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("clear()"),params );
}
public void acceptClear(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("clear()"),params,toThrow );
}
public void setClearDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("clear()"),null,null);
}
public void setClearDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("clear()"),null,toThrow);
}



public void acceptClearDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("clear()"),params,valueToThrow);
}


public void expectContains(java.lang.Object p0_Object, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("contains(Object)"),params, new Boolean(valueToReturn) );
}
public void expectContains(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("contains(Object)"),params,toThrow );
}
public void acceptContains(Object p0_Object, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("contains(Object)"),params, new Boolean(valueToReturn) );
}
public void acceptContains(Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("contains(Object)"),params,toThrow );
}
public void setContainsDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("contains(Object)"),null,new Boolean(toReturn));
}
public void setContainsDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("contains(Object)"),null,toThrow);
}
public void setContainsDummy(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("contains(Object)"),params,toThrow);
}
public void setContainsDummy(java.lang.Object p0_Object,boolean toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("contains(Object)"),params,new Boolean(toReturn));
}
public void acceptContainsDummy(Object p0_Object, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("contains(Object)"),params, new Boolean(valueToReturn) );
}
public void acceptContainsDummy(Object p0_Object, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy(getClassObjectMethodSignature("contains(Object)"),params,valueToThrow);
}


public void expectAddAll(java.util.Collection p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void expectAddAll(java.util.Collection p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addAll(Collection)"),params,toThrow );
}
public void acceptAddAll(Object p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void acceptAddAll(Object p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addAll(Collection)"),params,toThrow );
}
public void setAddAllDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("addAll(Collection)"),null,new Boolean(toReturn));
}
public void setAddAllDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addAll(Collection)"),null,toThrow);
}
public void setAddAllDummy(java.util.Collection p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("addAll(Collection)"),params,toThrow);
}
public void setAddAllDummy(java.util.Collection p0_Collection,boolean toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("addAll(Collection)"),params,new Boolean(toReturn));
}
public void acceptAddAllDummy(Object p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("addAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void acceptAddAllDummy(Object p0_Collection, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.setDummy(getClassObjectMethodSignature("addAll(Collection)"),params,valueToThrow);
}


public void expectIterator(java.util.Iterator valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("iterator()"),params, valueToReturn );
}
public void expectIterator(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("iterator()"),params,toThrow );
}
public void acceptIterator(java.util.Iterator valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("iterator()"),params, valueToReturn );
}
public void acceptIterator(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("iterator()"),params,toThrow );
}
public void setIteratorDummy(java.util.Iterator toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("iterator()"),null,toReturn);
}
public void setIteratorDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("iterator()"),null,toThrow);
}



public void acceptIteratorDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("iterator()"),params,valueToThrow);
}


public void expectSize(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("size()"),params, new Integer(valueToReturn) );
}
public void expectSize(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("size()"),params,toThrow );
}
public void acceptSize(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("size()"),params, new Integer(valueToReturn) );
}
public void acceptSize(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("size()"),params,toThrow );
}
public void setSizeDummy(int toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("size()"),null,new Integer(toReturn));
}
public void setSizeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("size()"),null,toThrow);
}



public void acceptSizeDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("size()"),params,valueToThrow);
}


public void expectToArray(java.lang.Object[] p0_Object1D, java.lang.Object[] valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("toArray(Object1D)"),params, valueToReturn );
}
public void expectToArray(java.lang.Object[] p0_Object1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("toArray(Object1D)"),params,toThrow );
}
public void acceptToArray(Object p0_Object1D, java.lang.Object[] valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("toArray(Object1D)"),params, valueToReturn );
}
public void acceptToArray(Object p0_Object1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("toArray(Object1D)"),params,toThrow );
}
public void setToArray_Object1DDummy(java.lang.Object[] toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("toArray(Object1D)"),null,toReturn);
}
public void setToArray_Object1DDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("toArray(Object1D)"),null,toThrow);
}
public void setToArrayDummy(java.lang.Object[] p0_Object1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object1D);

    MockCore.setDummy( getClassObjectMethodSignature("toArray(Object1D)"),params,toThrow);
}
public void setToArrayDummy(java.lang.Object[] p0_Object1D,java.lang.Object[] toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object1D);

    MockCore.setDummy( getClassObjectMethodSignature("toArray(Object1D)"),params,toReturn);
}
public void acceptToArrayDummy(Object p0_Object1D, java.lang.Object[] valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object1D);

    MockCore.setDummy( getClassObjectMethodSignature("toArray(Object1D)"),params, valueToReturn );
}
public void acceptToArrayDummy(Object p0_Object1D, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object1D);

    MockCore.setDummy(getClassObjectMethodSignature("toArray(Object1D)"),params,valueToThrow);
}


public void expectToArray(java.lang.Object[] valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("toArray()"),params, valueToReturn );
}
public void expectToArray(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("toArray()"),params,toThrow );
}
public void acceptToArray(java.lang.Object[] valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("toArray()"),params, valueToReturn );
}
public void acceptToArray(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("toArray()"),params,toThrow );
}
public void setToArrayDummy(java.lang.Object[] toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("toArray()"),null,toReturn);
}
public void setToArrayDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("toArray()"),null,toThrow);
}



public void acceptToArrayDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("toArray()"),params,valueToThrow);
}


public void expectRemove(java.lang.Object p0_Object, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("remove(Object)"),params, new Boolean(valueToReturn) );
}
public void expectRemove(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("remove(Object)"),params,toThrow );
}
public void acceptRemove(Object p0_Object, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("remove(Object)"),params, new Boolean(valueToReturn) );
}
public void acceptRemove(Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("remove(Object)"),params,toThrow );
}
public void setRemoveDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("remove(Object)"),null,new Boolean(toReturn));
}
public void setRemoveDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("remove(Object)"),null,toThrow);
}
public void setRemoveDummy(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("remove(Object)"),params,toThrow);
}
public void setRemoveDummy(java.lang.Object p0_Object,boolean toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("remove(Object)"),params,new Boolean(toReturn));
}
public void acceptRemoveDummy(Object p0_Object, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("remove(Object)"),params, new Boolean(valueToReturn) );
}
public void acceptRemoveDummy(Object p0_Object, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy(getClassObjectMethodSignature("remove(Object)"),params,valueToThrow);
}


public void expectIsEmpty(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isEmpty()"),params, new Boolean(valueToReturn) );
}
public void expectIsEmpty(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isEmpty()"),params,toThrow );
}
public void acceptIsEmpty(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isEmpty()"),params, new Boolean(valueToReturn) );
}
public void acceptIsEmpty(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isEmpty()"),params,toThrow );
}
public void setIsEmptyDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("isEmpty()"),null,new Boolean(toReturn));
}
public void setIsEmptyDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("isEmpty()"),null,toThrow);
}



public void acceptIsEmptyDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("isEmpty()"),params,valueToThrow);
}


public void expectContainsAll(java.util.Collection p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("containsAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void expectContainsAll(java.util.Collection p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("containsAll(Collection)"),params,toThrow );
}
public void acceptContainsAll(Object p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("containsAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void acceptContainsAll(Object p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("containsAll(Collection)"),params,toThrow );
}
public void setContainsAllDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("containsAll(Collection)"),null,new Boolean(toReturn));
}
public void setContainsAllDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("containsAll(Collection)"),null,toThrow);
}
public void setContainsAllDummy(java.util.Collection p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("containsAll(Collection)"),params,toThrow);
}
public void setContainsAllDummy(java.util.Collection p0_Collection,boolean toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("containsAll(Collection)"),params,new Boolean(toReturn));
}
public void acceptContainsAllDummy(Object p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("containsAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void acceptContainsAllDummy(Object p0_Collection, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.setDummy(getClassObjectMethodSignature("containsAll(Collection)"),params,valueToThrow);
}


public void expectRemoveAll(java.util.Collection p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("removeAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void expectRemoveAll(java.util.Collection p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("removeAll(Collection)"),params,toThrow );
}
public void acceptRemoveAll(Object p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("removeAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void acceptRemoveAll(Object p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("removeAll(Collection)"),params,toThrow );
}
public void setRemoveAllDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("removeAll(Collection)"),null,new Boolean(toReturn));
}
public void setRemoveAllDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("removeAll(Collection)"),null,toThrow);
}
public void setRemoveAllDummy(java.util.Collection p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("removeAll(Collection)"),params,toThrow);
}
public void setRemoveAllDummy(java.util.Collection p0_Collection,boolean toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("removeAll(Collection)"),params,new Boolean(toReturn));
}
public void acceptRemoveAllDummy(Object p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("removeAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void acceptRemoveAllDummy(Object p0_Collection, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.setDummy(getClassObjectMethodSignature("removeAll(Collection)"),params,valueToThrow);
}


public void expectRetainAll(java.util.Collection p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("retainAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void expectRetainAll(java.util.Collection p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("retainAll(Collection)"),params,toThrow );
}
public void acceptRetainAll(Object p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("retainAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void acceptRetainAll(Object p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("retainAll(Collection)"),params,toThrow );
}
public void setRetainAllDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("retainAll(Collection)"),null,new Boolean(toReturn));
}
public void setRetainAllDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("retainAll(Collection)"),null,toThrow);
}
public void setRetainAllDummy(java.util.Collection p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("retainAll(Collection)"),params,toThrow);
}
public void setRetainAllDummy(java.util.Collection p0_Collection,boolean toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("retainAll(Collection)"),params,new Boolean(toReturn));
}
public void acceptRetainAllDummy(Object p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("retainAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void acceptRetainAllDummy(Object p0_Collection, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.setDummy(getClassObjectMethodSignature("retainAll(Collection)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "java.util.MockSet"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "java.util.Set";
}
    public MockSet()
    {
        java.util.List params = new java.util.ArrayList();
        Object idex = MockCore.generateId("java.util.MockSet",params);
        if( idex instanceof Throwable )
        {
        }
        if( id != null && !id.equals(idex) ) throw new RuntimeException("expected construction of mock#"+id+" but constructed #"+idex);        id = (String)idex;
    }

    public static javaMock.MockSet.PreMock expectCtor()
    {
        java.util.List params = new java.util.ArrayList();
        String id = MockCore.addExpectedCtor(null,"java.util.MockSet",params);
        return new javaMock.MockSet.PreMock(id);
    }

    public static javaMock.MockSet.PreMock expectAnyCtor()
    {
        String id = MockCore.addExpectedAnyCtor(null,"java.util.MockSet",null);
        return new javaMock.MockSet.PreMock(id);
    }

    public static javaMock.MockSet.PreMock expectAnyCtor(Throwable th)
    {
        String id = MockCore.addExpectedAnyCtor(null,"java.util.MockSet",th);
        return new javaMock.MockSet.PreMock(id);
    }

    public boolean add(java.lang.Object p0_Object)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("add(Object)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("add: called but not prepared");
    return ((Boolean)returnValue).booleanValue();
}
public void expectAdd(java.lang.Object p0_Object, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("add(Object)"),params, new Boolean(valueToReturn) );
}
public void expectAdd(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("add(Object)"),params,toThrow );
}
public void acceptAdd(Object p0_Object, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("add(Object)"),params, new Boolean(valueToReturn) );
}
public void acceptAdd(Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("add(Object)"),params,toThrow );
}
public void setAddDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("add(Object)"),null,new Boolean(toReturn));
}
public void setAddDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("add(Object)"),null,toThrow);
}
public void setAddDummy(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("add(Object)"),params,toThrow);
}
public void setAddDummy(java.lang.Object p0_Object,boolean toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("add(Object)"),params,new Boolean(toReturn));
}
public void acceptAddDummy(Object p0_Object, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("add(Object)"),params, new Boolean(valueToReturn) );
}
public void acceptAddDummy(Object p0_Object, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy(getClassObjectMethodSignature("add(Object)"),params,valueToThrow);
}


    public void clear()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("clear()"),params,MockCore.OPT_UNEXPECTED_VOID_OKAY);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
}
public void expectClear()
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("clear()"),params );
}
public void expectClear(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("clear()"),params,toThrow );
}
public void acceptClear()
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("clear()"),params );
}
public void acceptClear(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("clear()"),params,toThrow );
}
public void setClearDummy()
{
  MockCore.setDummy(getClassObjectMethodSignature("clear()"),null,null);
}
public void setClearDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("clear()"),null,toThrow);
}



public void acceptClearDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("clear()"),params,valueToThrow);
}


    public boolean contains(java.lang.Object p0_Object)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("contains(Object)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("contains: called but not prepared");
    return ((Boolean)returnValue).booleanValue();
}
public void expectContains(java.lang.Object p0_Object, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("contains(Object)"),params, new Boolean(valueToReturn) );
}
public void expectContains(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("contains(Object)"),params,toThrow );
}
public void acceptContains(Object p0_Object, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("contains(Object)"),params, new Boolean(valueToReturn) );
}
public void acceptContains(Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("contains(Object)"),params,toThrow );
}
public void setContainsDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("contains(Object)"),null,new Boolean(toReturn));
}
public void setContainsDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("contains(Object)"),null,toThrow);
}
public void setContainsDummy(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("contains(Object)"),params,toThrow);
}
public void setContainsDummy(java.lang.Object p0_Object,boolean toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("contains(Object)"),params,new Boolean(toReturn));
}
public void acceptContainsDummy(Object p0_Object, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("contains(Object)"),params, new Boolean(valueToReturn) );
}
public void acceptContainsDummy(Object p0_Object, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy(getClassObjectMethodSignature("contains(Object)"),params,valueToThrow);
}


    public boolean addAll(java.util.Collection p0_Collection)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("addAll(Collection)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("addAll: called but not prepared");
    return ((Boolean)returnValue).booleanValue();
}
public void expectAddAll(java.util.Collection p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void expectAddAll(java.util.Collection p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addAll(Collection)"),params,toThrow );
}
public void acceptAddAll(Object p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void acceptAddAll(Object p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("addAll(Collection)"),params,toThrow );
}
public void setAddAllDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("addAll(Collection)"),null,new Boolean(toReturn));
}
public void setAddAllDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("addAll(Collection)"),null,toThrow);
}
public void setAddAllDummy(java.util.Collection p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("addAll(Collection)"),params,toThrow);
}
public void setAddAllDummy(java.util.Collection p0_Collection,boolean toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("addAll(Collection)"),params,new Boolean(toReturn));
}
public void acceptAddAllDummy(Object p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("addAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void acceptAddAllDummy(Object p0_Collection, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.setDummy(getClassObjectMethodSignature("addAll(Collection)"),params,valueToThrow);
}


    public java.util.Iterator iterator()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("iterator()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (java.util.Iterator)returnValue;
}
public void expectIterator(java.util.Iterator valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("iterator()"),params, valueToReturn );
}
public void expectIterator(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("iterator()"),params,toThrow );
}
public void acceptIterator(java.util.Iterator valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("iterator()"),params, valueToReturn );
}
public void acceptIterator(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("iterator()"),params,toThrow );
}
public void setIteratorDummy(java.util.Iterator toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("iterator()"),null,toReturn);
}
public void setIteratorDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("iterator()"),null,toThrow);
}



public void acceptIteratorDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("iterator()"),params,valueToThrow);
}


    public int size()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("size()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("size: called but not prepared");
    return ((Integer)returnValue).intValue();
}
public void expectSize(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("size()"),params, new Integer(valueToReturn) );
}
public void expectSize(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("size()"),params,toThrow );
}
public void acceptSize(int valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("size()"),params, new Integer(valueToReturn) );
}
public void acceptSize(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("size()"),params,toThrow );
}
public void setSizeDummy(int toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("size()"),null,new Integer(toReturn));
}
public void setSizeDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("size()"),null,toThrow);
}



public void acceptSizeDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("size()"),params,valueToThrow);
}


    public java.lang.Object[] toArray(java.lang.Object[] p0_Object1D)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Object1D);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("toArray(Object1D)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (java.lang.Object[])returnValue;
}
public void expectToArray(java.lang.Object[] p0_Object1D, java.lang.Object[] valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("toArray(Object1D)"),params, valueToReturn );
}
public void expectToArray(java.lang.Object[] p0_Object1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("toArray(Object1D)"),params,toThrow );
}
public void acceptToArray(Object p0_Object1D, java.lang.Object[] valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("toArray(Object1D)"),params, valueToReturn );
}
public void acceptToArray(Object p0_Object1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object1D);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("toArray(Object1D)"),params,toThrow );
}
public void setToArray_Object1DDummy(java.lang.Object[] toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("toArray(Object1D)"),null,toReturn);
}
public void setToArray_Object1DDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("toArray(Object1D)"),null,toThrow);
}
public void setToArrayDummy(java.lang.Object[] p0_Object1D,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object1D);

    MockCore.setDummy( getClassObjectMethodSignature("toArray(Object1D)"),params,toThrow);
}
public void setToArrayDummy(java.lang.Object[] p0_Object1D,java.lang.Object[] toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object1D);

    MockCore.setDummy( getClassObjectMethodSignature("toArray(Object1D)"),params,toReturn);
}
public void acceptToArrayDummy(Object p0_Object1D, java.lang.Object[] valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object1D);

    MockCore.setDummy( getClassObjectMethodSignature("toArray(Object1D)"),params, valueToReturn );
}
public void acceptToArrayDummy(Object p0_Object1D, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object1D);

    MockCore.setDummy(getClassObjectMethodSignature("toArray(Object1D)"),params,valueToThrow);
}


    public java.lang.Object[] toArray()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("toArray()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    return (java.lang.Object[])returnValue;
}
public void expectToArray(java.lang.Object[] valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("toArray()"),params, valueToReturn );
}
public void expectToArray(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("toArray()"),params,toThrow );
}
public void acceptToArray(java.lang.Object[] valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("toArray()"),params, valueToReturn );
}
public void acceptToArray(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("toArray()"),params,toThrow );
}
public void setToArrayDummy(java.lang.Object[] toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("toArray()"),null,toReturn);
}
public void setToArrayDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("toArray()"),null,toThrow);
}



public void acceptToArrayDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("toArray()"),params,valueToThrow);
}


    public boolean remove(java.lang.Object p0_Object)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("remove(Object)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("remove: called but not prepared");
    return ((Boolean)returnValue).booleanValue();
}
public void expectRemove(java.lang.Object p0_Object, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("remove(Object)"),params, new Boolean(valueToReturn) );
}
public void expectRemove(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("remove(Object)"),params,toThrow );
}
public void acceptRemove(Object p0_Object, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("remove(Object)"),params, new Boolean(valueToReturn) );
}
public void acceptRemove(Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("remove(Object)"),params,toThrow );
}
public void setRemoveDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("remove(Object)"),null,new Boolean(toReturn));
}
public void setRemoveDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("remove(Object)"),null,toThrow);
}
public void setRemoveDummy(java.lang.Object p0_Object,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("remove(Object)"),params,toThrow);
}
public void setRemoveDummy(java.lang.Object p0_Object,boolean toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("remove(Object)"),params,new Boolean(toReturn));
}
public void acceptRemoveDummy(Object p0_Object, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy( getClassObjectMethodSignature("remove(Object)"),params, new Boolean(valueToReturn) );
}
public void acceptRemoveDummy(Object p0_Object, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Object);

    MockCore.setDummy(getClassObjectMethodSignature("remove(Object)"),params,valueToThrow);
}


    public boolean isEmpty()
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("isEmpty()"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("isEmpty: called but not prepared");
    return ((Boolean)returnValue).booleanValue();
}
public void expectIsEmpty(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isEmpty()"),params, new Boolean(valueToReturn) );
}
public void expectIsEmpty(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isEmpty()"),params,toThrow );
}
public void acceptIsEmpty(boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isEmpty()"),params, new Boolean(valueToReturn) );
}
public void acceptIsEmpty(java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("isEmpty()"),params,toThrow );
}
public void setIsEmptyDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("isEmpty()"),null,new Boolean(toReturn));
}
public void setIsEmptyDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("isEmpty()"),null,toThrow);
}



public void acceptIsEmptyDummy(java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();

    MockCore.setDummy(getClassObjectMethodSignature("isEmpty()"),params,valueToThrow);
}


    public boolean containsAll(java.util.Collection p0_Collection)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("containsAll(Collection)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("containsAll: called but not prepared");
    return ((Boolean)returnValue).booleanValue();
}
public void expectContainsAll(java.util.Collection p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("containsAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void expectContainsAll(java.util.Collection p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("containsAll(Collection)"),params,toThrow );
}
public void acceptContainsAll(Object p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("containsAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void acceptContainsAll(Object p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("containsAll(Collection)"),params,toThrow );
}
public void setContainsAllDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("containsAll(Collection)"),null,new Boolean(toReturn));
}
public void setContainsAllDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("containsAll(Collection)"),null,toThrow);
}
public void setContainsAllDummy(java.util.Collection p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("containsAll(Collection)"),params,toThrow);
}
public void setContainsAllDummy(java.util.Collection p0_Collection,boolean toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("containsAll(Collection)"),params,new Boolean(toReturn));
}
public void acceptContainsAllDummy(Object p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("containsAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void acceptContainsAllDummy(Object p0_Collection, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.setDummy(getClassObjectMethodSignature("containsAll(Collection)"),params,valueToThrow);
}


    public boolean removeAll(java.util.Collection p0_Collection)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("removeAll(Collection)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("removeAll: called but not prepared");
    return ((Boolean)returnValue).booleanValue();
}
public void expectRemoveAll(java.util.Collection p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("removeAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void expectRemoveAll(java.util.Collection p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("removeAll(Collection)"),params,toThrow );
}
public void acceptRemoveAll(Object p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("removeAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void acceptRemoveAll(Object p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("removeAll(Collection)"),params,toThrow );
}
public void setRemoveAllDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("removeAll(Collection)"),null,new Boolean(toReturn));
}
public void setRemoveAllDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("removeAll(Collection)"),null,toThrow);
}
public void setRemoveAllDummy(java.util.Collection p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("removeAll(Collection)"),params,toThrow);
}
public void setRemoveAllDummy(java.util.Collection p0_Collection,boolean toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("removeAll(Collection)"),params,new Boolean(toReturn));
}
public void acceptRemoveAllDummy(Object p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("removeAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void acceptRemoveAllDummy(Object p0_Collection, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.setDummy(getClassObjectMethodSignature("removeAll(Collection)"),params,valueToThrow);
}


    public boolean retainAll(java.util.Collection p0_Collection)
    {
        id = MockCore.enteredMethodBody(id);
        Object returnValue = null;
        java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

        returnValue = MockCore.getReturnValue( getClassObjectMethodSignature("retainAll(Collection)"),params,MockCore.OPT_DEFAULT);
    if( returnValue instanceof RuntimeException )
    {
        throw (RuntimeException)returnValue;
    }
    if( returnValue instanceof Error )
    {
        throw (Error)returnValue;
    }
    if( returnValue == null ) throw MockCore.makeException("retainAll: called but not prepared");
    return ((Boolean)returnValue).booleanValue();
}
public void expectRetainAll(java.util.Collection p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("retainAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void expectRetainAll(java.util.Collection p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("retainAll(Collection)"),params,toThrow );
}
public void acceptRetainAll(Object p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("retainAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void acceptRetainAll(Object p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.addExpectedMethodCall( getClassObjectMethodSignature("retainAll(Collection)"),params,toThrow );
}
public void setRetainAllDummy(boolean toReturn)
{
  MockCore.setDummy(getClassObjectMethodSignature("retainAll(Collection)"),null,new Boolean(toReturn));
}
public void setRetainAllDummy(java.lang.Throwable toThrow)
{
    MockCore.setDummy(getClassObjectMethodSignature("retainAll(Collection)"),null,toThrow);
}
public void setRetainAllDummy(java.util.Collection p0_Collection,java.lang.Throwable toThrow)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("retainAll(Collection)"),params,toThrow);
}
public void setRetainAllDummy(java.util.Collection p0_Collection,boolean toReturn)
{
    java.util.List params = new java.util.ArrayList();
        params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("retainAll(Collection)"),params,new Boolean(toReturn));
}
public void acceptRetainAllDummy(Object p0_Collection, boolean valueToReturn)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.setDummy( getClassObjectMethodSignature("retainAll(Collection)"),params, new Boolean(valueToReturn) );
}
public void acceptRetainAllDummy(Object p0_Collection, java.lang.Throwable valueToThrow)
{
    java.util.List params = new java.util.ArrayList();
params.add(p0_Collection);

    MockCore.setDummy(getClassObjectMethodSignature("retainAll(Collection)"),params,valueToThrow);
}


    private String getClassObjectMethodSignature(String method){ return "java.util.MockSet"+"#"+__id()+"#"+method; }
    private String id;
    public String __id(){ return id; }
    public static final String MOCK_CREATOR_BASE_TYPE = "java.util.Set";
}
