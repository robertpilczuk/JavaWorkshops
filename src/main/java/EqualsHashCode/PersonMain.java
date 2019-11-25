package EqualsHashCode;

public class PersonMain {
    public static void main(String[] args) {

        Person osoba1 = new Person("Robert","Pilczuk", 20152,"Lublin", new Pesel(88111801312l));
        Person osoba2 = new Person("Jarek", "Osek", 20860,"Lublin", 93072111893l);
        Person osoba3 = new Person("robert","Pilczuk", 20152,"Lublin", 88111801312l);
        Person osoba4 = new Person("Ala","Pilczuk",20152,"Lublin",88121204840l);

        System.out.println(osoba1.equals(osoba2) + " Porównujemy os1 z os2 ");
        System.out.println(osoba1.equals(osoba3) + " Porównujemy os1 z os3 ");
        System.out.println(osoba2.equals(osoba3) + " Porównujemy os2 z os3 ");

        System.out.println(osoba1.hashCode()==osoba2.hashCode());
        System.out.println(osoba1.hashCode()==osoba3.hashCode());
        System.out.println(osoba2.hashCode()==osoba3.hashCode());
    }
}
