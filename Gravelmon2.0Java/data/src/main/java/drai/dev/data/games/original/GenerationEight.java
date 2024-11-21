package drai.dev.data.games.original;

import drai.dev.data.games.registry.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.blazingemerald.regional.*;
import drai.dev.data.pokemon.hiza.regional.*;
import drai.dev.data.pokemon.lockemon.regional.*;
import drai.dev.data.pokemon.myth.regional.*;
import drai.dev.data.pokemon.norheim.regional.*;
import drai.dev.data.pokemon.novrai.regional.*;
import drai.dev.data.pokemon.radicalred.*;
import drai.dev.data.pokemon.vanguard.regional.*;
import drai.dev.data.pokemon.varitas.regional.*;

public class GenerationEight extends Game {
    public GenerationEight() {
        super("generation8");
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new NovranWooloo("", Aspect.NOVRAN));
        addNewPokemon(new NovranDubwool("", Aspect.NOVRAN));
        addNewPokemon(new NovranClobbopus("", Aspect.NOVRAN));
        addNewPokemon(new NovranGrapploct("", Aspect.NOVRAN));
        addNewPokemon(new NovranHatenna("", Aspect.NOVRAN));
        addNewPokemon(new NovranHattrem("", Aspect.NOVRAN));
        addNewPokemon(new NovranHatterene("", Aspect.NOVRAN));
        addNewPokemon(new NovranImpidimp("", Aspect.NOVRAN));
        addNewPokemon(new NovranMorgrem("", Aspect.NOVRAN));
        addNewPokemon(new NovranGrimmsnarl("", Aspect.NOVRAN));

        addNewPokemon(new NorheimanRookidee("", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanCorvisquire("", Aspect.NORHEIMAN));
        addNewPokemon(new NorheimanFalinks("", Aspect.NORHEIMAN));

//        pokemon.add(new VaritasianHatenna(856)); Member of line Not Finished
//        pokemon.add(new VaritasianHattrem(857)); Missing Art
        addNewPokemon(new VaritasianImpidimp("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianMorgrem("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianMilcery("", Aspect.VARITASIAN));
        addNewPokemon(new VaritasianAlcremie("", Aspect.VARITASIAN));
//        pokemon.add(new VaritasianDreepy(885)); Member of line Not Finished
//        pokemon.add(new VaritasianDrakloak(886)); Missing Art
//        pokemon.add(new VaritasianDragapult(887)); Missing Art

//        pokemon.add(new HavaiianBlipbug(824)); Member of line Not Finished
//        pokemon.add(new HavaiianDottler(825)); Missing Art
//        pokemon.add(new HavaiianOrbeetle(826)); Missing Art
//
        addNewPokemon(new HizianSilicobra("", Aspect.HIZIAN));
        addNewPokemon(new HizianSandaconda("", Aspect.HIZIAN));

          //Pokemon Blazing Emerald
        addNewPokemon(new HoennianDreepy("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianDrakloak("", Aspect.HOENNIAN));
        addNewPokemon(new HoennianDragapult("", Aspect.HOENNIAN));

        //Radical Red
        addNewPokemon(new SeviianSizzlipede("", Aspect.SEVIIAN));
        addNewPokemon(new SeviianCentiskorch("", Aspect.SEVIIAN));

        //Myth
        addNewPokemon(new MythianKleavor("", Aspect.MYTHIAN));

        //Vanguard
        addNewPokemon(new AyreianGrookey("", Aspect.AYREIAN));
        addNewPokemon(new AyreianThwackey("", Aspect.AYREIAN));
        addNewPokemon(new AyreianRillaboom("", Aspect.AYREIAN));
        addNewPokemon(new AyreianSizzlipede("", Aspect.AYREIAN));
        addNewPokemon(new AyreianCentiskorch("", Aspect.AYREIAN));

        //Kaskadian
        addNewPokemon(new KaskadianDubwool("", Aspect.KASKADIAN));

    }
}
