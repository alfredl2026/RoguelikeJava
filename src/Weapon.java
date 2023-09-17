public class Weapon {
    private int mWeaponAttack;
    private int mWeaponMana;
    private int mWeaponMAttack;
    private String mWeaponName;
    public Weapon(String wpName, int wpAttack, int wpMAttack, int wpMana) {
        mWeaponName = wpName;
        mWeaponAttack = wpAttack;
        mWeaponMAttack = wpMAttack;
        mWeaponMana = wpMana;
    }
    public void someMethod(Weapon weaponInstance) {
        int wpATK = weaponInstance.mWeaponAttack;
    }
    public int totalAttack(int attack) {
        return (mWeaponAttack + attack);
    }

    public int getWeaponAttack() {
        return mWeaponAttack;
    }

    public int getWeaponMana() {
        return mWeaponMana;
    }

    public String getWeaponName() {
        return mWeaponName;
    }
    public int getWeaponMagicAttack() {return mWeaponMAttack;}
}
