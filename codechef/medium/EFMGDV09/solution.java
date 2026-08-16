import java.util.HashMap;

class CountryCapital {

    public static void main(String[] args) {
        // 1. Create a HashMap called countryCapitals
        HashMap<String, String> countryCapitals = new HashMap<>();

        // 2. Add entries to the HashMap
        countryCapitals.put("USA", "Washington D.C.");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("India", "New Delhi");

        // 3. Retrieve the capital of France and print it
        String capitalOfFrance = countryCapitals.get("France");
        System.out.println("Capital of France: " + capitalOfFrance);

        // 4. Handle missing entries for Germany
        String capitalOfGermany = countryCapitals.get("Germany");
        if (capitalOfGermany == null) {
            System.out.println("Not found");
        }


        // 5. Remove France from the HashMap
        countryCapitals.remove("France");
        
        // 6. Check if France exists after removing it
        if (countryCapitals.containsKey("France")) {
            System.out.println("Exists");
        } else {
            System.out.println("Not exists");
        }
    }
}