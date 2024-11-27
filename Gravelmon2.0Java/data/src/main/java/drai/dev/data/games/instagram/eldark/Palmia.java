package drai.dev.data.games.instagram.eldark;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.raian.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Palmia  extends drai.dev.data.games.registry.Game {
    public Palmia() {
        super("Palmia");
    }

    @Override
    public void init() {
        super.init();
        newPokemon.forEach(pokemon1 -> {
            pokemon1.getLabels().remove(Label.RAIAN);
            pokemon1.getLabels().add(Label.PALMIA);
        });
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Wizlit().setUsesBigModel());
        addNewPokemon(new Wazloom().setUsesBigModel());
        addNewPokemon(new Hollose(new Stats(528, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Oryoze().setUsesBigModel());
        addNewPokemon(new Burnyx().setUsesBigModel());
        addNewPokemon(new Pyroxall(new Stats(530, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Squcale().setUsesBigModel().fishingSpawnFromExisting());
        addNewPokemon(new Beracale().setUsesBigModel());
        addNewPokemon(new Yadazard(new Stats(534, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());

        addNewPokemon(new Bulblute().setUsesBigModel());
        addNewPokemon(new Euphobul().setUsesBigModel());
        addNewPokemon(new Cianbul(new Stats(480, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Arnabar().setUsesBigModel());
        addNewPokemon(new Jazarnab(new Stats(410, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Garupa().setUsesBigModel());
        addNewPokemon(new Upacoon().setUsesBigModel());
        addNewPokemon(new Dobnaly(new Stats(420, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Tetranq().setUsesBigModel());
        addNewPokemon(new Cynomotar(new Stats(430, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Jarboen(new Stats(430, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Sanqet().setUsesBigModel());
        addNewPokemon(new Herramal(new Stats(460, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        addNewPokemon(new Buffox().setUsesBigModel());
        addNewPokemon(new Foxmi(new Stats(460, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Kermite().setUsesBigModel());
        addNewPokemon(new Solmite(new Stats(410, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Wingmite(new Stats(410, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Mitequeen(new Stats(520, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))).setUsesBigModel());
        addNewPokemon(new Miteking(new Stats(520, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Hamoria().setUsesBigModel().fishingSpawnFromExisting());
        addNewPokemon(new Bossmor(new Stats(450, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Oinad().setUsesBigModel().fishingSpawnFromExisting());
        addNewPokemon(new Kanarel(new Stats(450, StatArchetype.PHYSICAL_WALL, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Weroy().setUsesBigModel());
        addNewPokemon(new Fazight().setUsesBigModel());
        addNewPokemon(new Mudarek(new Stats(510, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addPokedexPokemon(
                "eevee," +
                        "vaporeon," +
                        "jolteon," +
                        "flareon," +
                        "espeon," +
                        "umbreon," +
                        "leafeon," +
                        "glaceon," +
                        "sylveon");
        addNewPokemon(new Topazeon(new Stats(525, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Marsheon(new Stats(525, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        addNewPokemon(new Piezeon(new Stats(525, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))).setUsesBigModel());
        addNewPokemon(new Chibug(new Stats(320, StatArchetype.BULKY_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Snakolt(new Stats(320, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Grumyna().setUsesBigModel());
        addNewPokemon(new Mynzaj(new Stats(430, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Tribarix(new Stats(360, StatArchetype.FAST_SUPPORT, List.of(StatType.HP))).setUsesBigModel());
        addNewPokemon(new Vargri().setUsesBigModel().fishingSpawnFromExisting());
        addNewPokemon(new Monivara(new Stats(470, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Litchil().setUsesBigModel());
        addNewPokemon(new Defstring().setUsesBigModel());
        addNewPokemon(new Dajara(new Stats(510, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());

        addPokedexPokemon("ratata-palmian, raticate-palmian");
        addNewPokemon(new Ratatox(new Stats(525, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Froguin().setUsesBigModel().fishingSpawnFromExisting());
        addNewPokemon(new Tenturog(new Stats(470, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Murkrog(new Stats(470, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Igon().setUsesBigModel());
        addNewPokemon(new Stingall().setUsesBigModel());
        addNewPokemon(new Gonamor(new Stats(540, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Gonking(new Stats(540, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        addNewPokemon(new Agona(new Stats(540, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Colloestamp(new Stats(460, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Poltamp(new Stats(310, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Farstamp(new Stats(310, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Finstamp(new Stats(310, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Doomonic(new Stats(580, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());

        addPokedexPokemon("gastly-palmian");
        addNewPokemon(new Dieseltar().setUsesBigModel());
        addNewPokemon(new Diesgar(new Stats(500, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Mogboal().setUsesBigModel());
        addNewPokemon(new Goldos(new Stats(460, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Salaqoar(new Stats(430, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Reroglora().setUsesBigModel());
        addNewPokemon(new Agroglora(new Stats(440, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Reroyox().setUsesBigModel());
        addNewPokemon(new Walitan(new Stats(450, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))).setUsesBigModel());
        addNewPokemon(new Rexiard().setUsesBigModel());
        addNewPokemon(new Draxizar(new Stats(480, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Glidird(new Stats(360, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))).setUsesBigModel());

        addPokedexPokemon("pawniard-palmian, bisharp-palmian");
        addNewPokemon(new Kintan(new Stats(550, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Jelltox(new Stats(350, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))).setUsesBigModel().fishingSpawnFromExisting());
        addNewPokemon(new Darrpler().setUsesBigModel());
        addNewPokemon(new Darcoon().setUsesBigModel());
        addNewPokemon(new Grimoth(new Stats(510, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Batzon().setUsesBigModel());
        addNewPokemon(new Basitrus(new Stats(450, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Owsno().setUsesBigModel());
        addNewPokemon(new Flacowl(new Stats(440, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addPokedexPokemon("absol");
        addNewPokemon(new Balan(new Stats(560, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Desol(new Stats(560, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Bawolf().setUsesBigModel());
        addNewPokemon(new Puffulf(new Stats(480, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());

        addPokedexPokemon("gible-palmian, gabite-palmian, garchomp-palmian, exeggcute-palmian, exeggutor-palmian");
        addNewPokemon(new Dusklyr().setUsesBigModel());
        addNewPokemon(new Duskreap(new Stats(460, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Fairny().setUsesBigModel());
        addNewPokemon(new Candilite().setUsesBigModel());
        addNewPokemon(new Lampuly(new Stats(520, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());

        addPokedexPokemon("growlithe-palmian, arcanine-palmian, magikarp-palmian");
        addNewPokemon(new Bahmut(new Stats(540, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Joorit().setUsesBigModel());
        addNewPokemon(new Ejoort(new Stats(460, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))).setUsesBigModel());

        addPokedexPokemon("poliwag-palmian, poliwhirl-palmian");
        addNewPokemon(new Polimud(new Stats(510, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Croomish(new Stats(450, StatArchetype.BULKY_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Yotock(new Stats(450, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());

        addNewPokemon(new Chikotize().setUsesBigModel());
        addNewPokemon(new Florize().setUsesBigModel());
        addNewPokemon(new Purgrize(new Stats(580, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Cyndaqize().setUsesBigModel());
        addNewPokemon(new Flamize().setUsesBigModel());
        addNewPokemon(new Efreetize(new Stats(580, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Totodize().setUsesBigModel().fishingSpawnFromExisting());
        addNewPokemon(new Aqurize().setUsesBigModel());
        addNewPokemon(new Orcarize(new Stats(580, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());

        addPokedexPokemon("eevee");
        addNewPokemon(new Eonize(new Stats(580, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addPokedexPokemon("pichu, pikachu, raichu");
        addNewPokemon(new Churaize(new Stats(580, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Pikavee().setUsesBigModel());
        addNewPokemon(new Raivee(new Stats(550, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addPokedexPokemon("pinsir");
        addNewPokemon(new Insarize(new Stats(580, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE, StatType.ATTACK))).setUsesBigModel());
        addPokedexPokemon("rookidee");
        addPokedexPokemon("corvisquire");
        addPokedexPokemon("corviknight");
        addNewPokemon(new Stormrize(new Stats(580, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        addPokedexPokemon("tyrogue");
        addPokedexPokemon("hitmonchan");
        addPokedexPokemon("hitmonlee");
        addPokedexPokemon("hitmontop");
        addNewPokemon(new Hitmonrize(new Stats(580, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addPokedexPokemon("solosis");
        addPokedexPokemon("duosion");
        addPokedexPokemon("reuniclus");
        addNewPokemon(new Cellurize(new Stats(580, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))).setUsesBigModel());
        addPokedexPokemon("nickit");
        addPokedexPokemon("thievul");
        addNewPokemon(new Yeggrize(new Stats(580, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addPokedexPokemon("flabebe");
        addPokedexPokemon("floette");
        addPokedexPokemon("florges");
        addNewPokemon(new Pixirize(new Stats(580, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        addPokedexPokemon("koffing");
        addPokedexPokemon("weezing");
        addNewPokemon(new Polurize(new Stats(580, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        addPokedexPokemon("trapinch");
        addPokedexPokemon("vibrava");
        addPokedexPokemon("flygon");
        addNewPokemon(new Traprize(new Stats(580, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK, StatType.ATTACK))).setUsesBigModel());
        addPokedexPokemon("vanillite");
        addPokedexPokemon("vanillish");
        addPokedexPokemon("vanilluxe");
        addNewPokemon(new Glacerize(new Stats(580, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))).setUsesBigModel());
        addPokedexPokemon("roggenrola");
        addPokedexPokemon("boldore");
        addPokedexPokemon("gigalith");
        addNewPokemon(new Boldurize(new Stats(580, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addPokedexPokemon("klink");
        addPokedexPokemon("klang");
        addPokedexPokemon("klinklang");
        addNewPokemon(new Kagenrize(new Stats(580, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Drarize().setUsesBigModel());
        addNewPokemon(new Dreadrize().setUsesBigModel());
        addNewPokemon(new Tymarize(new Stats(600, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Maditize(new Stats(610, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Coratize(new Stats(610, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Noistize(new Stats(610, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Mothrize(new Stats(680, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Majaite(new Stats(680, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Royandy(new Stats(680, StatArchetype.PHYSICAL_WALL, List.of(StatType.ATTACK))).setUsesBigModel());
    }
}
