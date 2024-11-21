package drai.dev.data.games;

import drai.dev.data.games.registry.*;
import drai.dev.data.pokemon.vanguard.*;

public class Vanguard extends Game {
    public Vanguard() {
        super("Vanguard");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Magnemelt());
        addNewPokemon(new Fleumingo());
        addNewPokemon(new Loathedisc());
        addNewPokemon(new Gyropass());
        addNewPokemon(new Amacorala());
        addNewPokemon(new Solacor());
        addNewPokemon(new Dunmyth());
        addNewPokemon(new Dundragon());
        addNewPokemon(new Merlicun());
        addNewPokemon(new Firomenis());
        addNewPokemon(new Wolfum());
        addNewPokemon(new Supiritto());
        addNewPokemon(new Infernadeer());
        addNewPokemon(new Cradecart());
        addNewPokemon(new Sylure());
        addNewPokemon(new Syrallure());
        addNewPokemon(new Syrenade());
        addNewPokemon(new Tartot());
        addNewPokemon(new Teranigrade());
        addNewPokemon(new Setsarec());

    }
}
