class Car {
    String color;
    int speed;

    // --- コンストラクタ ---
    // クラス名(Car)と同じ。戻り値なし。
    Car(String c) {
        color = c;    // インスタンス化時の初期設定
        speed = 0;    // 初速は0
    }
}

public class Main {
    public static void main(String[] args) {
        // newした瞬間にコンストラクタが動く
        Car myCar = new Car("赤");
        System.out.println(myCar.color); // 出力: 赤
    }
}
