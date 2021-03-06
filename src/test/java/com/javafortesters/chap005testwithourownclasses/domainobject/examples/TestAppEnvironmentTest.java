package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

import static com.javafortesters.domainobject.TestAppEnv.*;
import org.junit.Assert;
import org.junit.Test;

public class TestAppEnvironmentTest {

    @Test
    public void canGetUrlStatically() {
        Assert.assertEquals("Returns hard coded URL", "http://192.123.0.3:67", getUrl());
    }

    @Test
    public void canGetDomainAndPortStatically() {
        Assert.assertEquals("Just the domain", "192.123.0.3", DOMAIN);
        Assert.assertEquals("Just the port", "67", PORT);
    }
}
