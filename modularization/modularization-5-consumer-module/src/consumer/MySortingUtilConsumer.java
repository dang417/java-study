package consumer;

import util.MySortingUtil;

import java.util.List;
import java.util.logging.Logger;

public class MySortingUtilConsumer {

    private static Logger logger = Logger.getLogger(MySortingUtilConsumer.class.getName());

    public static void main(String[] args) {
        MySortingUtil util = new MySortingUtil();
        List<String> sorted = util.sort(List.of("Ranga", "Ravi", "Sathish", "Adam", "Eve"));

        logger.info(sorted.toString());
    }
}
