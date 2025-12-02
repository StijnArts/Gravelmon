{
    name: "Elestompite",
    spritenum: 620,
    megaStone: "elestomp-mega",
    megaEvolves: "elestomp",
    itemUser: ["elestomp"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10225: 760,
    gen: 6,
    isNonstandard: "Past"
}
