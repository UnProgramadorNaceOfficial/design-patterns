package org.example.prototype;

public interface IPrototype<T extends IPrototype> extends Cloneable {

    // Clonacion simple / Simple clone
    public T clone();

    // Clonacion profunda / Deep clone
    public T deepClone();
}
