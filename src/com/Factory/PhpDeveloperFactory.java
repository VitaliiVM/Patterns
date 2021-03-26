package com.Factory;

public class PhpDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
