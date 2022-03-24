package com.semibottlekim.peeranalysis.domain.character;

import com.semibottlekim.peeranalysis.domain.expedition.Card;
import com.semibottlekim.peeranalysis.domain.expedition.Expedition;
import com.semibottlekim.peeranalysis.domain.expedition.ExpeditionCollection;

import java.util.List;

public class Character {

    private Expedition expedition;

    private int battleLevel;

    private int itemLevel;

    private BattleAbility battleAbility;

    private ExpeditionCollection collection;

    private int totalSkillPoint;

    private List<Skill> skills;

    private List<Jewel> jewels;

    private List<Card> cards;

    private List<Engraving> engravings;
}
