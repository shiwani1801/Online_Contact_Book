package contact.book

import com.perfios.AppInitializationService

class BootStrap {
 def init = { servletContext ->
        AppInitializationService.initialize()
    }

    def destroy = {
    }
}
