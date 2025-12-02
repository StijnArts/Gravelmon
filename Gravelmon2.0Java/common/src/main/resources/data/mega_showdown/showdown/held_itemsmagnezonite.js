{
    name: "Magnezonite",
    spritenum: 620,
    megaStone: "magnezone-mega",
    megaEvolves: "magnezone",
    itemUser: ["magnezone"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== "")
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10196: 760,
    gen: 6,
    isNonstandard: "Past"
}
