package exercises.oop.Subclase;

import exercises.oop.Clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    String screenType;
    int daysBatteryLife;
    boolean waterproof;
    boolean touchScreen;
    boolean gps;
    boolean bluetooth;

    public SmartWatch(){}

    public SmartWatch(String fabricante,
                      String modelo,
                      double price,
                      String color,
                      String screenType,
                      int daysBatteryLife,
                      boolean waterproof,
                      boolean touchScreen,
                      boolean gps,
                      boolean bluetooth) {
        super(fabricante, modelo, price, color);
        this.screenType = screenType;
        this.daysBatteryLife = daysBatteryLife;
        this.waterproof = waterproof;
        this.touchScreen = touchScreen;
        this.gps = gps;
        this.bluetooth = bluetooth;
    }

    // Getter & Setter

    public String getScreenType() {
        return screenType;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public int getDaysBatteryLife() {
        return daysBatteryLife;
    }

    public void setDaysBatteryLife(int daysBatteryLife) {
        this.daysBatteryLife = daysBatteryLife;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    public boolean isTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(boolean touchScreen) {
        this.touchScreen = touchScreen;
    }

    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "screenType='" + screenType + '\'' +
                ", daysBatteryLife=" + daysBatteryLife +
                ", waterproof=" + waterproof +
                ", touchScreen=" + touchScreen +
                ", gps=" + gps +
                ", bluetooth=" + bluetooth +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
