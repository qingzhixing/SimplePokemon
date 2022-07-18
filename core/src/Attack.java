public abstract class Attack {
    protected Attack(String name){
        this.name = name;
    }
    /*
    Add effects to target and return the damage dealt
     */
    abstract int Release(Sprite source,Sprite target);
    private String name;
    public final String GetName() {
        return name;
    }
}
