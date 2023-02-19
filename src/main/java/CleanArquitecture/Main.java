package CleanArquitecture;

public class Main {

    public static void main(String[] args) {

        OptionParser optionParser = new OptionParser(args);
        optionParser.registerOptions("minVal");
        optionParser.registerOptions("maxVal");
        optionParser.parse();

        String minVal = optionParser.getOption("minVal");
        System.out.println("MinVal: " +minVal);

    }

}
