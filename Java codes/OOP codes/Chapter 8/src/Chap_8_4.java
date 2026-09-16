class Cylinder {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        setRadius(radius);
        setHeight(height);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius>0?radius:1;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height>0?height:1;
    }

    public double calculateVolume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
}

class Chap_8_4 {
        public static void main(String[] args) {
            Cylinder cylinder1 = new Cylinder(5.0,5.0);
            System.out.println("Cylinder 1 - Radius: " + cylinder1.getRadius() + ", Height: " + cylinder1.getHeight());
            System.out.println("Volume: " + cylinder1.calculateVolume());

            Cylinder cylinder2 = new Cylinder(2.5, 5.0);
            System.out.println("Cylinder 2 - Radius: " + cylinder2.getRadius() + ", Height: " + cylinder2.getHeight());
            System.out.println("Volume: " + cylinder2.calculateVolume());

        }
    }

