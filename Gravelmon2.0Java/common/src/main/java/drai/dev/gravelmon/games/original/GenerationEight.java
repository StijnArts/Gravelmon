package drai.dev.gravelmon.games.original;

import drai.dev.gravelmon.games.registry.*;
import drai.dev.gravelmon.pokemon.blazingemerald.regional.*;
import drai.dev.gravelmon.pokemon.hiza.regional.*;
import drai.dev.gravelmon.pokemon.lockemon.regional.*;
import drai.dev.gravelmon.pokemon.myth.regional.*;
import drai.dev.gravelmon.pokemon.norheim.regional.*;
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

//        pokemon.add(new NorheimanRookidee(821)); NOT FINISHED
//        pokemon.add(new NorheimanCorvisquire(822)); NOT FINISHED
        pokemon.add(new NorheimanFalinks(870));

//        pokemon.add(new VaritasianHatenna(856)); NOT FINISHED
//        pokemon.add(new VaritasianHattrem(857)); NOT FINISHED
//        pokemon.add(new VaritasianImpidimp(859)); NOT FINISHED
//        pokemon.add(new VaritasianMorgrem(860)); NOT FINISHED
        pokemon.add(new VaritasianMilcery(868));
        pokemon.add(new VaritasianAlcremie(869));
//        pokemon.add(new VaritasianDreepy(885)); NOT FINISHED
//        pokemon.add(new VaritasianDrakloak(886)); NOT FINISHED
//        pokemon.add(new VaritasianDragapult(887)); NOT FINISHED

//        pokemon.add(new HavaiianBlipbug(824)); NOT FINISHED
//        pokemon.add(new HavaiianDottler(825)); NOT FINISHED
//        pokemon.add(new HavaiianOrbeetle(826)); NOT FINISHED
//
        pokemon.add(new HizianSilicobra(843));
        pokemon.add(new HizianSandaconda(844));

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
