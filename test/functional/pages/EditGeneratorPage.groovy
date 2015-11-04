package pages

import geb.Page

/**
 * Created by user on 27/10/2015.
 */
class EditGeneratorPage extends Page {
    def titulo = "ResS - Dashboard"
    static url = "ResS/generatorDashboard/accountConfig"

    static at = {
        title ==~ titulo
    }
}
