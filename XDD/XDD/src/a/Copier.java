package a;

import intefrace.Reader;
import intefrace.Writer;

public class Copier {
    public void copy(Reader reader, Writer writer){
        String str = reader.RF();
        writer.WF(str);
    }
}
