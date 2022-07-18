public class CombatListener {
    @FunctionalInterface
    public interface RoundStartHook {
        void OnRoundStart(Sprite sprite);
    }
    @FunctionalInterface
    public interface RoundEndHook {
        void OnRoundEnd(Sprite sprite);
    }
    @FunctionalInterface
    public interface AttackHook {
        void OnAttack(Sprite source, Sprite target, int damageDealt);
    }

    public RoundStartHook roundStartHook;
    public RoundEndHook roundEndHook;
    public AttackHook attackHook;

    public CombatListener() {
        roundStartHook = (sprite) -> {};
        roundEndHook = (sprite) -> {};
        attackHook = (source, target, damageDealt) -> {};
    }

    public void OnRoundStart(Sprite sprite) {
        roundStartHook.OnRoundStart(sprite);
    }

    public void OnRoundEnd(Sprite sprite) {
        roundEndHook.OnRoundEnd(sprite);
    }

    public void OnAttack(Sprite source, Sprite target, int damageDealt) {
        attackHook.OnAttack(source, target, damageDealt);
    }
}
