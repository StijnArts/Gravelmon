package drai.dev.data.games.pokemmo.done;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.orohnhavai.Voidefish;
import drai.dev.data.pokemon.atlas.Akrovern;
import drai.dev.data.pokemon.atlas.Albivore;
import drai.dev.data.pokemon.atlas.Carosella;
import drai.dev.data.pokemon.atlas.Eletize;
import drai.dev.data.pokemon.atlas.Emperiegle;
import drai.dev.data.pokemon.atlas.Eriegle;
import drai.dev.data.pokemon.atlas.Glozard;
import drai.dev.data.pokemon.atlas.Karaggon;
import drai.dev.data.pokemon.atlas.Luvenny;
import drai.dev.data.pokemon.atlas.Meritrot;
import drai.dev.data.pokemon.atlas.Nursee;
import drai.dev.data.pokemon.atlas.Nurturse;
import drai.dev.data.pokemon.atlas.Radiaze;
import drai.dev.data.pokemon.atlas.Radizorb;
import drai.dev.data.pokemon.atlas.Spartzle;
import drai.dev.data.pokemon.atlas.Stalliot;
import drai.dev.data.pokemon.atlas.Suavenny;
import drai.dev.data.pokemon.atlas.Trillowee;
import drai.dev.data.pokemon.atlas.Turtelisk;
import drai.dev.data.pokemon.atlas.Wilspri;
import drai.dev.data.pokemon.orohnhavai.*;

import java.util.*;
//done
public class OrohnHavai extends drai.dev.data.games.registry.Game {
    public OrohnHavai() {
        super("Orohn-Havai");
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Ekopi());
        pokemon.add(new Ekoraft());
        pokemon.add(new Expertri());
        pokemon.add(new Flaero());
        pokemon.add(new Impferno());
        pokemon.add(new Pyrovern());
        pokemon.add(new Kelpony());
        pokemon.add(new Maritide());
        pokemon.add(new Reefallion());
        pokemon.add(new Chenileaf());
        pokemon.add(new Cottoon());
        pokemon.add(new Sedavlin());
        pokemon.add(new Warblu());
        pokemon.add(new Territore());
        pokemon.add(new Warshrike());
//        pokemon.add(new Troopant()); Missing art
//        pokemon.add(new Antzooka()); Missing art
        pokemon.add(new Goosea());
        pokemon.add(new Neinei());
        pokemon.add(new Zapillar());
        pokemon.add(new Zapcoon());
        pokemon.add(new Zaptenna());
        pokemon.add(new Thistling());
        pokemon.add(new Withettle());
        pokemon.add(new Bonzumi());
        pokemon.add(new Bonzire());
        pokemon.add(new Imbumi());
        pokemon.add(new Frossit());
        pokemon.add(new Petumi());
        pokemon.add(new Fleuroma());
        pokemon.add(new Dorentu());
        pokemon.add(new Grandorent());
        pokemon.add(new Eriegle());
        pokemon.add(new Albivore());
        pokemon.add(new Emperiegle());
        pokemon.add(new Elfini());
        pokemon.add(new Aidelf());
        pokemon.add(new Mousense());
        pokemon.add(new Sensarat());
        pokemon.add(new Spartzle());
        pokemon.add(new Eletize());
        pokemon.add(new Slickitty());
        pokemon.add(new Axeleraze());
        pokemon.add(new Kroach());
        pokemon.add(new Kloakroach());
        pokemon.add(new Timiby());
        pokemon.add(new Nervreck());
        pokemon.add(new Wreckore());
        pokemon.add(new Lilabaa());
        pokemon.add(new Lulabaa());
        pokemon.add(new Glumence());
        pokemon.add(new Glumexin());
        pokemon.add(new Nursee());
        pokemon.add(new Nurturse());
        pokemon.add(new Chiroo());
        pokemon.add(new Trairoo());
        pokemon.add(new Luvenny());
        pokemon.add(new Suavenny());
        pokemon.add(new Pebblent());
        pokemon.add(new Rocroset());
        pokemon.add(new Granderosa(new Stats(512, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER,
                List.of(StatType.DEFENCE))));
        pokemon.add(new Reefermal());
        pokemon.add(new Veilvid());
        pokemon.add(new Brambarb());
        pokemon.add(new Wickvine());
        pokemon.add(new Wicktrive());
        pokemon.add(new Winklit());
        pokemon.add(new Gleamur());
        pokemon.add(new Pixiechu());
        var chemecko = new Chemecko();
        pokemon.add(chemecko);
//        pokemon.add(new AvorianChemecko(chemecko.getPokedexNumber()));
        pokemon.add(new Molozard());
        pokemon.add(new Twirpant());
        pokemon.add(new Kombantis());
        pokemon.add(new Barbenin());
        pokemon.add(new Scoprikon());

