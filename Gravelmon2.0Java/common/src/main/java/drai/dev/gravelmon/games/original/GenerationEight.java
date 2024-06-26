package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.blazingemerald.regional.*;
import drai.dev.gravelmon.pokemon.hiza.regional.*;
import drai.dev.gravelmon.pokemon.lockemon.regional.*;
import drai.dev.gravelmon.pokemon.myth.regional.*;
import drai.dev.gravelmon.pokemon.norheim.regional.*;
import drai.dev.gravelmon.pokemon.novrai.regional.*;
import drai.dev.gravelmon.pokemon.radicalred.*;
import drai.dev.gravelmon.pokemon.vanguard.regional.*;
import drai.dev.gravelmon.pokemon.varitas.regional.*;

public class GenerationEight extends Game {
    public GenerationEight() {
        super("generation8");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new NovranWooloo("", Aspect.NOVRAN));
        pokemon.add(new NovranDubwool("", Aspect.NOVRAN));
        pokemon.add(new NovranClobbopus("", Aspect.NOVRAN));
        pokemon.add(new NovranGrapploct("", Aspect.NOVRAN));
        pokemon.add(new NovranHatenna("", Aspect.NOVRAN));
        pokemon.add(new NovranHattrem("", Aspect.NOVRAN));
        pokemon.add(new NovranHatterene("", Aspect.NOVRAN));
        pokemon.add(new NovranImpidimp("", Aspect.NOVRAN));
        pokemon.add(new NovranMorgrem("", Aspect.NOVRAN));
        pokemon.add(new NovranGrimmsnarl("", Aspect.NOVRAN));

        pokemon.add(new NorheimanRookidee("", Aspect.NORHEIMAN));
        pokemon.add(new NorheimanCorvisquire("", Aspect.NORHEIMAN));
        pokemon.add(new NorheimanFalinks("", Aspect.NORHEIMAN));

//        pokemon.add(new VaritasianHatenna(856)); Member of line Not Finished
//        pokemon.add(new VaritasianHattrem(857)); Missing Art
        pokemon.add(new VaritasianImpidimp("", Aspect.VARITASIAN));
        pokemon.add(new VaritasianMorgrem("", Aspect.VARITASIAN));
        pokemon.add(new VaritasianMilcery("", Aspect.VARITASIAN));
        pokemon.add(new VaritasianAlcremie("", Aspect.VARITASIAN));
//        pokemon.add(new VaritasianDreepy(885)); Member of line Not Finished
//        pokemon.add(new VaritasianDrakloak(886)); Missing Art
//        pokemon.add(new VaritasianDragapult(887)); Missing Art

//        pokemon.add(new HavaiianBlipbug(824)); Member of line Not Finished
//        pokemon.add(new HavaiianDottler(825)); Missing Art
//        pokemon.add(new HavaiianOrbeetle(826)); Missing Art
//
        pokemon.add(new HizianSilicobra("", Aspect.HIZIAN));
        pokemon.add(new HizianSandaconda("", Aspect.HIZIAN));

          //Pokemon Blazing Emerald
        pokemon.add(new HoennianDreepy("", Aspect.HOENNIAN));
        pokemon.add(new HoennianDrakloak("", Aspect.HOENNIAN));
        pokemon.add(new HoennianDragapult("", Aspect.HOENNIAN));

        //Radical Red
        pokemon.add(new SeviianSizzlipede("", Aspect.SEVIIAN));
        pokemon.add(new SeviianCentiskorch("", Aspect.SEVIIAN));

        //Myth
        pokemon.add(new MythianKleavor("", Aspect.MYTHIAN));

        //Vanguard
        pokemon.add(new AyreianGrookey("", Aspect.AYREIAN));
        pokemon.add(new AyreianThwacky("", Aspect.AYREIAN));
        pokemon.add(new AyreianRillaboom("", Aspect.AYREIAN));
        pokemon.add(new AyreianSizzlipede("", Aspect.AYREIAN));
        pokemon.add(new AyreianCentiskorch("", Aspect.AYREIAN));

        //Kaskadian
        pokemon.add(new KaskadianDubwool("", Aspect.KASKADIAN));

    }
}
