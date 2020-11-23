public class Main {
    public static void main(String[] args) {
        PhoneCameraApp basicCameraApp = new BasicCameraApp("Text"); // Default is Email
        basicCameraApp.take();
        basicCameraApp.save();
        basicCameraApp.edit();
        basicCameraApp.share();
        basicCameraApp.setShareMethod("Email");
        basicCameraApp.share();

        PhoneCameraApp plusCameraApp = new PlusCameraApp("Email"); // Default is Text
        plusCameraApp.take();
        plusCameraApp.save();
        plusCameraApp.edit();
        plusCameraApp.share();
        plusCameraApp.setShareMethod("Text");
        plusCameraApp.share();
    }
}
