class DrinksDatabase {
    public static void main(String[] args) {
        Drink drink = new Drink();
        drink.name = "Wściekły Pies";
        drink.price = 11.50;
        drink.alcoholic = true;
        // składniki inicjalizacja
        drink.ingredient1 = new Ingredient();
        drink.ingredient2 = new Ingredient();
        drink.ingredient3 = new Ingredient();
        //składniki pierwszy
        drink.ingredient1.name = "Wódka";
        drink.ingredient1.amount = 28;
        //składnik drugi
        drink.ingredient2.name = "Tabasco";
        drink.ingredient2.amount = 2;
        //składnik trzeci
        drink.ingredient3.name = "Sok malinowy";
        drink.ingredient3.amount = 20;
        //suma militrów składników
        int milliliters =   drink.ingredient1.amount +
                            drink.ingredient2.amount +
                            drink.ingredient3.amount;

        //Wyswietlanie informacji o drinku
        System.out.println("Drink:\t\t" + drink.name);
        System.out.println("Alkoholowy:\t" + drink.alcoholic);
        System.out.println( "Składniki:\t"   + drink.ingredient1.name + "(" + drink.ingredient1.amount + "ml)" +
                            " + "           + drink.ingredient2.name + "(" + drink.ingredient2.amount + "ml)" +
                            " + "           + drink.ingredient3.name + "(" + drink.ingredient3.amount + "ml)" );
        System.out.println("Pojemność:\t" + milliliters + "ml");
        System.out.println("Cena:\t\t" + drink.price + "zł");
    }
}
