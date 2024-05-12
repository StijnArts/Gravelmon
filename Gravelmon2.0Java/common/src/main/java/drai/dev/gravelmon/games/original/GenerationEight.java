package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.blazingemerald.regional.*;
import drai.dev.gravelmon.pokemon.hiza.regional.*;
import drai.dev.gravelmon.pokemon.lockemon.regional.*;
import drai.dev.gravelmon.pokemon.myth.regional.*;
import drai.dev.gravelmon.pokemon.norheim.regional.*;
import drai.dev.gravelmon.pokemon.novrai.regional.*;
import drai.dev.gravelmon.pokemon.orohnhavai.regional.*;
import drai.dev.gravelmon.pokemon.radicalred.*;
import drai.dev.gravelmon.pokemon.vanguard.regional.*;
import drai.dev.gravelmon.pokemon.varitas.regional.*;

public class GenerationEight extends Game {
    public GenerationEight() {
        super("generation8");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new NovranWooloo(831));
        pokemon.add(new NovranDubwool(832));
        pokemon.add(new NovranClobbopus(852));
        pokemon.add(new NovranGrapploct(853));
        pokemon.add(new NovranHatenna(856));
        pokemon.add(new NovranHattrem(857));
        pokemon.add(new NovranHatterene(858));
        pokemon.add(new NovranImpidimp(859));
        pokemon.add(new NovranMorgrem(860));
        pokemon.add(new NovranGrimmsnarl(861));

//        pokemon.add(new VaritasianHatenna(856)); Member of line Not Finished
//        pokemon.add(new VaritasianHattrem(857)); Missing Art
        pokemon.add(new VaritasianImpidimp(859));
        pokemon.add(new VaritasianMorgrem(860));
        pokemon.add(new VaritasianMilcery(868));
        pokemon.add(new VaritasianAlcremie(869));
//        pokemon.add(new VaritasianDreepy(885)); Member of line Not Finished
//        pokemon.add(new VaritasianDrakloak(886)); Missing Art
//        pokemon.add(new VaritasianDragapult(887)); Missing Art

//        pokemon.add(new HavaiianBlipbug(824)); Member of line Not Finished
//        pokemon.add(new HavaiianDottler(825)); Missing Art
//        pokemon.add(new HavaiianOrbeetle(826)); Missing Art

          //Pokemon Blazing Emerald
        pokemon.add(new HoennianDreepy(885));
        pokemon.add(new HoennianDrakloak(886));
        pokemon.add(new HoennianDragapult(887));

        //Radical Red
        pokemon.add(new SeviianSizzlipede(850));
        pokemon.add(new SeviianCentiskorch(851));

        //Myth
        pokemon.add(new MythianKleavor(900));

        //Vanguard
        pokemon.add(new AyreianGrookey(810));
        pokemon.add(new AyreianThwacky(811));
        pokemon.add(new AyreianRillaboom(812));
        pokemon.add(new AyreianSizzlipede(850));
        pokemon.add(new AyreianCentiskorch(851));

        //Kaskadian
        pokemon.add(new KaskadianDubwool(832));

    }
}
