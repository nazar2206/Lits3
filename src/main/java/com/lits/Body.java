package com.lits;

import java.util.Objects;

public class Body {
    int age = 20;
    String firstName = "Alex", lastName = "Brain",FullName = firstName +" "+ lastName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Body)) return false;
        Body body = (Body) o;
        return Objects.equals(firstName, body.firstName) &&
                Objects.equals(lastName, body.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(FullName.length()*age);
    }
}
