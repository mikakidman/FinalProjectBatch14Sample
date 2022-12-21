public class Main {
    public static void main(String[] args) {

        SolarSystem Xron=new SolarSystem();
        Xron.moon=2;
        Xron.sun=1;
        Xron.planets=3;

        FeatureSun Fxron=new FeatureSun();
        Fxron.color="green";
        Fxron.size="12345km";
        Fxron.temp="256";

        Planet1 mars = new Planet1();
        mars.color="orange";
        mars.size=12345;
        mars.rings="5";
        mars.temp="95";
    }
}