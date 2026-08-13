interface TextFormatter {
    String format(String text);
}

class UpperCaseFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}

class ReverseFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}

class Codechef {
    public static void main(String[] args) {
        String text = "Codechef";

        // Format the text using UpperCaseFormatter
        TextFormatter formatter = new UpperCaseFormatter();
        System.out.println(formatter.format(text));

        // Format the text using ReverseFormatter
        formatter = new ReverseFormatter();
        System.out.println(formatter.format(text));
    }
}