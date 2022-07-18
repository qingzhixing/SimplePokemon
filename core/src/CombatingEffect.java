public class CombatingEffect implements Comparable<CombatingEffect> {
    public int lastRoundAmount;
    public Effect proxyEffect;

    CombatingEffect(Effect proxyEffect, int lastRoundAmount) {
        this.proxyEffect = proxyEffect;
        this.lastRoundAmount = lastRoundAmount;
    }

    public final String GetName() {
        return proxyEffect.name;
    }

    public final CombatListener GetCombatListener() {
        return proxyEffect.combatListener;
    }

    @Override
    public int compareTo(CombatingEffect o) {
        return proxyEffect.compareTo(o.proxyEffect);
    }
}
