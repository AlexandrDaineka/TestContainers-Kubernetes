package ru.netology.springbootdemoapp_task1.Model;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is production";
    }
}