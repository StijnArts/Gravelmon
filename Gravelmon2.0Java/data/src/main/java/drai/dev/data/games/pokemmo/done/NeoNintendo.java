package drai.dev.data.games.pokemmo.done;


import drai.dev.data.pokemon.neonintendo.*;
//done
public class NeoNintendo extends drai.dev.data.games.registry.Game {
    public NeoNintendo() {
        super("NeoNintendo");
    } //DONE

    @Override
    public void registerPokemon() {
//        addNewPokemon(new NeoZubat(41)); Member of line not finished
//        addNewPokemon(new NeoGeodude(74)); Member of line not finished
        addPokedexPokemon("cacnea-neo");
        addNewPokemon(new Cactussle());
//        addNewPokemon(new NeoTurtwig(387));Member of line not finished
//        addNewPokemon(new NeoGrotle(388));Member of line not finished
//        addNewPokemon(new NeoChimchar(390));Member of line not finished
//        addNewPokemon(new NeoMonferno(391));Member of line not finished
//        addNewPokemon(new NeoPiplup(393));Member of line not finished
//        addNewPokemon(new NeoPrinplup(394));Member of line not finished
//        addNewPokemon(new Velozolt());
    }

}
