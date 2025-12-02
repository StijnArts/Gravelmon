{
    name: "Shadowmewtwonite",
    spritenum: 620,
    megaStone: "mewtwo-shadow_mega",
    megaEvolves: "mewtwo",
    itemUser: ["mewtwo"],
    onTakeItem(item, source) {
      if (source.baseSpecies.forme !== shadow)
        return true;
      if (item.megaEvolves === source.baseSpecies.baseSpecies)
        return false;
      return true;
    },
    10236: 760,
    gen: 6,
    isNonstandard: "Past"
}
