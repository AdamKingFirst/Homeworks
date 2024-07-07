package homework03;

public class TV {

    private String resolution;
    private String plate;
    private int buttons;

    public TV(String resolution, String plate, int buttons) {
        this.resolution = resolution;
        this.plate = plate;
        this.buttons = buttons;
    }

    @Override
    public String toString() {
        return "TV{" +
                "resolution='" + resolution + '\'' +
                ", plate='" + plate + '\'' +
                ", buttons=" + buttons +
                '}';
    }

    public TV() {

    }

    public String getResolution() {
        return resolution;
    }
    public void setResolution(String resolution) {
        this.resolution  = resolution;
    }

    public String getPlate() {
        return plate;
    }
    public void setPlate(String plate) {
        this.plate = plate;
    }

    public int getButtons() {
        return buttons;
    }
    public void setButtons(int buttons) {
        this.buttons = buttons;
    }
}
