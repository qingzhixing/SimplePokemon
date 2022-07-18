public abstract class Effect implements Comparable<Effect> {
    public final String name;
    public final int priority;
    public final CombatListener combatListener;

    protected Effect(String name, int priority) {
        this.name = name;
        this.combatListener = new CombatListener();
        this.priority = priority;
    }

    public int compareTo(Effect proxyEffect) {
        return this.priority - proxyEffect.priority;
    }
}
