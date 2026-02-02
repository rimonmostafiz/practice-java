package com.rimonmostafiz.core.equality;

import java.util.Objects;

public class Person {
    Integer age;
    String name;

    public boolean equal(Object obj) {
        boolean isEqual;
        // there is problem with this, we are assuming obj is always Person
        // it can be a Cat or a Vehicle
        // so we should be careful while casting this to obj to Person
        // Person person = (Person) obj;

        //BETTER VERSION
        // if both of them are same reference then there is noting to check we can return true.
        if (this == obj) return true;

        // if obj is null -- Non-nullity -> an object should never be considered equal to null
        // we should never call equal method on a null object that will cause a NullPointerException
        // the next comparison is if they are not same type, then they can't be equal at all
        if (obj == null || getClass() != obj.getClass()) return false;

        // at this point we can safely cast on Person
        Person person = (Person) obj;

        // PROBLEM
        // this might work and might not work!!
        // as name is string and == on string check the reference only
        // so if name and person.name is same reference then this will pass
        // otherwise if they are different references but the value is same then this will return false
        isEqual = age == person.age && name == person.name;

        // PROBLEM
        // this seems that it will work but this might also not work as name can be null
        // then this will throw a NullPoiterException
        isEqual = age == person.age && name.equals(person.name);

        // PROBLEM
        // there is problem with this one also
        // if name is null then this is going to return false
        // but what if person.name is also null?? then we should return true, right??
        // we need to check if name is null and person.name is null then we should return true!!
        isEqual = age == person.age
                && name != null
                && name.equals(person.name);

        // BETTER VERSION
        // protects against null
        // NOTE: one thing to keep in mind is if name is a custom class that we implemented
        // then we have to make sure we've equal implemented on those class
        isEqual = age == person.age
                && Objects.equals(name, person.name);

        return isEqual;
    }
}
