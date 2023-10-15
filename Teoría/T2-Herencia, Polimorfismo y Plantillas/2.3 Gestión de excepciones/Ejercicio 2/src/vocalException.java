public class vocalException extends Exception {
    private String s;
    public vocalException(String str) {
        s = str;
    }

    public String getMessage() {
        return s;
    }
    
}
