package drai.dev.data.games.pokemmo;


import drai.dev.data.pokemon.neonintendo.*;

public class NeoNintendo extends drai.dev.data.games.registry.Game {
    public NeoNintendo() {
        super("NeoNintendo");
    } //DONE

    @Override
    public void registerPokemon() {
//        pokemon.add(new NeoZubat(41)); Member of line not finished
//        pokemon.add(new NeoGeodude(74)); Member of line not finished
        pokemon.add(new Cactussle());
//        pokemon.add(new NeoTurtwig(387));Member of line not finished
//        pokemon.add(new NeoGrotle(388));Member of line not finished
//        pokemon.add(new NeoChimchar(390));Member of line not finished
//        pokemon.add(new NeoMonferno(391));Member of line not finished
//        pokemon.add(new NeoPiplup(393));Member of line not finished
//        pokemon.add(new NeoPrinplup(394));Member of line not finished
//        pokemon.add(new Velozolt()); TODO find other members of galar fossil group
    }

}
