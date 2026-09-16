public class Chap_8_10 {

    enum Food {
        APPLE("fruit", 52),
        BANANA("fruit", 96),
        CARROT("vegetable", 41);

        private final String type;
        private final int calories;

        Food(String type, int calories) {
            this.type = type;
            this.calories = calories;
        }

        public String getType() {
            return type;
        }

        public int getCalories() {
            return calories;
        }
    }

    public static void main(String[] args) {
        for (Food food : Food.values()) {
            System.out.println("Food: " + food.name());
            System.out.println("Type: " + food.getType());
            System.out.println("Calories: " + food.getCalories());
            System.out.println();
        }
    }
}


