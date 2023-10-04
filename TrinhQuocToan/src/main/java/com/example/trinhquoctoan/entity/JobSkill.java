package com.example.trinhquoctoan.entity;

import com.example.trinhquoctoan.enumm.SkillLevel;

public class JobSkill {
    private String moreInfo;
    private SkillLevel skillLevel;

    public JobSkill(String moreInfo, SkillLevel skillLevel) {
        this.moreInfo = moreInfo;
        this.skillLevel = skillLevel;
    }

    public JobSkill() {
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }

    public SkillLevel getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(SkillLevel skillLevel) {
        this.skillLevel = skillLevel;
    }

    @Override
    public String toString() {
        return "JobSkill{" +
                "moreInfo='" + moreInfo + '\'' +
                ", skillLevel=" + skillLevel +
                '}';
    }
}
