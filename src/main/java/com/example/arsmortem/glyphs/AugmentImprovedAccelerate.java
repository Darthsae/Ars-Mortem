package com.example.arsmortem.glyphs;

import com.hollingsworth.arsnouveau.api.spell.AbstractSpellPart;
import com.hollingsworth.arsnouveau.api.spell.SpellStats;
import com.hollingsworth.arsnouveau.api.spell.SpellTier;
import com.hollingsworth.arsnouveau.common.lib.GlyphLib;
import com.hollingsworth.arsnouveau.api.spell.AbstractAugment;

public class AugmentImprovedAccelerate extends AbstractAugment {

    public static AugmentImprovedAccelerate INSTANCE = new AugmentImprovedAccelerate();

    private AugmentImprovedAccelerate() {
        super(GlyphLib.AugmentImprovedAccelerateID, "ImprovedAccelerate");
    }

    @Override
    public SpellStats.Builder applyModifiers(SpellStats.Builder builder, AbstractSpellPart spellPart) {
        builder.addAccelerationModifier(2.0F);
        return super.applyModifiers(builder, spellPart);
    }

    @Override
    public int getManaCost() {
        return 10;
    }

    @Override
    public SpellTier getTier() {
        return SpellTier.TWO;
    }

    @Override
    public String getBookDescription() {
        return "Increases the speed of projectile spells, twice as effective.";
    }
}
