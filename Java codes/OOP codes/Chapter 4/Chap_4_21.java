public class Chap_4_21 {
    public static void main(String[] args) {
        System.out.println("Pythagorean Triples");
        System.out.println("Serial No \t Base \t Perpendicular \t Hypotenuse");
        int serial_no=1;
        for (int hypotenuse = 1; hypotenuse < 500; hypotenuse++)
        {
            for (int perpendicular = 1; perpendicular < 500; perpendicular++)
            {
                for (int base = 1; base < 500; base++)
                {
                    if ((base * base) + (perpendicular * perpendicular) == hypotenuse * hypotenuse)
                    {
                        System.out.println(serial_no+") \t\t\t "+ base +" \t\t\t "+ perpendicular +" \t\t\t "+ hypotenuse);
                        serial_no++;
                    }
                }
            }
        }
    }
}
