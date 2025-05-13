package drai.dev.gravelmon.mega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class MegaRegistry {
    public static void register(){
        Pokemon.addMegaEvolution(
                new MegaEvolution("venusaur",
                        new Stats(80,100,123,122,120,80),
                        Ability.HUBRIS,
                        25, "insurgence", List.of(Label.GEN1, Label.INSURGENCE), Aspect.DELTA));
    }
}
