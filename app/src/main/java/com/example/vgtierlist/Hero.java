package com.example.vgtierlist;

public class Hero {

    private String mName;
    private String mAttackType;
    private String mRole;

    private int mIconId;
    private int mPortraitId;
    private String mPosition;
    private int mDescriptionId;


    public Hero(String name, String attackType, String position, String role, int iconId,
                int portraitId, int descriptionId)
    {
        mName = name;
        mAttackType = attackType;
        mPosition = position;
        mRole = role;
        mIconId = iconId;
        mPortraitId = portraitId;
        mDescriptionId = descriptionId;
    }

    public String getName()
    {
        return mName;
    }

    public String getAttackType()
    {
        return mAttackType;
    }

    public String getRole()
    {
        return mRole;
    }

    public String getPosition()
    {
        return mPosition;
    }

    public int getIconId()
    {
        return mIconId;
    }

    public int getPortraitId()
    {
        return mPortraitId;
    }

    public int getDescriptionId()
    {
        return mDescriptionId;
    }
}
