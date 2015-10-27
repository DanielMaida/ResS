import static cucumber.api.groovy.EN.*
import pages.LoginAuthenticationPage
import pages.HomePage

Given(~'^I am at the HomePage$'){ ->
    to HomePage
    at HomePage
}

When(~'^I go to the login page$'){ ->
    to LoginAuthenticationPage
    at LoginAuthenticationPage
}

And(~'^Enter the username "([^"]*)"$'){ String username ->
    page.fillUsername(username)
}

And(~'^The password "([^"]*)" at the correct fields$'){ String password ->
    page.fillPassword(password)
}

Then(~'^I log in as a generator$'){->
    page.logInButtonClick()
    at GeneratorDashboardPage
}

Then(~'^I log in as a collector$'){->
    page.logInButtonClick()
    at CollectorDashboardPage
}

Then(~'^I can not log in$'){->
    page.logInButtonClick()
    at LoginAuthenticationPage
}




