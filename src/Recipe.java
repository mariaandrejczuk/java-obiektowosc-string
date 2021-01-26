public class Recipe {

    String[] name;
    String[] ingredient;
    int time;
    String[] description;


    Recipe(String[] name, String[] ingredient, int time, String[] description) {
        this.name = name;
        this.ingredient = ingredient;
        this.time = time;
        this.description = description;
    }

    void display() {
        System.out.println();
        System.out.println("**********************************************");
        System.out.print("Przepis na: ");
        for (String n : name) {
            System.out.println(n);
        }
        System.out.print("Składniki: ");
        for (String i : ingredient) {
            System.out.println(i);
        }
        System.out.println("Czas przygotowania (w min): " + time);

        System.out.println("Sposób przyrządzenia: ");
        for(String d : description){
            System.out.println(d);
        }


    }
}


