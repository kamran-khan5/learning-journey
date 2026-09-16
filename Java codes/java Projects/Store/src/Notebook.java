public class Notebook extends NonConsumable {
    private String color;
    private boolean isCollegeRuled;
    private int subject;

    public Notebook(String name, double price,  int maxNumUsages, String color, String isCollegeRuled, int subject) {
        super(name, price, "Notebook", maxNumUsages);
        this.color = color;
        setIsCollegeRuled(isCollegeRuled);
        setSubject(subject);
    }

    public String getColor() {
        return color;
    }

    public void setIsCollegeRuled(String collegeRuled) {
        this.isCollegeRuled= collegeRuled.equalsIgnoreCase("yes");
    }
    public void setSubject(int subject){
        this.subject = subject>0?subject:1;
    }

    public boolean getIsCollegeRuled() {
        return isCollegeRuled;
    }

    public int getSubject() {
        return subject;
    }

    @Override
    public boolean equals(Item item) {
        if (!super.equals(item)) {
            return false;
        }
        Notebook notebook = (Notebook) item;
        return color.equalsIgnoreCase(notebook.color) && isCollegeRuled == notebook.isCollegeRuled && subject == notebook.subject;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("\nColor: %s\nCollege Ruled: %s\nSubject: %d",
                color, getIsCollegeRuled() ? "Yes" : "No", getSubject());
    }

}
