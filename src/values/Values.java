package values;

/**
 * Created by Alexander Bazo on 16/01/16.
 */
public class Values {

    public class Files {
        public static final String INPUT_FILE = "/data/assets/flights.txt";
    }

    public class Strings {

        public static final String DEFAULT_SPLITTER_DELIMITER = ",";
        public static final String DELIMITER_STRING = "->";
        public static final String LIST_DELIMITER_FOR_OUTPUT = ", ";
        public static final String EMPTY = "";
        public static final String SINGLE_WHITESPACE = " ";
        public static final String OPTIONS_INDEX_DELIMITER_FOR_OUTPUT = ":";

        public class EN {
            public static final String STARTUP_PROMPT = "Start FlightPlanner";
            public static final String DIALOG_PROMPT_PREFFIX = "You are here: ";
            public static final String DIALOG_PROMPT_SUFFIX = ". You can fly to: ";
            public static final String FINISHED_ROUTE_PROMPT = "This is your route: ";
            public static final String ROUTE_DESTINATIONS_DELIMITER = " -> ";
            public static final String SELECT_OPTION_PROMPT = "Enter a number to select a option: ";
        }

    }
}
