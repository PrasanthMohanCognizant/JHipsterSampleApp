package com.cts.jhipster.cucumber.stepdefs;

import com.cts.jhipster.JhipstersampleappApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = JhipstersampleappApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
