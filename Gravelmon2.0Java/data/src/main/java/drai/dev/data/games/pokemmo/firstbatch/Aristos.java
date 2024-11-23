package drai.dev.data.games.pokemmo.firstbatch;

import drai.dev.data.pokemon.aristos.*;

public class Aristos extends drai.dev.data.games.registry.Game {
    public Aristos() {
        super("Aristos");
    }

    @Override
    public void registerPokemon() {

        addPokedexPokemon("sentret-aristosian, furret-aristosian, spinarak-aristosian");
        addNewPokemon(new Lanidos());
        addPokedexPokemon("bellsprout-aristosian, weepinbell-aristosian, victreebel-aristosian," +
                "mareep-aristosian, flaaffy-aristosian");
        addNewPokemon(new Ramvolt());
//        pokemon.add(new Tuckle()); Missing Art
        addPokedexPokemon("farfetchd");
        addNewPokemon(new Achiefd());
        addPokedexPokemon("growlithe-aristosian, arcanine-aristosian");
//        pokemon.add(new Probotheos()); Missing Art'

        addPokedexPokemon("magikarp, gyarados, tropius-aristosian");
        addNewPokemon(new Kamurados());
        addNewPokemon(new Weeduza());
        addPokedexPokemon("tangela");
        addNewPokemon(new Tangorgon());
//        pokemon.add(new Soulix()); Missing Art
//        pokemon.add(new Fledjed()); Missing Art
        addNewPokemon(new Kangazad());
        addPokedexPokemon("kangaskhan-aristosian");
//        pokemon.add(new Paloarmo()); Missing Art Renamed from Pharoar
        addNewPokemon(new EPP_v11());
//        pokemon.add(new Cactrian()); Missing Art
//        pokemon.add(new Spiribloom()); Missing Art
//        pokemon.add(new Zoongus()); Missing Art
        addNewPokemon(new Kvadract());
        addNewPokemon(new Navatoria());
        addNewPokemon(new Sabroast());
    }

}
