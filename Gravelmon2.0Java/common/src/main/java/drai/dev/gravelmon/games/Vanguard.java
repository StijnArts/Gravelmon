package drai.dev.gravelmon.games;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.vanguard.*;

public class Vanguard extends Game {
    public Vanguard() {
        super("Vanguard");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Magnemelt());
        pokemon.add(new Fleumingo());
        pokemon.add(new Loathedisc());
        pokemon.add(new Gyropass());
        pokemon.add(new Amacorala());
        pokemon.add(new Solacor());
        pokemon.add(new Dunmyth());
        pokemon.add(new Dundragon());
        pokemon.add(new Merlicun());
        pokemon.add(new Firomenis());
        pokemon.add(new Wolfum());
        pokemon.add(new Supiritto());
        pokemon.add(new Infernadeer());
        pokemon.add(new Cradecart());
        pokemon.add(new Sylure());
        pokemon.add(new Syrallure());
        pokemon.add(new Syrenade());
        pokemon.add(new Tartot());
        pokemon.add(new Teranigrade());
        pokemon.add(new Setsarec());

    }
}
