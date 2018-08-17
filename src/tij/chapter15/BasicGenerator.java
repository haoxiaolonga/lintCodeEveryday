package tij.chapter15;

public class BasicGenerator<T> implements Generator<T> {


    public Class<T> type;

    //生成器的类型
    public BasicGenerator(Class<T> type) {
        this.type = type;
    }

    //实例化生成对象
    @Override
    public T next() {
        try {
            return type.newInstance();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    //创建一个类型生成器对象
    public static<T> Generator<T> create(Class<T> type) {
        return new BasicGenerator<>(type);
    }

    public static void main(String[] args){

    }

}
