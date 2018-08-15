package tij.chapter14.shape;

/**
 * class_name: Rhomboid
 * package: tij.chapter14.shape
 * describe: 练习3--
 * creat_user: haoxiaol
 * creat_date: 2018/8/15
 * creat_time: 14:47
 **/
public class Rhomboid extends Shape {
    @Override
    public String toString() {
        return "菱形";
    }

    //练习5
    public void rotate(Shape t) {
        if(t instanceof Circle) {
            return;
        }
        System.out.println("旋转");
    }

    public static void main(String[] args) {
        Shape t = new Rhomboid();
        Rhomboid tt = (Rhomboid) (t);
        try {
            //向下转型出现类型错误
            //练习4
            if(t instanceof Circle){
                Circle c = (Circle) t;
            }

        } catch (ClassCastException e) {
            System.out.println("y");
        } catch (Exception e) {
            System.out.println("异常");
        }


    }
}
