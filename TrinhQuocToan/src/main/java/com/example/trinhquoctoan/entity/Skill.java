package com.example.trinhquoctoan.entity;

import com.example.trinhquoctoan.enumm.SkillType;

public class Skill {
    private long id;
    private String skillDescription;
    private String skillName;
    private SkillType type;

    public Skill(long id, String skillDescription, String skillName, SkillType type) {
        this.id = id;
        this.skillDescription = skillDescription;
        this.skillName = skillName;
        this.type = type;
    }

    public Skill() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSkillDescription() {
        return skillDescription;
    }

    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public SkillType getType() {
        return type;
    }

    public void setType(SkillType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "id=" + id +
                ", skillDescription='" + skillDescription + '\'' +
                ", skillName='" + skillName + '\'' +
                ", type=" + type +
                '}';
    }
}
