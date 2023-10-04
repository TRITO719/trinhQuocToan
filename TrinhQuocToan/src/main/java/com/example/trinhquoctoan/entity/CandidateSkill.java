package com.example.trinhquoctoan.entity;

import com.example.trinhquoctoan.enumm.SkillLevel;

public class CandidateSkill {
    private String moreInfo;
    private SkillLevel skillLevel;

    public CandidateSkill(String moreInfo, SkillLevel skillLevel) {
        this.moreInfo = moreInfo;
        this.skillLevel = skillLevel;
    }

    public CandidateSkill() {
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
        return "CandidateSkill{" +
                "moreInfo='" + moreInfo + '\'' +
                ", skillLevel=" + skillLevel +
                '}';
    }
}
