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
//        addNewPokemon(new Tuckle()); Missing Art
        addPokedexPokemon("farfetchd");
        addNewPokemon(new Achiefd());
        addPokedexPokemon("growlithe-aristosian, arcanine-aristosian");
//        addNewPokemon(new Probotheos()); Missing Art
        addPokedexPokemon("magikarp, gyarados, tropius-aristosian");
        addNewPokemon(new Kamurados());
//        addNewPokemon(new Goobae()); //MISSING STATS
        addNewPokemon(new Weeduza());
        addPokedexPokemon("tangela");
        addNewPokemon(new Tangorgon());
//        addNewPokemon(new Soulix()); Missing Art
//        addNewPokemon(new Fledjed()); Missing Art
        addNewPokemon(new Kangazad());
        addPokedexPokemon("kangaskhan-aristosian");
//        addNewPokemon(new Paloarmo()); Missing Art Renamed from Pharoar
        addNewPokemon(new EPP_v11());
//        addNewPokemon(new Pharoar()); Missing Art
//        addNewPokemon(new Cactrian()); Missing Art
//        addNewPokemon(new Spiribloom()); Missing Art
//        addNewPokemon(new Zoongus()); Missing Art
        addNewPokemon(new Kvadract());
        addNewPokemon(new Navatoria());
        addNewPokemon(new Sabroast());
    }

}
