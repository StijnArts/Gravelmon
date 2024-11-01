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
        pokemon.forEach(pokemon1 -> {
            pokemon1.getLabels().remove(Label.RAIAN);
            pokemon1.getLabels().add(Label.PALMIA);
        });
    }

    @Override
    public void registerPokemon() {
        pokemon.add(new Wizlit().setUsesBigModel());
        pokemon.add(new Wazloom().setUsesBigModel());
        pokemon.add(new Hollose(new Stats(528, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Oryoze().setUsesBigModel());
        pokemon.add(new Burnyx().setUsesBigModel());
        pokemon.add(new Pyroxall(new Stats(530, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Squcale().setUsesBigModel());
        pokemon.add(new Beracale().setUsesBigModel());
        pokemon.add(new Yadazard(new Stats(534, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());

        pokemon.add(new Bulblute().setUsesBigModel());
        pokemon.add(new Euphobul().setUsesBigModel());
        pokemon.add(new Cianbul(new Stats(480, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Arnabar().setUsesBigModel());
        pokemon.add(new Jazarnab(new Stats(410, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Garupa().setUsesBigModel());
        pokemon.add(new Upacoon().setUsesBigModel());
        pokemon.add(new Dobnaly(new Stats(420, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Tetranq().setUsesBigModel());
        pokemon.add(new Cynomotar(new Stats(430, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Jarboen(new Stats(430, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Sanqet().setUsesBigModel());
        pokemon.add(new Herramal(new Stats(460, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        pokemon.add(new Buffox().setUsesBigModel());
        pokemon.add(new Foxmi(new Stats(460, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Kermite().setUsesBigModel());
        pokemon.add(new Solmite(new Stats(410, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Wingmite(new Stats(410, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Mitequeen(new Stats(520, StatArchetype.PHYSICAL_WALL, List.of(StatType.HP))).setUsesBigModel());
        pokemon.add(new Miteking(new Stats(520, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Hamoria().setUsesBigModel());
        pokemon.add(new Bossmor(new Stats(450, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Oinad().setUsesBigModel());
        pokemon.add(new Kanarel(new Stats(450, StatArchetype.PHYSICAL_WALL, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Weroy().setUsesBigModel());
        pokemon.add(new Fazight().setUsesBigModel());
        pokemon.add(new Mudarek(new Stats(510, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Topazeon(new Stats(525, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Marsheon(new Stats(525, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        pokemon.add(new Piezeon(new Stats(525, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))).setUsesBigModel());
        pokemon.add(new Chibug(new Stats(320, StatArchetype.BULKY_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Snakolt(new Stats(320, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Grumyna().setUsesBigModel());
        pokemon.add(new Mynzaj(new Stats(430, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Tribarix(new Stats(360, StatArchetype.FAST_SUPPORT, List.of(StatType.HP))).setUsesBigModel());
        pokemon.add(new Vargri().setUsesBigModel());
        pokemon.add(new Monivara(new Stats(470, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Litchil().setUsesBigModel());
        pokemon.add(new Defstring().setUsesBigModel());
        pokemon.add(new Dajara(new Stats(510, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());

        pokemon.add(new Ratatox(new Stats(525, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Froguin().setUsesBigModel());
        pokemon.add(new Tenturog(new Stats(470, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Murkrog(new Stats(470, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Igon().setUsesBigModel());
        pokemon.add(new Stingall().setUsesBigModel());
        pokemon.add(new Gonamor(new Stats(540, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Gonking(new Stats(540, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        pokemon.add(new Agona(new Stats(540, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Colloestamp(new Stats(460, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Poltamp(new Stats(310, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Farstamp(new Stats(310, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Finstamp(new Stats(310, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Doomonic(new Stats(580, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());

        pokemon.add(new Dieseltar().setUsesBigModel());
        pokemon.add(new Diesgar(new Stats(500, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Mogboal().setUsesBigModel());
        pokemon.add(new Goldos(new Stats(460, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Salaqoar(new Stats(430, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Reroglora().setUsesBigModel());
        pokemon.add(new Agroglora(new Stats(440, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Reroyox().setUsesBigModel());
        pokemon.add(new Walitan(new Stats(450, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))).setUsesBigModel());
        pokemon.add(new Rexiard().setUsesBigModel());
        pokemon.add(new Draxizar(new Stats(480, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Glidird(new Stats(360, StatArchetype.FAST_SUPPORT, List.of(StatType.SPEED))).setUsesBigModel());

        pokemon.add(new Kintan(new Stats(550, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Jelltox(new Stats(350, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))).setUsesBigModel());
        pokemon.add(new Darrpler().setUsesBigModel());
        pokemon.add(new Darcoon().setUsesBigModel());
        pokemon.add(new Grimoth(new Stats(510, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Batzon().setUsesBigModel());
        pokemon.add(new Basitrus(new Stats(450, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Owsno().setUsesBigModel());
        pokemon.add(new Flacowl(new Stats(440, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Balan(new Stats(560, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Desol(new Stats(560, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Bawolf().setUsesBigModel());
        pokemon.add(new Puffulf(new Stats(480, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());

        pokemon.add(new Dusklyr().setUsesBigModel());
        pokemon.add(new Duskreap(new Stats(460, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Fairny().setUsesBigModel());
        pokemon.add(new Candilite().setUsesBigModel());
        pokemon.add(new Lampuly(new Stats(520, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());

        pokemon.add(new Bahmut(new Stats(540, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Joorit().setUsesBigModel());
        pokemon.add(new Ejoort(new Stats(460, StatArchetype.PHYSICAL_WALL, List.of(StatType.DEFENCE))).setUsesBigModel());

        pokemon.add(new Polimud(new Stats(510, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Croomish(new Stats(450, StatArchetype.BULKY_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Yotock(new Stats(450, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());

        pokemon.add(new Chikotize().setUsesBigModel());
        pokemon.add(new Florize().setUsesBigModel());
        pokemon.add(new Purgrize(new Stats(580, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Cyndaqize().setUsesBigModel());
        pokemon.add(new Flamize().setUsesBigModel());
        pokemon.add(new Efreetize(new Stats(580, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Totodize().setUsesBigModel());
        pokemon.add(new Aqurize().setUsesBigModel());
        pokemon.add(new Orcarize(new Stats(580, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());

        pokemon.add(new Eonize(new Stats(580, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Churaize(new Stats(580, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Pikavee().setUsesBigModel());
        pokemon.add(new Raivee(new Stats(550, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        pokemon.add(new Insarize(new Stats(580, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE, StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Stormrize(new Stats(580, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Hitmonrize(new Stats(580, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Cellurize(new Stats(580, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))).setUsesBigModel());
        pokemon.add(new Yeggrize(new Stats(580, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Pixirize(new Stats(580, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Polurize(new Stats(580, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Traprize(new Stats(580, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK, StatType.ATTACK))).setUsesBigModel());
        pokemon.add(new Glacerize(new Stats(580, StatArchetype.SPECIAL_WALL, List.of(StatType.HP))).setUsesBigModel());
        pokemon.add(new Boldurize(new Stats(580, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Kagenrize(new Stats(580, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Drarize().setUsesBigModel());
        pokemon.add(new Dreadrize().setUsesBigModel());
        pokemon.add(new Tymarize(new Stats(600, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        pokemon.add(new Maditize(new Stats(610, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Coratize(new Stats(610, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Noistize(new Stats(610, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))).setUsesBigModel());
        pokemon.add(new Mothrize(new Stats(680, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Majaite(new Stats(680, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        pokemon.add(new Royandy(new Stats(680, StatArchetype.PHYSICAL_WALL, List.of(StatType.ATTACK))).setUsesBigModel());
    }
}
