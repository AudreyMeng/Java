public class PrivateObject {
    private String privateField = null;

    public PrivateObject(String privateField) {
        this.privateField = privateField;
    }

    private String getPrivateField(){
        return this.privateField;
    }
}
