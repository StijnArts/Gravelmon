package drai.dev.data.games.other;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Sevii extends Game {
    public static final Game INSTANCE = new Sevii();
    private Sevii() {
        super("Sevii");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new SeviianDoduo("", Aspect.SEVIIAN));
        addNewPokemon(new SeviianDodrio("", Aspect.SEVIIAN));
        addNewPokemon(new SeviianMantyke("", Aspect.SEVIIAN));
        addNewPokemon(new SeviianMantine("", Aspect.SEVIIAN));
        addNewPokemon(new SeviianTeddiursa("", Aspect.SEVIIAN));
        addNewPokemon(new SeviianUrsaring("", Aspect.SEVIIAN));
        addNewPokemon(new SeviianFeebas("Feebas", Aspect.SEVIIAN).fishingSpawnFromExisting());
        addNewPokemon(new SeviianMilotic("Milotic", Aspect.SEVIIAN));
        addNewPokemon(new SeviianCarnivine("", Aspect.SEVIIAN));
        addNewPokemon(new SeviianBlitzle("", Aspect.SEVIIAN));
        addNewPokemon(new SeviianZebstrika("", Aspect.SEVIIAN));
        addNewPokemon(new SeviianClauncher("Clauncher", Aspect.SEVIIAN));
        addNewPokemon(new SeviianClawitzer("Clawitzer", Aspect.SEVIIAN));
        addNewPokemon(new SeviianNoibat("Noibat", Aspect.SEVIIAN));
        addNewPokemon(new SeviianNoivern("Noivern", Aspect.SEVIIAN));
        addNewPokemon(new SeviianWishiwashi("", Aspect.SEVIIAN).fishingSpawnFromExisting());
        addNewPokemon(new SeviianDhelmise("", Aspect.SEVIIAN).fishingSpawnFromExisting());
        addNewPokemon(new SeviianSizzlipede("", Aspect.SEVIIAN));
        addNewPokemon(new SeviianCentiskorch("", Aspect.SEVIIAN));
        addNewPokemon(new SeviianNymble("", Aspect.SEVIIAN));
        addNewPokemon(new SeviianLokix("", Aspect.SEVIIAN));
    }
}
