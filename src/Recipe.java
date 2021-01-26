public class Recipe {

    String name;
    String ingredient;
    int time;
    String description;


    Recipe(String name, String ingredient, int time, String description) {
        this.name = name;
        this.ingredient = ingredient;
        this.time = time;
        this.description = description;
    }

    void display() {
        System.out.println();
        System.out.println("**********************************************");
        System.out.println("Przepis na: "+name);
        System.out.println("Składniki: "+ingredient);
        System.out.println("Czas przygotowania (w min): " + time);
        System.out.println("Sposób przyrządzenia: "+ description);
        }
    }



