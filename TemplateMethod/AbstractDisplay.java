package TemplateMethod;

public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();

    // メソッドにfinal修飾子を付けると、オーバーライドを禁止するメソッドを作る
    public final void display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
