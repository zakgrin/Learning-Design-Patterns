public class Main {
    public static void main(String[] args) {
        PhoneCameraApp basicCameraApp = new BasicCameraApp("Text"); // Default is Email
        basicCameraApp.take();
        basicCameraApp.save();
        basicCameraApp.edit();
        basicCameraApp.share();
        basicCameraApp.setShareMethod("Email"); // setter with the need to change the class (not good practice)
        basicCameraApp.share();
        ShareMethod textShareMethod = new ShareByText(); 
        basicCameraApp.setShareMethod(textShareMethod); // setter without the need to change the class
        basicCameraApp.share();

        PhoneCameraApp plusCameraApp = new PlusCameraApp("Email"); // Default is Text
        plusCameraApp.take();
        plusCameraApp.save();
        plusCameraApp.edit();
        plusCameraApp.share();
        plusCameraApp.setShareMethod("Text"); // setter with the need to change the class (not good practice)
        plusCameraApp.share();
        ShareMethod emailShareMethod = new ShareByEmail();
        plusCameraApp.setShareMethod(emailShareMethod); // setter without the need to change the class
        plusCameraApp.share();
    }
}
