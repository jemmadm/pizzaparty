package Exercise8;

public class Exercise8PizzaParty {


    public String pizzaDivider(int numberOfPeople, int numberOfPizzas, int numberOfSlicesPerPizza) {
        int numberOfSlicesPerPerson = (numberOfPizzas * numberOfSlicesPerPizza) / numberOfPeople;

        int leftOvers = leftoversCalculator(numberOfPeople, numberOfPizzas, numberOfSlicesPerPizza);

        return "Each person gets " + numberOfSlicesPerPerson + " slices and there are " + leftOvers + " slices remaining.";
    }

    public int leftoversCalculator(int numberOfPeople, int numberOfPizzas, int numberOfSlicesPerPizza) {
        return (numberOfPizzas * numberOfSlicesPerPizza) % numberOfPeople;
    }
}
