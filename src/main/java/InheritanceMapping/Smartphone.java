package InheritanceMapping;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Smartphone extends Device {

    @Column(name = "os", length = 50)
    private String operatingSystem;

    @Column(name = "camera_resolution")
    private double cameraResolution;

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public double getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(double cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
}
