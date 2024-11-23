package drai.dev.data.games.pokemmo.done;


import drai.dev.data.pokemon.aristos.*;

//Done
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
        pokemon.add(new Achiefd());
        addPokedexPokemon("growlithe-aristosian, arcanine-aristosian");
//        pokemon.add(new Probotheos()); Missing Art
        addPokedexPokemon("magikarp, gyarados, tropius-aristosian");
        pokemon.add(new Kamurados());
//        pokemon.add(new Goobae()); //MISSING STATS
        pokemon.add(new Weeduza());
        addPokedexPokemon("tangela");
        pokemon.add(new Tangorgon());
//        pokemon.add(new Soulix()); Missing Art
//        pokemon.add(new Fledjed()); Missing Art
        addNewPokemon(new Kangazad());
        addPokedexPokemon("kangaskhan-aristosian");
//        pokemon.add(new Paloarmo()); Missing Art Renamed from Pharoar
        pokemon.add(new EPP_v11());
//        pokemon.add(new Pharoar()); Missing Art
//        pokemon.add(new Cactrian()); Missing Art
//        pokemon.add(new Spiribloom()); Missing Art
//        pokemon.add(new Zoongus()); Missing Art
        addNewPokemon(new Kvadract());
        addNewPokemon(new Navatoria());
        addNewPokemon(new Sabroast());
    }

}
