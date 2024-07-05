package drai.dev.gravelmon;

import com.cobblemon.mod.common.api.*;
import com.cobblemon.mod.common.api.events.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.registries.*;
import drai.dev.gravelsextendedbattles.*;
import drai.dev.gravelsextendedbattles.resorting.*;
import kotlin.*;

import java.util.*;

public class Gravelmon
{
	public static boolean lateInitDone = false;
	public static final String MOD_ID = "gravelmon";
	public static final Map<String, String> FOSSIL_MAP = new HashMap<>();

	static {
		GravelmonBlocks.touch();
		GravelmonItems.touch();
	}

	public static void init() {
		GravelmonBlocks.BLOCKS.register();
		GravelmonItems.ITEMS.register();
		CobblemonEvents.BATTLE_STARTED_PRE.subscribe(Priority.HIGH, battleStartedPreEvent -> {
			if(!lateInitDone){
				GravelmonItems.lateInit();
				lateInitDone = true;
			}
			return Unit.INSTANCE;}
		);
		gravelmonFormEvolutions();
		gravelmonStarterInjections();
		registerMoveInsertions();
	}

	private static void gravelmonStarterInjections() {
		GravelmonStarters.injectStarters();
	}

	private static void gravelmonFormEvolutions() {
		SpeciesManager.registerFormEvolution("sandslash alolan", new EvolutionEntry("sandridger alolan", EvolutionType.LEVEL_UP, List.of(),
				List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40"))));
	}

	private static void registerMoveInsertions(){
		GravelmonMoveSubstitution.registerMoveInsertion("dunsparce", new MoveLearnSetEntry(Move.DRILL_RUN, 24));
		GravelmonMoveSubstitution.registerMoveInsertion("eevee", new MoveLearnSetEntry(Move.MACH_PUNCH, "tm"));
		GravelmonMoveSubstitution.registerMoveInsertion("persian", new MoveLearnSetEntry(Move.FAENG_RUSH,"faeralynx"));
		GravelmonMoveSubstitution.registerMoveInsertion("girafarig", new MoveLearnSetEntry(Move.OUTRAGE, 55));
		GravelmonMoveSubstitution.registerMoveInsertion("eevee", new MoveLearnSetEntry(Move.ROUND, "22"));
		GravelmonMoveSubstitution.registerMoveInsertion("pupitar", new MoveLearnSetEntry(Move.ERUPTION,"48"));
		GravelmonMoveSubstitution.registerMoveInsertion("dunsparce", new MoveLearnSetEntry(Move.SKY_DROP, 65));
		GravelmonMoveSubstitution.registerMoveInsertion("eevee", new MoveLearnSetEntry(Move.DRAGON_PULSE, "26"));
		GravelmonMoveSubstitution.registerMoveInsertion("eevee", new MoveLearnSetEntry(Move.SHADOW_BALL, "tm"));
		GravelmonMoveSubstitution.registerMoveInsertion("gabite", new MoveLearnSetEntry(Move.FAIRY_RUSH, 48));
		GravelmonMoveSubstitution.registerMoveInsertion("eevee", new MoveLearnSetEntry(Move.SONIC_BOOM, "tm"));
		GravelmonMoveSubstitution.registerMoveInsertion("aipom", new MoveLearnSetEntry(Move.ROCK_THROW, "34"));
		GravelmonMoveSubstitution.registerMoveInsertion("chimecho", new MoveLearnSetEntry(Move.HYPER_VOICE, 44));
		GravelmonMoveSubstitution.registerMoveInsertion("gabite", new MoveLearnSetEntry(Move.SUCKER_PUNCH, 18));
		GravelmonMoveSubstitution.registerMoveInsertion("hypno", new MoveLearnSetEntry(Move.PSYSTRIKE, 45));
		GravelmonMoveSubstitution.registerMoveInsertion("eevee", new MoveLearnSetEntry(Move.BUG_BITE, "tm"));
		GravelmonMoveSubstitution.registerMoveInsertion("remoraid", new MoveLearnSetEntry(Move.ROCK_BLAST,"34"));
		GravelmonMoveSubstitution.registerMoveInsertion("dunsparce", new MoveLearnSetEntry(Move.DIG, 31));
		GravelmonMoveSubstitution.registerMoveInsertion("wingull", new MoveLearnSetEntry(Move.ACROBATICS, 33));
		GravelmonMoveSubstitution.registerMoveInsertion("kecleon", new MoveLearnSetEntry(Move.THIEF, 36));

	}
}
