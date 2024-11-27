package drai.dev.data.games.instagram.eldark;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.raian.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Trizor extends drai.dev.data.games.registry.Game {
    public Trizor() {
        super("Trizor");
    }

    @Override
    public void init() {
        super.init();
        newPokemon.forEach(pokemon1 -> {
            pokemon1.getLabels().remove(Label.RAIAN);
            pokemon1.getLabels().add(Label.TRIZOR);
        });
    }

    @Override
    public void registerPokemon() {
        addNewPokemon(new Babear().setUsesBigModel());
        addNewPokemon(new Roybear().setUsesBigModel());
        addNewPokemon(new Beroxic(new Stats(530, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        addNewPokemon(new Tecanbear(new Stats(530, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());

        addNewPokemon(new Gorire().setUsesBigModel());
        addNewPokemon(new Gorajack().setUsesBigModel());
        addNewPokemon(new Gorisulfa(new Stats(530, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Tecnorilla(new Stats(530, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());

        addNewPokemon(new Spactrish().setUsesBigModel().fishingSpawnFromExisting());
        addNewPokemon(new Spacteel().setUsesBigModel());
        addNewPokemon(new Whaleist(new Stats(530, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Tecnophin(new Stats(530, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());

        addNewPokemon(new Woolorm().setUsesBigModel());
        addNewPokemon(new Blancoon().setUsesBigModel());
        addNewPokemon(new Mushlanket(new Stats(480, StatArchetype.BULKY_SUPPORT, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Chowl().setUsesBigModel());
        addNewPokemon(new Kickowl(new Stats(480, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Zokinub().setUsesBigModel());
        addNewPokemon(new Zilozwine().setUsesBigModel());
        addNewPokemon(new Zazozwine(new Stats(530, StatArchetype.PHYSICAL_WALL, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Orbavil().setUsesBigModel());
        addNewPokemon(new Earyvil().setUsesBigModel());
        addNewPokemon(new Morevil(new Stats(490, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Plasmar().setUsesBigModel());
        addNewPokemon(new Plateach(new Stats(450, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Spikuch().setUsesBigModel());
        addNewPokemon(new Sprunch(new Stats(460, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Baparo().setUsesBigModel());
        addNewPokemon(new Bigparro(new Stats(450, StatArchetype.SLOW_BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Kittone().setUsesBigModel());
        addNewPokemon(new Cattwo().setUsesBigModel());
        addNewPokemon(new Fetrio(new Stats(510, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Alyops().setUsesBigModel());
        addNewPokemon(new Teenops().setUsesBigModel());
        addNewPokemon(new Eyesult(new Stats(500, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Ugduck().setUsesBigModel());
        addNewPokemon(new Swaqueen(new Stats(470, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Binthmar().setUsesBigModel());
        addNewPokemon(new Umhmar(new Stats(460, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Orlic().setUsesBigModel());
        addNewPokemon(new Electroll().setUsesBigModel());
        addNewPokemon(new Magnetroll(new Stats(490, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Bapixie().setUsesBigModel());
        addNewPokemon(new Toxipixie(new Stats(460, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Parapixie(new Stats(460, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Burnpixie(new Stats(460, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Polaby().setUsesBigModel());
        addNewPokemon(new Prirog().setUsesBigModel());
        addNewPokemon(new Froprince(new Stats(520, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Maggenrola().setUsesBigModel());
        addNewPokemon(new Flydore().setUsesBigModel());
        addNewPokemon(new Gigascath(new Stats(515, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Chilleti().setUsesBigModel());
        addNewPokemon(new Icyety(new Stats(470, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        addNewPokemon(new Gecgon().setUsesBigModel());
        addNewPokemon(new Phrygon().setUsesBigModel());
        addNewPokemon(new Igunagon(new Stats(540, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addPokedexPokemon("baltoy, claydol");
        addNewPokemon(new Azagger(new Stats(545, StatArchetype.SPECIAL_WALL, List.of(StatType.SPECIAL_DEFENCE, StatType.DEFENCE))).setUsesBigModel());

        addPokedexPokemon("skarmory-trizoran");
        addNewPokemon(new Azmory(new Stats(534, StatArchetype.FAST_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Rosper().setUsesBigModel());
        addNewPokemon(new Vetesper().setUsesBigModel());
        addNewPokemon(new Masper(new Stats(520, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());

        addNewPokemon(new Lizaflage().setUsesBigModel());
        addNewPokemon(new Camoflora().setUsesBigModel());
        addNewPokemon(new Camottle(new Stats(524, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Kapalze().setUsesBigModel());
        addNewPokemon(new Tutolar().setUsesBigModel());
        addNewPokemon(new Locanel(new Stats(530, StatArchetype.FAST_SPECIAL_WALL, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Dropico().setUsesBigModel().fishingSpawnFromExisting());
        addNewPokemon(new Droprock().setUsesBigModel());
        addNewPokemon(new Rexdew(new Stats(528, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());

        addNewPokemon(new Stoni().setUsesBigModel());
        addNewPokemon(new Waraoni(new Stats(480, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Wanyoni(new Stats(480, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Suikoni(new Stats(480, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Raioni(new Stats(480, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Gakioni(new Stats(480, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Chooni(new Stats(480, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Engoni(new Stats(480, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Mikoni(new Stats(480, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Ofoni(new Stats(480, StatArchetype.BULKY_SUPPORT, List.of(StatType.SPECIAL_DEFENCE))).setUsesBigModel());
        addNewPokemon(new Kanazoni(new Stats(480, StatArchetype.BULKY_SUPPORT, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Suchoni(new Stats(480, StatArchetype.FAST_SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Nupponi(new Stats(480, StatArchetype.SPECIAL_WALL, List.of(StatType.HP  ))).setUsesBigModel());
        addNewPokemon(new Bulkoni(new Stats(480, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.HP, StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Atsoni(new Stats(480, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Ushioni(new Stats(480, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Hitotsoni(new Stats(480, StatArchetype.SLOW_BULKY_SPECIAL_ATTACKER, List.of(StatType.HP))).setUsesBigModel());
        addNewPokemon(new Ikarioni(new Stats(480, StatArchetype.SLOW_PHYSICALLY_BULKY_PHYSICAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Leapug().setUsesBigModel());
        addNewPokemon(new Kingpug(new Stats(470, StatArchetype.PHYSICAL_WALL, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Elephire().setUsesBigModel());
        addNewPokemon(new Elephlaze(new Stats(470, StatArchetype.BULKY_PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
        addNewPokemon(new Telvant(new Stats(310, StatArchetype.SPECIAL_WALL, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Scrwant(new Stats(310, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Bulbant(new Stats(310, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.SPEED))).setUsesBigModel());
        addNewPokemon(new Collecjunk(new Stats(410, StatArchetype.SPECIAL_ATTACKER, List.of(StatType.ATTACK))).setUsesBigModel());
        addNewPokemon(new Rexagon(new Stats(580, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());

        addPokedexPokemon("gible-trizoran, gabite-trizoran, garchomp-trizoran, absol-trizoran, onix-trizoran");
        addNewPokemon(new Rayqunix(new Stats(510, StatArchetype.BULKY_SPECIAL_ATTACKER, List.of(StatType.SPECIAL_ATTACK))).setUsesBigModel());
        addNewPokemon(new Cyrok().setUsesBigModel());
        addNewPokemon(new Golasma().setUsesBigModel());
        addNewPokemon(new Crimsagon(new Stats(600, StatArchetype.PHYSICAL_ATTACKER, List.of(StatType.DEFENCE))).setUsesBigModel());
    }
}
