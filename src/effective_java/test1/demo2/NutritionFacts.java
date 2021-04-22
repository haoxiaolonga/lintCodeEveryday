package effective_java.test1.demo2;

import java.util.Date;


public class NutritionFacts {

    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Bulider {

        public Bulider(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        //Required parameters
        private final int servingSize;
        private final int servings;

        //可选参数
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;
        private int sodium = 0;

        public Bulider calories(int val) {
            calories = val;
            return this;
        }


        public Bulider fat(int val) {
            fat = val;
            return this;
        }


        public Bulider carbohydrate(int val) {
            carbohydrate = val;
            return this;
        }


        public Bulider sodium(int val) {
            sodium = val;
            return this;
        }

        public NutritionFacts bulid() {
            return new NutritionFacts(this);
        }
    }

    public NutritionFacts(Bulider bulider) {
        servingSize = bulider.servingSize;
        servings = bulider.servings;
        calories = bulider.calories;
        fat = bulider.fat;
        sodium = bulider.sodium;
        carbohydrate = bulider.carbohydrate;
    }


    public static void main(String[] args) {
        // bulider模式
//        NutritionFacts test = new NutritionFacts.Bulider(1,1).calories(1).bulid();

        String str1 = new StringBuilder("test").append("test").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }

}
