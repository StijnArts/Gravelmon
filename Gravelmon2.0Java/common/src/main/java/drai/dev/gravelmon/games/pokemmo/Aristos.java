package drai.dev.gravelmon.games.pokemmo;

import drai.dev.gravelmon.pokemon.aristos.*;
import drai.dev.gravelmon.pokemon.aristos.Paloarmo;
import drai.dev.gravelmon.pokemon.junnin.*;

public class Aristos extends drai.dev.gravelmon.games.registry.Game {
    public Aristos() {
        super("Aristos");
    }

    @Override
    public void registerPokemon() {


        pokemon.add(new Lanidos());
        pokemon.add(new Ramvolt());
//        pokemon.add(new Tuckle()); Missing Art
//        pokemon.add(new Achiefd()); Missing Stats
//        pokemon.add(new Probotheos()); Missing Art
//        pokemon.add(new Kamurados()); Missing Stats
//        pokemon.add(new Weeduza()); Missing Stats
//        pokemon.add(new Tangorgon()); Missing Stats
//        pokemon.add(new Soulix()); Missing Art
//        pokemon.add(new Fledjed()); Missing Art
//        pokemon.add(new Kangazad()); Missing Stats
//        pokemon.add(new Paloarmo()); Missing Art Renamed from Pharoar
//        pokemon.add(new EPP_v11()); Missing Stats
//        pokemon.add(new Cactrian()); Missing Art
//        pokemon.add(new Spiribloom()); Missing Art
//        pokemon.add(new Zoongus()); Missing Art
        pokemon.add(new Kvadract());
        pokemon.add(new Navatoria());
        pokemon.add(new Sabroast());
    }

}
