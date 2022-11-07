package exercises.oop.Subclase;

import exercises.oop.Clases.SmartDevice;

public class SmartPhone extends SmartDevice {

    String memoryRAM;
    String internalMemory;
    boolean dualSIM;
    String camaraFront;
    String camaraBack;
    boolean desbloqBiomet;

//    public SmartPhone(){}


    public SmartPhone(String fabricante, String modelo, double price, String color, String memoryRAM, String internalMemory, boolean dualSIM, String camaraFront, String camaraBack, boolean desbloqBiomet) {
        super(fabricante, modelo, price, color);
        this.memoryRAM = memoryRAM;
        this.internalMemory = internalMemory;
        this.dualSIM = dualSIM;
        this.camaraFront = camaraFront;
        this.camaraBack = camaraBack;
        this.desbloqBiomet = desbloqBiomet;
    }


    // Getter & Setter

    public String getMemoryRAM() {
        return memoryRAM;
    }

    public void setMemoryRAM(String memoryRAM) {
        this.memoryRAM = memoryRAM;
    }

    public String getInternalMemory() {
        return internalMemory;
    }

    public void setInternalMemory(String internalMemory) {
        this.internalMemory = internalMemory;
    }

    public boolean isDualSIM() {
        return dualSIM;
    }

    public void setDualSIM(boolean dualSIM) {
        this.dualSIM = dualSIM;
    }

    public String getCamaraFront() {
        return camaraFront;
    }

    public void setCamaraFront(String camaraFront) {
        this.camaraFront = camaraFront;
    }

    public String getCamaraBack() {
        return camaraBack;
    }

    public void setCamaraBack(String camaraBack) {
        this.camaraBack = camaraBack;
    }

    public boolean isDesbloqBiomet() {
        return desbloqBiomet;
    }

    public void setDesbloqBiomet(boolean desbloqBiomet) {
        this.desbloqBiomet = desbloqBiomet;
    }


    // toString


    @Override
    public String toString() {
        return "SmartPhone{" +
                "memoryRAM='" + memoryRAM + '\'' +
                ", internalMemory='" + internalMemory + '\'' +
                ", dualSIM=" + dualSIM +
                ", camaraFront='" + camaraFront + '\'' +
                ", camaraBack='" + camaraBack + '\'' +
                ", desbloqBiomet=" + desbloqBiomet +
                '}';
    }
}
