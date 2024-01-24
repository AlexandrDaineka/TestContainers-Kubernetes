package ru.netology.springbootdemoapp_task1.TwoImplementations;

import ru.netology.springbootdemoapp_task1.Interfaces.SystemProfile;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current profile is dev";
    }
}