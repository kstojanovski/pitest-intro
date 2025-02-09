package com.acme;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RuleTest {

    Rule rule = new Rule();

    @Test
    public void testRule() {
        assertEquals(1, rule.simpleRule(1));
//        assertEquals(0, rule.simpleRule(0)); //hidden mutation
        assertEquals(-1, rule.simpleRule(-1));
    }

}