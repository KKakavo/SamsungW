package a;

import intefrace.Writer;

public class Printer implements Writer {

    @Override
    public void WF(String string) {
        System.out.println(string);
    }
}
