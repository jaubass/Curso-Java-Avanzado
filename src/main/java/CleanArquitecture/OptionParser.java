package CleanArquitecture;

import java.util.HashMap;

public class OptionParser {

    private HashMap <String, String> options = new HashMap();
    private String []args;

    private OptionParser(){}
    public OptionParser (String []args) {
        this.args = args;
    }

    public void registerOptions(String optionsName) {
        options.put(optionsName, "");
    }

    public String getOption(String optionsName) {
        return options.get(optionsName);
    }

    public void setOptionValue (String optionName, String optionValue) {
        options.replace(optionName, optionValue);
    }

    public void parse () {
        for(int i = 0; i < args.length; i++) {
            String optionName = args[i].replace("-","");
            if (options.containsKey(optionName)) {
                setOptionValue(optionName, args[i +1] );
            }
        }
    }

}
