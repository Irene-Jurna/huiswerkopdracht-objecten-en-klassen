import java.util.ArrayList;
import java.util.List;

public class ApplePieRecipe {
    private List<Ingredient> ingredients;

    public ApplePieRecipe() {
        ingredients = new ArrayList<>();
        ingredients.add(new Ingredient(200, "gram", "ongezouten roomboter"));
        ingredients.add(new Ingredient(200, "gram", "witte bastard suiker"));
        ingredients.add(new Ingredient(400, "gram", "zelfrijzend bakmeel"));
        ingredients.add(new Ingredient(1, "stuk(s)", "ei"));
        ingredients.add(new Ingredient(8, "gram", "vanillesuiker"));
        ingredients.add(new Ingredient(1, "snuf", "zout"));
        ingredients.add(new Ingredient(1.5, "kilo", "zoetzure appels"));
        ingredients.add(new Ingredient(75, "gram", "kristal suiker"));
        ingredients.add(new Ingredient(3, "theelepels", "kaneel"));
        ingredients.add(new Ingredient(15, "gram", "paneermeel"));
    }

    public void printIngredients() {
        for (Ingredient ingredient : ingredients) {
            System.out.println(ingredient.getAmount() + " " + ingredient.getUnit() + " " + ingredient.getName());
        }
        System.out.println();
    }

    public void printRecipe() {
        preheatOven();
        beatEgg();
        makeDough();
        prepareApples();
        prepareSpringform();
        fillSpringformWithDough();
        fillSpringformWithApples();
        cutDoughStrips();
        makeCakeTop();
        bakeCake();
    }

    public void preheatOven() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void beatEgg() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void makeDough() {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void prepareApples() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void prepareSpringform() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem.");
    }

    public void fillSpringformWithDough() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void fillSpringformWithApples() {
        System.out.println("Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void cutDoughStrips() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void makeCakeTop() {
        System.out.println("Leg de stroken kruislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    public void bakeCake() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }
}
