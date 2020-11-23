public class PlusCameraApp extends PhoneCameraApp {
    
    public PlusCameraApp() {
        shareMethod = new ShareByText();
    }

    public PlusCameraApp(String method) {
        setShareMethod(method);
    }

    public void edit() {
        System.out.println("Plus Camera App Edit");
    }
}
