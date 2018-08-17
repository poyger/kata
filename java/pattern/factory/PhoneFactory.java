package pattern.factory;

public class PhoneFactory {

    public static Phone getPhone(String os){
        switch (os) {
            case "android" :
                return new Samsung();
            case "ios" :
                return new IPhone();
            default:
                throw new RuntimeException("Os not found");
        }
    }

    private PhoneFactory(){}
}
