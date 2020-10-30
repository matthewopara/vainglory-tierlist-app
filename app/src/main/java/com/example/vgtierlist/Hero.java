package com.example.vgtierlist;

public class Hero {

    private final String mName;
    private final String mAttackType;
    private final String mRole;

    private final int mIconId;
    private final int mPortraitId;
    private final String mPosition;
    private final int mDescriptionId;


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
