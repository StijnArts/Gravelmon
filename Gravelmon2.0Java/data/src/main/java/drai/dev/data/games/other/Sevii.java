package drai.dev.data.games.other;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.gravelmon.pokemon.attributes.*;

public class Sevii extends Game {
    public static final Game INSTANCE = new Sevii();
    private Sevii() {
        super("Sevii", "https://dex.radicalred.net/");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new SeviianDoduo("", Aspect.SEVIIAN).useDefaultCry());
        addNewPokemon(new SeviianDodrio("", Aspect.SEVIIAN).useDefaultCry());
        addNewPokemon(new SeviianMantyke("", Aspect.SEVIIAN).useDefaultCry());
        addNewPokemon(new SeviianMantine("", Aspect.SEVIIAN).useDefaultCry());
        addNewPokemon(new SeviianTeddiursa("", Aspect.SEVIIAN).useDefaultCry());
        addNewPokemon(new SeviianUrsaring("", Aspect.SEVIIAN).useDefaultCry());
        addNewPokemon(new SeviianFeebas("Feebas", Aspect.SEVIIAN).fishingSpawnFromExisting().useDefaultCry());
        addNewPokemon(new SeviianMilotic("Milotic", Aspect.SEVIIAN).useDefaultCry());
        addNewPokemon(new SeviianCarnivine("", Aspect.SEVIIAN).useDefaultCry());
        addNewPokemon(new SeviianBlitzle("", Aspect.SEVIIAN).useDefaultCry());
        addNewPokemon(new SeviianZebstrika("", Aspect.SEVIIAN).useDefaultCry());
        addNewPokemon(new SeviianClauncher("Clauncher", Aspect.SEVIIAN).useDefaultCry());
        addNewPokemon(new SeviianClawitzer("Clawitzer", Aspect.SEVIIAN).useDefaultCry());
        addNewPokemon(new SeviianNoibat("Noibat", Aspect.SEVIIAN).useDefaultCry());
        addNewPokemon(new SeviianNoivern("Noivern", Aspect.SEVIIAN).useDefaultCry());
        addNewPokemon(new SeviianWishiwashi("", Aspect.SEVIIAN).fishingSpawnFromExisting().useDefaultCry());
        addNewPokemon(new SeviianDhelmise("", Aspect.SEVIIAN).fishingSpawnFromExisting().useDefaultCry());
        addNewPokemon(new SeviianSizzlipede("", Aspect.SEVIIAN).useDefaultCry());
        addNewPokemon(new SeviianCentiskorch("", Aspect.SEVIIAN).useDefaultCry());
        addNewPokemon(new SeviianNymble("", Aspect.SEVIIAN).useDefaultCry());
        addNewPokemon(new SeviianLokix("", Aspect.SEVIIAN).useDefaultCry());
    }
}
