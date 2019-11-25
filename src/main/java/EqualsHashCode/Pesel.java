package EqualsHashCode;

import java.util.Objects;

public class Pesel {
    private long pesel;

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pesel pesel1 = (Pesel) o;
        return pesel == pesel1.pesel;
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel);
    }

    public Pesel(long pesel) {
        this.pesel = pesel;
    }
}
