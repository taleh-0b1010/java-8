package com.baba.generics_collections.generics;

public interface GenericInterface<T> {

    public void method(T t);
}

//------------------------------------------------------

//The first is to specify the generic type in the class
class WayOne implements GenericInterface<Test> {

    @Override
    public void method(Test test) {}
}

//------------------------------------------------------

//The next way is to create a generic class
class WayTwo<T> implements GenericInterface<T> {

    @Override
    public void method(T t) {}
}

//------------------------------------------------------

class Test {}