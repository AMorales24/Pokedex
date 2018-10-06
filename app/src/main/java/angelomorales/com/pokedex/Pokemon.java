package angelomorales.com.pokedex;

import java.util.UUID;


public class Pokemon {
    private UUID mId;
    private int mImageReference;
    private String mPokeName;
    private String mPokeHeight;
    private String mPokeWeight;
    private String mCategory;
    private String mHP;
    private String mAttack;
    private String mDefense;
    private String mSpecialAttack;
    private String mSpecialDefense;
    private String mSpeed;

    public Pokemon() {
        mId = UUID.randomUUID();
    }

    public UUID getId() {
        return mId;
    }

    public int getImageReference() {
        return mImageReference;
    }

    public void setImageReference(int imageReference) {
        mImageReference = imageReference;
    }

    public String getPokeName() {
        return mPokeName;
    }

    public void setPokeName(String pokeName) {
        mPokeName = pokeName;
    }

    public String getPokeHeight() {
        return mPokeHeight;
    }

    public void setPokeHeight(String pokeHeight) {
        mPokeHeight = pokeHeight;
    }

    public String getPokeWeight() {
        return mPokeWeight;
    }

    public void setPokeWeight(String pokeWeight) {
        mPokeWeight = pokeWeight;
    }

    public String getCategory() {
        return mCategory;
    }

    public void setCategory(String category) {
        mCategory = category;
    }

    public String getHP() {
        return mHP;
    }

    public void setHP(String HP) {
        mHP = HP;
    }

    public String getAttack() {
        return mAttack;
    }

    public void setAttack(String attack) {
        mAttack = attack;
    }

    public String getDefense() {
        return mDefense;
    }

    public void setDefense(String defense) {
        mDefense = defense;
    }

    public String getSpecialAttack() {
        return mSpecialAttack;
    }

    public void setSpecialAttack(String specialAttack) {
        mSpecialAttack = specialAttack;
    }

    public String getSpecialDefense() {
        return mSpecialDefense;
    }

    public void setSpecialDefense(String specialDefense) {
        mSpecialDefense = specialDefense;
    }

    public String getSpeed() {
        return mSpeed;
    }

    public void setSpeed(String speed) {
        mSpeed = speed;
    }
}