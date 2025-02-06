public class TaxCalculator {
    public void calculateTax(Person person) {
        if (person.getAge() > 65 || person.getGender().equalsIgnoreCase("female")) {
            person.setTax(0);
            System.out.println("Tax is not applicable");
        } else {
            if (person.getIncome() <= 200000) {
                person.setTax(0);
            } else if (person.getIncome() > 200000 && person.getIncome() <= 500000) {
                person.setTax((person.getIncome() - 200000) * 10 / 100);
            } else if (person.getIncome() > 500000 && person.getIncome() <= 800000) {  // Fixed condition
                person.setTax((person.getIncome() - 500000) * 20 / 100 + 30000);
            } else {
                person.setTax((person.getIncome() - 800000) * 30 / 100 + 90000);
            }
        }
    }
}
