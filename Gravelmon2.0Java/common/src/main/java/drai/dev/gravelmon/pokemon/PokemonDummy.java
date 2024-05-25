package drai.dev.gravelmon.pokemon;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class PokemonDummy extends Pokemon{
    public PokemonDummy(String name, Type primaryType, Type secondaryType, List<EvolutionEntry> evolutions, List<Label> labels) {
        super(name, primaryType, secondaryType, evolutions, labels);
        this.setPortraitXYZ(0.1,2.0,0.0);
    }

    public PokemonDummy(int dexNo, String name, Type primaryType, Type secondaryType, List<EvolutionEntry> evolutions, List<Label> labels) {
        super(dexNo, name, primaryType, secondaryType, evolutions, labels);
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
