package tld.xyz.jsfsimple.presentation;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class SomethingBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name = "Adam";
    private int answer = 42;

    public String getName() {
        return name;
    }

    public int getAnswer() {
        return answer;
    }
}
