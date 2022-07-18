import java.util.LinkedList;

public abstract class Sprite {

    protected Sprite(SpriteProperties[] properties) {
        this.properties = properties;
    }

    public enum SpriteProperties{
        NORMAL,
        COMBAT,
        FLY,
        TOXIC,
        GROUND,
        ROCK,
        INSECT,
        GHOST,
        STEEL,
        FIRE,
        WATER,
        GRASS,
        ELECTRIC,
        SUPER,
        ICE,
        DRAGON,
        DEMON,
        SPIRIT,
        EMPTY,
    }

    public String name;
    public final SpriteProperties[] properties;
    public int level;
    public double experience;
    public double attackPower;
    public double defensePower;
    public double health;
    public double maxHealth;
    public double attackSpeed;
    public LinkedList<Attack> attacks;

}
