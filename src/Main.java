public class Main {
    public static void main(String[] args) {
        ApplePieRecipe appeltaart = new ApplePieRecipe();

        appeltaart.printIngredients();

        appeltaart.preheatOven();
        appeltaart.beatEgg();
        appeltaart.makeDough();
        appeltaart.prepareApples();
        appeltaart.prepareSpringform();
        appeltaart.fillSpringformWithDough();
        appeltaart.fillSpringformWithApples();
        appeltaart.cutDoughStrips();
        appeltaart.makeCakeTop();
        appeltaart.bakeCake();
    }
}