package com.test;

public class VariableExampleClass {

    private final int field;

    private static  final  int JAVA_CONSTANT=10;

    public VariableExampleClass() {
        this.field = 100;
    }

    public void changeValues(final int param)
    {
        //Not Allowed
        //param=1;
        final  int localVar;

        localVar=42;

        //Not Allowed 2nd assignment
        //localVar=43;

    }
}
