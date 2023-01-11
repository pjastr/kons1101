package pl.uwm.wmii.kaz.pjastr;

import java.time.LocalDate;

public class TestCourt {
    public static void main(String[] args)
    {
        Court c1 = new Court(100.03, 56.2,"Słoneczna 54", 2000);
        System.out.println(c1.getWidth());
        System.out.println(c1.getLength());
        System.out.println(c1.getAddress());
        System.out.println(c1.getYear_built());
        c1.setWidth(50);
        c1.setLength(70);
        c1.setAddress("Oczapowskiego 2");
        c1.setYear_built(-9);
        System.out.println(c1.getWidth());
        System.out.println(c1.getLength());
        System.out.println(c1.getAddress());
        System.out.println(c1.getYear_built());
        System.out.println(c1.area());
        System.out.println(LocalDate.now().getYear());
        Court.validate(c1);
        System.out.println(c1.getYear_built());
        System.out.println(c1);
        Court c2 = new Court(50, 150, "sert",2018);
        System.out.println(c1.area());
        System.out.println(c2.area());
        System.out.println(c1.equals(c2));
        Stadium s1 = new Stadium(100, 50, "Słoneczna 10, 10-100 Olsztyn", 1999, "Słoneczny Stadion", "Słoneczko", 10000);
        System.out.println(s1);
        Stadium s2 = new Stadium(100, 50, "Słoneczna 10, 10-100 Olsztyn", 1999, "Słoneczny Stadion",  10000);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
    }

}
