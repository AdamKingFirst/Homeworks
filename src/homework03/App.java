package homework03;

public class App {
    public static void main(String[] args) {
        TV tv = new TV("1280x720", "m200", 6);
        TV tv1 = new TV("240x320", "m300", 6);
        TV tv2 = new TV();

        tv.setResolution("8784x851");
        tv.getResolution();

        tv2.setResolution("151x548");
        tv2.setPlate("m400");
        tv2.setButtons(7);

        System.out.println(tv);
        System.out.println(tv1);
        System.out.println(tv2);
    }
}
