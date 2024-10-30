package drai.dev.data.games.pokemmo.done;


import drai.dev.data.pokemon.aristos.*;

//Done
public class Aristos extends drai.dev.data.games.registry.Game {
    public Aristos() {
        super("Aristos");
    }

    @Override
    public void registerPokemon() {


        pokemon.add(new Lanidos());
        pokemon.add(new Ramvolt());
//        pokemon.add(new Tuckle()); Missing Art
        pokemon.add(new Achiefd());
//        pokemon.add(new Probotheos()); Missing Art
        pokemon.add(new Kamurados());
//        pokemon.add(new Goobae()); //MISSING STATS
        pokemon.add(new Weeduza());
        pokemon.add(new Tangorgon());
//        pokemon.add(new Soulix()); Missing Art
//        pokemon.add(new Fledjed()); Missing Art
        pokemon.add(new Kangazad());
//        pokemon.add(new Paloarmo()); Missing Art Renamed from Pharoar
        pokemon.add(new EPP_v11());
//        pokemon.add(new Pharoar()); Missing Art
//        pokemon.add(new Cactrian()); Missing Art
//        pokemon.add(new Spiribloom()); Missing Art
//        pokemon.add(new Zoongus()); Missing Art
        pokemon.add(new Kvadract());
        pokemon.add(new Navatoria());
        pokemon.add(new Sabroast());
    }

}
