package a;

import intefrace.Reader;

import java.util.Scanner;

public class Keyboard implements Reader {

    @Override
    public String RF() {
        Scanner in = new Scanner(System.in);
        return in.next();
    }
}
