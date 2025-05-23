package drai.dev.data.games.other;

import drai.dev.data.attributes.*;
import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.phoenixrising.regional.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class PhoenixRising extends Game {
    public static final Game INSTANCE = new PhoenixRising();
    private PhoenixRising() {
        super("PhoenixRising");
    }

    @Override
    public void registerPokemon() {

        addNewPokemon(new RelicBudew("", Aspect.RELIC));
        addNewPokemon(new RelicRoselia("Roselia", Aspect.RELIC));
        addNewPokemon(new RelicRoserade("", Aspect.RELIC));
        addNewPokemon(new RelicSpinda("Spinda", Aspect.RELIC));
        addNewPokemon(new RelicKoffing("", Aspect.RELIC));
        addNewPokemon(new RelicWeezing("", Aspect.RELIC));
        addNewPokemon(new RelicSkiddo("Skiddo", Aspect.RELIC));
        addNewPokemon(new RelicGogoat("Gogoat", Aspect.RELIC));
        addNewPokemon(new RelicAipom("", Aspect.RELIC));
        addNewPokemon(new RelicAmbipom("", Aspect.RELIC));
        addNewPokemon(new RelicTentacool("", Aspect.RELIC));
        addNewPokemon(new RelicTentacruel("", Aspect.RELIC));
        addNewPokemon(new RelicLedyba("", Aspect.RELIC));
        addNewPokemon(new RelicLedian("", Aspect.RELIC));
        addNewPokemon(new RelicFlabebe("", Aspect.RELIC));
        addNewPokemon(new RelicFloette("", Aspect.RELIC));
        addNewPokemon(new RelicFlorges("", Aspect.RELIC, new Stats(552, StatArchetype.BULKY_SPECIAL_ATTACKER,
                List.of(StatType.SPECIAL_ATTACK, StatType.SPECIAL_DEFENCE, StatType.SPECIAL_ATTACK, StatType.SPEED))));
    }
}
