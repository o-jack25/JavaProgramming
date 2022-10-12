package Package2;
import Package1.*;

public class C {
    //public keyword makes String accessible via different files
    public String publicMessage = "this is public";
    protected String protectedMessage = "this is protected";
    String defaultMessage = "This is the default.";

    private String privateMessage = "This is a private message";
}
