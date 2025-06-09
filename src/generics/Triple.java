package generics;

public class Triple<X, Y, Z> {
    private X first;
    private Y second;
    private Z third;

    public Triple(X first, Y second, Z third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public X getFirst() {
        return first;
    }

    public void setFirst(X first) {
        this.first = first;
    }

    public Y getSecond() {
        return second;
    }

    public void setSecond(Y second) {
        this.second = second;
    }

    public Z getThird() {
        return third;
    }

    public void setThird(Z third) {
        this.third = third;
    }

    @Override
    public String toString() {
        return "Triple{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }

    public static void main(String[] args) {
        // Triple with Integer, String, and Double
        Triple<Integer, String, Double> triple1 = new Triple<>(1, "One", 1.0);
        System.out.println("Triple 1: " + triple1);

        // Triple with String, String, and Integer
        Triple<String, String, Integer> triple2 = new Triple<>("Key", "Value", 42);
        System.out.println("Triple 2: " + triple2);

        // Triple with custom classes
        class CustomClass1 {
            private String name;

            public CustomClass1(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return "CustomClass1{" +
                        "name='" + name + '\'' +
                        '}';
            }
        }

        class CustomClass2 {
            private int id;

            public CustomClass2(int id) {
                this.id = id;
            }

            @Override
            public String toString() {
                return "CustomClass2{" +
                        "id=" + id +
                        '}';
            }
        }

        CustomClass1 customObj1 = new CustomClass1("Custom Object 1");
        CustomClass2 customObj2 = new CustomClass2(123);
        Double customObj3 = 456.78;
        Triple<CustomClass1, CustomClass2, Double> triple3 = new Triple<>(customObj1, customObj2, customObj3);
        System.out.println("Triple 3: " + triple3);
    }
}

