class Acronym {
    String acronym = "";
    Acronym(String phrase) {
        String[] str = phrase.split(" ");
        for(String x : str)
            acronym += Character.toString(Character.toUpperCase(x.charAt(0)));
    }

    String get() {
        return acronym;
    }

}
