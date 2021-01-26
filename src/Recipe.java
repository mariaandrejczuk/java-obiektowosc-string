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
        System.out.println("Przepis na: " + name);
        System.out.println("Składniki: " + ingredient);
        System.out.println("Czas przygotowania (w min): " + time);
        //System.out.println("Sposób przyrządzenia: " + description);
        String[] paragraphs = description.split("\\.");
        //String[] paragraphs = description.split(". ", 0);
        String newDescription = ("Sposób przyrządzenia:\n" + paragraphs[0]);
        for (int i = 1; i < paragraphs.length; i++) {
            if (i % 2 != 0) {
                newDescription += (paragraphs[i] + ".\n");
            } else {
                newDescription += (paragraphs[i] + ".");
            }
        }
        System.out.println(newDescription);
        System.out.println("Zachęcam do zapoznania się z innymi przepisami.");
    }
}




