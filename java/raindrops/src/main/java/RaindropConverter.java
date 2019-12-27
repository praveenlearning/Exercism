class RaindropConverter {
    String rain = "";
    String convert(int number) {
        if(number%3 == 0)
            rain += "Pling";
        if(number%5 == 0)
            rain += "Plang";
        if(number%7 == 0)
            rain += "Plong";
        if(rain == "")
            rain += Integer.toString(number);
        return rain;
    }

}