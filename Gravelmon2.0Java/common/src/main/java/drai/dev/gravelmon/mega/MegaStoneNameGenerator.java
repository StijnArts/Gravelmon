package drai.dev.gravelmon.mega;

import java.util.*;
import java.util.function.Function;

public class MegaStoneNameGenerator {

    private static final List<Rule> rules = List.of(
            new Rule(name -> name.endsWith("ie"), name -> name.substring(0, name.length() - 2) + "ite"),
            new Rule(name -> name.endsWith("ee"), name -> name.substring(0, name.length() - 2) + "ite"),
            new Rule(name -> name.endsWith("aa"), name -> name.substring(0, name.length() - 2) + "ite"),
            new Rule(name -> name.endsWith("oo"), name -> name.substring(0, name.length() - 2) + "ite"),
            new Rule(name -> name.endsWith("ii"), name -> name.substring(0, name.length() - 2) + "ite"),
            new Rule(name -> name.endsWith("e"), name -> name.substring(0, name.length() - 1) + "ite"),
            new Rule(name -> name.endsWith("i"), name -> name.substring(0, name.length() - 1) + "ite"),
            new Rule(name -> name.endsWith("ic"), name -> name.substring(0, name.length() - 2) + "ite"),
            new Rule(name -> name.endsWith("o"), name -> name + "nite"),
            new Rule(name -> name.endsWith("a"), name -> name + "nite"),
            new Rule(name -> true, name -> name + "ite")
    );

    public static String generateMegaStoneName(String pokemonName) {
        for (Rule rule : rules) {
            if (rule.matches(pokemonName.toLowerCase())) {
                return capitalize(rule.apply(pokemonName));
            }
        }
        return capitalize(pokemonName + "ite");
    }

    private static String capitalize(String name) {
        if (name == null || name.isEmpty()) return name;
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    // --- Helper class for rules ---
    private static class Rule {
        private final Function<String, String> action;
        private final Function<String, Boolean> condition;

        public Rule(Function<String, Boolean> condition, Function<String, String> action) {
            this.condition = condition;
            this.action = action;
        }

        public boolean matches(String input) {
            return condition.apply(input);
        }

        public String apply(String input) {
            return action.apply(input);
        }
    }

    // --- Demo ---
    public static void main(String[] args) {
        List<String> testNames = List.of("Tarmendoa", "Histameanie", "Catteraxe");

        for (String name : testNames) {
            System.out.println(name + " → " + generateMegaStoneName(name));
        }
    }
}
