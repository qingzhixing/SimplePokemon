import java.util.PriorityQueue;

public abstract class CombatingSprite extends Sprite {
    public Sprite proxySprite;
    public PriorityQueue<CombatingEffect> effects;
    public boolean isOutOfDecision;

    protected CombatingSprite(Sprite proxySprite) {
        super(proxySprite.properties);
        this.proxySprite = proxySprite;
        isOutOfDecision = true;
        effects = new PriorityQueue<CombatingEffect>();
    }

    /*
    Decide what attack to use and return the damage dealt
     */
    abstract int MakeDecision(CombatingSprite target);

    public final void Injured(int damage) {
        if (!isOutOfDecision) return;
        proxySprite.health -= damage;
    }

    public final void AddEffect(CombatingEffect effect) {
        effects.add(effect);
    }
}
