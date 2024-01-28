package drai.dev.gravelmon.games.pokemmo;

import drai.dev.gravelmon.pokemon.aristos.*;

public class Aristos extends drai.dev.gravelmon.games.registry.Game {
    public Aristos() {
        super("Aristos");
    }

    @Override
    public void registerPokemon() {


//        pokemon.add(new Achiefd()); NOT FINISEHD
//        pokemon.add(new EPP_v11()); NOT FINISEHD
//        pokemon.add(new Fledjed()); NOT FINISHED
//        pokemon.add(new Kangazad()); NOT FINISEHD
//        pokemon.add(new Kamurados()); NOT FINISEHD
//        pokemon.add(new Cactrian()); NOT FINISEHD
        pokemon.add(new Lanidos());
//        pokemon.add(new Probotheos()); NOT FINISHED
//        pokemon.add(new Pharoar()); NOT FINISHED
        pokemon.add(new Ramvolt());
//        pokemon.add(new Soulix()); NOT FINISEHD
//        pokemon.add(new Spiribloom()); NOT FINISEHD
//        pokemon.add(new Tuckle()); NOT FINISHED
//        pokemon.add(new Weeduza()); NOT FINISHED
//        pokemon.add(new Tangorgon()); NOT FINISHED
//        pokemon.add(new Zoongus()); NOT FINISEHD
        pokemon.add(new Kvadract());
        pokemon.add(new Navatoria());
        pokemon.add(new Sabroast());
    }

}
