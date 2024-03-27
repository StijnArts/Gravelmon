package drai.dev.gravelmon.games.pokemmo.secondbatch;


import drai.dev.gravelmon.pokemon.neonintendo.Cactussle;
import drai.dev.gravelmon.pokemon.pastelisland.*;
import drai.dev.gravelmon.pokemon.neonintendo.*;
import drai.dev.gravelmon.pokemon.nodorro.*;
import drai.dev.gravelmon.pokemon.orbis.*;
import drai.dev.gravelmon.pokemon.fliga.*;
import drai.dev.gravelmon.pokemon.ruskow.*;
import drai.dev.gravelmon.pokemon.otopo.*;
import drai.dev.gravelmon.pokemon.goetia.*;
import drai.dev.gravelmon.pokemon.ionos.*;
import drai.dev.gravelmon.pokemon.lagoone.*;

public class NeoNintendo extends drai.dev.gravelmon.games.registry.Game {
    public NeoNintendo() {
        super("Neo Nintendo");
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
