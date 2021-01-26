public class Main {
    public static void main(String[] args) {
        //Recipe recipe = new Recipe();

        String[] name1 = {"Sos śródziemnomorski"};
        String[] name2 = {"Zupa warzywna"};
        String[] name3 = {"Pasta warzywna"};

        String[] ingredient1 = {"woda, oliwa, warzywa, przyprawy."};
        String[] ingredient2 = {"woda, warzywa, ziemniaki, przyprawy."};
        String[] ingredient3 = {"warzywa, oliwa, przyprawy."};

        int time1 = 10;
        int time2 = 35;
        int time3 = 20;

        String[] description1 = {"Wymieszaj składniki i wstaw do lodówki."};
        String[] description2 = {"Wymieszaj składniki i gotuj przez poł godziny."};
        String[] description3 = {"Zmiksuj składniki na gładką masę."};


        Recipe r1 = new Recipe(name1, ingredient1, time1, description1);
        Recipe r2 = new Recipe(name2, ingredient2, time2, description2);
        Recipe r3 = new Recipe(name3, ingredient3, time3, description3);


        r1.display();
        r2.display();
        r3.display();

    }
}
