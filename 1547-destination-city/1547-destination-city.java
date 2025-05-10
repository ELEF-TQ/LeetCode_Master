class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> fromCities = new HashSet<>();

        // Starting cities
        for (List<String> path : paths) {
            fromCities.add(path.get(0));
        }

        // Destination is the one that never be a starting city
        for (List<String> path : paths) {
            String destination = path.get(1);
            if (!fromCities.contains(destination)) {
                return destination;
            }
        }

        // in case there is no city
        return "";
    }
}
