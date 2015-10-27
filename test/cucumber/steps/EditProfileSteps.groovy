import net.sf.ehcache.search.expression.And
import pages.*
import steps.EditProfileTestAuxiliar
import static cucumber.api.groovy.EN.*


Given(~'^I am at the the edit profile page as a generator$'){ ->
    to EditGeneratorPage
    at EditGeneratorPage
}

Given(~'^I am at the the edit profile page as a collector$'){ ->
    to EditCollectorPage
    at EditCollectorPage
}

When(~'^Fill the username field with "([^"]*)"$'){ String username ->
    page.fillUsername(username)
}

And(~'^the password field with "([^"]*)"$'){String password ->
    page.fillPassword(password)
}

And(~'^the email field with "([^"]*)"$'){String email ->
    page.fillEmail(email)
}

And(~'^I confirm the edition$'){->
    page.confirmEdition()
}

Then(~'^I see at the account settings page my new generator settings$'){->
    at GeneratorAccountConfigPage
}

Then(~'^I see at the account settings page my new collector settings$'){->
    at CollectorAccountConfigPage
}

Given(~'^Exists an user with the username "([^"]*)" in the system$'){String username ->
    EditProfileTestAuxiliar.findUserByUsername(username)
}

When(~'^I change the username to "([^"]*)"$'){String newUsername ->
    EditProfileTestAuxiliar.updateUsername(newUsername)
}

And(~'^the password to "([^"]*)"$'){String password ->
    EditProfileTestAuxiliar.updatePassword(password)
}

And(~'^the email to "([^"]*)"$'){String email ->
    EditProfileTestAuxiliar.updateEmail(email)
}

Then(~'^The user has new account settings$'){->
    EditProfileTestAuxiliar.findUserByUsername(newUsername)
}