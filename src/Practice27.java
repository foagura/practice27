class Super {
    String a = "TEST";
    public void testPrint() {
        System.out.println(a);
    }
}

class Sub extends Super {
    public void testPrint() {    // オーバーライドで処理内容を書き換え
        System.out.println("これはサブクラスのオーバーライドテストです：" + a);
    }
}

public class Practice27 {
    public static void main(String[] args) {
        Super superObj = new Super();
        superObj.testPrint();    // オーバーライドされる前の処理を呼び出す
        Sub subObj = new Sub();
        subObj.testPrint();    // オーバーライド後の処理を呼び出す
    }
}
