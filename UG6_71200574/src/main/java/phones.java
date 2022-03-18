public class phones {
    String phoneCode;
    String companyCode;
    String androidType;
    int ramCapatiy;
    int romCapatiy;
    float screenSize;
    int cameraResolution;

    String Phones(String phoneCode, String companyCode, String androidCode){
        this.phoneCode=phoneCode;
        this.companyCode=companyCode;
    }
    String Phones(String phoneCode, String companyCode, String androidCode, int ramCapacity, int romCapatiy, float screenSize, int cameraResolution){
        this.phoneCode=phoneCode;
        this.companyCode=companyCode;
        this.androidCode=androidCode;
        this.ramCapatiy=ramCapacity;
        this.screenSize=screenSize;
        this.cameraResolution=cameraResolution;
    }
}
