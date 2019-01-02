package org.openehr

import cucumber.api.PendingException
import service.Service

this.metaClass.mixin(cucumber.api.groovy.EN)

Given(/first step/) {  ->
    Service s = new Service()
    System.out.println(s.getString())
    assert s.getString() == "a string"
}


Given("second step"){  ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}



Given(/third step/) {  ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}



When(/second{int} step/) { Integer int1 ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}


Then(/third{int} step/) { Integer int1 ->
    // Write code here that turns the phrase above into concrete actions
    throw new PendingException()
}