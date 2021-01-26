public class Main {
    public static void main(String[] args) {
        //Recipe recipe = new Recipe();

        String name1 = "ZUPA Z CIECIERZYCY";
        String name2 = "RÓŻE KARNAWALOWE";

        String ingredient1 = "ciecierzyca - 200g, cytryna - 1 sztuka, oliwa z oliwek - 2 łyżki, cebula - 1 sztuka, marchewka - 1 sztuka, bulion na włoszczyźnie - 2 kostki, ząbek czosnku, kawałek selera naciowego, przyprawy. ";
        String ingredient2 = "mąka pszenna - 300g, 6 żółtek, 2 łyżki cukru pudru, 3 łyżki śmietany, 2 łyżki masła, łyżka rumu, tłuszcz do głębokiego smażenia, wiśnie lub dżem wiśniowy, cukier puder do dekoracji. ";

        int time1 = 45;
        int time2 = 60;

        String description1 = " Ciecierzycę namocz przez noc w zimnej wodzie. Na drugi dzień wypłucz, zalej litrem wody, dodaj kostki rosołowe. Gotuj około 30 minut, aż groch zrobi się miękki. Otrzyj cytrynę ze skórki i wyciśnij z niej sok. Drobno pokrój cebulę, czosnek, seler i marchewkę. Warzywa podsmaż na rozgrzanej oliwie, aż zrobią się delikatnie rumiane. Dodaj do gotującej się zupy. Gdy ciecierzyca zrobi się miękka, odłóż część grochu i warzyw na bok. Resztę zmiksuj. Do powstałego kremu dodaj wyjęte wcześniej warzywa, skórkę i sok z cytryny. Zupę dopraw kminem i ziołami do smaku. Oprószyć posiekaną natką pietruszki z wierzchu.";
        String description2 = " Z podanych składników zagnieć twarde, elastyczne ciasto. Wstaw je na godzinę do lodówki. Ciasto cienko rozwałkuj, wykrawaj kółka o trzech średnicach: ok. 3, 5, 7 cm. Każde kółko nakrój w 6 miejscach na głębokość 1 cm. Układaj jedno na drugim od największego do najmniejszego. Naciśnij środek palcami, aby się zlepiły. Róże smaż w gorącym tłuszczu, wkładając małym kółkiem do dołu, po chwili odwróć. Wyjmij łyżką cedzakową, osącz z tłuszczu. eszcze ciepłe posyp cukrem pudrem, a w sam środek nałóż łyżeczką porcję dżemu lub wiśnię.";

        Recipe r1 = new Recipe(name1, ingredient1, time1, description1);
        Recipe r2 = new Recipe(name2, ingredient2, time2, description2);

        r1.display();
        r2.display();


        //String newDescription1 = description1.replaceAll(". ",".\\n");
        //String[] newDescription2 = description2.split(". ");
    }
}