        pokemon.add(new Kraklam());
        pokemon.add(new Krakshen());
        pokemon.add(new Caraprisma());
        pokemon.add(new Clawconut());
        pokemon.add(new Clawgigus());
        pokemon.add(new Fribitad());
        pokemon.add(new Ribivine());
        pokemon.add(new Meritrot());
        pokemon.add(new Stalliot());
        pokemon.add(new Carosella());
        pokemon.add(new Timingo());
        pokemon.add(new Flambagant());
//        pokemon.add(new Glimpid()); Member of line not finished
//        pokemon.add(new Cryosect()); Missing Art
        pokemon.add(new Hematick());
        pokemon.add(new Vorvosip());
        pokemon.add(new Stegrump());
        pokemon.add(new Stegovore());
        pokemon.add(new Devostoric());
        pokemon.add(new Petirex());
        pokemon.add(new Wreckasaur());
        pokemon.add(new Arrocknid());
        pokemon.add(new Exoroknid());
        pokemon.add(new Kragodon(new Stats(415, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))));
        pokemon.add(new Therasloth());
        pokemon.add(new Slotherror());
        pokemon.add(new Pitopyre(new Stats(378, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Wooble());
        pokemon.add(new Snowool());
        pokemon.add(new Shiveram());
        pokemon.add(new Burnuki(new Stats(388, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))));
        pokemon.add(new Turtelisk());
        pokemon.add(new Karaggon());
        pokemon.add(new Akrovern());
        pokemon.add(new Glozard());
        pokemon.add(new Radizorb());
        pokemon.add(new Radiaze());
        pokemon.add(new Clastroid());
        pokemon.add(new Colistroid());
        pokemon.add(new Galixoid());
        pokemon.add(new Ferobite());
        pokemon.add(new Purswayer());
        pokemon.add(new Fortibal());
        pokemon.add(new Armodieval());
        pokemon.add(new Chillimp(new Stats(345, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Pinxie());
        pokemon.add(new Cosminx());
//        pokemon.add(new Konchore()); Missing Stats
//        pokemon.add(new Neptide()); Missing Art
//        pokemon.add(new Lemomi()); Missing Stats
//        pokemon.add(new Shelmissy()); Missing Art
//        pokemon.add(new Empressea()); Missing Art
        pokemon.add(new Sharfin());
        pokemon.add(new Thrashark());
        pokemon.add(new Voidefish());
        pokemon.add(new Voidevour());
//        pokemon.add(new Gargobble()); Missing Art
//        pokemon.add(new Garglizer()); Member of line not finished
        pokemon.add(new Ruffski());
        pokemon.add(new Arblizen());
        pokemon.add(new Siberizen());
        pokemon.add(new Pipsicle());
        pokemon.add(new Wilspri());
        pokemon.add(new Trillowee());

        pokemon.add(new Oreglyph());
        pokemon.add(new Geoglyphic(new Stats(476, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
//        pokemon.add(new Eskiflurr()); Missing art
        pokemon.add(new Tasticky());
        pokemon.add(new Tadapt());
        pokemon.add(new Thornment());
        pokemon.add(new Phrilter());
        pokemon.add(new Vortexol());
        pokemon.add(new Elecko());
        pokemon.add(new Foxsye());
        pokemon.add(new Veroxifye());
//        pokemon.add(new Chainect()); Missing art
//        pokemon.add(new Chainector()); Missing art
        pokemon.add(new Tundrill());
//        pokemon.add(new Malakele()); Missing art
//        pokemon.add(new Kahukele()); Missing art
        pokemon.add(new Camohut());
        pokemon.add(new Camofirma());
        pokemon.add(new Fyglow());
//        pokemon.add(new Polighoul()); Missing art
        pokemon.add(new Alpheon());
        pokemon.add(new Eveon());
        pokemon.add(new Tekichu(new Stats(410, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))));
        pokemon.add(new Finray());
        pokemon.add(new Ogoprowl());
        pokemon.add(new Sephysar());
//        pokemon.add(new Vexigon()); Member of line not finished
//        pokemon.add(new Noxareo()); Missing art
//        pokemon.add(new Darcastro()); Member of line not finished
        pokemon.add(new Rivulcred());
        pokemon.add(new Valecred());
//        pokemon.add(new Drazephir()); Missing art
        pokemon.add(new Netherval());
        pokemon.add(new Quadrossal());
        pokemon.add(new Infiluv());
//        pokemon.add(new Obideion()); Missing art
//        pokemon.add(new Generion()); Missing art
//        pokemon.add(new Indureion()); Missing art
        pokemon.add(new Zedakazm());
//        pokemon.add(new Intelix()); Missing art
//        pokemon.add(new Nectavian()); Missing art

    }

}
