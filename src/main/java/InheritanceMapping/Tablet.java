package InheritanceMapping;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Tablet extends Device {

    @Column(name = "screen_size")
    private double screenSize;

    @Column(name = "battery_life")
    private int batteryLife;

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }
}
